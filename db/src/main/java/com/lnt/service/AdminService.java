package com.lnt.service;

import java.util.List;
import com.lnt.domain.Admin;


public interface AdminService {
List<Admin> getAllAdminService();
void addAdminService(Admin a);
Admin searchAdminByIdService(int id);
void updateAdminService(Admin a,int id);
}
