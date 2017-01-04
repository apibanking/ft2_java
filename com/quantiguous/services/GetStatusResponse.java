
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="transferType" type="{http://www.quantiguous.com/services}transferTypeType"/>
 *         &lt;element name="reqTransferType" type="{http://www.quantiguous.com/services}transferTypeType"/>
 *         &lt;element name="transactionDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="transferAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="transferCurrencyCode" type="{http://www.quantiguous.com/services}currencyCodeType"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}transactionStatus"/>
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
    "transferType",
    "reqTransferType",
    "transactionDate",
    "transferAmount",
    "transferCurrencyCode",
    "transactionStatus"
})
@XmlRootElement(name = "getStatusResponse")
public class GetStatusResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType transferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType reqTransferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar transactionDate;
    protected float transferAmount;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType transferCurrencyCode;
    @XmlElement(required = true)
    protected TransactionStatusType transactionStatus;

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
     * Gets the value of the reqTransferType property.
     * 
     * @return
     *     possible object is
     *     {@link TransferTypeType }
     *     
     */
    public TransferTypeType getReqTransferType() {
        return reqTransferType;
    }

    /**
     * Sets the value of the reqTransferType property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransferTypeType }
     *     
     */
    public void setReqTransferType(TransferTypeType value) {
        this.reqTransferType = value;
    }

    /**
     * Gets the value of the transactionDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getTransactionDate() {
        return transactionDate;
    }

    /**
     * Sets the value of the transactionDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setTransactionDate(XMLGregorianCalendar value) {
        this.transactionDate = value;
    }

    /**
     * Gets the value of the transferAmount property.
     * 
     */
    public float getTransferAmount() {
        return transferAmount;
    }

    /**
     * Sets the value of the transferAmount property.
     * 
     */
    public void setTransferAmount(float value) {
        this.transferAmount = value;
    }

    /**
     * Gets the value of the transferCurrencyCode property.
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getTransferCurrencyCode() {
        return transferCurrencyCode;
    }

    /**
     * Sets the value of the transferCurrencyCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setTransferCurrencyCode(CurrencyCodeType value) {
        this.transferCurrencyCode = value;
    }

    /**
     * Gets the value of the transactionStatus property.
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getTransactionStatus() {
        return transactionStatus;
    }

    /**
     * Sets the value of the transactionStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setTransactionStatus(TransactionStatusType value) {
        this.transactionStatus = value;
    }

}
