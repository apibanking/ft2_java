
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for currencyCodeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="currencyCodeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="INR"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "currencyCodeType")
@XmlEnum
public enum CurrencyCodeType {

    INR;

    public String value() {
        return name();
    }

    public static CurrencyCodeType fromValue(String v) {
        return valueOf(v);
    }

}
