/**
 * BilledBalance.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class BilledBalance  implements java.io.Serializable {
    private java.math.BigDecimal billedAmount;

    private Boolean treatment;

    public BilledBalance() {
    }

    public BilledBalance(
           java.math.BigDecimal billedAmount,
           Boolean treatment) {
           this.billedAmount = billedAmount;
           this.treatment = treatment;
    }


    /**
     * Gets the billedAmount value for this BilledBalance.
     * 
     * @return billedAmount
     */
    public java.math.BigDecimal getBilledAmount() {
        return billedAmount;
    }


    /**
     * Sets the billedAmount value for this BilledBalance.
     * 
     * @param billedAmount
     */
    public void setBilledAmount(java.math.BigDecimal billedAmount) {
        this.billedAmount = billedAmount;
    }


    /**
     * Gets the treatment value for this BilledBalance.
     * 
     * @return treatment
     */
    public Boolean getTreatment() {
        return treatment;
    }


    /**
     * Sets the treatment value for this BilledBalance.
     * 
     * @param treatment
     */
    public void setTreatment(Boolean treatment) {
        this.treatment = treatment;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BilledBalance)) return false;
        BilledBalance other = (BilledBalance) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.billedAmount==null && other.getBilledAmount()==null) || 
             (this.billedAmount!=null &&
              this.billedAmount.equals(other.getBilledAmount()))) &&
            ((this.treatment==null && other.getTreatment()==null) || 
             (this.treatment!=null &&
              this.treatment.equals(other.getTreatment())));
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
        if (getBilledAmount() != null) {
            _hashCode += getBilledAmount().hashCode();
        }
        if (getTreatment() != null) {
            _hashCode += getTreatment().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BilledBalance.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BilledBalance"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BilledAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("treatment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Treatment"));
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
