
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for slot complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="slot">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="interval" type="{http://soap.integration.fsm.comarch.com/}timeInterval"/>
 *         &lt;element name="goodness" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="variantsQuantity" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *         &lt;element name="fulfillmentPartner" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "slot", propOrder = {
    "interval",
    "goodness",
    "variantsQuantity",
    "fulfillmentPartner"
})
public class Slot {

    @XmlElement(required = true)
    protected TimeInterval interval;
    @XmlElement(required = true)
    protected String goodness;
    protected int variantsQuantity;
    protected String fulfillmentPartner;

    /**
     * Gets the value of the interval property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getInterval() {
        return interval;
    }

    /**
     * Sets the value of the interval property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setInterval(TimeInterval value) {
        this.interval = value;
    }

    /**
     * Gets the value of the goodness property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGoodness() {
        return goodness;
    }

    /**
     * Sets the value of the goodness property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGoodness(String value) {
        this.goodness = value;
    }

    /**
     * Gets the value of the variantsQuantity property.
     * 
     */
    public int getVariantsQuantity() {
        return variantsQuantity;
    }

    /**
     * Sets the value of the variantsQuantity property.
     * 
     */
    public void setVariantsQuantity(int value) {
        this.variantsQuantity = value;
    }

    /**
     * Gets the value of the fulfillmentPartner property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFulfillmentPartner() {
        return fulfillmentPartner;
    }

    /**
     * Sets the value of the fulfillmentPartner property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFulfillmentPartner(String value) {
        this.fulfillmentPartner = value;
    }

}
