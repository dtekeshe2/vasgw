/**
 * BalTransferRetDto.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public class BalTransferRetDto  implements java.io.Serializable {
    private String amount;

    private String beforeBalance;

    private String balance;

    public BalTransferRetDto() {
    }

    public BalTransferRetDto(
           String amount,
           String beforeBalance,
           String balance) {
           this.amount = amount;
           this.beforeBalance = beforeBalance;
           this.balance = balance;
    }


    /**
     * Gets the amount value for this BalTransferRetDto.
     * 
     * @return amount
     */
    public String getAmount() {
        return amount;
    }


    /**
     * Sets the amount value for this BalTransferRetDto.
     * 
     * @param amount
     */
    public void setAmount(String amount) {
        this.amount = amount;
    }


    /**
     * Gets the beforeBalance value for this BalTransferRetDto.
     * 
     * @return beforeBalance
     */
    public String getBeforeBalance() {
        return beforeBalance;
    }


    /**
     * Sets the beforeBalance value for this BalTransferRetDto.
     * 
     * @param beforeBalance
     */
    public void setBeforeBalance(String beforeBalance) {
        this.beforeBalance = beforeBalance;
    }


    /**
     * Gets the balance value for this BalTransferRetDto.
     * 
     * @return balance
     */
    public String getBalance() {
        return balance;
    }


    /**
     * Sets the balance value for this BalTransferRetDto.
     * 
     * @param balance
     */
    public void setBalance(String balance) {
        this.balance = balance;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalTransferRetDto)) return false;
        BalTransferRetDto other = (BalTransferRetDto) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.amount==null && other.getAmount()==null) || 
             (this.amount!=null &&
              this.amount.equals(other.getAmount()))) &&
            ((this.beforeBalance==null && other.getBeforeBalance()==null) || 
             (this.beforeBalance!=null &&
              this.beforeBalance.equals(other.getBeforeBalance()))) &&
            ((this.balance==null && other.getBalance()==null) || 
             (this.balance!=null &&
              this.balance.equals(other.getBalance())));
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
        if (getAmount() != null) {
            _hashCode += getAmount().hashCode();
        }
        if (getBeforeBalance() != null) {
            _hashCode += getBeforeBalance().hashCode();
        }
        if (getBalance() != null) {
            _hashCode += getBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalTransferRetDto.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BalTransferRetDto"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("amount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Amount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("beforeBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "BeforeBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://zimbabwe.customization.ws.bss.zsmart.ztesoft.com", "Balance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setNillable(true);
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
