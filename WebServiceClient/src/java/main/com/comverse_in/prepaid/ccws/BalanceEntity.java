/**
 * BalanceEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class BalanceEntity  extends com.comverse_in.prepaid.ccws.BalanceEntityBase  implements java.io.Serializable {
    private Double availableBalance;

    private com.comverse_in.prepaid.ccws.FundsType fundsType;

    private Double maximumSpendingLimit;

    private Double availableSpendingLimit;

    private Integer precisionPoint;

    public BalanceEntity() {
    }

    public BalanceEntity(
           Double balance,
           java.util.Calendar accountExpiration,
           String balanceName,
           Double nextMaximumSpendingLimit,
           Double totalSpendingLimit,
           Double availableBalance,
           com.comverse_in.prepaid.ccws.FundsType fundsType,
           Double maximumSpendingLimit,
           Double availableSpendingLimit,
           Integer precisionPoint) {
        super(
            balance,
            accountExpiration,
            balanceName,
            nextMaximumSpendingLimit,
            totalSpendingLimit);
        this.availableBalance = availableBalance;
        this.fundsType = fundsType;
        this.maximumSpendingLimit = maximumSpendingLimit;
        this.availableSpendingLimit = availableSpendingLimit;
        this.precisionPoint = precisionPoint;
    }


    /**
     * Gets the availableBalance value for this BalanceEntity.
     * 
     * @return availableBalance
     */
    public Double getAvailableBalance() {
        return availableBalance;
    }


    /**
     * Sets the availableBalance value for this BalanceEntity.
     * 
     * @param availableBalance
     */
    public void setAvailableBalance(Double availableBalance) {
        this.availableBalance = availableBalance;
    }


    /**
     * Gets the fundsType value for this BalanceEntity.
     * 
     * @return fundsType
     */
    public com.comverse_in.prepaid.ccws.FundsType getFundsType() {
        return fundsType;
    }


    /**
     * Sets the fundsType value for this BalanceEntity.
     * 
     * @param fundsType
     */
    public void setFundsType(com.comverse_in.prepaid.ccws.FundsType fundsType) {
        this.fundsType = fundsType;
    }


    /**
     * Gets the maximumSpendingLimit value for this BalanceEntity.
     * 
     * @return maximumSpendingLimit
     */
    public Double getMaximumSpendingLimit() {
        return maximumSpendingLimit;
    }


    /**
     * Sets the maximumSpendingLimit value for this BalanceEntity.
     * 
     * @param maximumSpendingLimit
     */
    public void setMaximumSpendingLimit(Double maximumSpendingLimit) {
        this.maximumSpendingLimit = maximumSpendingLimit;
    }


    /**
     * Gets the availableSpendingLimit value for this BalanceEntity.
     * 
     * @return availableSpendingLimit
     */
    public Double getAvailableSpendingLimit() {
        return availableSpendingLimit;
    }


    /**
     * Sets the availableSpendingLimit value for this BalanceEntity.
     * 
     * @param availableSpendingLimit
     */
    public void setAvailableSpendingLimit(Double availableSpendingLimit) {
        this.availableSpendingLimit = availableSpendingLimit;
    }


    /**
     * Gets the precisionPoint value for this BalanceEntity.
     * 
     * @return precisionPoint
     */
    public Integer getPrecisionPoint() {
        return precisionPoint;
    }


    /**
     * Sets the precisionPoint value for this BalanceEntity.
     * 
     * @param precisionPoint
     */
    public void setPrecisionPoint(Integer precisionPoint) {
        this.precisionPoint = precisionPoint;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BalanceEntity)) return false;
        BalanceEntity other = (BalanceEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.availableBalance==null && other.getAvailableBalance()==null) || 
             (this.availableBalance!=null &&
              this.availableBalance.equals(other.getAvailableBalance()))) &&
            ((this.fundsType==null && other.getFundsType()==null) || 
             (this.fundsType!=null &&
              this.fundsType.equals(other.getFundsType()))) &&
            ((this.maximumSpendingLimit==null && other.getMaximumSpendingLimit()==null) || 
             (this.maximumSpendingLimit!=null &&
              this.maximumSpendingLimit.equals(other.getMaximumSpendingLimit()))) &&
            ((this.availableSpendingLimit==null && other.getAvailableSpendingLimit()==null) || 
             (this.availableSpendingLimit!=null &&
              this.availableSpendingLimit.equals(other.getAvailableSpendingLimit()))) &&
            ((this.precisionPoint==null && other.getPrecisionPoint()==null) || 
             (this.precisionPoint!=null &&
              this.precisionPoint.equals(other.getPrecisionPoint())));
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
        if (getAvailableBalance() != null) {
            _hashCode += getAvailableBalance().hashCode();
        }
        if (getFundsType() != null) {
            _hashCode += getFundsType().hashCode();
        }
        if (getMaximumSpendingLimit() != null) {
            _hashCode += getMaximumSpendingLimit().hashCode();
        }
        if (getAvailableSpendingLimit() != null) {
            _hashCode += getAvailableSpendingLimit().hashCode();
        }
        if (getPrecisionPoint() != null) {
            _hashCode += getPrecisionPoint().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BalanceEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableBalance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AvailableBalance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundsType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("maximumSpendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MaximumSpendingLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("availableSpendingLimit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AvailableSpendingLimit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precisionPoint");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PrecisionPoint"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "int"));
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
