package com.example.login.controller;

import com.example.login.common.Common;
import com.example.login.model.Response;
import com.example.login.model.ResponseStructure;
import com.example.login.service.impl.Implementation;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Description;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/login")
@Log4j2
public class Controller {

    Common common;

    @Autowired
    Implementation implementation;


    @ApiResponses( value = {@ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @Operation(summary = "get the security jwt")
    @GetMapping("/getJwt")
    public ResponseEntity<ResponseStructure> getJwt(@Parameter(description = "user")@RequestParam String user,@Parameter(description = "user password") @RequestParam String password) {
        ResponseStructure response = new ResponseStructure();
        try {
            Response res = implementation.getJWT(user,password);
            response.setCode(common.successfulCode);
            response.setState(common.successfulState);
            response.setMessage(common.taskMessage);
            response.setResponse(res);
            return new ResponseEntity<>(response, HttpStatus.OK);
        } catch (Exception e) {
            response.setCode(common.internalServerErrorCode);
            response.setState(common.noSuccessfulState);
            response.setMessage(common.internalServerErrorMessage);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

    @ApiResponses( value = {@ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @GetMapping("/validateJwt")
    @Operation(summary = "validate that the jwt is correct")
    public ResponseEntity<ResponseStructure> validateJwt(@Parameter(description = "jwt") @RequestParam String jwt) {
        ResponseStructure response = new ResponseStructure();

        try {
            boolean res = implementation.validateToken(jwt);
            if(res) {
                response.setCode(common.successfulCode);
                response.setState(common.successfulState);
                response.setMessage(common.validToken);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
            else{
                response.setCode(common.badRequestCode);
                response.setState(common.noSuccessfulState);
                response.setMessage(common.invalidToken);
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
        } catch (
                Exception e) {
            response.setCode(common.internalServerErrorCode);
            response.setState(common.noSuccessfulState);
            response.setMessage(common.internalServerErrorMessage);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
