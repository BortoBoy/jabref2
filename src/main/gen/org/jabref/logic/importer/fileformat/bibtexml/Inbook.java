//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2018.06.19 at 09:08:24 AM BRT 
//


package org.jabref.logic.importer.fileformat.bibtexml;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlElementRefs;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;choice>
 *           &lt;element name="author" type="{http://bibtexml.sf.net/}authorType"/>
 *         &lt;/choice>
 *         &lt;element name="title" type="{http://bibtexml.sf.net/}titleType"/>
 *         &lt;choice>
 *           &lt;group ref="{http://bibtexml.sf.net/}inbookGroup1"/>
 *           &lt;element name="pages" type="{http://bibtexml.sf.net/}pagesType"/>
 *         &lt;/choice>
 *         &lt;element name="publisher" type="{http://bibtexml.sf.net/}publisherType" minOccurs="0"/>
 *         &lt;element name="year" type="{http://bibtexml.sf.net/}yearType" minOccurs="0"/>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="volume" type="{http://bibtexml.sf.net/}volumeType"/>
 *           &lt;element name="number" type="{http://bibtexml.sf.net/}numberType"/>
 *         &lt;/choice>
 *         &lt;element name="series" type="{http://bibtexml.sf.net/}seriesType" minOccurs="0"/>
 *         &lt;element name="editor" type="{http://bibtexml.sf.net/}editorType"/>
 *         &lt;element name="type" type="{http://bibtexml.sf.net/}typeType" minOccurs="0"/>
 *         &lt;element name="address" type="{http://bibtexml.sf.net/}addressType" minOccurs="0"/>
 *         &lt;element name="edition" type="{http://bibtexml.sf.net/}editionType" minOccurs="0"/>
 *         &lt;element name="month" type="{http://bibtexml.sf.net/}monthType" minOccurs="0"/>
 *         &lt;element name="note" type="{http://bibtexml.sf.net/}noteType" minOccurs="0"/>
 *         &lt;group ref="{http://bibtexml.sf.net/}common"/>
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
    "content"
})
@XmlRootElement(name = "inbook")
public class Inbook {

    @XmlElementRefs({
        @XmlElementRef(name = "number", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "year", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "url", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "annotate", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "location", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "chapter", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "mrnumber", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "note", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "copyright", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "abstract", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "language", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "crossref", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "contents", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "edition", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "publisher", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "type", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "title", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "key", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "address", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "affiliation", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "volume", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "editor", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "author", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "isbn", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "month", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "issn", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "pages", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "lccn", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "size", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "series", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "keywords", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "doi", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "category", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false),
        @XmlElementRef(name = "price", namespace = "http://bibtexml.sf.net/", type = JAXBElement.class, required = false)
    })
    protected List<JAXBElement<?>> content;

    /**
     * Gets the rest of the content model. 
     * 
     * <p>
     * You are getting this "catch-all" property because of the following reason: 
     * The field name "Pages" is used by two different parts of a schema. See: 
     * line 405 of file:/home/ufscar/Desktop/borto/jabref2/src/main/resources/xjc/bibtexml/bibtexml.xsd
     * line 446 of file:/home/ufscar/Desktop/borto/jabref2/src/main/resources/xjc/bibtexml/bibtexml.xsd
     * <p>
     * To get rid of this property, apply a property customization to one 
     * of both of the following declarations to change their names: 
     * Gets the value of the content property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the content property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContent().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link XMLGregorianCalendar }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link BigInteger }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * {@link JAXBElement }{@code <}{@link String }{@code >}
     * 
     * 
     */
    public List<JAXBElement<?>> getContent() {
        if (content == null) {
            content = new ArrayList<JAXBElement<?>>();
        }
        return this.content;
    }

}
