package com.lnt.repository;
import java.util.List;


import com.lnt.domain.LoanTable;
import com.lnt.models.Application;


public interface LoanDetailsDao {

	public List<LoanTable> getLoanList();
	public LoanTable addLoanDetails(LoanTable loan);
	public List<Application> getApplications();
	
	/*
	 * public LoanTable searchLoanPersonById(int id);
	 * 
	 * public void updateLoanDetails(LoanTable loanTable, int id);
	 */
	
}
