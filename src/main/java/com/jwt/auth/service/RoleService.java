package com.jwt.auth.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jwt.auth.entity.Role;
import com.jwt.auth.repository.RoleRepo;

@Service
public class RoleService {
@Autowired
RoleRepo roleRepo;


public Role createNewRole(Role role) {
	return roleRepo.save(role);
	}
}
