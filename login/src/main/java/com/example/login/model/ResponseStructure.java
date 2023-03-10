package com.example.login.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "ResponseStructure", description = "represents the response structure")
public class ResponseStructure {
    @Schema(name = "code", type = "string", description = "represents the response status code")
    private Integer code;
    @Schema(name = "state", type = "string", description = "represents the response status")
    private String state;
    @Schema(name = "message", type = "string", description = "represents the response status message")
    private String message;
    @Schema(name = "response", type = "Response", description = "represents useful information")
    private Response response;
}
