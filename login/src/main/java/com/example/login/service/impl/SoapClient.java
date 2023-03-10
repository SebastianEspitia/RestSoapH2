package com.example.login.service.impl;

import com.example.login.model.wsdl.LoginRequestType;

import com.example.login.model.wsdl.LoginResponseType;
import com.example.login.model.wsdl.ObjectFactory;
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

    public LoginResponseType getJwt(String user, String password) {

        ObjectFactory obj = new ObjectFactory();
        LoginResponseType response = new LoginResponseType();
        JAXBElement<LoginResponseType> resposeMsg;
        LoginRequestType request = new LoginRequestType();
        JAXBElement<LoginRequestType> requestMsg = obj.createLoginRequest(request);
        request.setUsuerAccount(user);
        request.setPassword(password);
        Jaxb2Marshaller marshaller = new Jaxb2Marshaller();
        marshaller.setContextPath("com.example.login.model.wsdl");
        WebServiceTemplate webServiceTemplate = new WebServiceTemplate();
        webServiceTemplate.setMarshaller(marshaller);
        webServiceTemplate.setUnmarshaller(marshaller);
        try {
            resposeMsg = (JAXBElement<LoginResponseType>) webServiceTemplate.marshalSendAndReceive(ruta,
                    requestMsg, new SoapActionCallback(soapaction));
            response = resposeMsg.getValue();
        } catch (Exception e) {
            log.info("error: " + e);
        }
        return response;
    }

}
