
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for workOrderQuery complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="workOrderQuery">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="key">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;choice>
 *                     &lt;element name="workOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                     &lt;element name="processSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;/choice>
 *                   &lt;element name="interval" type="{http://soap.integration.fsm.comarch.com/}timeInterval" minOccurs="0"/>
 *                   &lt;element name="customer" type="{http://soap.integration.fsm.comarch.com/}customerQuery" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "workOrderQuery", propOrder = {
    "sourceSystem",
    "processId",
    "key"
})
public class WorkOrderQuery {

    @XmlElement(required = true)
    protected String sourceSystem;
    @XmlElement(required = true)
    protected String processId;
    @XmlElement(required = true)
    protected WorkOrderQuery.Key key;

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
     * Gets the value of the key property.
     * 
     * @return
     *     possible object is
     *     {@link WorkOrderQuery.Key }
     *     
     */
    public WorkOrderQuery.Key getKey() {
        return key;
    }

    /**
     * Sets the value of the key property.
     * 
     * @param value
     *     allowed object is
     *     {@link WorkOrderQuery.Key }
     *     
     */
    public void setKey(WorkOrderQuery.Key value) {
        this.key = value;
    }


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
     *         &lt;element name="sourceSystem" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;choice>
     *           &lt;element name="workOrderId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *           &lt;element name="processId" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *           &lt;element name="processSignature" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;/choice>
     *         &lt;element name="interval" type="{http://soap.integration.fsm.comarch.com/}timeInterval" minOccurs="0"/>
     *         &lt;element name="customer" type="{http://soap.integration.fsm.comarch.com/}customerQuery" minOccurs="0"/>
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
        "sourceSystem",
        "workOrderId",
        "processId",
        "processSignature",
        "interval",
        "customer"
    })
    public static class Key {

        protected String sourceSystem;
        protected String workOrderId;
        protected String processId;
        protected String processSignature;
        protected TimeInterval interval;
        protected CustomerQuery customer;

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
         * Gets the value of the processSignature property.
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProcessSignature() {
            return processSignature;
        }

        /**
         * Sets the value of the processSignature property.
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProcessSignature(String value) {
            this.processSignature = value;
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
         * Gets the value of the customer property.
         * 
         * @return
         *     possible object is
         *     {@link CustomerQuery }
         *     
         */
        public CustomerQuery getCustomer() {
            return customer;
        }

        /**
         * Sets the value of the customer property.
         * 
         * @param value
         *     allowed object is
         *     {@link CustomerQuery }
         *     
         */
        public void setCustomer(CustomerQuery value) {
            this.customer = value;
        }

    }

}
