//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vJAXB 2.1.10 in JDK 6 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.04.02 at 04:08:12 PM EDT 
//


package org.opengeoportal.ogc.wmc.jaxb;

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
 *         &lt;choice minOccurs="0">
 *           &lt;element ref="{http://www.opengis.net/sld}Normalize"/>
 *           &lt;element ref="{http://www.opengis.net/sld}Histogram"/>
 *         &lt;/choice>
 *         &lt;element ref="{http://www.opengis.net/sld}GammaValue" minOccurs="0"/>
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
    "normalize",
    "histogram",
    "gammaValue"
})
@XmlRootElement(name = "ContrastEnhancement")
public class ContrastEnhancement {

    @XmlElement(name = "Normalize")
    protected Normalize normalize;
    @XmlElement(name = "Histogram")
    protected Histogram histogram;
    @XmlElement(name = "GammaValue")
    protected Double gammaValue;

    /**
     * Gets the value of the normalize property.
     * 
     * @return
     *     possible object is
     *     {@link Normalize }
     *     
     */
    public Normalize getNormalize() {
        return normalize;
    }

    /**
     * Sets the value of the normalize property.
     * 
     * @param value
     *     allowed object is
     *     {@link Normalize }
     *     
     */
    public void setNormalize(Normalize value) {
        this.normalize = value;
    }

    /**
     * Gets the value of the histogram property.
     * 
     * @return
     *     possible object is
     *     {@link Histogram }
     *     
     */
    public Histogram getHistogram() {
        return histogram;
    }

    /**
     * Sets the value of the histogram property.
     * 
     * @param value
     *     allowed object is
     *     {@link Histogram }
     *     
     */
    public void setHistogram(Histogram value) {
        this.histogram = value;
    }

    /**
     * Gets the value of the gammaValue property.
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getGammaValue() {
        return gammaValue;
    }

    /**
     * Sets the value of the gammaValue property.
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setGammaValue(Double value) {
        this.gammaValue = value;
    }

}
