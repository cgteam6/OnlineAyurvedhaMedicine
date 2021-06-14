package com.cg.service;

import com.cg.entities.User;

public interface UserService {
	public User addUser(User User);
	public User updateUser(User User) throws UserNotFoundException;
	public User removeUser(int userId) throws UserNotFoundException;
	public List<User> showAllUsers();
	public boolean validateUser(int userid,String userName);

}
