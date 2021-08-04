package userRequirements;

import userRequirements.business.concretes.MailVerificationManager;
import userRequirements.business.concretes.UserCheckManager;
import userRequirements.business.concretes.UserManager;
import userRequirements.dataAcess.concretes.HibernateUserDao;
import userRequirements.entities.concretes.User;

public class Main {

	public static void main(String[] args) {
		User user1 = new User(1,"Oðuzhan","Demirci "," oguzhandemirci@gmail.com "," 23465823465 ");
		User user2 = new User(2,"Bedirhan","Demirci","bedirhandemirci@gmail.com","31234613123");
		User user3 = new User(3,"Mustafa","Akar","mustafaakar@gmail.com","23412231265");
		User user4 = new User(4,"Fatih","Bayraktar","fatihbayraktar@gmail.com","23467093465");

		UserManager userManager = new UserManager(new UserCheckManager(), new MailVerificationManager(),new HibernateUserDao());
	  
	  userManager.signUp(user1);
	  userManager.signUp(user2);
	  userManager.signUp(user3);
	  userManager.signUp(user4);
	
	}

}
