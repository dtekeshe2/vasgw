/**
 * COSFriend.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class COSFriend  implements java.io.Serializable {
    private String allowedRechargeCOS;

    private Integer treansferNumber;

    public COSFriend() {
    }

    public COSFriend(
           String allowedRechargeCOS,
           Integer treansferNumber) {
           this.allowedRechargeCOS = allowedRechargeCOS;
           this.treansferNumber = treansferNumber;
    }


    /**
     * Gets the allowedRechargeCOS value for this COSFriend.
     * 
     * @return allowedRechargeCOS
     */
    public String getAllowedRechargeCOS() {
        return allowedRechargeCOS;
    }


    /**
     * Sets the allowedRechargeCOS value for this COSFriend.
     * 
     * @param allowedRechargeCOS
     */
    public void setAllowedRechargeCOS(String allowedRechargeCOS) {
        this.allowedRechargeCOS = allowedRechargeCOS;
    }


    /**
     * Gets the treansferNumber value for this COSFriend.
     * 
     * @return treansferNumber
     */
    public Integer getTreansferNumber() {
        return treansferNumber;
    }


    /**
     * Sets the treansferNumber value for this COSFriend.
     * 
     * @param treansferNumber
     */
    public void setTreansferNumber(Integer treansferNumber) {
        this.treansferNumber = treansferNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof COSFriend)) return false;
        COSFriend other = (COSFriend) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.allowedRechargeCOS==null && other.getAllowedRechargeCOS()==null) || 
             (this.allowedRechargeCOS!=null &&
              this.allowedRechargeCOS.equals(other.getAllowedRechargeCOS()))) &&
            ((this.treansferNumber==null && other.getTreansferNumber()==null) || 
             (this.treansferNumber!=null &&
              this.treansferNumber.equals(other.getTreansferNumber())));
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
        if (getAllowedRechargeCOS() != null) {
            _hashCode += getAllowedRechargeCOS().hashCode();
        }
        if (getTreansferNumber() != null) {
            _hashCode += getTreansferNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(COSFriend.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSFriend"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("allowedRechargeCOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "allowedRechargeCOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treansferNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "treansferNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
