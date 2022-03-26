package com.lnt.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.lnt.domain.IncomeDetails;
import com.lnt.domain.LoanTable;
import com.lnt.service.IncomeDetailsService;
import com.lnt.service.LoanDetailsService;

@RestController
@CrossOrigin
public class IncomeController {
	
	@Autowired
	private IncomeDetailsService incomeDetailsService;
	
	@RequestMapping(value="/displayIncome")
	public List<IncomeDetails> displayIncome()  {
		List<IncomeDetails> incomeDetails = incomeDetailsService.getIncomeList();
        System.out.println("Income Details : " + incomeDetails);
		return incomeDetails;
	}
	
	@RequestMapping(value = "/saveIncome", method = RequestMethod.POST,produces="text/plain")
	public String saveIncome(@RequestBody  IncomeDetails incomeDetails)
			  {		
		incomeDetailsService.addIncomeDetails(incomeDetails);
		return "Saved Successfully";
	}

}
