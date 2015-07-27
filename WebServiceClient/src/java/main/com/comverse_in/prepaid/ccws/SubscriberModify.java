/**
 * SubscriberModify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberModify  extends com.comverse_in.prepaid.ccws.SubscriberBase  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges;

    private Boolean deleteSubscriberPeriodicCharges;

    private com.comverse_in.prepaid.ccws.SubscriberPPS subscriber;

    public SubscriberModify() {
    }

    public SubscriberModify(
           String subscriberID,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome,
           com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo,
           com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook,
           com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges,
           Boolean deleteSubscriberPeriodicCharges,
           com.comverse_in.prepaid.ccws.SubscriberPPS subscriber) {
        super(
            subscriberID,
            identity,
            subscriberHome,
            subscriberInfo,
            subscriberPhoneBook);
        this.periodicCharges = periodicCharges;
        this.deleteSubscriberPeriodicCharges = deleteSubscriberPeriodicCharges;
        this.subscriber = subscriber;
    }


    /**
     * Gets the periodicCharges value for this SubscriberModify.
     * 
     * @return periodicCharges
     */
    public com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] getPeriodicCharges() {
        return periodicCharges;
    }


    /**
     * Sets the periodicCharges value for this SubscriberModify.
     * 
     * @param periodicCharges
     */
    public void setPeriodicCharges(com.comverse_in.prepaid.ccws.SubscriberPeriodicCharge[] periodicCharges) {
        this.periodicCharges = periodicCharges;
    }


    /**
     * Gets the deleteSubscriberPeriodicCharges value for this SubscriberModify.
     * 
     * @return deleteSubscriberPeriodicCharges
     */
    public Boolean getDeleteSubscriberPeriodicCharges() {
        return deleteSubscriberPeriodicCharges;
    }


    /**
     * Sets the deleteSubscriberPeriodicCharges value for this SubscriberModify.
     * 
     * @param deleteSubscriberPeriodicCharges
     */
    public void setDeleteSubscriberPeriodicCharges(Boolean deleteSubscriberPeriodicCharges) {
        this.deleteSubscriberPeriodicCharges = deleteSubscriberPeriodicCharges;
    }


    /**
     * Gets the subscriber value for this SubscriberModify.
     * 
     * @return subscriber
     */
    public com.comverse_in.prepaid.ccws.SubscriberPPS getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this SubscriberModify.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.comverse_in.prepaid.ccws.SubscriberPPS subscriber) {
        this.subscriber = subscriber;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberModify)) return false;
        SubscriberModify other = (SubscriberModify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.periodicCharges==null && other.getPeriodicCharges()==null) || 
             (this.periodicCharges!=null &&
              java.util.Arrays.equals(this.periodicCharges, other.getPeriodicCharges()))) &&
            ((this.deleteSubscriberPeriodicCharges==null && other.getDeleteSubscriberPeriodicCharges()==null) || 
             (this.deleteSubscriberPeriodicCharges!=null &&
              this.deleteSubscriberPeriodicCharges.equals(other.getDeleteSubscriberPeriodicCharges()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = super.hashCode();
        if (getPeriodicCharges() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getPeriodicCharges());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getPeriodicCharges(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getDeleteSubscriberPeriodicCharges() != null) {
            _hashCode += getDeleteSubscriberPeriodicCharges().hashCode();
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberModify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberModify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPeriodicCharge"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicCharge"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("deleteSubscriberPeriodicCharges");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DeleteSubscriberPeriodicCharges"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPPS"));
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
