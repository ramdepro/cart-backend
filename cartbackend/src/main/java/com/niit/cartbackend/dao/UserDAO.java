package com.niit.cartbackend.dao;

import java.util.List;

import com.niit.cartbackend.model.User;

public interface UserDAO {
	public void addUser(User user);
	public void updateUser(User user);
	public void deleteUser(User user);
	public User getUserById(int userId);
	public List<User> listUsers();
	public User getUserByUsername(String username);
}
