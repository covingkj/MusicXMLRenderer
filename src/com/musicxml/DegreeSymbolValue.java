//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.7 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.03.14 at 03:42:06 PM PDT 
//


package com.musicxml;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for degree-symbol-value.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="degree-symbol-value">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="major"/>
 *     &lt;enumeration value="minor"/>
 *     &lt;enumeration value="augmented"/>
 *     &lt;enumeration value="diminished"/>
 *     &lt;enumeration value="half-diminished"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "degree-symbol-value")
@XmlEnum
public enum DegreeSymbolValue {

    @XmlEnumValue("major")
    MAJOR("major"),
    @XmlEnumValue("minor")
    MINOR("minor"),
    @XmlEnumValue("augmented")
    AUGMENTED("augmented"),
    @XmlEnumValue("diminished")
    DIMINISHED("diminished"),
    @XmlEnumValue("half-diminished")
    HALF_DIMINISHED("half-diminished");
    private final java.lang.String value;

    DegreeSymbolValue(java.lang.String v) {
        value = v;
    }

    public java.lang.String value() {
        return value;
    }

    public static DegreeSymbolValue fromValue(java.lang.String v) {
        for (DegreeSymbolValue c: DegreeSymbolValue.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
