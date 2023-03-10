package com.example.device.service.impl;

import com.example.device.model.wsdl.ObjectFactory;
import com.example.device.model.wsdl.ResgisterDevicesRequestType;
import com.example.device.model.wsdl.ResgisterDevicesResponseType;
import lombok.extern.log4j.Log4j2;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;
import org.springframework.stereotype.Component;
import org.springframework.ws.client.core.WebServiceTemplate;
import org.springframework.ws.client.core.support.WebServiceGatewaySupport;
import org.springframework.ws.soap.client.core.SoapActionCallback;

import javax.xml.bind.JAXBElement;

@Log4j2
@Component
public class SoapClient extends WebServiceGatewaySupport {

    @Value("${Spring.rutamock}")
    private String ruta;
    @Value("${Spring.soapaction}")
    private String soapaction;

    public ResgisterDevicesResponseType getDevice(String jwt) {



        ObjectFactory obj = new ObjectFactory();
        ResgisterDevicesResponseType response = new ResgisterDevicesResponseType();
        JAXBElement<ResgisterDevicesResponseType> resposeMsg;
        ResgisterDevicesRequestType request = new ResgisterDevicesRequestType();
        request.setDevices(jwt);


        JAXBElement<ResgisterDevicesRequestType> requestMsg = obj.createResgisterDevicesRequest(request);
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.device.model.wsdl");
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        try {
            resposeMsg = (JAXBElement<ResgisterDevicesResponseType>) webServiceTemplate.marshalSendAndReceive(ruta,
                    requestMsg, new SoapActionCallback(soapaction));
            response = resposeMsg.getValue();
        } catch (Exception e) {
            log.info("error: " + e);
        }
        return response;
    }
}
