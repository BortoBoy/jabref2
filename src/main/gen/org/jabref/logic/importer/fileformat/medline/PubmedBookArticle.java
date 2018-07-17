//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.07.17 at 08:51:15 AM BRT 
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
 *         &lt;element ref="{}BookDocument"/>
 *         &lt;element ref="{}PubmedBookData" minOccurs="0"/>
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
    "bookDocument",
    "pubmedBookData"
})
@XmlRootElement(name = "PubmedBookArticle")
public class PubmedBookArticle {

    @XmlElement(name = "BookDocument", required = true)
    protected BookDocument bookDocument;
    @XmlElement(name = "PubmedBookData")
    protected PubmedBookData pubmedBookData;

    /**
     * Gets the value of the bookDocument property.
     * 
     * @return
     *     possible object is
     *     {@link BookDocument }
     *     
     */
    public BookDocument getBookDocument() {
        return bookDocument;
    }

    /**
     * Sets the value of the bookDocument property.
     * 
     * @param value
     *     allowed object is
     *     {@link BookDocument }
     *     
     */
    public void setBookDocument(BookDocument value) {
        this.bookDocument = value;
    }

    /**
     * Gets the value of the pubmedBookData property.
     * 
     * @return
     *     possible object is
     *     {@link PubmedBookData }
     *     
     */
    public PubmedBookData getPubmedBookData() {
        return pubmedBookData;
    }

    /**
     * Sets the value of the pubmedBookData property.
     * 
     * @param value
     *     allowed object is
     *     {@link PubmedBookData }
     *     
     */
    public void setPubmedBookData(PubmedBookData value) {
        this.pubmedBookData = value;
    }

}
