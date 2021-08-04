package userRequirements.dataAcess.abstracts;

import java.util.ArrayList;
import java.util.List;

import userRequirements.entities.concretes.User;

public interface UserDao {
	void add(User user);
	void delete(User user);
	void update(User user);
	boolean getEmail(String mail);
	boolean getPassword(String password);
	List<User> users = new ArrayList<User>();
	}
