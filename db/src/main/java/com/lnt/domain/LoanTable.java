package com.lnt.domain;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "loan")
public class LoanTable {
	
	@Id
	@Column(name = "loan_id")
	@GeneratedValue
	private Integer  loanId;
	
	
	@Column(name = "user_name")
	private String userName;
	
	
	@Column(name = "max_loan_grant")
	private Double maxLoanGrant;
	
	@Column(name = "interest_rate ")
	private Double interestRate;
	
	@Column(name = "tenure")
	private Integer  tenure;
	
	@Column(name = "loan_amount")
	private Long loanAmount;
	
	@Column(name = "loan_status")
	private String loanStatus;
	
	public String getLoanStatus() {
		return loanStatus;
	}

	public void setLoanStatus(String loanStatus) {
		this.loanStatus = loanStatus;
	}

	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "loan_date")
	private LocalDate loanStartDate;
	
	@OneToOne(targetEntity = PersonalDetails.class)
	private PersonalDetails personalDetails ;
	

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	

	public LocalDate getLoanStartDate() {
		return loanStartDate;
	}

	public void setLoanStartDate(LocalDate loanStartDate) {
		this.loanStartDate = loanStartDate;
	}

	public PersonalDetails getPersonalDetails() {
		return personalDetails;
	}

	public void setPersonalDetails(PersonalDetails personalDetails) {
		this.personalDetails = personalDetails;
	}

	public Integer getLoanId() {
		return loanId;
	}

	public void setLoanId(Integer loanId) {
		this.loanId = loanId;
	}

	public LoanTable() {

	}

	public LoanTable(Double maxLoanGrant, Double interestRate, Integer tenure, Long loanAmount) {
		super();
		this.maxLoanGrant = maxLoanGrant;
		this.interestRate = interestRate;
		this.tenure = tenure;
		this.loanAmount = loanAmount;
	}

	

	public Double getMaxLoanGrant() {
		return maxLoanGrant;
	}

	public void setMaxLoanGrant(Double maxLoanGrant) {
		this.maxLoanGrant = maxLoanGrant;
	}

	public Double getInterestRate() {
		return interestRate;
	}

	public void setInterestRate(Double interestRate) {
		this.interestRate = interestRate;
	}

	public Integer getTenure() {
		return tenure;
	}

	public void setTenure(Integer tenure) {
		this.tenure = tenure;
	}

	public Long getLoanAmount() {
		return loanAmount;
	}

	public void setLoanAmount(Long loanAmount) {
		this.loanAmount = loanAmount;
	}
	


	
	
	

}
