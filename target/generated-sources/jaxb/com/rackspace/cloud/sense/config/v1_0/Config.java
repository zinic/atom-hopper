//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, vhudson-jaxb-ri-2.1-833 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2010.09.29 at 04:22:14 PM CDT 
//


package com.rackspace.cloud.sense.config.v1_0;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
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
 *         &lt;element ref="{http://docs.rackspacecloud.com/cloud-sense/sense-config/v1.0}defaults" minOccurs="0"/>
 *         &lt;element ref="{http://docs.rackspacecloud.com/cloud-sense/sense-config/v1.0}namespace" minOccurs="0"/>
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
    "defaults",
    "namespace"
})
@XmlRootElement(name = "config")
public class Config {

    protected Defaults defaults;
    protected Namespace namespace;

    /**
     * Gets the value of the defaults property.
     * 
     * @return
     *     possible object is
     *     {@link Defaults }
     *     
     */
    public Defaults getDefaults() {
        return defaults;
    }

    /**
     * Sets the value of the defaults property.
     * 
     * @param value
     *     allowed object is
     *     {@link Defaults }
     *     
     */
    public void setDefaults(Defaults value) {
        this.defaults = value;
    }

    /**
     * Gets the value of the namespace property.
     * 
     * @return
     *     possible object is
     *     {@link Namespace }
     *     
     */
    public Namespace getNamespace() {
        return namespace;
    }

    /**
     * Sets the value of the namespace property.
     * 
     * @param value
     *     allowed object is
     *     {@link Namespace }
     *     
     */
    public void setNamespace(Namespace value) {
        this.namespace = value;
    }

}