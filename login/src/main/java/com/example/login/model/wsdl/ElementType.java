
package com.example.login.model.wsdl;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para elementType complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="elementType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="devices" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="numberUnits" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="price" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "elementType", propOrder = {
    "devices",
    "numberUnits",
    "price"
})
public class ElementType {

    @XmlElement(required = true)
    protected String devices;
    @XmlElement(required = true)
    protected String numberUnits;
    @XmlElement(required = true)
    protected String price;

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

    /**
     * Obtiene el valor de la propiedad numberUnits.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumberUnits() {
        return numberUnits;
    }

    /**
     * Define el valor de la propiedad numberUnits.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumberUnits(String value) {
        this.numberUnits = value;
    }

    /**
     * Obtiene el valor de la propiedad price.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPrice() {
        return price;
    }

    /**
     * Define el valor de la propiedad price.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPrice(String value) {
        this.price = value;
    }

}
