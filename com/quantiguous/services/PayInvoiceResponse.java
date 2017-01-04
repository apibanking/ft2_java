
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.quantiguous.com/services}version"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}uniqueResponseNo"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "version",
    "uniqueResponseNo"
})
@XmlRootElement(name = "payInvoiceResponse")
public class PayInvoiceResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueResponseNo;

    /**
     * Gets the value of the version property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * Sets the value of the version property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * Gets the value of the uniqueResponseNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueResponseNo() {
        return uniqueResponseNo;
    }

    /**
     * Sets the value of the uniqueResponseNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueResponseNo(String value) {
        this.uniqueResponseNo = value;
    }

}
