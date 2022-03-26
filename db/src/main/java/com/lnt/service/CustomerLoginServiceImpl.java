package com.lnt.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.repository.CustomerLoginDaoImpl;

@Service
public class CustomerLoginServiceImpl implements CustomerLoginservice {

	@Autowired
	private CustomerLoginDaoImpl customer;

	
	
	@Override
	public String fetchLogin(String email) {
		// TODO Auto-generated method stub
		return customer.findByEmailIdPwd(email);
	}

}
