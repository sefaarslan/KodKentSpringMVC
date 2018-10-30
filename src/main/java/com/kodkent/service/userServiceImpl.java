package com.kodkent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kodkent.dal.userDAO;
import com.kodkent.dal.userDAOImpl;
import com.kodkent.model.User;

@Service
public class userServiceImpl implements userService {
	
	@Autowired
	private userDAOImpl userDao;

	@Override
	public void save(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(User user) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<User> list() {
		// TODO Auto-generated method stub
		return userDao.getAll();
	}

	
	

}
