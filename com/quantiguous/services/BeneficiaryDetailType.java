
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beneficiaryDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beneficiaryDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.quantiguous.com/services}beneficiaryName"/>
 *         &lt;element name="beneficiaryAddress" type="{http://www.quantiguous.com/services}AddressType" minOccurs="0"/>
 *         &lt;element name="beneficiaryContact" type="{http://www.quantiguous.com/services}contactType"/>
 *         &lt;element name="beneficiaryAccountNo" type="{http://www.quantiguous.com/services}beneficiaryAccountNoType"/>
 *         &lt;element name="beneficiaryIFSC" type="{http://www.quantiguous.com/services}IFSCType"/>
 *         &lt;element name="beneficiaryMobileNo" type="{http://www.quantiguous.com/services}MobileNoType" minOccurs="0"/>
 *         &lt;element name="beneficiaryMMID" type="{http://www.quantiguous.com/services}MMIDType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiaryDetailType", propOrder = {
    "beneficiaryName",
    "beneficiaryAddress",
    "beneficiaryContact",
    "beneficiaryAccountNo",
    "beneficiaryIFSC",
    "beneficiaryMobileNo",
    "beneficiaryMMID"
})
public class BeneficiaryDetailType {

    @XmlElement(required = true)
    protected NameType beneficiaryName;
    protected AddressType beneficiaryAddress;
    @XmlElement(required = true)
    protected ContactType beneficiaryContact;
    @XmlElement(required = true)
    protected String beneficiaryAccountNo;
    @XmlElement(required = true)
    protected String beneficiaryIFSC;
    protected String beneficiaryMobileNo;
    protected String beneficiaryMMID;

    /**
     * The name of the beneficiary
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getBeneficiaryName() {
        return beneficiaryName;
    }

    /**
     * Sets the value of the beneficiaryName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setBeneficiaryName(NameType value) {
        this.beneficiaryName = value;
    }

    /**
     * Gets the value of the beneficiaryAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getBeneficiaryAddress() {
        return beneficiaryAddress;
    }

    /**
     * Sets the value of the beneficiaryAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setBeneficiaryAddress(AddressType value) {
        this.beneficiaryAddress = value;
    }

    /**
     * Gets the value of the beneficiaryContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getBeneficiaryContact() {
        return beneficiaryContact;
    }

    /**
     * Sets the value of the beneficiaryContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setBeneficiaryContact(ContactType value) {
        this.beneficiaryContact = value;
    }

    /**
     * Gets the value of the beneficiaryAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryAccountNo() {
        return beneficiaryAccountNo;
    }

    /**
     * Sets the value of the beneficiaryAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryAccountNo(String value) {
        this.beneficiaryAccountNo = value;
    }

    /**
     * Gets the value of the beneficiaryIFSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIFSC() {
        return beneficiaryIFSC;
    }

    /**
     * Sets the value of the beneficiaryIFSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIFSC(String value) {
        this.beneficiaryIFSC = value;
    }

    /**
     * Gets the value of the beneficiaryMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryMobileNo() {
        return beneficiaryMobileNo;
    }

    /**
     * Sets the value of the beneficiaryMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryMobileNo(String value) {
        this.beneficiaryMobileNo = value;
    }

    /**
     * Gets the value of the beneficiaryMMID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryMMID() {
        return beneficiaryMMID;
    }

    /**
     * Sets the value of the beneficiaryMMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryMMID(String value) {
        this.beneficiaryMMID = value;
    }

}
