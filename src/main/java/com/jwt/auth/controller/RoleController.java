package com.jwt.auth.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.auth.entity.Role;
import com.jwt.auth.service.RoleService;

@RestController
public class RoleController {
@Autowired
RoleService roleService;
@PostMapping("/createNewRole")
public Role CreateNewRole(@RequestBody Role role) {
	return roleService.createNewRole(role);
	
}

}
