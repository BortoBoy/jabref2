//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.19 at 09:08:23 AM BRT 
//


package org.jabref.logic.importer.fileformat.medline;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for anonymous complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{}DataBankName"/>
 *         &lt;element ref="{}AccessionNumberList" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "dataBankName",
    "accessionNumberList"
})
@XmlRootElement(name = "DataBank")
public class DataBank {

    @XmlElement(name = "DataBankName", required = true)
    protected String dataBankName;
    @XmlElement(name = "AccessionNumberList")
    protected AccessionNumberList accessionNumberList;

    /**
     * Gets the value of the dataBankName property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataBankName() {
        return dataBankName;
    }

    /**
     * Sets the value of the dataBankName property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataBankName(String value) {
        this.dataBankName = value;
    }

    /**
     * Gets the value of the accessionNumberList property.
     * 
     * @return
     *     possible object is
     *     {@link AccessionNumberList }
     *     
     */
    public AccessionNumberList getAccessionNumberList() {
        return accessionNumberList;
    }

    /**
     * Sets the value of the accessionNumberList property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccessionNumberList }
     *     
     */
    public void setAccessionNumberList(AccessionNumberList value) {
        this.accessionNumberList = value;
    }

}
