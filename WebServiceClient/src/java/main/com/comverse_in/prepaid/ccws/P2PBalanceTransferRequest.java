/**
 * P2PBalanceTransferRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class P2PBalanceTransferRequest  implements java.io.Serializable {
    private String donorSubscriberID;

    private String donorSubscriberIdentity;

    private String recipientSubscriberID;

    private String recipientSubscriberIdentity;

    private Double amount;

    private String currency;

    public P2PBalanceTransferRequest() {
    }

    public P2PBalanceTransferRequest(
           String donorSubscriberID,
           String donorSubscriberIdentity,
           String recipientSubscriberID,
           String recipientSubscriberIdentity,
           Double amount,
           String currency) {
           this.donorSubscriberID = donorSubscriberID;
           this.donorSubscriberIdentity = donorSubscriberIdentity;
           this.recipientSubscriberID = recipientSubscriberID;
           this.recipientSubscriberIdentity = recipientSubscriberIdentity;
           this.amount = amount;
           this.currency = currency;
    }


    /**
     * Gets the donorSubscriberID value for this P2PBalanceTransferRequest.
     * 
     * @return donorSubscriberID
     */
    public String getDonorSubscriberID() {
        return donorSubscriberID;
    }


    /**
     * Sets the donorSubscriberID value for this P2PBalanceTransferRequest.
     * 
     * @param donorSubscriberID
     */
    public void setDonorSubscriberID(String donorSubscriberID) {
        this.donorSubscriberID = donorSubscriberID;
    }


    /**
     * Gets the donorSubscriberIdentity value for this P2PBalanceTransferRequest.
     * 
     * @return donorSubscriberIdentity
     */
    public String getDonorSubscriberIdentity() {
        return donorSubscriberIdentity;
    }


    /**
     * Sets the donorSubscriberIdentity value for this P2PBalanceTransferRequest.
     * 
     * @param donorSubscriberIdentity
     */
    public void setDonorSubscriberIdentity(String donorSubscriberIdentity) {
        this.donorSubscriberIdentity = donorSubscriberIdentity;
    }


    /**
     * Gets the recipientSubscriberID value for this P2PBalanceTransferRequest.
     * 
     * @return recipientSubscriberID
     */
    public String getRecipientSubscriberID() {
        return recipientSubscriberID;
    }


    /**
     * Sets the recipientSubscriberID value for this P2PBalanceTransferRequest.
     * 
     * @param recipientSubscriberID
     */
    public void setRecipientSubscriberID(String recipientSubscriberID) {
        this.recipientSubscriberID = recipientSubscriberID;
    }


    /**
     * Gets the recipientSubscriberIdentity value for this P2PBalanceTransferRequest.
     * 
     * @return recipientSubscriberIdentity
     */
    public String getRecipientSubscriberIdentity() {
        return recipientSubscriberIdentity;
    }


    /**
     * Sets the recipientSubscriberIdentity value for this P2PBalanceTransferRequest.
     * 
     * @param recipientSubscriberIdentity
     */
    public void setRecipientSubscriberIdentity(String recipientSubscriberIdentity) {
        this.recipientSubscriberIdentity = recipientSubscriberIdentity;
    }


    /**
     * Gets the amount value for this P2PBalanceTransferRequest.
     * 
     * @return amount
     */
    public Double getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this P2PBalanceTransferRequest.
     * 
     * @param amount
     */
    public void setAmount(Double amount) {
        this.amount = amount;
    }


    /**
     * Gets the currency value for this P2PBalanceTransferRequest.
     * 
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this P2PBalanceTransferRequest.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof P2PBalanceTransferRequest)) return false;
        P2PBalanceTransferRequest other = (P2PBalanceTransferRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.donorSubscriberID==null && other.getDonorSubscriberID()==null) || 
             (this.donorSubscriberID!=null &&
              this.donorSubscriberID.equals(other.getDonorSubscriberID()))) &&
            ((this.donorSubscriberIdentity==null && other.getDonorSubscriberIdentity()==null) || 
             (this.donorSubscriberIdentity!=null &&
              this.donorSubscriberIdentity.equals(other.getDonorSubscriberIdentity()))) &&
            ((this.recipientSubscriberID==null && other.getRecipientSubscriberID()==null) || 
             (this.recipientSubscriberID!=null &&
              this.recipientSubscriberID.equals(other.getRecipientSubscriberID()))) &&
            ((this.recipientSubscriberIdentity==null && other.getRecipientSubscriberIdentity()==null) || 
             (this.recipientSubscriberIdentity!=null &&
              this.recipientSubscriberIdentity.equals(other.getRecipientSubscriberIdentity()))) &&
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency())));
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
        if (getDonorSubscriberID() != null) {
            _hashCode += getDonorSubscriberID().hashCode();
        }
        if (getDonorSubscriberIdentity() != null) {
            _hashCode += getDonorSubscriberIdentity().hashCode();
        }
        if (getRecipientSubscriberID() != null) {
            _hashCode += getRecipientSubscriberID().hashCode();
        }
        if (getRecipientSubscriberIdentity() != null) {
            _hashCode += getRecipientSubscriberIdentity().hashCode();
        }
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(P2PBalanceTransferRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "P2PBalanceTransferRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorSubscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "donorSubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("donorSubscriberIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "donorSubscriberIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientSubscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "recipientSubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("recipientSubscriberIdentity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "recipientSubscriberIdentity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currency"));
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
