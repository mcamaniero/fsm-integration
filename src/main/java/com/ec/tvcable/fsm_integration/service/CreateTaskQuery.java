
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for createTaskQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="createTaskQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="workOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="inventory" type="{http://soap.integration.fsm.comarch.com/}inventory" minOccurs="0"/>
 *         &lt;element name="location" type="{http://soap.integration.fsm.comarch.com/}location"/>
 *         &lt;element name="customer" type="{http://soap.integration.fsm.comarch.com/}customer" minOccurs="0"/>
 *         &lt;element name="additionalRequirements" type="{http://soap.integration.fsm.comarch.com/}additionalRequirements" minOccurs="0"/>
 *         &lt;element name="slot" type="{http://soap.integration.fsm.comarch.com/}timeInterval"/>
 *         &lt;element name="notes" type="{http://soap.integration.fsm.comarch.com/}notes" minOccurs="0"/>
 *         &lt;element name="attributes" type="{http://soap.integration.fsm.comarch.com/}attributes" minOccurs="0"/>
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
@XmlType(name = "createTaskQuery", propOrder = {
    "sourceSystem",
    "processId",
    "workOrderId",
    "inventory",
    "location",
    "customer",
    "additionalRequirements",
    "slot",
    "notes",
    "attributes",
    "additionalTaskTypes"
})
public class CreateTaskQuery {

    @XmlElement(required = true)
    protected String sourceSystem;
    @XmlElement(required = true)
    protected String processId;
    @XmlElement(required = true)
    protected String workOrderId;
    @XmlElementRef(name = "inventory", type = JAXBElement.class)
    protected JAXBElement<Inventory> inventory;
    @XmlElement(required = true)
    protected Location location;
    @XmlElementRef(name = "customer", type = JAXBElement.class)
    protected JAXBElement<Customer> customer;
    @XmlElementRef(name = "additionalRequirements", type = JAXBElement.class)
    protected JAXBElement<AdditionalRequirements> additionalRequirements;
    @XmlElement(required = true)
    protected TimeInterval slot;
    protected Notes notes;
    protected Attributes attributes;
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
     * Gets the value of the workOrderId property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWorkOrderId() {
        return workOrderId;
    }

    /**
     * Sets the value of the workOrderId property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWorkOrderId(String value) {
        this.workOrderId = value;
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
     * Gets the value of the slot property.
     * 
     * @return
     *     possible object is
     *     {@link TimeInterval }
     *     
     */
    public TimeInterval getSlot() {
        return slot;
    }

    /**
     * Sets the value of the slot property.
     * 
     * @param value
     *     allowed object is
     *     {@link TimeInterval }
     *     
     */
    public void setSlot(TimeInterval value) {
        this.slot = value;
    }

    /**
     * Gets the value of the notes property.
     * 
     * @return
     *     possible object is
     *     {@link Notes }
     *     
     */
    public Notes getNotes() {
        return notes;
    }

    /**
     * Sets the value of the notes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Notes }
     *     
     */
    public void setNotes(Notes value) {
        this.notes = value;
    }

    /**
     * Gets the value of the attributes property.
     * 
     * @return
     *     possible object is
     *     {@link Attributes }
     *     
     */
    public Attributes getAttributes() {
        return attributes;
    }

    /**
     * Sets the value of the attributes property.
     * 
     * @param value
     *     allowed object is
     *     {@link Attributes }
     *     
     */
    public void setAttributes(Attributes value) {
        this.attributes = value;
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
