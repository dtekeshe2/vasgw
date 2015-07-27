/**
 * CosAccumulator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CosAccumulator  implements java.io.Serializable {
    private String accumulator_name;

    private Integer accumulator_position;

    public CosAccumulator() {
    }

    public CosAccumulator(
           String accumulator_name,
           Integer accumulator_position) {
           this.accumulator_name = accumulator_name;
           this.accumulator_position = accumulator_position;
    }


    /**
     * Gets the accumulator_name value for this CosAccumulator.
     * 
     * @return accumulator_name
     */
    public String getAccumulator_name() {
        return accumulator_name;
    }


    /**
     * Sets the accumulator_name value for this CosAccumulator.
     * 
     * @param accumulator_name
     */
    public void setAccumulator_name(String accumulator_name) {
        this.accumulator_name = accumulator_name;
    }


    /**
     * Gets the accumulator_position value for this CosAccumulator.
     * 
     * @return accumulator_position
     */
    public Integer getAccumulator_position() {
        return accumulator_position;
    }


    /**
     * Sets the accumulator_position value for this CosAccumulator.
     * 
     * @param accumulator_position
     */
    public void setAccumulator_position(Integer accumulator_position) {
        this.accumulator_position = accumulator_position;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CosAccumulator)) return false;
        CosAccumulator other = (CosAccumulator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accumulator_name==null && other.getAccumulator_name()==null) || 
             (this.accumulator_name!=null &&
              this.accumulator_name.equals(other.getAccumulator_name()))) &&
            ((this.accumulator_position==null && other.getAccumulator_position()==null) || 
             (this.accumulator_position!=null &&
              this.accumulator_position.equals(other.getAccumulator_position())));
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
        if (getAccumulator_name() != null) {
            _hashCode += getAccumulator_name().hashCode();
        }
        if (getAccumulator_position() != null) {
            _hashCode += getAccumulator_position().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CosAccumulator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosAccumulator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulator_name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulator_name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulator_position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulator_position"));
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
