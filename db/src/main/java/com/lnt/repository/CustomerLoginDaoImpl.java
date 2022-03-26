package com.lnt.repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import org.springframework.stereotype.Repository;


import com.lnt.domain.CustomerLogin;

@Repository
@Transactional
public class CustomerLoginDaoImpl implements CustomerLoginDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@Override
	public String findByEmailIdPwd(String email) {
		// TODO Auto-generated method stub
		
		return email;
	}

	

}
