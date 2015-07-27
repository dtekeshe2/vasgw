/**
 * RechargeAccountPIRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class RechargeAccountPIRequest  implements java.io.Serializable {
    private String subscriberId;

    private String identity;

    private Integer invokePaymentInterface;

    private String secreteCode;

    private String comment;

    public RechargeAccountPIRequest() {
    }

    public RechargeAccountPIRequest(
           String subscriberId,
           String identity,
           Integer invokePaymentInterface,
           String secreteCode,
           String comment) {
           this.subscriberId = subscriberId;
           this.identity = identity;
           this.invokePaymentInterface = invokePaymentInterface;
           this.secreteCode = secreteCode;
           this.comment = comment;
    }


    /**
     * Gets the subscriberId value for this RechargeAccountPIRequest.
     * 
     * @return subscriberId
     */
    public String getSubscriberId() {
        return subscriberId;
    }


    /**
     * Sets the subscriberId value for this RechargeAccountPIRequest.
     * 
     * @param subscriberId
     */
    public void setSubscriberId(String subscriberId) {
        this.subscriberId = subscriberId;
    }


    /**
     * Gets the identity value for this RechargeAccountPIRequest.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this RechargeAccountPIRequest.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the invokePaymentInterface value for this RechargeAccountPIRequest.
     * 
     * @return invokePaymentInterface
     */
    public Integer getInvokePaymentInterface() {
        return invokePaymentInterface;
    }


    /**
     * Sets the invokePaymentInterface value for this RechargeAccountPIRequest.
     * 
     * @param invokePaymentInterface
     */
    public void setInvokePaymentInterface(Integer invokePaymentInterface) {
        this.invokePaymentInterface = invokePaymentInterface;
    }


    /**
     * Gets the secreteCode value for this RechargeAccountPIRequest.
     * 
     * @return secreteCode
     */
    public String getSecreteCode() {
        return secreteCode;
    }


    /**
     * Sets the secreteCode value for this RechargeAccountPIRequest.
     * 
     * @param secreteCode
     */
    public void setSecreteCode(String secreteCode) {
        this.secreteCode = secreteCode;
    }


    /**
     * Gets the comment value for this RechargeAccountPIRequest.
     * 
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RechargeAccountPIRequest.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechargeAccountPIRequest)) return false;
        RechargeAccountPIRequest other = (RechargeAccountPIRequest) obj;
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
            ((this.invokePaymentInterface==null && other.getInvokePaymentInterface()==null) || 
             (this.invokePaymentInterface!=null &&
              this.invokePaymentInterface.equals(other.getInvokePaymentInterface()))) &&
            ((this.secreteCode==null && other.getSecreteCode()==null) || 
             (this.secreteCode!=null &&
              this.secreteCode.equals(other.getSecreteCode()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment())));
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
        if (getInvokePaymentInterface() != null) {
            _hashCode += getInvokePaymentInterface().hashCode();
        }
        if (getSecreteCode() != null) {
            _hashCode += getSecreteCode().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeAccountPIRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeAccountPIRequest"));
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
        elemField.setFieldName("invokePaymentInterface");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InvokePaymentInterface"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("secreteCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "secreteCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Comment"));
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
