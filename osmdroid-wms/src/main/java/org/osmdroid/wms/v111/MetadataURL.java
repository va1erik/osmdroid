//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.11.05 at 10:00:55 PM EST 
//


package org.osmdroid.wms.v111;

////import javax.xml.bind.annotation.XmlAccessType;
////import javax.xml.bind.annotation.XmlAccessorType;
////import javax.xml.bind.annotation.XmlAttribute;
////import javax.xml.bind.annotation.XmlElement;
////import javax.xml.bind.annotation.XmlRootElement;
////import javax.xml.bind.annotation.XmlType;
////import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
////import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//
//
///**
// *
// */
////@XmlAccessorType(XmlAccessType.FIELD)
////@XmlType(name = "", propOrder = {
//    "format",
//    "onlineResource"
//})
////@XmlRootElement(name = "MetadataURL")
public class MetadataURL {

//    //@XmlAttribute(name = "type", required = true)
//    //@XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String type;
//    //@XmlElement(name = "Format", required = true)
    protected Format format;
//    //@XmlElement(name = "OnlineResource", required = true)
    protected OnlineResource onlineResource;

    /**
     * Gets the value of the type property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * Sets the value of the type property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
    }

    /**
     * Gets the value of the format property.
     * 
     * @return
     *     possible object is
     *     {@link Format }
     *     
     */
    public Format getFormat() {
        return format;
    }

    /**
     * Sets the value of the format property.
     * 
     * @param value
     *     allowed object is
     *     {@link Format }
     *     
     */
    public void setFormat(Format value) {
        this.format = value;
    }

    /**
     * Gets the value of the onlineResource property.
     * 
     * @return
     *     possible object is
     *     {@link OnlineResource }
     *     
     */
    public OnlineResource getOnlineResource() {
        return onlineResource;
    }

    /**
     * Sets the value of the onlineResource property.
     * 
     * @param value
     *     allowed object is
     *     {@link OnlineResource }
     *     
     */
    public void setOnlineResource(OnlineResource value) {
        this.onlineResource = value;
    }

}
