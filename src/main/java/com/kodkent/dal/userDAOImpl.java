package com.kodkent.dal;

import java.lang.reflect.Field;
import java.util.List;

import javax.annotation.Resource;
import javax.persistence.Query;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.kodkent.model.User;


@Repository
@Transactional
public class userDAOImpl implements userDAO {
	

	@Autowired
	private SessionFactory sessionFactory;

	

	public boolean save(User user) {
		  try{
			Session currentSession = sessionFactory.getCurrentSession();
			currentSession.saveOrUpdate(user);
		         
		        return true;
		     }catch(Exception ex){
		        
		//load the logs      
		      return false;
		     }
	}



	



	@Override
	public List<User> getAll() {
		
	        try{
	        	Session currentSession = sessionFactory.getCurrentSession();
				
	    		
	    		Query theQuery = 
	    				(Query) currentSession.createQuery("from User ");
	    		
	    		// execute query and get result list
	    		List<User> users = theQuery.getResultList();
	        	  
	            return users;
	            }catch(Exception ex){
	        		//load the logs      

	            return null;
	            }

}}
