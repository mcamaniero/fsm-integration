
package com.ec.tvcable.fsm_integration.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for additionalRequirements complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="additionalRequirements">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="executorRole" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="executors" type="{http://soap.integration.fsm.comarch.com/}executors" minOccurs="0"/>
 *         &lt;element name="sla" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="additionalSkills" type="{http://soap.integration.fsm.comarch.com/}additionalSkills" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "additionalRequirements", propOrder = {
    "executorRole",
    "executors",
    "sla",
    "additionalSkills"
})
public class AdditionalRequirements {

    protected String executorRole;
    protected Executors executors;
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sla;
    protected AdditionalSkills additionalSkills;

    /**
     * Gets the value of the executorRole property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExecutorRole() {
        return executorRole;
    }

    /**
     * Sets the value of the executorRole property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExecutorRole(String value) {
        this.executorRole = value;
    }

    /**
     * Gets the value of the executors property.
     * 
     * @return
     *     possible object is
     *     {@link Executors }
     *     
     */
    public Executors getExecutors() {
        return executors;
    }

    /**
     * Sets the value of the executors property.
     * 
     * @param value
     *     allowed object is
     *     {@link Executors }
     *     
     */
    public void setExecutors(Executors value) {
        this.executors = value;
    }

    /**
     * Gets the value of the sla property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSla() {
        return sla;
    }

    /**
     * Sets the value of the sla property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSla(XMLGregorianCalendar value) {
        this.sla = value;
    }

    /**
     * Gets the value of the additionalSkills property.
     * 
     * @return
     *     possible object is
     *     {@link AdditionalSkills }
     *     
     */
    public AdditionalSkills getAdditionalSkills() {
        return additionalSkills;
    }

    /**
     * Sets the value of the additionalSkills property.
     * 
     * @param value
     *     allowed object is
     *     {@link AdditionalSkills }
     *     
     */
    public void setAdditionalSkills(AdditionalSkills value) {
        this.additionalSkills = value;
    }

}
