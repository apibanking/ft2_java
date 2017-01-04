
package com.quantiguous.services;

import java.math.BigInteger;
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
 *         &lt;element ref="{http://www.quantiguous.com/services}uniqueResponseNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}attemptNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}transferType"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}lowBalanceAlert"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}transactionStatus"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}nameWithBeneficiaryBank" minOccurs="0"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}requestReferenceNo"/>
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
    "uniqueResponseNo",
    "attemptNo",
    "transferType",
    "lowBalanceAlert",
    "transactionStatus",
    "nameWithBeneficiaryBank",
    "requestReferenceNo"
})
@XmlRootElement(name = "transferResponse")
public class TransferResponse {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueResponseNo;
    @XmlElement(required = true)
    protected BigInteger attemptNo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType transferType;
    protected boolean lowBalanceAlert;
    @XmlElement(required = true)
    protected TransactionStatusType transactionStatus;
    protected String nameWithBeneficiaryBank;
    @XmlElement(required = true)
    protected String requestReferenceNo;

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

    /**
     * Gets the value of the attemptNo property.
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAttemptNo() {
        return attemptNo;
    }

    /**
     * Sets the value of the attemptNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAttemptNo(BigInteger value) {
        this.attemptNo = value;
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

    /**
     * Gets the value of the nameWithBeneficiaryBank property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameWithBeneficiaryBank() {
        return nameWithBeneficiaryBank;
    }

    /**
     * Sets the value of the nameWithBeneficiaryBank property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameWithBeneficiaryBank(String value) {
        this.nameWithBeneficiaryBank = value;
    }

    /**
     * Gets the value of the requestReferenceNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestReferenceNo() {
        return requestReferenceNo;
    }

    /**
     * Sets the value of the requestReferenceNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestReferenceNo(String value) {
        this.requestReferenceNo = value;
    }

}
