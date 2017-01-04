
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for invoiceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="invoiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="purchaseOrderNumber" type="{http://www.quantiguous.com/services}purchaseOrderNumberType"/>
 *         &lt;element name="invoiceNumber" type="{http://www.quantiguous.com/services}invoiceNumberType"/>
 *         &lt;element name="invoiceDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *         &lt;element name="invoiceAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="passedAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="taxesApplied" type="{http://www.quantiguous.com/services}taxesAppliedArray"/>
 *         &lt;element name="taxDeductedAtSource" type="{http://www.quantiguous.com/services}taxDeductedAtSourceType"/>
 *         &lt;element name="otherDeductions" type="{http://www.quantiguous.com/services}nonNegativeFloat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "invoiceType", propOrder = {
    "purchaseOrderNumber",
    "invoiceNumber",
    "invoiceDate",
    "invoiceAmount",
    "passedAmount",
    "taxesApplied",
    "taxDeductedAtSource",
    "otherDeductions"
})
public class InvoiceType {

    @XmlElement(required = true)
    protected String purchaseOrderNumber;
    @XmlElement(required = true)
    protected String invoiceNumber;
    @XmlElement(required = true)
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar invoiceDate;
    protected float invoiceAmount;
    protected float passedAmount;
    @XmlElement(required = true)
    protected TaxesAppliedArray taxesApplied;
    @XmlElement(required = true)
    protected TaxDeductedAtSourceType taxDeductedAtSource;
    protected float otherDeductions;

    /**
     * Gets the value of the purchaseOrderNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurchaseOrderNumber() {
        return purchaseOrderNumber;
    }

    /**
     * Sets the value of the purchaseOrderNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurchaseOrderNumber(String value) {
        this.purchaseOrderNumber = value;
    }

    /**
     * Gets the value of the invoiceNumber property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvoiceNumber() {
        return invoiceNumber;
    }

    /**
     * Sets the value of the invoiceNumber property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvoiceNumber(String value) {
        this.invoiceNumber = value;
    }

    /**
     * Gets the value of the invoiceDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getInvoiceDate() {
        return invoiceDate;
    }

    /**
     * Sets the value of the invoiceDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setInvoiceDate(XMLGregorianCalendar value) {
        this.invoiceDate = value;
    }

    /**
     * Gets the value of the invoiceAmount property.
     * 
     */
    public float getInvoiceAmount() {
        return invoiceAmount;
    }

    /**
     * Sets the value of the invoiceAmount property.
     * 
     */
    public void setInvoiceAmount(float value) {
        this.invoiceAmount = value;
    }

    /**
     * Gets the value of the passedAmount property.
     * 
     */
    public float getPassedAmount() {
        return passedAmount;
    }

    /**
     * Sets the value of the passedAmount property.
     * 
     */
    public void setPassedAmount(float value) {
        this.passedAmount = value;
    }

    /**
     * Gets the value of the taxesApplied property.
     * 
     * @return
     *     possible object is
     *     {@link TaxesAppliedArray }
     *     
     */
    public TaxesAppliedArray getTaxesApplied() {
        return taxesApplied;
    }

    /**
     * Sets the value of the taxesApplied property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesAppliedArray }
     *     
     */
    public void setTaxesApplied(TaxesAppliedArray value) {
        this.taxesApplied = value;
    }

    /**
     * Gets the value of the taxDeductedAtSource property.
     * 
     * @return
     *     possible object is
     *     {@link TaxDeductedAtSourceType }
     *     
     */
    public TaxDeductedAtSourceType getTaxDeductedAtSource() {
        return taxDeductedAtSource;
    }

    /**
     * Sets the value of the taxDeductedAtSource property.
     * 
     * @param value
     *     allowed object is
     *     {@link TaxDeductedAtSourceType }
     *     
     */
    public void setTaxDeductedAtSource(TaxDeductedAtSourceType value) {
        this.taxDeductedAtSource = value;
    }

    /**
     * Gets the value of the otherDeductions property.
     * 
     */
    public float getOtherDeductions() {
        return otherDeductions;
    }

    /**
     * Sets the value of the otherDeductions property.
     * 
     */
    public void setOtherDeductions(float value) {
        this.otherDeductions = value;
    }

}
