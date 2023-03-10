package com.example.device.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "ParameterResponse", description = "represents the characteristics of the device")
public class ParameterResponse {
    @Schema(name = "devices", type = "string", description = "devices")
    private String devices;
    @Schema(name = "numberUnits", type = "string", description = "number of units")
    private String numberUnits;
    @Schema(name = "price", type = "string", description = "price")
    private String price;
}
