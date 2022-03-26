package com.lnt.domain;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="login")
public class CustomerLogin {

	@Id
	@Column(name = "l_id")
	@GeneratedValue
	private int  loginId;
	
	@Column(name = "email")
	private String emailId;
	
	@Column(name = "password")
	private String password;

	public Integer getLoginId() {
		return loginId;
	}

	public void setLoginId(Integer loginId) {
		this.loginId = loginId;
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

	public CustomerLogin(Integer loginId, String email1, String password) {
		super();
		this.loginId = loginId;
		this.emailId = emailId;
		this.password = password;
	}

	
	
	
	
	
}
