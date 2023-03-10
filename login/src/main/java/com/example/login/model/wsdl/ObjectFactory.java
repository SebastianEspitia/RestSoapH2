
package com.example.login.model.wsdl;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the local.proveedor.service package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _ResgisterDevicesResponse_QNAME = new QName("http://local/proveedor/service", "resgisterDevicesResponse");
    private final static QName _LoginResponse_QNAME = new QName("http://local/proveedor/service", "loginResponse");
    private final static QName _ResgisterDevicesRequest_QNAME = new QName("http://local/proveedor/service", "resgisterDevicesRequest");
    private final static QName _LoginRequest_QNAME = new QName("http://local/proveedor/service", "loginRequest");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: local.proveedor.service
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link LoginResponseType }
     * 
     */
    public LoginResponseType createLoginResponseType() {
        return new LoginResponseType();
    }

    /**
     * Create an instance of {@link ResgisterDevicesRequestType }
     * 
     */
    public ResgisterDevicesRequestType createResgisterDevicesRequestType() {
        return new ResgisterDevicesRequestType();
    }

    /**
     * Create an instance of {@link LoginRequestType }
     * 
     */
    public LoginRequestType createLoginRequestType() {
        return new LoginRequestType();
    }

    /**
     * Create an instance of {@link ResgisterDevicesResponseType }
     * 
     */
    public ResgisterDevicesResponseType createResgisterDevicesResponseType() {
        return new ResgisterDevicesResponseType();
    }

    /**
     * Create an instance of {@link ResgisterDevicesGroupType }
     * 
     */
    public ResgisterDevicesGroupType createResgisterDevicesGroupType() {
        return new ResgisterDevicesGroupType();
    }

    /**
     * Create an instance of {@link ElementType }
     * 
     */
    public ElementType createElementType() {
        return new ElementType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResgisterDevicesResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local/proveedor/service", name = "resgisterDevicesResponse")
    public JAXBElement<ResgisterDevicesResponseType> createResgisterDevicesResponse(ResgisterDevicesResponseType value) {
        return new JAXBElement<ResgisterDevicesResponseType>(_ResgisterDevicesResponse_QNAME, ResgisterDevicesResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local/proveedor/service", name = "loginResponse")
    public JAXBElement<LoginResponseType> createLoginResponse(LoginResponseType value) {
        return new JAXBElement<LoginResponseType>(_LoginResponse_QNAME, LoginResponseType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link ResgisterDevicesRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local/proveedor/service", name = "resgisterDevicesRequest")
    public JAXBElement<ResgisterDevicesRequestType> createResgisterDevicesRequest(ResgisterDevicesRequestType value) {
        return new JAXBElement<ResgisterDevicesRequestType>(_ResgisterDevicesRequest_QNAME, ResgisterDevicesRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link LoginRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://local/proveedor/service", name = "loginRequest")
    public JAXBElement<LoginRequestType> createLoginRequest(LoginRequestType value) {
        return new JAXBElement<LoginRequestType>(_LoginRequest_QNAME, LoginRequestType.class, null, value);
    }

}
