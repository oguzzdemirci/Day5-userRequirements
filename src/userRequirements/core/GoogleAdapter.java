package userRequirements.core;

public class GoogleAdapter implements GoogleService{

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " Doðrulama mail'i gönderildi.");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		System.out.println(email + "Google Hesabý doðrulandý.");
		return true;
	}

}
