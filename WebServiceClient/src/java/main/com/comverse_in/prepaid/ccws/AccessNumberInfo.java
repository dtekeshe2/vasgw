/**
 * AccessNumberInfo.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class AccessNumberInfo  implements java.io.Serializable {
    private String accessNumber;

    private String spName;

    private Integer numberType;

    private String destinationNumber;

    public AccessNumberInfo() {
    }

    public AccessNumberInfo(
           String accessNumber,
           String spName,
           Integer numberType,
           String destinationNumber) {
           this.accessNumber = accessNumber;
           this.spName = spName;
           this.numberType = numberType;
           this.destinationNumber = destinationNumber;
    }


    /**
     * Gets the accessNumber value for this AccessNumberInfo.
     * 
     * @return accessNumber
     */
    public String getAccessNumber() {
        return accessNumber;
    }


    /**
     * Sets the accessNumber value for this AccessNumberInfo.
     * 
     * @param accessNumber
     */
    public void setAccessNumber(String accessNumber) {
        this.accessNumber = accessNumber;
    }


    /**
     * Gets the spName value for this AccessNumberInfo.
     * 
     * @return spName
     */
    public String getSpName() {
        return spName;
    }


    /**
     * Sets the spName value for this AccessNumberInfo.
     * 
     * @param spName
     */
    public void setSpName(String spName) {
        this.spName = spName;
    }


    /**
     * Gets the numberType value for this AccessNumberInfo.
     * 
     * @return numberType
     */
    public Integer getNumberType() {
        return numberType;
    }


    /**
     * Sets the numberType value for this AccessNumberInfo.
     * 
     * @param numberType
     */
    public void setNumberType(Integer numberType) {
        this.numberType = numberType;
    }


    /**
     * Gets the destinationNumber value for this AccessNumberInfo.
     * 
     * @return destinationNumber
     */
    public String getDestinationNumber() {
        return destinationNumber;
    }


    /**
     * Sets the destinationNumber value for this AccessNumberInfo.
     * 
     * @param destinationNumber
     */
    public void setDestinationNumber(String destinationNumber) {
        this.destinationNumber = destinationNumber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AccessNumberInfo)) return false;
        AccessNumberInfo other = (AccessNumberInfo) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accessNumber==null && other.getAccessNumber()==null) || 
             (this.accessNumber!=null &&
              this.accessNumber.equals(other.getAccessNumber()))) &&
            ((this.spName==null && other.getSpName()==null) || 
             (this.spName!=null &&
              this.spName.equals(other.getSpName()))) &&
            ((this.numberType==null && other.getNumberType()==null) || 
             (this.numberType!=null &&
              this.numberType.equals(other.getNumberType()))) &&
            ((this.destinationNumber==null && other.getDestinationNumber()==null) || 
             (this.destinationNumber!=null &&
              this.destinationNumber.equals(other.getDestinationNumber())));
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
        if (getAccessNumber() != null) {
            _hashCode += getAccessNumber().hashCode();
        }
        if (getSpName() != null) {
            _hashCode += getSpName().hashCode();
        }
        if (getNumberType() != null) {
            _hashCode += getNumberType().hashCode();
        }
        if (getDestinationNumber() != null) {
            _hashCode += getDestinationNumber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AccessNumberInfo.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumberInfo"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accessNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccessNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SpName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("numberType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NumberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DestinationNumber"));
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
