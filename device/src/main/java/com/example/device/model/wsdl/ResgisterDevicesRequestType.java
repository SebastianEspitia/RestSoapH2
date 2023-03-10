
package com.example.device.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resgisterDevicesRequestType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resgisterDevicesRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devices" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resgisterDevicesRequestType", propOrder = {
    "devices"
})
public class ResgisterDevicesRequestType {

    @XmlElement(required = true)
    protected String devices;

    /**
     * Obtiene el valor de la propiedad devices.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDevices() {
        return devices;
    }

    /**
     * Define el valor de la propiedad devices.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDevices(String value) {
        this.devices = value;
    }

}
