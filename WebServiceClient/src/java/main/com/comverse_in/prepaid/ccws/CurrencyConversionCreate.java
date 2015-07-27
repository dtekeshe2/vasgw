/**
 * CurrencyConversionCreate.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CurrencyConversionCreate  extends com.comverse_in.prepaid.ccws.CurrencyConversionDelete  implements java.io.Serializable {
    private String intermediaryCurrency;

    private String currencyConversionRate;

    public CurrencyConversionCreate() {
    }

    public CurrencyConversionCreate(
           String fromCurrency,
           String toCurrency,
           java.util.Calendar startDateTime,
           String intermediaryCurrency,
           String currencyConversionRate) {
        super(
            fromCurrency,
            toCurrency,
            startDateTime);
        this.intermediaryCurrency = intermediaryCurrency;
        this.currencyConversionRate = currencyConversionRate;
    }


    /**
     * Gets the intermediaryCurrency value for this CurrencyConversionCreate.
     * 
     * @return intermediaryCurrency
     */
    public String getIntermediaryCurrency() {
        return intermediaryCurrency;
    }


    /**
     * Sets the intermediaryCurrency value for this CurrencyConversionCreate.
     * 
     * @param intermediaryCurrency
     */
    public void setIntermediaryCurrency(String intermediaryCurrency) {
        this.intermediaryCurrency = intermediaryCurrency;
    }


    /**
     * Gets the currencyConversionRate value for this CurrencyConversionCreate.
     * 
     * @return currencyConversionRate
     */
    public String getCurrencyConversionRate() {
        return currencyConversionRate;
    }


    /**
     * Sets the currencyConversionRate value for this CurrencyConversionCreate.
     * 
     * @param currencyConversionRate
     */
    public void setCurrencyConversionRate(String currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrencyConversionCreate)) return false;
        CurrencyConversionCreate other = (CurrencyConversionCreate) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.intermediaryCurrency==null && other.getIntermediaryCurrency()==null) || 
             (this.intermediaryCurrency!=null &&
              this.intermediaryCurrency.equals(other.getIntermediaryCurrency()))) &&
            ((this.currencyConversionRate==null && other.getCurrencyConversionRate()==null) || 
             (this.currencyConversionRate!=null &&
              this.currencyConversionRate.equals(other.getCurrencyConversionRate())));
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
        if (getIntermediaryCurrency() != null) {
            _hashCode += getIntermediaryCurrency().hashCode();
        }
        if (getCurrencyConversionRate() != null) {
            _hashCode += getCurrencyConversionRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyConversionCreate.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionCreate"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("intermediaryCurrency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IntermediaryCurrency"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyConversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRate"));
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
