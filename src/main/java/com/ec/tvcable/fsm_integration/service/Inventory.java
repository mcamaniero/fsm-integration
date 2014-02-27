
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElementRef;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for inventory complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="inventory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="node" type="{http://soap.integration.fsm.comarch.com/}node" minOccurs="0"/>
 *         &lt;element name="devices" type="{http://soap.integration.fsm.comarch.com/}devices" minOccurs="0"/>
 *         &lt;element name="services" type="{http://soap.integration.fsm.comarch.com/}services" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "inventory", propOrder = {
    "node",
    "devices",
    "services"
})
public class Inventory {

    @XmlElementRef(name = "node", type = JAXBElement.class)
    protected JAXBElement<Node> node;
    @XmlElementRef(name = "devices", type = JAXBElement.class)
    protected JAXBElement<Devices> devices;
    @XmlElementRef(name = "services", type = JAXBElement.class)
    protected JAXBElement<Services> services;

    /**
     * Gets the value of the node property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Node }{@code >}
     *     
     */
    public JAXBElement<Node> getNode() {
        return node;
    }

    /**
     * Sets the value of the node property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Node }{@code >}
     *     
     */
    public void setNode(JAXBElement<Node> value) {
        this.node = value;
    }

    /**
     * Gets the value of the devices property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Devices }{@code >}
     *     
     */
    public JAXBElement<Devices> getDevices() {
        return devices;
    }

    /**
     * Sets the value of the devices property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Devices }{@code >}
     *     
     */
    public void setDevices(JAXBElement<Devices> value) {
        this.devices = value;
    }

    /**
     * Gets the value of the services property.
     * 
     * @return
     *     possible object is
     *     {@link JAXBElement }{@code <}{@link Services }{@code >}
     *     
     */
    public JAXBElement<Services> getServices() {
        return services;
    }

    /**
     * Sets the value of the services property.
     * 
     * @param value
     *     allowed object is
     *     {@link JAXBElement }{@code <}{@link Services }{@code >}
     *     
     */
    public void setServices(JAXBElement<Services> value) {
        this.services = value;
    }

}
