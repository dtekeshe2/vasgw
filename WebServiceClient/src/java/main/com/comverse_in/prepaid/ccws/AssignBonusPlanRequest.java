/**
 * AssignBonusPlanRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class AssignBonusPlanRequest  implements java.io.Serializable {
    private String subscriberId;

    private String identity;

    private String bonusPlan;

    public AssignBonusPlanRequest() {
    }

    public AssignBonusPlanRequest(
           String subscriberId,
           String identity,
           String bonusPlan) {
           this.subscriberId = subscriberId;
           this.identity = identity;
           this.bonusPlan = bonusPlan;
    }


    /**
     * Gets the subscriberId value for this AssignBonusPlanRequest.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this AssignBonusPlanRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the identity value for this AssignBonusPlanRequest.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this AssignBonusPlanRequest.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the bonusPlan value for this AssignBonusPlanRequest.
     * 
     * @return bonusPlan
     */
    public String getBonusPlan() {
        return bonusPlan;
    }


    /**
     * Sets the bonusPlan value for this AssignBonusPlanRequest.
     * 
     * @param bonusPlan
     */
    public void setBonusPlan(String bonusPlan) {
        this.bonusPlan = bonusPlan;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof AssignBonusPlanRequest)) return false;
        AssignBonusPlanRequest other = (AssignBonusPlanRequest) obj;
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
            ((this.bonusPlan==null && other.getBonusPlan()==null) || 
             (this.bonusPlan!=null &&
              this.bonusPlan.equals(other.getBonusPlan())));
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
        if (getBonusPlan() != null) {
            _hashCode += getBonusPlan().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(AssignBonusPlanRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AssignBonusPlanRequest"));
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
        elemField.setFieldName("bonusPlan");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan"));
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
