/**
 * CosBalanceOrder.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CosBalanceOrder  implements java.io.Serializable {
    private String balanceName;

    private Long balanceOrder;

    private java.math.BigDecimal initialBalance;

    private java.math.BigDecimal maximumBalance;

    private String unitTypeName;

    private Long expireOption;

    private Long expireOffset;

    private java.math.BigDecimal minimumBalance;

    public CosBalanceOrder() {
    }

    public CosBalanceOrder(
           String balanceName,
           Long balanceOrder,
           java.math.BigDecimal initialBalance,
           java.math.BigDecimal maximumBalance,
           String unitTypeName,
           Long expireOption,
           Long expireOffset,
           java.math.BigDecimal minimumBalance) {
           this.balanceName = balanceName;
           this.balanceOrder = balanceOrder;
           this.initialBalance = initialBalance;
           this.maximumBalance = maximumBalance;
           this.unitTypeName = unitTypeName;
           this.expireOption = expireOption;
           this.expireOffset = expireOffset;
           this.minimumBalance = minimumBalance;
    }


    /**
     * Gets the balanceName value for this CosBalanceOrder.
     * 
     * @return balanceName
     */
    public String getBalanceName() {
        return balanceName;
    }


    /**
     * Sets the balanceName value for this CosBalanceOrder.
     * 
     * @param balanceName
     */
    public void setBalanceName(String balanceName) {
        this.balanceName = balanceName;
    }


    /**
     * Gets the balanceOrder value for this CosBalanceOrder.
     * 
     * @return balanceOrder
     */
    public Long getBalanceOrder() {
        return balanceOrder;
    }


    /**
     * Sets the balanceOrder value for this CosBalanceOrder.
     * 
     * @param balanceOrder
     */
    public void setBalanceOrder(Long balanceOrder) {
        this.balanceOrder = balanceOrder;
    }


    /**
     * Gets the initialBalance value for this CosBalanceOrder.
     * 
     * @return initialBalance
     */
    public java.math.BigDecimal getInitialBalance() {
        return initialBalance;
    }


    /**
     * Sets the initialBalance value for this CosBalanceOrder.
     * 
     * @param initialBalance
     */
    public void setInitialBalance(java.math.BigDecimal initialBalance) {
        this.initialBalance = initialBalance;
    }


    /**
     * Gets the maximumBalance value for this CosBalanceOrder.
     * 
     * @return maximumBalance
     */
    public java.math.BigDecimal getMaximumBalance() {
        return maximumBalance;
    }


    /**
     * Sets the maximumBalance value for this CosBalanceOrder.
     * 
     * @param maximumBalance
     */
    public void setMaximumBalance(java.math.BigDecimal maximumBalance) {
        this.maximumBalance = maximumBalance;
    }


    /**
     * Gets the unitTypeName value for this CosBalanceOrder.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this CosBalanceOrder.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the expireOption value for this CosBalanceOrder.
     * 
     * @return expireOption
     */
    public Long getExpireOption() {
        return expireOption;
    }


    /**
     * Sets the expireOption value for this CosBalanceOrder.
     * 
     * @param expireOption
     */
    public void setExpireOption(Long expireOption) {
        this.expireOption = expireOption;
    }


    /**
     * Gets the expireOffset value for this CosBalanceOrder.
     * 
     * @return expireOffset
     */
    public Long getExpireOffset() {
        return expireOffset;
    }


    /**
     * Sets the expireOffset value for this CosBalanceOrder.
     * 
     * @param expireOffset
     */
    public void setExpireOffset(Long expireOffset) {
        this.expireOffset = expireOffset;
    }


    /**
     * Gets the minimumBalance value for this CosBalanceOrder.
     * 
     * @return minimumBalance
     */
    public java.math.BigDecimal getMinimumBalance() {
        return minimumBalance;
    }


    /**
     * Sets the minimumBalance value for this CosBalanceOrder.
     * 
     * @param minimumBalance
     */
    public void setMinimumBalance(java.math.BigDecimal minimumBalance) {
        this.minimumBalance = minimumBalance;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CosBalanceOrder)) return false;
        CosBalanceOrder other = (CosBalanceOrder) obj;
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
            ((this.balanceOrder==null && other.getBalanceOrder()==null) || 
             (this.balanceOrder!=null &&
              this.balanceOrder.equals(other.getBalanceOrder()))) &&
            ((this.initialBalance==null && other.getInitialBalance()==null) || 
             (this.initialBalance!=null &&
              this.initialBalance.equals(other.getInitialBalance()))) &&
            ((this.maximumBalance==null && other.getMaximumBalance()==null) || 
             (this.maximumBalance!=null &&
              this.maximumBalance.equals(other.getMaximumBalance()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.expireOption==null && other.getExpireOption()==null) || 
             (this.expireOption!=null &&
              this.expireOption.equals(other.getExpireOption()))) &&
            ((this.expireOffset==null && other.getExpireOffset()==null) || 
             (this.expireOffset!=null &&
              this.expireOffset.equals(other.getExpireOffset()))) &&
            ((this.minimumBalance==null && other.getMinimumBalance()==null) || 
             (this.minimumBalance!=null &&
              this.minimumBalance.equals(other.getMinimumBalance())));
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
        if (getBalanceOrder() != null) {
            _hashCode += getBalanceOrder().hashCode();
        }
        if (getInitialBalance() != null) {
            _hashCode += getInitialBalance().hashCode();
        }
        if (getMaximumBalance() != null) {
            _hashCode += getMaximumBalance().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        if (getExpireOption() != null) {
            _hashCode += getExpireOption().hashCode();
        }
        if (getExpireOffset() != null) {
            _hashCode += getExpireOffset().hashCode();
        }
        if (getMinimumBalance() != null) {
            _hashCode += getMinimumBalance().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CosBalanceOrder.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CosBalanceOrder"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "balanceOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("initialBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "initialBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "maximumBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
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
        elemField.setFieldName("expireOption");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "expireOption"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expireOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "expireOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("minimumBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "minimumBalance"));
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
