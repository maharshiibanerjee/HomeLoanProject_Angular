package com.lnt.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.LoanTable;
import com.lnt.models.Application;
import com.lnt.service.LoanDetailsService;

@RestController
@CrossOrigin
public class LoanController {
	
	@Autowired
	private LoanDetailsService loanDetailsService;
	
	
	@RequestMapping(value="/displayLoan")
	public List<LoanTable> displayLoan()  {
		List<LoanTable> loanList = loanDetailsService.getLoanList();
        System.out.println("Loan list : " + loanList);
		return loanList;
	}
	
	@RequestMapping(value = "/saveLoan", method = RequestMethod.POST)
	public String saveLoan(@RequestBody  LoanTable loantable
			)  {
		
		
		loanDetailsService.addLoanDetails(loantable);
		return "Saved Successfully";
	}
	@GetMapping(value="/displayApplications")
	public List<Application> displayApplications()  {
		List<Application> loanList = loanDetailsService.getApplications();
        System.out.println("Loan list : " + loanList);
		return loanList;
	}
	@PutMapping(value="/loanStatus/{id}/{status}")
	public String updateLoanStatus(@PathVariable int id,@PathVariable String status )  {
		
		Integer count = loanDetailsService.updateLoanStatus(id,status);
		if(count>0) return "Saved Successfully";
		else return "Not Saved";
	}

}
 //Approve Loan, Reject Loan , Get all pending loans, Get all Approved Loans