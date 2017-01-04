
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for supplierDetailType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplierDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="supplierName" type="{http://www.quantiguous.com/services}nameType"/>
 *         &lt;element name="supplierAddress" type="{http://www.quantiguous.com/services}AddressType"/>
 *         &lt;element name="supplierContact" type="{http://www.quantiguous.com/services}contactType"/>
 *         &lt;element name="supplierAccountNo" type="{http://www.quantiguous.com/services}accountNoType"/>
 *         &lt;element name="supplierIFSC" type="{http://www.quantiguous.com/services}IFSCType"/>
 *         &lt;element name="supplierMobileNo" type="{http://www.quantiguous.com/services}MobileNoType"/>
 *         &lt;element name="supplierMMID" type="{http://www.quantiguous.com/services}MMIDType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplierDetailType", propOrder = {
    "supplierName",
    "supplierAddress",
    "supplierContact",
    "supplierAccountNo",
    "supplierIFSC",
    "supplierMobileNo",
    "supplierMMID"
})
public class SupplierDetailType {

    @XmlElement(required = true)
    protected NameType supplierName;
    @XmlElement(required = true)
    protected AddressType supplierAddress;
    @XmlElement(required = true)
    protected ContactType supplierContact;
    @XmlElement(required = true)
    protected String supplierAccountNo;
    @XmlElement(required = true)
    protected String supplierIFSC;
    @XmlElement(required = true)
    protected String supplierMobileNo;
    @XmlElement(required = true)
    protected String supplierMMID;

    /**
     * Gets the value of the supplierName property.
     * 
     * @return
     *     possible object is
     *     {@link NameType }
     *     
     */
    public NameType getSupplierName() {
        return supplierName;
    }

    /**
     * Sets the value of the supplierName property.
     * 
     * @param value
     *     allowed object is
     *     {@link NameType }
     *     
     */
    public void setSupplierName(NameType value) {
        this.supplierName = value;
    }

    /**
     * Gets the value of the supplierAddress property.
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getSupplierAddress() {
        return supplierAddress;
    }

    /**
     * Sets the value of the supplierAddress property.
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setSupplierAddress(AddressType value) {
        this.supplierAddress = value;
    }

    /**
     * Gets the value of the supplierContact property.
     * 
     * @return
     *     possible object is
     *     {@link ContactType }
     *     
     */
    public ContactType getSupplierContact() {
        return supplierContact;
    }

    /**
     * Sets the value of the supplierContact property.
     * 
     * @param value
     *     allowed object is
     *     {@link ContactType }
     *     
     */
    public void setSupplierContact(ContactType value) {
        this.supplierContact = value;
    }

    /**
     * Gets the value of the supplierAccountNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAccountNo() {
        return supplierAccountNo;
    }

    /**
     * Sets the value of the supplierAccountNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAccountNo(String value) {
        this.supplierAccountNo = value;
    }

    /**
     * Gets the value of the supplierIFSC property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierIFSC() {
        return supplierIFSC;
    }

    /**
     * Sets the value of the supplierIFSC property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierIFSC(String value) {
        this.supplierIFSC = value;
    }

    /**
     * Gets the value of the supplierMobileNo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierMobileNo() {
        return supplierMobileNo;
    }

    /**
     * Sets the value of the supplierMobileNo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierMobileNo(String value) {
        this.supplierMobileNo = value;
    }

    /**
     * Gets the value of the supplierMMID property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierMMID() {
        return supplierMMID;
    }

    /**
     * Sets the value of the supplierMMID property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierMMID(String value) {
        this.supplierMMID = value;
    }

}
