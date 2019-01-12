package com.evolve.core.domain.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.evolve.core.domain.entities.Admin;
import com.evolve.core.domain.repositories.AdminRepository;
@Service
public class AdminService {

	@Autowired
	AdminRepository adminRepository;

	public void saveAdmin(Admin admin) {
		adminRepository.save(admin);
	}

	public void deleteAdmin(Admin admin) {
		adminRepository.delete(admin);	
	}
	public List<Admin> getAllAdmins(){
		return adminRepository.findAll();	
	}
	
	public Optional<Admin> getAdminById(int idAdmin) {
		return adminRepository.findById(idAdmin);
	}
}
