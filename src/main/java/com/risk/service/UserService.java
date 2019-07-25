package com.risk.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.risk.model.User;

@Service
public interface UserService {
	
	abstract public List<User> getUser();
	abstract public void addUser(User user); 

}
