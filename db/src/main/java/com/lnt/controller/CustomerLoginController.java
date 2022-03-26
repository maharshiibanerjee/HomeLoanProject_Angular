package com.lnt.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.CustomerLogin;

import com.lnt.service.CustomerLoginservice;

@RestController
@CrossOrigin
public class CustomerLoginController {

	@Autowired
	private CustomerLoginservice service;
	
	
	@RequestMapping(value = "/login", method = RequestMethod.POST)
	public String loginUser(@RequestBody CustomerLogin customer) throws Exception {
		String emailId = customer.getEmailId();
		String pwd = customer.getPassword();
		
		String email = null;
		
		if(emailId != null && pwd != null) {
			
			email = service.fetchLogin(emailId);
		}
		
		if(emailId == null) {
			throw new Exception("bad Credentails");
		}
		return email;
		
	}
}
