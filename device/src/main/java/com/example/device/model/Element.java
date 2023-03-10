package com.example.device.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

@Data
@Schema(name = "Element", description = "represents each device")
public class Element {
    @Schema(name = "Element", type = "ParameterResponse", description = "represents each device")
    private ParameterResponse element;
}
