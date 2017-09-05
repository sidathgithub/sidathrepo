package com.websystique.springmvc.dao;

import java.util.List;

import com.websystique.springmvc.model.User;


public interface UserDao {

	//User findById(int id);
	
	//User findBySSO(String sso);
	//User findByName(String name);
	
	//void save(User user);
	void saveUser(User user);
	
	void updateUser(User user);
	
	//void deleteUserById(long id);

	//void deleteBySSO(String sso);
	
	List<User> findAllUsers();
	
	//void deleteAllUsers();
	
	//public boolean isUserExist(User user);

}

