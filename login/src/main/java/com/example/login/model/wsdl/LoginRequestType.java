
package com.example.login.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loginRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="usuerAccount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="password" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginRequestType", propOrder = {
    "usuerAccount",
    "password"
})
public class LoginRequestType {

    @XmlElement(required = true)
    protected String usuerAccount;
    @XmlElement(required = true)
    protected String password;

    /**
     * Obtiene el valor de la propiedad usuerAccount.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUsuerAccount() {
        return usuerAccount;
    }

    /**
     * Define el valor de la propiedad usuerAccount.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUsuerAccount(String value) {
        this.usuerAccount = value;
    }

    /**
     * Obtiene el valor de la propiedad password.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassword() {
        return password;
    }

    /**
     * Define el valor de la propiedad password.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassword(String value) {
        this.password = value;
    }

}
