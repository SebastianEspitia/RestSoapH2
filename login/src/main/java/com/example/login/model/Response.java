package com.example.login.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Response", description = "represents the structure of useful information")
public class Response {
    @Schema(name = "jwt", type = "string", description = "jwt")
    private String jwt;

}
