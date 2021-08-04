package userRequirements.business.concretes;

import java.util.ArrayList;
import java.util.List;

import userRequirements.business.abstracts.MailVerificationService;

public class MailVerificationManager implements MailVerificationService {

	UserCheckManager userCheckManager;

	List<String> verificatedEmails = new ArrayList<String>();

	@Override
	public void sendMail(String email) {
		System.out.println(email + " Doðrulama mail'i gönderilmiþtir.");

	}

	@Override
	public void verifyMail(String email) {
		verificatedEmails.add(email);
	}

	@Override
	public boolean isVerificated(String email) {
		if (verificatedEmails.contains(email)) {
			return true;
		}
		return false;
	}

}
