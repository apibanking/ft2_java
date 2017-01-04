
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for supplierType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="supplierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="supplierCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="supplierDetail" type="{http://www.quantiguous.com/services}supplierDetailType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "supplierType", propOrder = {
    "supplierCode",
    "supplierDetail"
})
public class SupplierType {

    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String supplierCode;
    protected SupplierDetailType supplierDetail;

    /**
     * Gets the value of the supplierCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * Sets the value of the supplierCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * Gets the value of the supplierDetail property.
     * 
     * @return
     *     possible object is
     *     {@link SupplierDetailType }
     *     
     */
    public SupplierDetailType getSupplierDetail() {
        return supplierDetail;
    }

    /**
     * Sets the value of the supplierDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierDetailType }
     *     
     */
    public void setSupplierDetail(SupplierDetailType value) {
        this.supplierDetail = value;
    }

}
