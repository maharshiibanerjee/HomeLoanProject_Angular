package com.lnt.repository;

import com.lnt.domain.CustomerLogin;

public interface CustomerLoginDao {
	
	public String findByEmailIdPwd(String email);

}
