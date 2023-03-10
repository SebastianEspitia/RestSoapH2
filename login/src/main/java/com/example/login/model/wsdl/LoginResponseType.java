
package com.example.login.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para loginResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="loginResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="jwt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "loginResponseType", propOrder = {
    "jwt"
})
public class LoginResponseType {

    @XmlElement(required = true)
    protected String jwt;

    /**
     * Obtiene el valor de la propiedad jwt.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getJwt() {
        return jwt;
    }

    /**
     * Define el valor de la propiedad jwt.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setJwt(String value) {
        this.jwt = value;
    }

}
