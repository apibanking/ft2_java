
package com.quantiguous.services;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for transferTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="transferTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="NEFT"/>
 *     &lt;enumeration value="IMPS"/>
 *     &lt;enumeration value="RTGS"/>
 *     &lt;enumeration value="FT"/>
 *     &lt;enumeration value="ANY"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "transferTypeType")
@XmlEnum
public enum TransferTypeType {

    NEFT,
    IMPS,
    RTGS,
    FT,
    ANY;

    public String value() {
        return name();
    }

    public static TransferTypeType fromValue(String v) {
        return valueOf(v);
    }

}
