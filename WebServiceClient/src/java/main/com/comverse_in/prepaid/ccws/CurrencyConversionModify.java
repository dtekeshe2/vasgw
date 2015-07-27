/**
 * CurrencyConversionModify.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CurrencyConversionModify  extends com.comverse_in.prepaid.ccws.CurrencyConversionCreate  implements java.io.Serializable {
    private java.util.Calendar newStartDateTime;

    public CurrencyConversionModify() {
    }

    public CurrencyConversionModify(
           String fromCurrency,
           String toCurrency,
           java.util.Calendar startDateTime,
           String intermediaryCurrency,
           String currencyConversionRate,
           java.util.Calendar newStartDateTime) {
        super(
            fromCurrency,
            toCurrency,
            startDateTime,
            intermediaryCurrency,
            currencyConversionRate);
        this.newStartDateTime = newStartDateTime;
    }


    /**
     * Gets the newStartDateTime value for this CurrencyConversionModify.
     * 
     * @return newStartDateTime
     */
    public java.util.Calendar getNewStartDateTime() {
        return newStartDateTime;
    }


    /**
     * Sets the newStartDateTime value for this CurrencyConversionModify.
     * 
     * @param newStartDateTime
     */
    public void setNewStartDateTime(java.util.Calendar newStartDateTime) {
        this.newStartDateTime = newStartDateTime;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrencyConversionModify)) return false;
        CurrencyConversionModify other = (CurrencyConversionModify) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.newStartDateTime==null && other.getNewStartDateTime()==null) || 
             (this.newStartDateTime!=null &&
              this.newStartDateTime.equals(other.getNewStartDateTime())));
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
        if (getNewStartDateTime() != null) {
            _hashCode += getNewStartDateTime().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyConversionModify.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionModify"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newStartDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewStartDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
