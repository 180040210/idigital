package com.product.review.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.product.review.entity.Role;
import com.product.review.repository.RoleRepo;


@Service
public class RoleService {
@Autowired
RoleRepo roleRepo;


public Role createNewRole(Role role) {
	return roleRepo.save(role);
	}
}
