/**
 * BalanceEntityBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class BalanceEntityBase  implements java.io.Serializable {
    private Double balance;

    private java.util.Calendar accountExpiration;

    private String balanceName;

    private Double nextMaximumSpendingLimit;

    private Double totalSpendingLimit;

    public BalanceEntityBase() {
    }

    public BalanceEntityBase(
           Double balance,
           java.util.Calendar accountExpiration,
           String balanceName,
           Double nextMaximumSpendingLimit,
           Double totalSpendingLimit) {
           this.balance = balance;
           this.accountExpiration = accountExpiration;
           this.balanceName = balanceName;
           this.nextMaximumSpendingLimit = nextMaximumSpendingLimit;
           this.totalSpendingLimit = totalSpendingLimit;
    }


    /**
     * Gets the balance value for this BalanceEntityBase.
     * 
     * @return balance
     */
    public Double getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BalanceEntityBase.
     * 
     * @param balance
     */
    public void setBalance(Double balance) {
        this.balance = balance;
    }


    /**
     * Gets the accountExpiration value for this BalanceEntityBase.
     * 
     * @return accountExpiration
     */
    public java.util.Calendar getAccountExpiration() {
        return accountExpiration;
    }


    /**
     * Sets the accountExpiration value for this BalanceEntityBase.
     * 
     * @param accountExpiration
     */
    public void setAccountExpiration(java.util.Calendar accountExpiration) {
        this.accountExpiration = accountExpiration;
    }


    /**
     * Gets the balanceName value for this BalanceEntityBase.
     * 
     * @return balanceName
     */
    public String getBalanceName() {
        return balanceName;
    }


    /**
     * Sets the balanceName value for this BalanceEntityBase.
     * 
     * @param balanceName
     */
    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }


    /**
     * Gets the nextMaximumSpendingLimit value for this BalanceEntityBase.
     * 
     * @return nextMaximumSpendingLimit
     */
    public Double getNextMaximumSpendingLimit() {
        return nextMaximumSpendingLimit;
    }


    /**
     * Sets the nextMaximumSpendingLimit value for this BalanceEntityBase.
     * 
     * @param nextMaximumSpendingLimit
     */
    public void setNextMaximumSpendingLimit(Double nextMaximumSpendingLimit) {
        this.nextMaximumSpendingLimit = nextMaximumSpendingLimit;
    }


    /**
     * Gets the totalSpendingLimit value for this BalanceEntityBase.
     * 
     * @return totalSpendingLimit
     */
    public Double getTotalSpendingLimit() {
        return totalSpendingLimit;
    }


    /**
     * Sets the totalSpendingLimit value for this BalanceEntityBase.
     * 
     * @param totalSpendingLimit
     */
    public void setTotalSpendingLimit(Double totalSpendingLimit) {
        this.totalSpendingLimit = totalSpendingLimit;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalanceEntityBase)) return false;
        BalanceEntityBase other = (BalanceEntityBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance()))) &&
            ((this.accountExpiration==null && other.getAccountExpiration()==null) || 
             (this.accountExpiration!=null &&
              this.accountExpiration.equals(other.getAccountExpiration()))) &&
            ((this.balanceName==null && other.getBalanceName()==null) || 
             (this.balanceName!=null &&
              this.balanceName.equals(other.getBalanceName()))) &&
            ((this.nextMaximumSpendingLimit==null && other.getNextMaximumSpendingLimit()==null) || 
             (this.nextMaximumSpendingLimit!=null &&
              this.nextMaximumSpendingLimit.equals(other.getNextMaximumSpendingLimit()))) &&
            ((this.totalSpendingLimit==null && other.getTotalSpendingLimit()==null) || 
             (this.totalSpendingLimit!=null &&
              this.totalSpendingLimit.equals(other.getTotalSpendingLimit())));
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
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        if (getAccountExpiration() != null) {
            _hashCode += getAccountExpiration().hashCode();
        }
        if (getBalanceName() != null) {
            _hashCode += getBalanceName().hashCode();
        }
        if (getNextMaximumSpendingLimit() != null) {
            _hashCode += getNextMaximumSpendingLimit().hashCode();
        }
        if (getTotalSpendingLimit() != null) {
            _hashCode += getTotalSpendingLimit().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceEntityBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntityBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountExpiration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccountExpiration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextMaximumSpendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextMaximumSpendingLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("totalSpendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TotalSpendingLimit"));
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
