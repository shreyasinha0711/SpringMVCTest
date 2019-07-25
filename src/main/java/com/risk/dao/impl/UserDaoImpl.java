package com.risk.dao.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.risk.dao.UserDao;
import com.risk.model.User;
@Repository
public class UserDaoImpl implements UserDao{
	
	static List<User> userlist = new ArrayList<User>();
	static {
		userlist.add(new User("Shreya","India","Shreya@gmail.com", 24, "9431618150"));
		userlist.add(new User("Shreya","India","Shreya@gmail.com", 24, "9431618150"));
		userlist.add(new User("Shreya","India","Shreya@gmail.com", 24, "9431618150"));
		userlist.add(new User("Shreya","India","Shreya@gmail.com", 24, "9431618150"));
		userlist.add(new User("Shreya","India","Shreya@gmail.com", 24, "9431618150"));
	}
	
	public List<User> getUser(){
		return userlist;
	}

	public void addUser(User user) {
		userlist.add(user);
	}
}
