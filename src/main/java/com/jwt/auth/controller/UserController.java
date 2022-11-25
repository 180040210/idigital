package com.jwt.auth.controller;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jwt.auth.entity.User1;
import com.jwt.auth.service.UserService;
@RestController
public class UserController {
@Autowired
UserService userService;
@PostConstruct
public void initRoleAndUser() {
	userService.initRolesAndUser1();
}
@PostMapping("/createNewUser")
public User1 createNewUser(@RequestBody User1 user) {
	return userService.createNewUser(user);
	
}
@GetMapping("/forAdmin")
@PreAuthorize("hasRole('Admin')")
public String forAdmin(){
    return "This URL is only accessible to the admin";
}

@GetMapping({"/forUser"})
@PreAuthorize("hasRole('User')")
public String forUser(){
    return "This URL is only accessible to the user";
}
}
