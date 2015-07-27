/**
 * SubscriberCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberCreate  extends com.comverse_in.prepaid.ccws.SubscriberBase  implements java.io.Serializable {
    private com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances;

    private com.comverse_in.prepaid.ccws.SubscriberMainBase subscriber;

    private String SPName;

    public SubscriberCreate() {
    }

    public SubscriberCreate(
           String subscriberID,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberHome subscriberHome,
           com.comverse_in.prepaid.ccws.SubscriberInfo subscriberInfo,
           com.comverse_in.prepaid.ccws.SubscriberPB subscriberPhoneBook,
           com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances,
           com.comverse_in.prepaid.ccws.SubscriberMainBase subscriber,
           String SPName) {
        super(
            subscriberID,
            identity,
            subscriberHome,
            subscriberInfo,
            subscriberPhoneBook);
        this.balances = balances;
        this.subscriber = subscriber;
        this.SPName = SPName;
    }


    /**
     * Gets the balances value for this SubscriberCreate.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntityBase[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this SubscriberCreate.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the subscriber value for this SubscriberCreate.
     * 
     * @return subscriber
     */
    public com.comverse_in.prepaid.ccws.SubscriberMainBase getSubscriber() {
        return subscriber;
    }


    /**
     * Sets the subscriber value for this SubscriberCreate.
     * 
     * @param subscriber
     */
    public void setSubscriber(com.comverse_in.prepaid.ccws.SubscriberMainBase subscriber) {
        this.subscriber = subscriber;
    }


    /**
     * Gets the SPName value for this SubscriberCreate.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this SubscriberCreate.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberCreate)) return false;
        SubscriberCreate other = (SubscriberCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.subscriber==null && other.getSubscriber()==null) || 
             (this.subscriber!=null &&
              this.subscriber.equals(other.getSubscriber()))) &&
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName())));
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
        if (getBalances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalances());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalances(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriber() != null) {
            _hashCode += getSubscriber().hashCode();
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntityBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Subscriber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberMainBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SPName"));
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
