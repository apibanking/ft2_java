
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for beneficiaryType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="beneficiaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="beneficiaryCode" type="{http://www.quantiguous.com/services}beneficiaryCodeType"/>
 *         &lt;element name="beneficiaryDetail" type="{http://www.quantiguous.com/services}beneficiaryDetailType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "beneficiaryType", propOrder = {
    "beneficiaryCode",
    "beneficiaryDetail"
})
public class BeneficiaryType {

    protected String beneficiaryCode;
    protected BeneficiaryDetailType beneficiaryDetail;

    /**
     * Gets the value of the beneficiaryCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryCode() {
        return beneficiaryCode;
    }

    /**
     * Sets the value of the beneficiaryCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryCode(String value) {
        this.beneficiaryCode = value;
    }

    /**
     * Gets the value of the beneficiaryDetail property.
     * 
     * @return
     *     possible object is
     *     {@link BeneficiaryDetailType }
     *     
     */
    public BeneficiaryDetailType getBeneficiaryDetail() {
        return beneficiaryDetail;
    }

    /**
     * Sets the value of the beneficiaryDetail property.
     * 
     * @param value
     *     allowed object is
     *     {@link BeneficiaryDetailType }
     *     
     */
    public void setBeneficiaryDetail(BeneficiaryDetailType value) {
        this.beneficiaryDetail = value;
    }

}
