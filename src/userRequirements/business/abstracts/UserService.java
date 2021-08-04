package userRequirements.business.abstracts;

import userRequirements.entities.concretes.User;

public interface UserService {
	void signUp(User user);
	void signIn(User user);
	
}
