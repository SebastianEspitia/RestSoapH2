package com.example.login.service.impl;

import com.example.login.model.Response;
import com.example.login.model.entity.UserAuthentication;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@Log4j2
public class Implementation {

    @Autowired
    SoapClient soapClient;
    @Autowired
    CrudDB crud;

    public Response getJWT(String user, String password) {
        Response response = new Response();
        try {
            String valJwt = soapClient.getJwt(user, password).getJwt();
            response.setJwt(valJwt);
            UserAuthentication objUser = new UserAuthentication();
            objUser.setName(user);
            objUser.setJwt(valJwt);
            crud.insertUser(objUser);
        } catch (Exception e) {
            return null;
        }
        return response;
    }

    public boolean validateToken(String jwt) {
        boolean response = false;
        try {
            List<UserAuthentication> tokens = crud.findToken();
            for (UserAuthentication token : tokens) {
                if (token.getJwt().equals(jwt)) {
                    response = true;
                    return response;
                }
            }
        } catch (Exception e) {
            return response;
        }
        return response;
    }


}
