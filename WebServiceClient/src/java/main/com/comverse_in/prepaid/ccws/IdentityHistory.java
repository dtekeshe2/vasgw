/**
 * IdentityHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class IdentityHistory  implements java.io.Serializable {
    private java.util.Calendar startDateTime;

    private java.util.Calendar endDateTime;

    private String oldIdentity;

    private String newIdentity;

    public IdentityHistory() {
    }

    public IdentityHistory(
           java.util.Calendar startDateTime,
           java.util.Calendar endDateTime,
           String oldIdentity,
           String newIdentity) {
           this.startDateTime = startDateTime;
           this.endDateTime = endDateTime;
           this.oldIdentity = oldIdentity;
           this.newIdentity = newIdentity;
    }


    /**
     * Gets the startDateTime value for this IdentityHistory.
     * 
     * @return startDateTime
     */
    public java.util.Calendar getStartDateTime() {
        return startDateTime;
    }


    /**
     * Sets the startDateTime value for this IdentityHistory.
     * 
     * @param startDateTime
     */
    public void setStartDateTime(java.util.Calendar startDateTime) {
        this.startDateTime = startDateTime;
    }


    /**
     * Gets the endDateTime value for this IdentityHistory.
     * 
     * @return endDateTime
     */
    public java.util.Calendar getEndDateTime() {
        return endDateTime;
    }


    /**
     * Sets the endDateTime value for this IdentityHistory.
     * 
     * @param endDateTime
     */
    public void setEndDateTime(java.util.Calendar endDateTime) {
        this.endDateTime = endDateTime;
    }


    /**
     * Gets the oldIdentity value for this IdentityHistory.
     * 
     * @return oldIdentity
     */
    public String getOldIdentity() {
        return oldIdentity;
    }


    /**
     * Sets the oldIdentity value for this IdentityHistory.
     * 
     * @param oldIdentity
     */
    public void setOldIdentity(String oldIdentity) {
        this.oldIdentity = oldIdentity;
    }


    /**
     * Gets the newIdentity value for this IdentityHistory.
     * 
     * @return newIdentity
     */
    public String getNewIdentity() {
        return newIdentity;
    }


    /**
     * Sets the newIdentity value for this IdentityHistory.
     * 
     * @param newIdentity
     */
    public void setNewIdentity(String newIdentity) {
        this.newIdentity = newIdentity;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof IdentityHistory)) return false;
        IdentityHistory other = (IdentityHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.startDateTime==null && other.getStartDateTime()==null) || 
             (this.startDateTime!=null &&
              this.startDateTime.equals(other.getStartDateTime()))) &&
            ((this.endDateTime==null && other.getEndDateTime()==null) || 
             (this.endDateTime!=null &&
              this.endDateTime.equals(other.getEndDateTime()))) &&
            ((this.oldIdentity==null && other.getOldIdentity()==null) || 
             (this.oldIdentity!=null &&
              this.oldIdentity.equals(other.getOldIdentity()))) &&
            ((this.newIdentity==null && other.getNewIdentity()==null) || 
             (this.newIdentity!=null &&
              this.newIdentity.equals(other.getNewIdentity())));
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
        if (getStartDateTime() != null) {
            _hashCode += getStartDateTime().hashCode();
        }
        if (getEndDateTime() != null) {
            _hashCode += getEndDateTime().hashCode();
        }
        if (getOldIdentity() != null) {
            _hashCode += getOldIdentity().hashCode();
        }
        if (getNewIdentity() != null) {
            _hashCode += getNewIdentity().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(IdentityHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("startDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "StartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "EndDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("oldIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OldIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewIdentity"));
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
