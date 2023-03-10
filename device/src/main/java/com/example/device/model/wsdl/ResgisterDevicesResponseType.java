
package com.example.device.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para resgisterDevicesResponseType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="resgisterDevicesResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="resgisterDevicesGroup" type="{http://local/proveedor/service}resgisterDevicesGroupType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "resgisterDevicesResponseType", propOrder = {
    "resgisterDevicesGroup"
})
public class ResgisterDevicesResponseType {

    @XmlElement(required = true)
    protected ResgisterDevicesGroupType resgisterDevicesGroup;

    /**
     * Obtiene el valor de la propiedad resgisterDevicesGroup.
     * 
     * @return
     *     possible object is
     *     {@link ResgisterDevicesGroupType }
     *     
     */
    public ResgisterDevicesGroupType getResgisterDevicesGroup() {
        return resgisterDevicesGroup;
    }

    /**
     * Define el valor de la propiedad resgisterDevicesGroup.
     * 
     * @param value
     *     allowed object is
     *     {@link ResgisterDevicesGroupType }
     *     
     */
    public void setResgisterDevicesGroup(ResgisterDevicesGroupType value) {
        this.resgisterDevicesGroup = value;
    }

}
