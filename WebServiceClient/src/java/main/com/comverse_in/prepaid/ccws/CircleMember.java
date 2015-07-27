/**
 * CircleMember.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CircleMember  implements java.io.Serializable {
    private Integer position;

    private com.comverse_in.prepaid.ccws.SubscriberBasic subscriber;

    private Boolean nonRTBS;

    public CircleMember() {
    }

    public CircleMember(
           Integer position,
           com.comverse_in.prepaid.ccws.SubscriberBasic subscriber,
           Boolean nonRTBS) {
           this.position = position;
           this.subscriber = subscriber;
           this.nonRTBS = nonRTBS;
    }


    /**
     * Gets the position value for this CircleMember.
     * 
     * @return position
     */
    public Integer getPosition() {
        return position;
    }


    /**
     * Sets the position value for this CircleMember.
     * 
     * @param position
     */
    public void setPosition(Integer position) {
        this.position = position;
    }


    /**
     * Gets the subscriber value for this CircleMember.
     * 
     * @return subscriber
     */
    public com.comverse_in.prepaid.ccws.SubscriberBasic getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this CircleMember.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.comverse_in.prepaid.ccws.SubscriberBasic subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the nonRTBS value for this CircleMember.
     * 
     * @return nonRTBS
     */
    public Boolean getNonRTBS() {
        return nonRTBS;
    }


    /**
     * Sets the nonRTBS value for this CircleMember.
     * 
     * @param nonRTBS
     */
    public void setNonRTBS(Boolean nonRTBS) {
        this.nonRTBS = nonRTBS;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CircleMember)) return false;
        CircleMember other = (CircleMember) obj;
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
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.nonRTBS==null && other.getNonRTBS()==null) || 
             (this.nonRTBS!=null &&
              this.nonRTBS.equals(other.getNonRTBS())));
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
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getNonRTBS() != null) {
            _hashCode += getNonRTBS().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CircleMember.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CircleMember"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("position");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "position"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberBasic"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nonRTBS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "nonRTBS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
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
