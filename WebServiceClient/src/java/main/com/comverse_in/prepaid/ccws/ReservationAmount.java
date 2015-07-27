/**
 * ReservationAmount.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class ReservationAmount  implements java.io.Serializable {
    private String balanceName;

    private java.math.BigDecimal totalReservationAmount;

    private java.math.BigDecimal totalConsAmount;

    public ReservationAmount() {
    }

    public ReservationAmount(
           String balanceName,
           java.math.BigDecimal totalReservationAmount,
           java.math.BigDecimal totalConsAmount) {
           this.balanceName = balanceName;
           this.totalReservationAmount = totalReservationAmount;
           this.totalConsAmount = totalConsAmount;
    }


    /**
     * Gets the balanceName value for this ReservationAmount.
     * 
     * @return balanceName
     */
    public String getBalanceName() {
        return balanceName;
    }


    /**
     * Sets the balanceName value for this ReservationAmount.
     * 
     * @param balanceName
     */
    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }


    /**
     * Gets the totalReservationAmount value for this ReservationAmount.
     * 
     * @return totalReservationAmount
     */
    public java.math.BigDecimal getTotalReservationAmount() {
        return totalReservationAmount;
    }


    /**
     * Sets the totalReservationAmount value for this ReservationAmount.
     * 
     * @param totalReservationAmount
     */
    public void setTotalReservationAmount(java.math.BigDecimal totalReservationAmount) {
        this.totalReservationAmount = totalReservationAmount;
    }


    /**
     * Gets the totalConsAmount value for this ReservationAmount.
     * 
     * @return totalConsAmount
     */
    public java.math.BigDecimal getTotalConsAmount() {
        return totalConsAmount;
    }


    /**
     * Sets the totalConsAmount value for this ReservationAmount.
     * 
     * @param totalConsAmount
     */
    public void setTotalConsAmount(java.math.BigDecimal totalConsAmount) {
        this.totalConsAmount = totalConsAmount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof ReservationAmount)) return false;
        ReservationAmount other = (ReservationAmount) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balanceName==null && other.getBalanceName()==null) || 
             (this.balanceName!=null &&
              this.balanceName.equals(other.getBalanceName()))) &&
            ((this.totalReservationAmount==null && other.getTotalReservationAmount()==null) || 
             (this.totalReservationAmount!=null &&
              this.totalReservationAmount.equals(other.getTotalReservationAmount()))) &&
            ((this.totalConsAmount==null && other.getTotalConsAmount()==null) || 
             (this.totalConsAmount!=null &&
              this.totalConsAmount.equals(other.getTotalConsAmount())));
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
        if (getBalanceName() != null) {
            _hashCode += getBalanceName().hashCode();
        }
        if (getTotalReservationAmount() != null) {
            _hashCode += getTotalReservationAmount().hashCode();
        }
        if (getTotalConsAmount() != null) {
            _hashCode += getTotalConsAmount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(ReservationAmount.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ReservationAmount"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalReservationAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TotalReservationAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalConsAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TotalConsAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
