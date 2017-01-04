
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>Java class for taxDeductedAtSourceType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxDeductedAtSourceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sectionCode" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="sectionName" type="{http://www.w3.org/2001/XMLSchema}token"/>
 *         &lt;element name="deductionRate" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *         &lt;element name="deductedAmount" type="{http://www.quantiguous.com/services}positiveFloat"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxDeductedAtSourceType", propOrder = {
    "sectionCode",
    "sectionName",
    "deductionRate",
    "deductedAmount"
})
public class TaxDeductedAtSourceType {

    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sectionCode;
    @XmlElement(required = true)
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "token")
    protected String sectionName;
    protected float deductionRate;
    protected float deductedAmount;

    /**
     * Gets the value of the sectionCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionCode() {
        return sectionCode;
    }

    /**
     * Sets the value of the sectionCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionCode(String value) {
        this.sectionCode = value;
    }

    /**
     * Gets the value of the sectionName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSectionName() {
        return sectionName;
    }

    /**
     * Sets the value of the sectionName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSectionName(String value) {
        this.sectionName = value;
    }

    /**
     * Gets the value of the deductionRate property.
     * 
     */
    public float getDeductionRate() {
        return deductionRate;
    }

    /**
     * Sets the value of the deductionRate property.
     * 
     */
    public void setDeductionRate(float value) {
        this.deductionRate = value;
    }

    /**
     * Gets the value of the deductedAmount property.
     * 
     */
    public float getDeductedAmount() {
        return deductedAmount;
    }

    /**
     * Sets the value of the deductedAmount property.
     * 
     */
    public void setDeductedAmount(float value) {
        this.deductedAmount = value;
    }

}
