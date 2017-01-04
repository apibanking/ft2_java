
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
 *         &lt;element ref="{http://www.quantiguous.com/services}appID" minOccurs="0"/>
 *         &lt;element name="purposeCode" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.quantiguous.com/services}purposeCode">
 *               &lt;pattern value="\w+"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.quantiguous.com/services}customerID"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}debitAccountNo"/>
 *         &lt;element ref="{http://www.quantiguous.com/services}beneficiary"/>
 *         &lt;element name="transferType" type="{http://www.quantiguous.com/services}transferTypeType"/>
 *         &lt;element name="transferCurrencyCode" type="{http://www.quantiguous.com/services}currencyCodeType"/>
 *         &lt;element name="transferAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="remitterToBeneficiaryInfo" type="{http://www.quantiguous.com/services}remitterToBeneficiaryInfoType"/>
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
    "appID",
    "purposeCode",
    "customerID",
    "debitAccountNo",
    "beneficiary",
    "transferType",
    "transferCurrencyCode",
    "transferAmount",
    "remitterToBeneficiaryInfo"
})
@XmlRootElement(name = "transfer")
public class Transfer {

    @XmlElement(required = true)
    protected String version;
    @XmlElement(required = true)
    protected String uniqueRequestNo;
    protected String appID;
    protected String purposeCode;
    @XmlElement(required = true)
    protected String customerID;
    @XmlElement(required = true)
    protected String debitAccountNo;
    @XmlElement(required = true)
    protected BeneficiaryType beneficiary;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected TransferTypeType transferType;
    @XmlElement(required = true)
    @XmlSchemaType(name = "token")
    protected CurrencyCodeType transferCurrencyCode;
    protected float transferAmount;
    @XmlElement(required = true)
    protected String remitterToBeneficiaryInfo;

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
     * Gets the value of the appID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * Sets the value of the appID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * Gets the value of the purposeCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPurposeCode() {
        return purposeCode;
    }

    /**
     * Sets the value of the purposeCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPurposeCode(String value) {
        this.purposeCode = value;
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
     * Gets the value of the beneficiary property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryType }
     *     
     */
    public BeneficiaryType getBeneficiary() {
        return beneficiary;
    }

    /**
     * Sets the value of the beneficiary property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryType }
     *     
     */
    public void setBeneficiary(BeneficiaryType value) {
        this.beneficiary = value;
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
     * Gets the value of the remitterToBeneficiaryInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRemitterToBeneficiaryInfo() {
        return remitterToBeneficiaryInfo;
    }

    /**
     * Sets the value of the remitterToBeneficiaryInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRemitterToBeneficiaryInfo(String value) {
        this.remitterToBeneficiaryInfo = value;
    }

}
