//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.17 at 08:51:15 AM BRT 
//


package org.jabref.logic.importer.fileformat.medline;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for art.id.type.int.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="art.id.type.int">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="pubmed"/>
 *     &lt;enumeration value="medline"/>
 *     &lt;enumeration value="pmcid"/>
 *     &lt;enumeration value="pmcbook"/>
 *     &lt;enumeration value="bookaccession"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "art.id.type.int")
@XmlEnum
public enum ArtIdTypeInt {

    @XmlEnumValue("pubmed")
    PUBMED("pubmed"),
    @XmlEnumValue("medline")
    MEDLINE("medline"),
    @XmlEnumValue("pmcid")
    PMCID("pmcid"),
    @XmlEnumValue("pmcbook")
    PMCBOOK("pmcbook"),
    @XmlEnumValue("bookaccession")
    BOOKACCESSION("bookaccession");
    private final String value;

    ArtIdTypeInt(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ArtIdTypeInt fromValue(String v) {
        for (ArtIdTypeInt c: ArtIdTypeInt.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
