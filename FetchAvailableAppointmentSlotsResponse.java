
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for fetchAvailableAppointmentSlotsResponse complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="fetchAvailableAppointmentSlotsResponse">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="return" type="{http://soap.integration.fsm.comarch.com/}availableSlots"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "fetchAvailableAppointmentSlotsResponse", propOrder = {
    "_return"
})
public class FetchAvailableAppointmentSlotsResponse {

    @XmlElement(name = "return", required = true)
    protected AvailableSlots _return;

    /**
     * Gets the value of the return property.
     * 
     * @return
     *     possible object is
     *     {@link AvailableSlots }
     *     
     */
    public AvailableSlots getReturn() {
        return _return;
    }

    /**
     * Sets the value of the return property.
     * 
     * @param value
     *     allowed object is
     *     {@link AvailableSlots }
     *     
     */
    public void setReturn(AvailableSlots value) {
        this._return = value;
    }

}
