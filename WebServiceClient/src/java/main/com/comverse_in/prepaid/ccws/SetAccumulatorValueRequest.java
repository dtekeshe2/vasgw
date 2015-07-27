/**
 * SetAccumulatorValueRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SetAccumulatorValueRequest  implements java.io.Serializable {
    private String subscriberId;

    private String identity;

    private String accumulator;

    private Double accumulatorValue;

    public SetAccumulatorValueRequest() {
    }

    public SetAccumulatorValueRequest(
           String subscriberId,
           String identity,
           String accumulator,
           Double accumulatorValue) {
           this.subscriberId = subscriberId;
           this.identity = identity;
           this.accumulator = accumulator;
           this.accumulatorValue = accumulatorValue;
    }


    /**
     * Gets the subscriberId value for this SetAccumulatorValueRequest.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this SetAccumulatorValueRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the identity value for this SetAccumulatorValueRequest.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this SetAccumulatorValueRequest.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accumulator value for this SetAccumulatorValueRequest.
     * 
     * @return accumulator
     */
    public String getAccumulator() {
        return accumulator;
    }


    /**
     * Sets the accumulator value for this SetAccumulatorValueRequest.
     * 
     * @param accumulator
     */
    public void setAccumulator(String accumulator) {
        this.accumulator = accumulator;
    }


    /**
     * Gets the accumulatorValue value for this SetAccumulatorValueRequest.
     * 
     * @return accumulatorValue
     */
    public Double getAccumulatorValue() {
        return accumulatorValue;
    }


    /**
     * Sets the accumulatorValue value for this SetAccumulatorValueRequest.
     * 
     * @param accumulatorValue
     */
    public void setAccumulatorValue(Double accumulatorValue) {
        this.accumulatorValue = accumulatorValue;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SetAccumulatorValueRequest)) return false;
        SetAccumulatorValueRequest other = (SetAccumulatorValueRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberId==null && other.getSubscriberId()==null) || 
             (this.subscriberId!=null &&
              this.subscriberId.equals(other.getSubscriberId()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accumulator==null && other.getAccumulator()==null) || 
             (this.accumulator!=null &&
              this.accumulator.equals(other.getAccumulator()))) &&
            ((this.accumulatorValue==null && other.getAccumulatorValue()==null) || 
             (this.accumulatorValue!=null &&
              this.accumulatorValue.equals(other.getAccumulatorValue())));
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
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getAccumulator() != null) {
            _hashCode += getAccumulator().hashCode();
        }
        if (getAccumulatorValue() != null) {
            _hashCode += getAccumulatorValue().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SetAccumulatorValueRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SetAccumulatorValueRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccumulatorValue"));
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
