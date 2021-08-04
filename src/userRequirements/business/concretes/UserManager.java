package userRequirements.business.concretes;

import userRequirements.business.abstracts.MailVerificationService;
import userRequirements.business.abstracts.UserCheckService;
import userRequirements.business.abstracts.UserService;
import userRequirements.dataAcess.abstracts.UserDao;
import userRequirements.dataAcess.concretes.HibernateUserDao;
import userRequirements.entities.concretes.User;

public class UserManager implements UserService {
	UserCheckService userCheckService;
	MailVerificationService mailVerificationService;
	UserDao userDao;

	public UserManager(UserCheckService userCheckService, MailVerificationService mailVerificationService, HibernateUserDao hibernateUserDao) {
		super();
		this.userCheckService = userCheckService;
		this.mailVerificationService = mailVerificationService;
	}



	@Override
	public void signUp(User user) {
		if (userCheckService.isValid(user) == true) {
			System.out.print(user.getFirstName() + " Kullanıcı sisteme eklendi.");
			mailVerificationService.sendMail(user.getEmail());
			
		}
	}

	@Override
	public void signIn(User user) {
		mailVerificationService.verifyMail(user.getEmail());

		if (userDao.getEmail(user.getEmail()) && userDao.getPassword(user.getPassword())
				&& mailVerificationService.isVerificated(user.getEmail()) == true) {
			System.out.println("Başarılı !! Giriş yapılıyor...");
		} else if (mailVerificationService.isVerificated(user.getEmail()) == false) {
			System.out.println("Kullanıcı girişi mail doğrulanamadığı için gerçekleştirilemedi.");
		} else {
			System.out.println("Kullanıcı bilgileri hatalı.Lütfen tekrar deneyiniz.");
		}
	}
		
	}



