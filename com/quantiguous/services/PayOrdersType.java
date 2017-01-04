
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payOrdersType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payOrdersType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="numOrders" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payOrder" type="{http://www.quantiguous.com/services}payOrderType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payOrdersType", propOrder = {
    "numOrders",
    "payOrder"
})
public class PayOrdersType {

    @XmlElement(required = true)
    protected String numOrders;
    @XmlElement(required = true)
    protected PayOrderType payOrder;

    /**
     * Gets the value of the numOrders property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumOrders() {
        return numOrders;
    }

    /**
     * Sets the value of the numOrders property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumOrders(String value) {
        this.numOrders = value;
    }

    /**
     * Gets the value of the payOrder property.
     * 
     * @return
     *     possible object is
     *     {@link PayOrderType }
     *     
     */
    public PayOrderType getPayOrder() {
        return payOrder;
    }

    /**
     * Sets the value of the payOrder property.
     * 
     * @param value
     *     allowed object is
     *     {@link PayOrderType }
     *     
     */
    public void setPayOrder(PayOrderType value) {
        this.payOrder = value;
    }

}
