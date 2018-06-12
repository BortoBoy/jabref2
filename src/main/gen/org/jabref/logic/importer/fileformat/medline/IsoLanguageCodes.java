//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.12 at 09:09:45 AM BRT 
//


package org.jabref.logic.importer.fileformat.medline;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for iso.language.codes.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="iso.language.codes">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="AF"/>
 *     &lt;enumeration value="AR"/>
 *     &lt;enumeration value="AZ"/>
 *     &lt;enumeration value="BG"/>
 *     &lt;enumeration value="CS"/>
 *     &lt;enumeration value="DA"/>
 *     &lt;enumeration value="DE"/>
 *     &lt;enumeration value="EN"/>
 *     &lt;enumeration value="EL"/>
 *     &lt;enumeration value="ES"/>
 *     &lt;enumeration value="FA"/>
 *     &lt;enumeration value="FI"/>
 *     &lt;enumeration value="FR"/>
 *     &lt;enumeration value="HE"/>
 *     &lt;enumeration value="HU"/>
 *     &lt;enumeration value="HY"/>
 *     &lt;enumeration value="IN"/>
 *     &lt;enumeration value="IS"/>
 *     &lt;enumeration value="IT"/>
 *     &lt;enumeration value="IW"/>
 *     &lt;enumeration value="JA"/>
 *     &lt;enumeration value="KA"/>
 *     &lt;enumeration value="KO"/>
 *     &lt;enumeration value="LT"/>
 *     &lt;enumeration value="MK"/>
 *     &lt;enumeration value="ML"/>
 *     &lt;enumeration value="NL"/>
 *     &lt;enumeration value="NO"/>
 *     &lt;enumeration value="PL"/>
 *     &lt;enumeration value="PT"/>
 *     &lt;enumeration value="PS"/>
 *     &lt;enumeration value="RO"/>
 *     &lt;enumeration value="RU"/>
 *     &lt;enumeration value="SL"/>
 *     &lt;enumeration value="SK"/>
 *     &lt;enumeration value="SQ"/>
 *     &lt;enumeration value="SR"/>
 *     &lt;enumeration value="SV"/>
 *     &lt;enumeration value="SW"/>
 *     &lt;enumeration value="TH"/>
 *     &lt;enumeration value="TR"/>
 *     &lt;enumeration value="UK"/>
 *     &lt;enumeration value="VI"/>
 *     &lt;enumeration value="ZH"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "iso.language.codes")
@XmlEnum
public enum IsoLanguageCodes {

    AF,
    AR,
    AZ,
    BG,
    CS,
    DA,
    DE,
    EN,
    EL,
    ES,
    FA,
    FI,
    FR,
    HE,
    HU,
    HY,
    IN,
    IS,
    IT,
    IW,
    JA,
    KA,
    KO,
    LT,
    MK,
    ML,
    NL,
    NO,
    PL,
    PT,
    PS,
    RO,
    RU,
    SL,
    SK,
    SQ,
    SR,
    SV,
    SW,
    TH,
    TR,
    UK,
    VI,
    ZH;

    public String value() {
        return name();
    }

    public static IsoLanguageCodes fromValue(String v) {
        return valueOf(v);
    }

}
