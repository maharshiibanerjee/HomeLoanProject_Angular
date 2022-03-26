package com.lnt.service;

import java.util.List;

import com.lnt.domain.LoanTable;
import com.lnt.models.Application;

public interface LoanDetailsService {
	public List<LoanTable> getLoanList();

	public LoanTable addLoanDetails(LoanTable loantable);
	
	public LoanTable searchLoanByIdService(int id);
	
	void updateLoanService(LoanTable a,int id);
    
	public List<Application> getApplications();

	public Integer updateLoanStatus(int id, String status);
	
}
