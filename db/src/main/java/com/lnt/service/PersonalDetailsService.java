package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.domain.LoanTable;
import com.lnt.domain.PersonalDetails;

import com.lnt.repository.PersonalDetailsDao;


@Service
public class PersonalDetailsService  {
	

	@Autowired
	private PersonalDetailsDao personal;
	
	/*
	 * public List<PersonalDetails> getPersonalList() { // TODO Auto-generated
	 * method stub return personal.getPersonalDetailsList(); }
	 */

	public PersonalDetails addPersonalDetailsList(PersonalDetails personalDetails) {
		
		return personal.save(personalDetails);
	
		
	}
	
	
	public PersonalDetails fetchUserByEmailId(String emailId) {
		return personal.EmailId(emailId);
	}
	
	
	
	 public PersonalDetails fetchUserByEmailIdAndPassword(String emailId, String password) { 
		 return personal.findByEmailIdAndPassword(emailId, password); }
	 
	

	
	
	
	

	
	
	


}
