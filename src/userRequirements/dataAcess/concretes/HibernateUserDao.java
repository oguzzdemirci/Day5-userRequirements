package userRequirements.dataAcess.concretes;

import java.util.ArrayList;
import java.util.List;

import userRequirements.dataAcess.abstracts.UserDao;
import userRequirements.entities.concretes.User;

public class HibernateUserDao implements UserDao {
	List<User> users = new ArrayList<User>();

	@Override
	public void add(User user) {
		users.add(user);

	}

	@Override
	public void delete(User user) {

	}

	@Override
	public void update(User user) {

	}

	@Override
	public boolean getEmail(String mail) {
		for (User user : users) {
			if (user.getEmail() == mail)
				return true;
		}
		return false;
	}

	@Override
	public boolean getPassword(String password) {
		for (User user : users) {
			if (user.getPassword() == password)
				return true;
		}
		return false;
	}
}
