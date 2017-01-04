
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for payOrderType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="payOrderType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="payMode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payableAt" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payAmount" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="payeeName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="signedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="coSignedBy" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "payOrderType", propOrder = {
    "payMode",
    "payableAt",
    "payAmount",
    "payeeName",
    "signedBy",
    "coSignedBy"
})
public class PayOrderType {

    @XmlElement(required = true)
    protected String payMode;
    @XmlElement(required = true)
    protected String payableAt;
    @XmlElement(required = true)
    protected String payAmount;
    @XmlElement(required = true)
    protected String payeeName;
    @XmlElement(required = true)
    protected String signedBy;
    @XmlElement(required = true)
    protected String coSignedBy;

    /**
     * Gets the value of the payMode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayMode() {
        return payMode;
    }

    /**
     * Sets the value of the payMode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayMode(String value) {
        this.payMode = value;
    }

    /**
     * Gets the value of the payableAt property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayableAt() {
        return payableAt;
    }

    /**
     * Sets the value of the payableAt property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayableAt(String value) {
        this.payableAt = value;
    }

    /**
     * Gets the value of the payAmount property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayAmount() {
        return payAmount;
    }

    /**
     * Sets the value of the payAmount property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayAmount(String value) {
        this.payAmount = value;
    }

    /**
     * Gets the value of the payeeName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPayeeName() {
        return payeeName;
    }

    /**
     * Sets the value of the payeeName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPayeeName(String value) {
        this.payeeName = value;
    }

    /**
     * Gets the value of the signedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSignedBy() {
        return signedBy;
    }

    /**
     * Sets the value of the signedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSignedBy(String value) {
        this.signedBy = value;
    }

    /**
     * Gets the value of the coSignedBy property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCoSignedBy() {
        return coSignedBy;
    }

    /**
     * Sets the value of the coSignedBy property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCoSignedBy(String value) {
        this.coSignedBy = value;
    }

}
