package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.domain.LoanTable;
import com.lnt.models.Application;
import com.lnt.repository.LoanDetailsDaoImpl;
@Service
public class LoanDetailsServiceImpl implements LoanDetailsService{
	
	@Autowired
	private LoanDetailsDaoImpl loanDetailsDaoImpl;

	@Override
	public List<LoanTable> getLoanList() {
		// TODO Auto-generated method stub
		return loanDetailsDaoImpl.getLoanList();
	}

	@Override
	public LoanTable addLoanDetails(LoanTable loantable) {
		// TODO Auto-generated method stub
		return loanDetailsDaoImpl.addLoanDetails(loantable);
	}

	
	
	
	
	
	@Override
	public LoanTable searchLoanByIdService(int id) {
	
		return null;
	}

	@Override
	public void updateLoanService(LoanTable loan, int id) {
		// TODO Auto-generated method stub
	//	loanDetailsDaoImpl.updateLoanDetails(loan, id);
	}

	@Override
	public List<Application> getApplications() {
		return loanDetailsDaoImpl.getApplications();
	}
	
	@Override
	public Integer updateLoanStatus(int id, String status) {
		return loanDetailsDaoImpl.updateLoanStatus(id,status);
	}
	



}
