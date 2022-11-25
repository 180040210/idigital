package com.jwt.auth.service;

import java.util.HashSet;
import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import com.jwt.auth.entity.Role;
import com.jwt.auth.entity.User1;
import com.jwt.auth.repository.RoleRepo;
import com.jwt.auth.repository.UserRepo;

@Service
public class UserService {
@Autowired
UserRepo userRepo;
@Autowired
RoleRepo roleRepo;
@Autowired
PasswordEncoder passwordEncoder;
public User1 createNewUser(User1 user) {
	return userRepo.save(user);
	
}
public void initRolesAndUser1() {
	// TODO Auto-generated method stub
	 Role adminRole = new Role();
     adminRole.setRoleName("Admin");
     adminRole.setRoleDescription("Admin role");
     roleRepo.save(adminRole);

     Role userRole = new Role();
     userRole.setRoleName("User");
     userRole.setRoleDescription("Default role for newly created record");
     roleRepo.save(userRole);

     User1 adminUser = new User1();
     adminUser.setUserName("admin123");
     adminUser.setUserPassword(getEncodedPassword("admin@pass"));
     adminUser.setUserFirstName("admin");
     adminUser.setUserLastName("admin");
     Set<Role> adminRoles = new HashSet<>();
     adminRoles.add(adminRole);
     adminUser.setRole(adminRoles);
     userRepo.save(adminUser);

     User1 user1 = new User1();
     user1.setUserName("raj123");
     user1.setUserPassword(getEncodedPassword("raj@123"));
     user1.setUserFirstName("raj");
     user1.setUserLastName("sharma");
     Set<Role> userRoles = new HashSet<>();
     userRoles.add(userRole);
     user1.setRole(userRoles);
     userRepo.save(user1);
 }
public String getEncodedPassword(String password) {
    return passwordEncoder.encode(password);
}
	
}

