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
////import javax.xml.bind.annotation.XmlRootElement;
////import javax.xml.bind.annotation.XmlType;
////import javax.xml.bind.annotation.adapters.NormalizedStringAdapter;
////import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
//
//
///**
// *
// */
////@XmlAccessorType(XmlAccessType.FIELD)
////@XmlType(name = "")
////@XmlRootElement(name = "ScaleHint")
public class ScaleHint {

//    //@XmlAttribute(name = "min", required = true)
//    //@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String min;
//    //@XmlAttribute(name = "max", required = true)
//    //@XmlJavaTypeAdapter(NormalizedStringAdapter.class)
    protected String max;

    /**
     * Gets the value of the min property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMin() {
        return min;
    }

    /**
     * Sets the value of the min property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMin(String value) {
        this.min = value;
    }

    /**
     * Gets the value of the max property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMax() {
        return max;
    }

    /**
     * Sets the value of the max property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMax(String value) {
        this.max = value;
    }

}
