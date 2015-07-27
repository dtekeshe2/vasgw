/**
 * BalanceDefinition.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class BalanceDefinition  implements java.io.Serializable {
    private String balanceName;

    private String unitTypeName;

    private Boolean isCoreBalance;

    private Boolean isCurrencyBalance;

    public BalanceDefinition() {
    }

    public BalanceDefinition(
           String balanceName,
           String unitTypeName,
           Boolean isCoreBalance,
           Boolean isCurrencyBalance) {
           this.balanceName = balanceName;
           this.unitTypeName = unitTypeName;
           this.isCoreBalance = isCoreBalance;
           this.isCurrencyBalance = isCurrencyBalance;
    }


    /**
     * Gets the balanceName value for this BalanceDefinition.
     * 
     * @return balanceName
     */
    public String getBalanceName() {
        return balanceName;
    }


    /**
     * Sets the balanceName value for this BalanceDefinition.
     * 
     * @param balanceName
     */
    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }


    /**
     * Gets the unitTypeName value for this BalanceDefinition.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this BalanceDefinition.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the isCoreBalance value for this BalanceDefinition.
     * 
     * @return isCoreBalance
     */
    public Boolean getIsCoreBalance() {
        return isCoreBalance;
    }


    /**
     * Sets the isCoreBalance value for this BalanceDefinition.
     * 
     * @param isCoreBalance
     */
    public void setIsCoreBalance(Boolean isCoreBalance) {
        this.isCoreBalance = isCoreBalance;
    }


    /**
     * Gets the isCurrencyBalance value for this BalanceDefinition.
     * 
     * @return isCurrencyBalance
     */
    public Boolean getIsCurrencyBalance() {
        return isCurrencyBalance;
    }


    /**
     * Sets the isCurrencyBalance value for this BalanceDefinition.
     * 
     * @param isCurrencyBalance
     */
    public void setIsCurrencyBalance(Boolean isCurrencyBalance) {
        this.isCurrencyBalance = isCurrencyBalance;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalanceDefinition)) return false;
        BalanceDefinition other = (BalanceDefinition) obj;
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
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.isCoreBalance==null && other.getIsCoreBalance()==null) || 
             (this.isCoreBalance!=null &&
              this.isCoreBalance.equals(other.getIsCoreBalance()))) &&
            ((this.isCurrencyBalance==null && other.getIsCurrencyBalance()==null) || 
             (this.isCurrencyBalance!=null &&
              this.isCurrencyBalance.equals(other.getIsCurrencyBalance())));
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
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        if (getIsCoreBalance() != null) {
            _hashCode += getIsCoreBalance().hashCode();
        }
        if (getIsCurrencyBalance() != null) {
            _hashCode += getIsCurrencyBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceDefinition.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceDefinition"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "unitTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCoreBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsCoreBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isCurrencyBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsCurrencyBalance"));
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
