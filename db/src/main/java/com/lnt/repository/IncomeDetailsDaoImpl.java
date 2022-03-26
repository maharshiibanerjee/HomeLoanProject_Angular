package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.IncomeDetails;
import com.lnt.domain.LoanTable;

@Repository
@Transactional
public class IncomeDetailsDaoImpl implements IncomeDetailsDao {
	
	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<IncomeDetails> getIncomeDetailsList() {
		
		return entityManager.createQuery("from IncomeDetails").getResultList();
	}

	@Override
	public IncomeDetails addIncomeDetails(IncomeDetails incomeDetails) {
		
		entityManager.persist(incomeDetails);
		return incomeDetails;
	}
	
	@Override
	public IncomeDetails searchIncomePersonById(int id) {
		// TODO Auto-generated method stub
		return entityManager.find(IncomeDetails.class, id);
	}

	@Override
	public void updateIncomeDetails(IncomeDetails incomeDetails, int id) {
		// TODO Auto-generated method stub
		
		IncomeDetails income = searchIncomePersonById(id);
		income.setEmployerName(incomeDetails.getEmployerName());
		income.setEstimatedAmount(incomeDetails.getEstimatedAmount());
		income.setOrganizationType(incomeDetails.getOrganizationType());
		income.setPropertyName(incomeDetails.getPropertyName());
		income.setRetirementAge(incomeDetails.getRetirementAge());
		income.setPropertyLocation(incomeDetails.getPropertyLocation());
		income.setTypeOfEmployment(incomeDetails.getTypeOfEmployment());
				
				
				
		
	}

}
