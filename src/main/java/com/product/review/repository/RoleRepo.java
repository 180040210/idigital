package com.product.review.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.product.review.entity.Role;

@Repository
public interface RoleRepo extends JpaRepository<Role, String>{

}
