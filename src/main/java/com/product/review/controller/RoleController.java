package com.product.review.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.product.review.entity.Role;
import com.product.review.service.RoleService;



@RestController
public class RoleController {
@Autowired
RoleService roleService;
@PostMapping("/createNewRole")
public Role CreateNewRole(@RequestBody Role role) {
	return roleService.createNewRole(role);
	
}

}
