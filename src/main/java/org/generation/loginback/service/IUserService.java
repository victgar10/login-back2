package org.generation.loginback.service;

import java.util.List;

import org.generation.loginback.model.User;



public interface IUserService {

	public List<User> getAllUser();
	
	public User getUserById(long id);
	
	public boolean existUserByEmail(String email);
	
	public User setUser(User user);
	
}
