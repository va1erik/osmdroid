//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2016.01.10 at 01:27:59 PM EST 
//


package net.opengis.wms;

import java.util.ArrayList;
import java.util.List;
/*import javax.xml.bind.annotation.XmlAccessType;*/
/*import javax.xml.bind.annotation.XmlAccessorType;*/
/*import javax.xml.bind.annotation.XmlElement;*/
/*import javax.xml.bind.annotation.XmlRootElement;*/
/*import javax.xml.bind.annotation.XmlType;*/


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
 *         &lt;element ref="{http://www.opengis.net/wms}GetCapabilities"/>
 *         &lt;element ref="{http://www.opengis.net/wms}GetMap"/>
 *         &lt;element ref="{http://www.opengis.net/wms}GetFeatureInfo" minOccurs="0"/>
 *         &lt;element ref="{http://www.opengis.net/wms}_ExtendedOperation" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
/*@XmlAccessorType(XmlAccessType.FIELD)*/
/*@XmlType(name = "", propOrder = {
    "getCapabilities",
    "getMap",
    "getFeatureInfo",
    "extendedOperation"
})*/
/*@XmlRootElement(name = "Request")*/
public class Request {

    /*@XmlElement(name = "GetCapabilities", required = true)*/
    protected OperationType getCapabilities;
    /*@XmlElement(name = "GetMap", required = true)*/
    protected OperationType getMap;
    /*@XmlElement(name = "GetFeatureInfo")*/
    protected OperationType getFeatureInfo;
    /*@XmlElement(name = "_ExtendedOperation")*/
    protected List<OperationType> extendedOperation;

    /**
     * Gets the value of the getCapabilities property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetCapabilities() {
        return getCapabilities;
    }

    /**
     * Sets the value of the getCapabilities property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetCapabilities(OperationType value) {
        this.getCapabilities = value;
    }

    /**
     * Gets the value of the getMap property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetMap() {
        return getMap;
    }

    /**
     * Sets the value of the getMap property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetMap(OperationType value) {
        this.getMap = value;
    }

    /**
     * Gets the value of the getFeatureInfo property.
     * 
     * @return
     *     possible object is
     *     {@link OperationType }
     *     
     */
    public OperationType getGetFeatureInfo() {
        return getFeatureInfo;
    }

    /**
     * Sets the value of the getFeatureInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link OperationType }
     *     
     */
    public void setGetFeatureInfo(OperationType value) {
        this.getFeatureInfo = value;
    }

    /**
     * Gets the value of the extendedOperation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extendedOperation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtendedOperation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OperationType }
     * 
     * 
     */
    public List<OperationType> getExtendedOperation() {
        if (extendedOperation == null) {
            extendedOperation = new ArrayList<OperationType>();
        }
        return this.extendedOperation;
    }

}
