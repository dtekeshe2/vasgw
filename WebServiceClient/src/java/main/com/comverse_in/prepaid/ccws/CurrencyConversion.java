/**
 * CurrencyConversion.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CurrencyConversion  implements java.io.Serializable {
    private String fromCurrencyCode;

    private String toCurrencyCode;

    private Double conversionRate;

    public CurrencyConversion() {
    }

    public CurrencyConversion(
           String fromCurrencyCode,
           String toCurrencyCode,
           Double conversionRate) {
           this.fromCurrencyCode = fromCurrencyCode;
           this.toCurrencyCode = toCurrencyCode;
           this.conversionRate = conversionRate;
    }


    /**
     * Gets the fromCurrencyCode value for this CurrencyConversion.
     * 
     * @return fromCurrencyCode
     */
    public String getFromCurrencyCode() {
        return fromCurrencyCode;
    }


    /**
     * Sets the fromCurrencyCode value for this CurrencyConversion.
     * 
     * @param fromCurrencyCode
     */
    public void setFromCurrencyCode(String fromCurrencyCode) {
        this.fromCurrencyCode = fromCurrencyCode;
    }


    /**
     * Gets the toCurrencyCode value for this CurrencyConversion.
     * 
     * @return toCurrencyCode
     */
    public String getToCurrencyCode() {
        return toCurrencyCode;
    }


    /**
     * Sets the toCurrencyCode value for this CurrencyConversion.
     * 
     * @param toCurrencyCode
     */
    public void setToCurrencyCode(String toCurrencyCode) {
        this.toCurrencyCode = toCurrencyCode;
    }


    /**
     * Gets the conversionRate value for this CurrencyConversion.
     * 
     * @return conversionRate
     */
    public Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this CurrencyConversion.
     * 
     * @param conversionRate
     */
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CurrencyConversion)) return false;
        CurrencyConversion other = (CurrencyConversion) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.fromCurrencyCode==null && other.getFromCurrencyCode()==null) || 
             (this.fromCurrencyCode!=null &&
              this.fromCurrencyCode.equals(other.getFromCurrencyCode()))) &&
            ((this.toCurrencyCode==null && other.getToCurrencyCode()==null) || 
             (this.toCurrencyCode!=null &&
              this.toCurrencyCode.equals(other.getToCurrencyCode()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate())));
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
        if (getFromCurrencyCode() != null) {
            _hashCode += getFromCurrencyCode().hashCode();
        }
        if (getToCurrencyCode() != null) {
            _hashCode += getToCurrencyCode().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CurrencyConversion.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversion"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fromCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FromCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("toCurrencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ToCurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ConversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
