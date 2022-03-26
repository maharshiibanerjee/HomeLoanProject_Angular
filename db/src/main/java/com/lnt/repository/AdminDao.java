package com.lnt.repository;

import java.util.List;

import com.lnt.domain.Admin;

public interface AdminDao {
List<Admin> getAllAdmins();
Admin searchAdminById(int id);
void updateAdmin(Admin a,int id);
void addNewAdmin(Admin a);
}
