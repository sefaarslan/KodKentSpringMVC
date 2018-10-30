package com.kodkent.service;

import java.util.List;


import com.kodkent.model.User;

public interface userService {

	public void save(User user);
    public void delete(User user);
    public List<User> list();   
   
}
