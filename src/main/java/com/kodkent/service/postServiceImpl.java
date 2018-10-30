package com.kodkent.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.kodkent.dal.postDAOImpl;
import com.kodkent.model.Post;

@Service
public class postServiceImpl implements postService{

	@Override
	public void save(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void delete(Post post) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public List<Post> list(Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Post find(int id, Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> search(String column, String value, Post post) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Post> search(Post post) {
		// TODO Auto-generated method stub
		return null;
	}
	




}
