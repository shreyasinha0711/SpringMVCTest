package com.risk.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.risk.model.User;
@Repository
public interface UserDao {

	abstract public List<User> getUser();
	abstract public void addUser(User user);
}
