package com.lnt.repository;

import java.util.List;

import com.lnt.domain.IncomeDetails;
import com.lnt.domain.LoanTable;



public interface IncomeDetailsDao {
	
	public List<IncomeDetails> getIncomeDetailsList();
	
	public IncomeDetails addIncomeDetails(IncomeDetails incomeDetails);
	
	public void updateIncomeDetails(IncomeDetails incomeDetails, int id);
	
	public IncomeDetails searchIncomePersonById(int id);
	

}
