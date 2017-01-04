
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Version" type="{http://www.quantiguous.com/services}versionType"/>
 *         &lt;element name="accountCurrencyCode" type="{http://www.quantiguous.com/services}currencyCodeType"/>
 *         &lt;element name="accountBalanceAmount" type="{http://www.quantiguous.com/services}nonNegativeFloat"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}lowBalanceAlert"/>
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
    "accountCurrencyCode",
    "accountBalanceAmount",
    "lowBalanceAlert"
})
@XmlRootElement(name = "getBalanceResponse")
public class GetBalanceResponse {

    @XmlElement(name = "Version", required = true)
    protected String version;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType accountCurrencyCode;
    protected float accountBalanceAmount;
    protected boolean lowBalanceAlert;

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
     * Gets the value of the accountCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getAccountCurrencyCode() {
        return accountCurrencyCode;
    }

    /**
     * Sets the value of the accountCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setAccountCurrencyCode(CurrencyCodeType value) {
        this.accountCurrencyCode = value;
    }

    /**
     * Gets the value of the accountBalanceAmount property.
     * 
     */
    public float getAccountBalanceAmount() {
        return accountBalanceAmount;
    }

    /**
     * Sets the value of the accountBalanceAmount property.
     * 
     */
    public void setAccountBalanceAmount(float value) {
        this.accountBalanceAmount = value;
    }

    /**
     * Gets the value of the lowBalanceAlert property.
     * 
     */
    public boolean isLowBalanceAlert() {
        return lowBalanceAlert;
    }

    /**
     * Sets the value of the lowBalanceAlert property.
     * 
     */
    public void setLowBalanceAlert(boolean value) {
        this.lowBalanceAlert = value;
    }

}
