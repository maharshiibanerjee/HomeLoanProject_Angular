package com.lnt.service;

import java.util.List;

import com.lnt.domain.IncomeDetails;



public interface IncomeDetailsService {
	public List<IncomeDetails> getIncomeList();

	public IncomeDetails addIncomeDetails(IncomeDetails incomedetails);

}