
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
 *         &lt;element ref="{http://www.quantiguous.com/services}version"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}uniqueRequestNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}customerID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}debitAccountNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}supplier"/>
 *         &lt;element name="transferType" type="{http://www.quantiguous.com/services}transferTypeType"/>
 *         &lt;element name="paymentCurrency" type="{http://www.quantiguous.com/services}currencyCodeType"/>
 *         &lt;element name="netPayableAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="invoice" type="{http://www.quantiguous.com/services}invoiceType"/>
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
    "uniqueRequestNo",
    "customerID",
    "debitAccountNo",
    "supplier",
    "transferType",
    "paymentCurrency",
    "netPayableAmount",
    "invoice"
})
@XmlRootElement(name = "payInvoice")
public class PayInvoice {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueRequestNo;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String debitAccountNo;
    @XmlElement(required = true)
    protected SupplierType supplier;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType transferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType paymentCurrency;
    protected float netPayableAmount;
    @XmlElement(required = true)
    protected InvoiceType invoice;

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
     * Gets the value of the uniqueRequestNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueRequestNo() {
        return uniqueRequestNo;
    }

    /**
     * Sets the value of the uniqueRequestNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueRequestNo(String value) {
        this.uniqueRequestNo = value;
    }

    /**
     * Gets the value of the customerID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCustomerID() {
        return customerID;
    }

    /**
     * Sets the value of the customerID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCustomerID(String value) {
        this.customerID = value;
    }

    /**
     * Gets the value of the debitAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDebitAccountNo() {
        return debitAccountNo;
    }

    /**
     * Sets the value of the debitAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDebitAccountNo(String value) {
        this.debitAccountNo = value;
    }

    /**
     * Gets the value of the supplier property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierType }
     *     
     */
    public SupplierType getSupplier() {
        return supplier;
    }

    /**
     * Sets the value of the supplier property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierType }
     *     
     */
    public void setSupplier(SupplierType value) {
        this.supplier = value;
    }

    /**
     * Gets the value of the transferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypeType }
     *     
     */
    public TransferTypeType getTransferType() {
        return transferType;
    }

    /**
     * Sets the value of the transferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypeType }
     *     
     */
    public void setTransferType(TransferTypeType value) {
        this.transferType = value;
    }

    /**
     * Gets the value of the paymentCurrency property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getPaymentCurrency() {
        return paymentCurrency;
    }

    /**
     * Sets the value of the paymentCurrency property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setPaymentCurrency(CurrencyCodeType value) {
        this.paymentCurrency = value;
    }

    /**
     * Gets the value of the netPayableAmount property.
     * 
     */
    public float getNetPayableAmount() {
        return netPayableAmount;
    }

    /**
     * Sets the value of the netPayableAmount property.
     * 
     */
    public void setNetPayableAmount(float value) {
        this.netPayableAmount = value;
    }

    /**
     * Gets the value of the invoice property.
     * 
     * @return
     *     possible object is
     *     {@link InvoiceType }
     *     
     */
    public InvoiceType getInvoice() {
        return invoice;
    }

    /**
     * Sets the value of the invoice property.
     * 
     * @param value
     *     allowed object is
     *     {@link InvoiceType }
     *     
     */
    public void setInvoice(InvoiceType value) {
        this.invoice = value;
    }

}
