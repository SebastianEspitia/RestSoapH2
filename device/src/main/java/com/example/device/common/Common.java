package com.example.device.common;

public interface Common {
    String successfulState = "ok";
    String noSuccessfulState = " no ok";
    Integer successfulCode = 200;
    Integer createdCode = 201;
    Integer badRequestCode = 400;
    Integer internalServerErrorCode = 500;
    String invalidToken = "invalid jwt";
    String validToken = "valid jwt";
    String taskMessage = "successful";
    String internalServerErrorMessage = "Internal service error";
}
