
package com.quantiguous.services;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for taxesAppliedArray complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="taxesAppliedArray">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="taxItem" type="{http://www.quantiguous.com/services}taxAppliedItem" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "taxesAppliedArray", propOrder = {
    "taxItem"
})
public class TaxesAppliedArray {

    protected List<TaxAppliedItem> taxItem;

    /**
     * Gets the value of the taxItem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the taxItem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTaxItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxAppliedItem }
     * 
     * 
     */
    public List<TaxAppliedItem> getTaxItem() {
        if (taxItem == null) {
            taxItem = new ArrayList<TaxAppliedItem>();
        }
        return this.taxItem;
    }

}
