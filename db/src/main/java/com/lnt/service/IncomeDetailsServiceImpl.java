package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lnt.domain.IncomeDetails;
import com.lnt.repository.IncomeDetailsDaoImpl;


@Service
public class IncomeDetailsServiceImpl implements IncomeDetailsService {
	
	@Autowired
	private IncomeDetailsDaoImpl incomeDetailsDaoImpl;

	@Override
	public List<IncomeDetails> getIncomeList() {
		// TODO Auto-generated method stub
		return incomeDetailsDaoImpl.getIncomeDetailsList();
	}

	@Override
	public IncomeDetails addIncomeDetails(IncomeDetails incomedetails) {
		// TODO Auto-generated method stub
		return incomeDetailsDaoImpl.addIncomeDetails(incomedetails);
	}

}
