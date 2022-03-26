package com.lnt.repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.LoanTable;
import com.lnt.models.Application;

@Repository
@Transactional
public class LoanDetailsDaoImpl implements LoanDetailsDao {

	@PersistenceContext
	private EntityManager entityManager;

	@SuppressWarnings("unchecked")
	@Override
	public List<LoanTable> getLoanList() {
		// TODO Auto-generated method stub
		return entityManager.createQuery("from LoanTable").getResultList();
		//return entityManager.createQuery("select t.userName,t.maxLoanGrant,i.estimatedAmount from LoanTable t inner join IncomeDetails i on t.userName=i.userName ").getResultList();

		
	}

	@Override     
	public LoanTable addLoanDetails(LoanTable loan) {
		// TODO Auto-generated method stub
		entityManager.persist(loan);
		return loan;

	}

	@Override
	public List<Application> getApplications() {
		List <Application> list = new ArrayList();
		
		//List<Object[]> rows = entityManager.createQuery(queryText).getResultList();
		List<Object[]> rows = entityManager.createNativeQuery("SELECT L.LOAN_ID,L.PERSONAL_DETAILS_P_ID,IDE.PROPERTY_NAME,IDE.PROPERTY_LOCATION, L.LOAN_AMOUNT, L.LOAN_STATUS\r\n" + 
        		"FROM LOAN L,INCOME_DETAILS IDE WHERE L.PERSONAL_DETAILS_P_ID=IDE.PERSONAL_DETAILS_P_ID").getResultList();
		for (Object[] row: rows) {
			Application application=new Application();
			System.out.println(" ------- ");
			application.setLoanId(((BigDecimal)row[0]).intValue());
			application.setpId(((BigDecimal)row[1]).intValue());
			application.setPropertyName((String)row[2]);
			application.setPropertyLocation((String)row[3]);
			application.setLoanAmount(((BigDecimal)row[4]).longValue());
			application.setLoanStatus((String)row[5]);
			list.add(application);
		}
				return list;
	}

	public Integer updateLoanStatus(int id, String status) {
		String qryString = "update LoanTable loan set loan.loanStatus=?0 where loan.loanId=?1";
        Query query = entityManager.createQuery(qryString);
        query.setParameter(0, status);
        query.setParameter(1, id);

        query.executeUpdate();

        Integer count = query.executeUpdate();
		return count;
	}
		

}


