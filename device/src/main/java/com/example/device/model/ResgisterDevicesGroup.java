package com.example.device.model;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.util.List;

@Data
@Schema(name = "ResgisterDevicesGroup", description = "represents the device group")
public class ResgisterDevicesGroup {
    @Schema(name = "ResgisterDevicesGroup", type = "Element", description = "represents the device group")
    private List<Element> ResgisterDevicesGroup;
}
