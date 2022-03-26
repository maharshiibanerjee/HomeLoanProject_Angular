package com.lnt.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lnt.domain.Admin;
@Repository
@Component

public class AdminDaoImpl implements AdminDao{
	@PersistenceContext // DI spring container injects Entity Manager obj
	private EntityManager em;
	
	@Override
	public List<Admin> getAllAdmins() {
		Query q= em.createQuery("select a from Admin a",Admin.class);
		List<Admin> admins=  q.getResultList();
		System.out.println(admins.size());
		return admins;
	}
	@Override
	public Admin searchAdminById(int id) {
		// TODO Auto-generated method stub
		return em.find(Admin.class, id);
	}
	@Override
	public void updateAdmin(Admin a, int id) {
		Admin managedCopy=searchAdminById(id);
		managedCopy.setUsername(a.getUsername());
		managedCopy.setPassword(a.getPassword());
		System.out.println("updated");
	}
	@Override
	public void addNewAdmin(Admin a) {
		em.persist(a);
	}


}