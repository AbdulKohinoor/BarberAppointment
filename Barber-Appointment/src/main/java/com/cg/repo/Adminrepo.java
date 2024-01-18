package com.cg.repo;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cg.models.Admin;


@Repository
public interface Adminrepo extends JpaRepository<Admin , Integer> {

	public Optional <Admin> findByAdminEmail(String email);
	public Admin findByAdminEmailAndAdminPassword(String email, String password);

}