package com.lnt.domain;

import java.time.LocalDate;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "PersonalDetail")
public class PersonalDetails {
	
	

	@Id
	@Column(name = "p_id")
	@GeneratedValue
	private Integer  pId;

	@Column(name = "user_name")
	private String userName;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "middle_name")
	private String middleName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "email")
	private String emailId;
	
	@Column(name = "password")
	private String password;
	
	@Column(name = "phone_number")
	private String phonenumber;
	
	@JsonFormat(pattern = "yyyy-MM-dd")
	@Column(name = "dob")
	private LocalDate dob;
	
	@Column(name = "gender")
	private String gender;
	
	@Column(name = "nationality")
	private String nationality;
	
	@Column(name = "aadhar")
	private String aadharNo;
	
	@Column(name = "pan")
	private String panNo;

	@OneToOne(mappedBy = "personalDetails")
	private  IncomeDetails incomeDetails;
	
	
	@OneToOne(mappedBy = "personalDetails")
	private LoanTable loanTable;
	

	public PersonalDetails(Integer pId,String userName, String firstName, String middleName, String lastName, String emailId,
			String password, String phoneNumber, LocalDate dob, String gender, String nationality, String aadharNo,
			String panNo) {
		super();
		this.pId = pId;
		this.userName = userName;
		this.firstName = firstName;
		this.middleName = middleName;
		this.lastName = lastName;
		this.emailId = emailId;
		this.password = password;
		this.phonenumber = phoneNumber;
		this.dob = dob;
		this.gender = gender;
		this.nationality = nationality;
		this.aadharNo = aadharNo;
		this.panNo = panNo;
	}

	
	
	
	
	public Integer getpId() {
		return pId;
	}

	public void setpId(Integer pId) {
		this.pId = pId;
	}
	
	public String getUsername() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getMiddleName() {
		return middleName;
	}

	public void setMiddleName(String middleName) {
		this.middleName = middleName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailId() {
		return emailId;
	}

	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getPhoneNumber() {
		return phonenumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phonenumber = phoneNumber;
	}

	public LocalDate getDob() {
		return dob;
	}

	public void setDob(LocalDate dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getAadharNo() {
		return aadharNo;
	}

	public void setAadharNo(String aadharNo) {
		this.aadharNo = aadharNo;
	}

	public String getPanNo() {
		return panNo;
	}

	public void setPanNo(String panNo) {
		this.panNo = panNo;
	}





	public PersonalDetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	
}
