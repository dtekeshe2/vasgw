/**
 * SubscriberHome.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberHome  implements java.io.Serializable {
    private String home1;

    private String home2;

    private String home3;

    private String home4;

    public SubscriberHome() {
    }

    public SubscriberHome(
           String home1,
           String home2,
           String home3,
           String home4) {
           this.home1 = home1;
           this.home2 = home2;
           this.home3 = home3;
           this.home4 = home4;
    }


    /**
     * Gets the home1 value for this SubscriberHome.
     * 
     * @return home1
     */
    public String getHome1() {
        return home1;
    }


    /**
     * Sets the home1 value for this SubscriberHome.
     * 
     * @param home1
     */
    public void setHome1(String home1) {
        this.home1 = home1;
    }


    /**
     * Gets the home2 value for this SubscriberHome.
     * 
     * @return home2
     */
    public String getHome2() {
        return home2;
    }


    /**
     * Sets the home2 value for this SubscriberHome.
     * 
     * @param home2
     */
    public void setHome2(String home2) {
        this.home2 = home2;
    }


    /**
     * Gets the home3 value for this SubscriberHome.
     * 
     * @return home3
     */
    public String getHome3() {
        return home3;
    }


    /**
     * Sets the home3 value for this SubscriberHome.
     * 
     * @param home3
     */
    public void setHome3(String home3) {
        this.home3 = home3;
    }


    /**
     * Gets the home4 value for this SubscriberHome.
     * 
     * @return home4
     */
    public String getHome4() {
        return home4;
    }


    /**
     * Sets the home4 value for this SubscriberHome.
     * 
     * @param home4
     */
    public void setHome4(String home4) {
        this.home4 = home4;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberHome)) return false;
        SubscriberHome other = (SubscriberHome) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.home1==null && other.getHome1()==null) || 
             (this.home1!=null &&
              this.home1.equals(other.getHome1()))) &&
            ((this.home2==null && other.getHome2()==null) || 
             (this.home2!=null &&
              this.home2.equals(other.getHome2()))) &&
            ((this.home3==null && other.getHome3()==null) || 
             (this.home3!=null &&
              this.home3.equals(other.getHome3()))) &&
            ((this.home4==null && other.getHome4()==null) || 
             (this.home4!=null &&
              this.home4.equals(other.getHome4())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getHome1() != null) {
            _hashCode += getHome1().hashCode();
        }
        if (getHome2() != null) {
            _hashCode += getHome2().hashCode();
        }
        if (getHome3() != null) {
            _hashCode += getHome3().hashCode();
        }
        if (getHome4() != null) {
            _hashCode += getHome4().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberHome.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberHome"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Home1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Home2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Home3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("home4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Home4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
    }

    /**
     * Return type metadata object
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Custom Serializer
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanSerializer(
            _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Custom Deserializer
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
           String mechType,
           Class _javaType,
           javax.xml.namespace.QName _xmlType) {
        return 
          new  org.apache.axis.encoding.ser.BeanDeserializer(
            _javaType, _xmlType, typeDesc);
    }

}
