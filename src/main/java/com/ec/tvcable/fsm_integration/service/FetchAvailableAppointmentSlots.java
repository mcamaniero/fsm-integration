
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchAvailableAppointmentSlots complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchAvailableAppointmentSlots">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="query" type="{http://soap.integration.fsm.comarch.com/}availableSlotsQuery"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchAvailableAppointmentSlots", propOrder = {
    "query"
})
public class FetchAvailableAppointmentSlots {

    @XmlElement(required = true)
    protected AvailableSlotsQuery query;

    /**
     * Gets the value of the query property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSlotsQuery }
     *     
     */
    public AvailableSlotsQuery getQuery() {
        return query;
    }

    /**
     * Sets the value of the query property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSlotsQuery }
     *     
     */
    public void setQuery(AvailableSlotsQuery value) {
        this.query = value;
    }

}
