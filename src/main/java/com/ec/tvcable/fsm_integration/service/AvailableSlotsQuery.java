
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for availableSlotsQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="availableSlotsQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processCreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *         &lt;element name="orderType" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="orderTechnology" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventory" type="{http://soap.integration.fsm.comarch.com/}inventory" minOccurs="0"/>
 *         &lt;element name="location" type="{http://soap.integration.fsm.comarch.com/}location"/>
 *         &lt;element name="customer" type="{http://soap.integration.fsm.comarch.com/}customer" minOccurs="0"/>
 *         &lt;element name="additionalRequirements" type="{http://soap.integration.fsm.comarch.com/}additionalRequirements" minOccurs="0"/>
 *         &lt;element name="interval" type="{http://soap.integration.fsm.comarch.com/}timeInterval"/>
 *         &lt;element name="additionalTaskTypes" type="{http://soap.integration.fsm.comarch.com/}additionalTaskTypes" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "availableSlotsQuery", propOrder = {
    "sourceSystem",
    "processId",
    "processCreationDate",
    "orderType",
    "orderTechnology",
    "inventory",
    "location",
    "customer",
    "additionalRequirements",
    "interval",
    "additionalTaskTypes"
})
public class AvailableSlotsQuery {

    @XmlElement(required = true)
    protected String sourceSystem;
    @XmlElement(required = true)
    protected String processId;
    @XmlElement(required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar processCreationDate;
    @XmlElement(required = true)
    protected String orderType;
    @XmlElement(required = true)
    protected String orderTechnology;
    @XmlElementRef(name = "inventory", type = JAXBElement.class)
    protected JAXBElement<Inventory> inventory;
    @XmlElement(required = true)
    protected Location location;
    @XmlElementRef(name = "customer", type = JAXBElement.class)
    protected JAXBElement<Customer> customer;
    @XmlElementRef(name = "additionalRequirements", type = JAXBElement.class)
    protected JAXBElement<AdditionalRequirements> additionalRequirements;
    @XmlElement(required = true)
    protected TimeInterval interval;
    protected AdditionalTaskTypes additionalTaskTypes;

    /**
     * Gets the value of the sourceSystem property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceSystem() {
        return sourceSystem;
    }

    /**
     * Sets the value of the sourceSystem property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceSystem(String value) {
        this.sourceSystem = value;
    }

    /**
     * Gets the value of the processId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProcessId() {
        return processId;
    }

    /**
     * Sets the value of the processId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProcessId(String value) {
        this.processId = value;
    }

    /**
     * Gets the value of the processCreationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getProcessCreationDate() {
        return processCreationDate;
    }

    /**
     * Sets the value of the processCreationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setProcessCreationDate(XMLGregorianCalendar value) {
        this.processCreationDate = value;
    }

    /**
     * Gets the value of the orderType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderType() {
        return orderType;
    }

    /**
     * Sets the value of the orderType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderType(String value) {
        this.orderType = value;
    }

    /**
     * Gets the value of the orderTechnology property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrderTechnology() {
        return orderTechnology;
    }

    /**
     * Sets the value of the orderTechnology property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrderTechnology(String value) {
        this.orderTechnology = value;
    }

    /**
     * Gets the value of the inventory property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Inventory }{@code >}
     *     
     */
    public JAXBElement<Inventory> getInventory() {
        return inventory;
    }

    /**
     * Sets the value of the inventory property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Inventory }{@code >}
     *     
     */
    public void setInventory(JAXBElement<Inventory> value) {
        this.inventory = value;
    }

    /**
     * Gets the value of the location property.
     * 
     * @return
     *     possible object is
     *     {@link Location }
     *     
     */
    public Location getLocation() {
        return location;
    }

    /**
     * Sets the value of the location property.
     * 
     * @param value
     *     allowed object is
     *     {@link Location }
     *     
     */
    public void setLocation(Location value) {
        this.location = value;
    }

    /**
     * Gets the value of the customer property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public JAXBElement<Customer> getCustomer() {
        return customer;
    }

    /**
     * Sets the value of the customer property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Customer }{@code >}
     *     
     */
    public void setCustomer(JAXBElement<Customer> value) {
        this.customer = value;
    }

    /**
     * Gets the value of the additionalRequirements property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link AdditionalRequirements }{@code >}
     *     
     */
    public JAXBElement<AdditionalRequirements> getAdditionalRequirements() {
        return additionalRequirements;
    }

    /**
     * Sets the value of the additionalRequirements property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link AdditionalRequirements }{@code >}
     *     
     */
    public void setAdditionalRequirements(JAXBElement<AdditionalRequirements> value) {
        this.additionalRequirements = value;
    }

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
     * Gets the value of the additionalTaskTypes property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalTaskTypes }
     *     
     */
    public AdditionalTaskTypes getAdditionalTaskTypes() {
        return additionalTaskTypes;
    }

    /**
     * Sets the value of the additionalTaskTypes property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalTaskTypes }
     *     
     */
    public void setAdditionalTaskTypes(AdditionalTaskTypes value) {
        this.additionalTaskTypes = value;
    }

}
