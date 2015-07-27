/**
 * CircleMembership.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CircleMembership  implements java.io.Serializable {
    private Integer position;

    private String circleName;

    public CircleMembership() {
    }

    public CircleMembership(
           Integer position,
           String circleName) {
           this.position = position;
           this.circleName = circleName;
    }


    /**
     * Gets the position value for this CircleMembership.
     * 
     * @return position
     */
    public Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this CircleMembership.
     * 
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }


    /**
     * Gets the circleName value for this CircleMembership.
     * 
     * @return circleName
     */
    public String getCircleName() {
        return circleName;
    }


    /**
     * Sets the circleName value for this CircleMembership.
     * 
     * @param circleName
     */
    public void setCircleName(String circleName) {
        this.circleName = circleName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CircleMembership)) return false;
        CircleMembership other = (CircleMembership) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.position==null && other.getPosition()==null) || 
             (this.position!=null &&
              this.position.equals(other.getPosition()))) &&
            ((this.circleName==null && other.getCircleName()==null) || 
             (this.circleName!=null &&
              this.circleName.equals(other.getCircleName())));
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
        if (getPosition() != null) {
            _hashCode += getPosition().hashCode();
        }
        if (getCircleName() != null) {
            _hashCode += getCircleName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CircleMembership.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMembership"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("circleName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "circleName"));
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
