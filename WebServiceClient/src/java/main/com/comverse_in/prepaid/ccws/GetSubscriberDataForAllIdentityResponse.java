/**
 * GetSubscriberDataForAllIdentityResponse.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class GetSubscriberDataForAllIdentityResponse  implements java.io.Serializable {
    private String subscriberId;

    private Integer status;

    private com.comverse_in.prepaid.ccws.IdentitySpecficData[] identityData;

    public GetSubscriberDataForAllIdentityResponse() {
    }

    public GetSubscriberDataForAllIdentityResponse(
           String subscriberId,
           Integer status,
           com.comverse_in.prepaid.ccws.IdentitySpecficData[] identityData) {
           this.subscriberId = subscriberId;
           this.status = status;
           this.identityData = identityData;
    }


    /**
     * Gets the subscriberId value for this GetSubscriberDataForAllIdentityResponse.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this GetSubscriberDataForAllIdentityResponse.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the status value for this GetSubscriberDataForAllIdentityResponse.
     * 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }


    /**
     * Sets the status value for this GetSubscriberDataForAllIdentityResponse.
     * 
     * @param status
     */
    public void setStatus(Integer status) {
        this.status = status;
    }


    /**
     * Gets the identityData value for this GetSubscriberDataForAllIdentityResponse.
     * 
     * @return identityData
     */
    public com.comverse_in.prepaid.ccws.IdentitySpecficData[] getIdentityData() {
        return identityData;
    }


    /**
     * Sets the identityData value for this GetSubscriberDataForAllIdentityResponse.
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

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GetSubscriberDataForAllIdentityResponse)) return false;
        GetSubscriberDataForAllIdentityResponse other = (GetSubscriberDataForAllIdentityResponse) obj;
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
            ((this.status==null && other.getStatus()==null) || 
             (this.status!=null &&
              this.status.equals(other.getStatus()))) &&
            ((this.identityData==null && other.getIdentityData()==null) || 
             (this.identityData!=null &&
              java.util.Arrays.equals(this.identityData, other.getIdentityData())));
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
        if (getStatus() != null) {
            _hashCode += getStatus().hashCode();
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
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GetSubscriberDataForAllIdentityResponse.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GetSubscriberDataForAllIdentityResponse"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberId");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberId"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("status");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Status"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
