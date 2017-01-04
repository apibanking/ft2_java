
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for taxAppliedItem complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxAppliedItem">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="ST"/>
 *               &lt;enumeration value="VAT"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="accountingCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="accountingName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="taxRate" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="taxAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxAppliedItem", propOrder = {
    "taxType",
    "accountingCode",
    "accountingName",
    "taxRate",
    "taxAmount"
})
public class TaxAppliedItem {

    @XmlElement(required = true)
    protected String taxType;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String accountingCode;
    @XmlElement(required = true)
    protected String accountingName;
    protected float taxRate;
    protected float taxAmount;

    /**
     * Gets the value of the taxType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTaxType() {
        return taxType;
    }

    /**
     * Sets the value of the taxType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTaxType(String value) {
        this.taxType = value;
    }

    /**
     * Gets the value of the accountingCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingCode() {
        return accountingCode;
    }

    /**
     * Sets the value of the accountingCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingCode(String value) {
        this.accountingCode = value;
    }

    /**
     * Gets the value of the accountingName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountingName() {
        return accountingName;
    }

    /**
     * Sets the value of the accountingName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountingName(String value) {
        this.accountingName = value;
    }

    /**
     * Gets the value of the taxRate property.
     * 
     */
    public float getTaxRate() {
        return taxRate;
    }

    /**
     * Sets the value of the taxRate property.
     * 
     */
    public void setTaxRate(float value) {
        this.taxRate = value;
    }

    /**
     * Gets the value of the taxAmount property.
     * 
     */
    public float getTaxAmount() {
        return taxAmount;
    }

    /**
     * Sets the value of the taxAmount property.
     * 
     */
    public void setTaxAmount(float value) {
        this.taxAmount = value;
    }

}
