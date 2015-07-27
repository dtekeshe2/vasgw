/**
 * Identity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class Identity  implements java.io.Serializable {
    private Integer identityID;

    private String identityType;

    public Identity() {
    }

    public Identity(
           Integer identityID,
           String identityType) {
           this.identityID = identityID;
           this.identityType = identityType;
    }


    /**
     * Gets the identityID value for this Identity.
     * 
     * @return identityID
     */
    public Integer getIdentityID() {
        return identityID;
    }


    /**
     * Sets the identityID value for this Identity.
     * 
     * @param identityID
     */
    public void setIdentityID(Integer identityID) {
        this.identityID = identityID;
    }


    /**
     * Gets the identityType value for this Identity.
     * 
     * @return identityType
     */
    public String getIdentityType() {
        return identityType;
    }


    /**
     * Sets the identityType value for this Identity.
     * 
     * @param identityType
     */
    public void setIdentityType(String identityType) {
        this.identityType = identityType;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof Identity)) return false;
        Identity other = (Identity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.identityID==null && other.getIdentityID()==null) || 
             (this.identityID!=null &&
              this.identityID.equals(other.getIdentityID()))) &&
            ((this.identityType==null && other.getIdentityType()==null) || 
             (this.identityType!=null &&
              this.identityType.equals(other.getIdentityType())));
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
        if (getIdentityID() != null) {
            _hashCode += getIdentityID().hashCode();
        }
        if (getIdentityType() != null) {
            _hashCode += getIdentityType().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(Identity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityType"));
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
