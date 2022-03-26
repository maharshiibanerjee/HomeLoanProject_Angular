package com.lnt.controller;

import java.io.Console;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;


import com.lnt.domain.PersonalDetails;

import com.lnt.service.PersonalDetailsService;

@RestController
@CrossOrigin
public class PersonalController {

	
	
	@Autowired
	private PersonalDetailsService personalDetailsService;
	
	
	/*
	 * @RequestMapping(value="/displayPersonalDetails") public List<PersonalDetails>
	 * displayPersonalDetails() { List<PersonalDetails> personalList =
	 * personalDetailsService.getPersonalList();
	 * System.out.println("Personal list : " + personalList); return personalList; }
	 */
	
	@RequestMapping(value = "/savePersonalDetail", method = RequestMethod.POST)
	public PersonalDetails savePersonaldetails(@RequestBody  PersonalDetails personalDetails) throws Exception
			 {
		
		
		String tempEmailId = personalDetails.getEmailId();
		if(tempEmailId != null && !"".equals(tempEmailId)) {
			PersonalDetails obj = personalDetailsService.fetchUserByEmailId(tempEmailId);
			if(obj != null) {
				throw new Exception("user with" + tempEmailId+ " is already exist");
			}
		}
		
		
		PersonalDetails per = null;
		per = personalDetailsService.addPersonalDetailsList(personalDetails);
		return per;
	}
	
	@RequestMapping(value = "/loginUser", method = RequestMethod.POST)
	public  PersonalDetails loginUser(@RequestBody PersonalDetails personalDetails) throws Exception{
		
		String tempEmail = personalDetails.getEmailId();
		String tempPwd = personalDetails.getPassword();
		
		System.out.println("email" + tempEmail);
		System.out.println("pwd" + tempPwd);
		
		PersonalDetails perObj = null;
		
		if(tempEmail != null && tempPwd != null) {
			perObj = personalDetailsService.fetchUserByEmailIdAndPassword(tempEmail, tempPwd);
		}
		
		 if(perObj == null) {
			throw new Exception("Bad Credentials");
		}
		
		return perObj;
	}
	
	
	
	
}
