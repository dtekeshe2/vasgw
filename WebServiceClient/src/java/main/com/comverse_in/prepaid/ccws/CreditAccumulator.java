/**
 * CreditAccumulator.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CreditAccumulator  implements java.io.Serializable {
    private String accumulator;

    private Double creditAmount;

    private String currencyCode;

    public CreditAccumulator() {
    }

    public CreditAccumulator(
           String accumulator,
           Double creditAmount,
           String currencyCode) {
           this.accumulator = accumulator;
           this.creditAmount = creditAmount;
           this.currencyCode = currencyCode;
    }


    /**
     * Gets the accumulator value for this CreditAccumulator.
     * 
     * @return accumulator
     */
    public String getAccumulator() {
        return accumulator;
    }


    /**
     * Sets the accumulator value for this CreditAccumulator.
     * 
     * @param accumulator
     */
    public void setAccumulator(String accumulator) {
        this.accumulator = accumulator;
    }


    /**
     * Gets the creditAmount value for this CreditAccumulator.
     * 
     * @return creditAmount
     */
    public Double getCreditAmount() {
        return creditAmount;
    }


    /**
     * Sets the creditAmount value for this CreditAccumulator.
     * 
     * @param creditAmount
     */
    public void setCreditAmount(Double creditAmount) {
        this.creditAmount = creditAmount;
    }


    /**
     * Gets the currencyCode value for this CreditAccumulator.
     * 
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this CreditAccumulator.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CreditAccumulator)) return false;
        CreditAccumulator other = (CreditAccumulator) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.accumulator==null && other.getAccumulator()==null) || 
             (this.accumulator!=null &&
              this.accumulator.equals(other.getAccumulator()))) &&
            ((this.creditAmount==null && other.getCreditAmount()==null) || 
             (this.creditAmount!=null &&
              this.creditAmount.equals(other.getCreditAmount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode())));
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
        if (getAccumulator() != null) {
            _hashCode += getAccumulator().hashCode();
        }
        if (getCreditAmount() != null) {
            _hashCode += getCreditAmount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CreditAccumulator.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAccumulator"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creditAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreditAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyCode"));
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
