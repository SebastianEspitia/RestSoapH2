package com.example.login.service.impl;

import com.example.login.model.entity.UserAuthentication;
import com.example.login.repository.Repository;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class CrudDB {

    @Autowired
    Repository repository;

    public UserAuthentication insertUser(UserAuthentication data) {
        try {
            return repository.save(data);
        }catch (Exception e){return null;}
    }

    public List<UserAuthentication> findToken() {
        try {
            List<UserAuthentication> response = repository.findAll();
            return response;
        }catch (Exception e){return null;}
    }
}
