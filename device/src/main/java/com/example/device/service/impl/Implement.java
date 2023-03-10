package com.example.device.service.impl;

import com.example.device.consumption.Consumption;
import com.example.device.model.Element;
import com.example.device.model.ParameterResponse;
import com.example.device.model.ResgisterDevicesGroup;
import com.example.device.model.wsdl.ElementType;
import com.example.device.model.wsdl.ResgisterDevicesResponseType;
import com.fasterxml.jackson.databind.JsonNode;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@Log4j2
public class Implement {

    @Autowired
    SoapClient soapClient;

    public ResgisterDevicesGroup logic(String jwt, String devices) {


        ResgisterDevicesGroup resgisterDevicesGroup = new ResgisterDevicesGroup();
        boolean call = callGetUser(jwt);
        if (call) {
            ResgisterDevicesResponseType resgisterDevicesResponse = soapClient.getDevice(jwt);
            List<Element> elements = new ArrayList<>();
            for (ElementType element : resgisterDevicesResponse.getResgisterDevicesGroup().getElement()) {
                ParameterResponse parameterResponse = new ParameterResponse();
                Element elem = new Element();
                parameterResponse.setDevices(element.getDevices());
                parameterResponse.setPrice(element.getPrice());
                parameterResponse.setNumberUnits(element.getNumberUnits());
                elem.setElement(parameterResponse);
                elements.add(elem);
            }
            resgisterDevicesGroup.setResgisterDevicesGroup(elements);
        } else {
            resgisterDevicesGroup = null;
        }
        return resgisterDevicesGroup;
    }

    @Autowired
    Consumption consumption;

    @Value("${Spring.rutalogin}")
    private String rutalogin;

    public boolean callGetUser(String jwt) {
        boolean response = false;
        try {
            String ruta = rutalogin+"=" + jwt;
            JsonNode responseConsumption = consumption.consumo(ruta);
            response = true;
        } catch (Exception e) {
            log.info("error:   " + e);
        }
        return response;
    }

}
