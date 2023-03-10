package com.example.login.repository;


import com.example.login.model.entity.UserAuthentication;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Repository extends JpaRepository<UserAuthentication,Long> {

}
