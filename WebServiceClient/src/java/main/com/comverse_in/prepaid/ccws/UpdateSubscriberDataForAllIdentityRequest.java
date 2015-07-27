/**
 * UpdateSubscriberDataForAllIdentityRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class UpdateSubscriberDataForAllIdentityRequest  implements java.io.Serializable {
    private String subscriberId;

    private com.comverse_in.prepaid.ccws.IdentitySpecficData[] identityData;

    private String SPName;

    public UpdateSubscriberDataForAllIdentityRequest() {
    }

    public UpdateSubscriberDataForAllIdentityRequest(
           String subscriberId,
           com.comverse_in.prepaid.ccws.IdentitySpecficData[] identityData,
           String SPName) {
           this.subscriberId = subscriberId;
           this.identityData = identityData;
           this.SPName = SPName;
    }


    /**
     * Gets the subscriberId value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the identityData value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @return identityData
     */
    public com.comverse_in.prepaid.ccws.IdentitySpecficData[] getIdentityData() {
        return identityData;
    }


    /**
     * Sets the identityData value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @param identityData
     */
    public void setIdentityData(com.comverse_in.prepaid.ccws.IdentitySpecficData[] identityData) {
        this.identityData = identityData;
    }

    public com.comverse_in.prepaid.ccws.IdentitySpecficData getIdentityData(int i) {
        return this.identityData[i];
    }

    public void setIdentityData(int i, com.comverse_in.prepaid.ccws.IdentitySpecficData _value) {
        this.identityData[i] = _value;
    }


    /**
     * Gets the SPName value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this UpdateSubscriberDataForAllIdentityRequest.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof UpdateSubscriberDataForAllIdentityRequest)) return false;
        UpdateSubscriberDataForAllIdentityRequest other = (UpdateSubscriberDataForAllIdentityRequest) obj;
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
            ((this.identityData==null && other.getIdentityData()==null) || 
             (this.identityData!=null &&
              java.util.Arrays.equals(this.identityData, other.getIdentityData()))) &&
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
        int _hashCode = 1;
        if (getSubscriberId() != null) {
            _hashCode += getSubscriberId().hashCode();
        }
        if (getIdentityData() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getIdentityData());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getIdentityData(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(UpdateSubscriberDataForAllIdentityRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UpdateSubscriberDataForAllIdentityRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identityData");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentityData"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IdentitySpecficData"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setMaxOccursUnbounded(true);
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
