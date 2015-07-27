/**
 * PreCallThreshold.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class PreCallThreshold  implements java.io.Serializable {
    private String thresholdType;

    private Double thresholdValue;

    public PreCallThreshold() {
    }

    public PreCallThreshold(
           String thresholdType,
           Double thresholdValue) {
           this.thresholdType = thresholdType;
           this.thresholdValue = thresholdValue;
    }


    /**
     * Gets the thresholdType value for this PreCallThreshold.
     * 
     * @return thresholdType
     */
    public String getThresholdType() {
        return thresholdType;
    }


    /**
     * Sets the thresholdType value for this PreCallThreshold.
     * 
     * @param thresholdType
     */
    public void setThresholdType(String thresholdType) {
        this.thresholdType = thresholdType;
    }


    /**
     * Gets the thresholdValue value for this PreCallThreshold.
     * 
     * @return thresholdValue
     */
    public Double getThresholdValue() {
        return thresholdValue;
    }


    /**
     * Sets the thresholdValue value for this PreCallThreshold.
     * 
     * @param thresholdValue
     */
    public void setThresholdValue(Double thresholdValue) {
        this.thresholdValue = thresholdValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PreCallThreshold)) return false;
        PreCallThreshold other = (PreCallThreshold) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.thresholdType==null && other.getThresholdType()==null) || 
             (this.thresholdType!=null &&
              this.thresholdType.equals(other.getThresholdType()))) &&
            ((this.thresholdValue==null && other.getThresholdValue()==null) || 
             (this.thresholdValue!=null &&
              this.thresholdValue.equals(other.getThresholdValue())));
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
        if (getThresholdType() != null) {
            _hashCode += getThresholdType().hashCode();
        }
        if (getThresholdValue() != null) {
            _hashCode += getThresholdValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(PreCallThreshold.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreCallThreshold"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "thresholdType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("thresholdValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "thresholdValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
