package userRequirements.core;

public class GoogleAdapter implements GoogleService{

	@Override
	public void sendToVerifyMail(String email) {
		System.out.println(email + " Do�rulama mail'i g�nderildi.");
		
	}

	@Override
	public boolean checkVerifyAccount(String email) {
		System.out.println(email + "Google Hesab� do�ruland�.");
		return true;
	}

}
