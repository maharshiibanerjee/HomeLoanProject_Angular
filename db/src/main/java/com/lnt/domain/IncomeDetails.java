package com.lnt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "IncomeDetails")

public class IncomeDetails {

	@Id
	@Column(name = "income_id")
	@GeneratedValue
	private Integer incomeId;

	@Column(name = "user_name")
	private String userName;

	@Column(name = "property_location")
	private String propertyLocation;

	@Column(name = "property_name")
	private String propertyName;

	@Column(name = "estimated_amt")
	private double estimatedAmount;

	@Column(name = "type_of_emp")
	private String typeOfEmployment;

	@Column(name = "ret_age")
	private Integer retirementAge;

	
	 @OneToOne(targetEntity = PersonalDetails.class) 
	 private PersonalDetails personalDetails ;
	 

	/*
	 * public IncomeDetails(String userName, String propertyLocation, String
	 * propertyName, double estimatedAmount, String typeOfEmployment, Integer
	 * retirementAge, String organizationType, String employerName) { super();
	 * this.userName = userName; this.propertyLocation = propertyLocation;
	 * this.propertyName = propertyName; this.estimatedAmount = estimatedAmount;
	 * this.typeOfEmployment = typeOfEmployment; this.retirementAge = retirementAge;
	 * this.organizationType = organizationType; this.employerName = employerName; }
	 */

	/*
	 * public IncomeDetails() {
	 * 
	 * }
	 */

	@Column(name = "org_type")
	private String organizationType;

	public Integer getIncomeId() {
		return incomeId;
	}

	public void setIncomeId(Integer incomeId) {
		this.incomeId = incomeId;
	}

	@Column(name = "employer_name")
	private String employerName;

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPropertyLocation() {
		return propertyLocation;
	}

	public void setPropertyLocation(String propertyLocation) {
		this.propertyLocation = propertyLocation;
	}

	public String getPropertyName() {
		return propertyName;
	}

	public void setPropertyName(String propertyName) {
		this.propertyName = propertyName;
	}

	public double getEstimatedAmount() {
		return estimatedAmount;
	}

	public void setEstimatedAmount(double estimatedAmount) {
		this.estimatedAmount = estimatedAmount;
	}

	public String getTypeOfEmployment() {
		return typeOfEmployment;
	}

	public void setTypeOfEmployment(String typeOfEmployment) {
		this.typeOfEmployment = typeOfEmployment;
	}

	public Integer getRetirementAge() {
		return retirementAge;
	}

	public void setRetirementAge(Integer retirementAge) {
		this.retirementAge = retirementAge;
	}

	public String getOrganizationType() {
		return organizationType;
	}

	public void setOrganizationType(String organizationType) {
		this.organizationType = organizationType;
	}

	public String getEmployerName() {
		return employerName;
	}

	public void setEmployerName(String employerName) {
		this.employerName = employerName;
	}
}
