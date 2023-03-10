package com.example.device.controller;

import com.example.device.common.Common;
import com.example.device.model.ResgisterDevicesGroup;
import com.example.device.model.ResponseStructure;
import com.example.device.service.impl.Implement;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@Log4j2
@RestController
@RequestMapping(path = "/device")
public class Controller {

    Common common;

    @Autowired
    Implement implement;

    @ApiResponses( value = {@ApiResponse(responseCode = "200", description = "OK"),
            @ApiResponse(responseCode = "400", description = "Bad Request"),
            @ApiResponse(responseCode = "500", description = "Internal Server Error")})
    @GetMapping("/allDevice")
    @Operation(summary = "get all devices, remember to implement the jwt")
    public ResponseEntity<ResponseStructure> getDevice(@Parameter(description = "jwt")@RequestHeader("jwt") String jwt, @Parameter(description = "devices")@RequestParam String devices) {
        ResponseStructure response = new ResponseStructure();
        try {
            ResgisterDevicesGroup res = implement.logic(jwt, devices);
            log.info(res);
            if(res!=null) {
                response.setCode(common.successfulCode);
                response.setState(common.successfulState);
                response.setMessage(common.taskMessage);
                response.setResponse(res);
                return new ResponseEntity<>(response, HttpStatus.OK);
            }
            else{
                response.setCode(common.badRequestCode);
                response.setState(common.noSuccessfulState);
                response.setMessage(common.invalidToken);
                return new ResponseEntity<>(response, HttpStatus.BAD_REQUEST);
            }
        } catch (Exception e) {
            response.setCode(common.internalServerErrorCode);
            response.setState(common.noSuccessfulState);
            response.setMessage(common.internalServerErrorMessage);
            return new ResponseEntity<>(response, HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }

}
