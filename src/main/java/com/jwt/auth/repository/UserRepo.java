package com.jwt.auth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.jwt.auth.entity.User1;
@Repository
public interface UserRepo extends JpaRepository<User1, String> {

}
