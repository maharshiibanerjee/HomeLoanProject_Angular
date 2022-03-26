package com.lnt.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.Admin;
import com.lnt.repository.AdminDao;


@Component
@Transactional
public class AdminServiceImpl  implements AdminService{
	@Autowired
 private AdminDao adminDao;
	@Override
	public List<Admin> getAllAdminService() {
		return adminDao.getAllAdmins();
	}
	

	@Override
	public void addAdminService(Admin a) {
		adminDao.addNewAdmin (a);
	}

	@Override
	public Admin searchAdminByIdService(int id) {
		Admin a=adminDao.searchAdminById(id);
		if(a==null) {
			String msg="This admin "+id+" not found";
			throw new ArithmeticException(msg);
		}	
		return a;
	}

	@Override
	public void updateAdminService(Admin a, int id) {
		adminDao.updateAdmin(a, id);
	}

	

}
