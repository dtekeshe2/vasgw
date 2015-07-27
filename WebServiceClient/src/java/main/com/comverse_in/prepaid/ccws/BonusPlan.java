/**
 * BonusPlan.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class BonusPlan  implements java.io.Serializable {
    private Long bonusPlanID;

    private String bonusPlanName;

    private String accumulatorName;

    private Double threshold;

    private Double rewardAmount;

    private String targetBalanceName;

    private Long expOffset;

    private String chargeCode;

    private String currencyISO;

    private String serviceProvider;

    public BonusPlan() {
    }

    public BonusPlan(
           Long bonusPlanID,
           String bonusPlanName,
           String accumulatorName,
           Double threshold,
           Double rewardAmount,
           String targetBalanceName,
           Long expOffset,
           String chargeCode,
           String currencyISO,
           String serviceProvider) {
           this.bonusPlanID = bonusPlanID;
           this.bonusPlanName = bonusPlanName;
           this.accumulatorName = accumulatorName;
           this.threshold = threshold;
           this.rewardAmount = rewardAmount;
           this.targetBalanceName = targetBalanceName;
           this.expOffset = expOffset;
           this.chargeCode = chargeCode;
           this.currencyISO = currencyISO;
           this.serviceProvider = serviceProvider;
    }


    /**
     * Gets the bonusPlanID value for this BonusPlan.
     * 
     * @return bonusPlanID
     */
    public Long getBonusPlanID() {
        return bonusPlanID;
    }


    /**
     * Sets the bonusPlanID value for this BonusPlan.
     * 
     * @param bonusPlanID
     */
    public void setBonusPlanID(Long bonusPlanID) {
        this.bonusPlanID = bonusPlanID;
    }


    /**
     * Gets the bonusPlanName value for this BonusPlan.
     * 
     * @return bonusPlanName
     */
    public String getBonusPlanName() {
        return bonusPlanName;
    }


    /**
     * Sets the bonusPlanName value for this BonusPlan.
     * 
     * @param bonusPlanName
     */
    public void setBonusPlanName(String bonusPlanName) {
        this.bonusPlanName = bonusPlanName;
    }


    /**
     * Gets the accumulatorName value for this BonusPlan.
     * 
     * @return accumulatorName
     */
    public String getAccumulatorName() {
        return accumulatorName;
    }


    /**
     * Sets the accumulatorName value for this BonusPlan.
     * 
     * @param accumulatorName
     */
    public void setAccumulatorName(String accumulatorName) {
        this.accumulatorName = accumulatorName;
    }


    /**
     * Gets the threshold value for this BonusPlan.
     * 
     * @return threshold
     */
    public Double getThreshold() {
        return threshold;
    }


    /**
     * Sets the threshold value for this BonusPlan.
     * 
     * @param threshold
     */
    public void setThreshold(Double threshold) {
        this.threshold = threshold;
    }


    /**
     * Gets the rewardAmount value for this BonusPlan.
     * 
     * @return rewardAmount
     */
    public Double getRewardAmount() {
        return rewardAmount;
    }


    /**
     * Sets the rewardAmount value for this BonusPlan.
     * 
     * @param rewardAmount
     */
    public void setRewardAmount(Double rewardAmount) {
        this.rewardAmount = rewardAmount;
    }


    /**
     * Gets the targetBalanceName value for this BonusPlan.
     * 
     * @return targetBalanceName
     */
    public String getTargetBalanceName() {
        return targetBalanceName;
    }


    /**
     * Sets the targetBalanceName value for this BonusPlan.
     * 
     * @param targetBalanceName
     */
    public void setTargetBalanceName(String targetBalanceName) {
        this.targetBalanceName = targetBalanceName;
    }


    /**
     * Gets the expOffset value for this BonusPlan.
     * 
     * @return expOffset
     */
    public Long getExpOffset() {
        return expOffset;
    }


    /**
     * Sets the expOffset value for this BonusPlan.
     * 
     * @param expOffset
     */
    public void setExpOffset(Long expOffset) {
        this.expOffset = expOffset;
    }


    /**
     * Gets the chargeCode value for this BonusPlan.
     * 
     * @return chargeCode
     */
    public String getChargeCode() {
        return chargeCode;
    }


    /**
     * Sets the chargeCode value for this BonusPlan.
     * 
     * @param chargeCode
     */
    public void setChargeCode(String chargeCode) {
        this.chargeCode = chargeCode;
    }


    /**
     * Gets the currencyISO value for this BonusPlan.
     * 
     * @return currencyISO
     */
    public String getCurrencyISO() {
        return currencyISO;
    }


    /**
     * Sets the currencyISO value for this BonusPlan.
     * 
     * @param currencyISO
     */
    public void setCurrencyISO(String currencyISO) {
        this.currencyISO = currencyISO;
    }


    /**
     * Gets the serviceProvider value for this BonusPlan.
     * 
     * @return serviceProvider
     */
    public String getServiceProvider() {
        return serviceProvider;
    }


    /**
     * Sets the serviceProvider value for this BonusPlan.
     * 
     * @param serviceProvider
     */
    public void setServiceProvider(String serviceProvider) {
        this.serviceProvider = serviceProvider;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof BonusPlan)) return false;
        BonusPlan other = (BonusPlan) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.bonusPlanID==null && other.getBonusPlanID()==null) || 
             (this.bonusPlanID!=null &&
              this.bonusPlanID.equals(other.getBonusPlanID()))) &&
            ((this.bonusPlanName==null && other.getBonusPlanName()==null) || 
             (this.bonusPlanName!=null &&
              this.bonusPlanName.equals(other.getBonusPlanName()))) &&
            ((this.accumulatorName==null && other.getAccumulatorName()==null) || 
             (this.accumulatorName!=null &&
              this.accumulatorName.equals(other.getAccumulatorName()))) &&
            ((this.threshold==null && other.getThreshold()==null) || 
             (this.threshold!=null &&
              this.threshold.equals(other.getThreshold()))) &&
            ((this.rewardAmount==null && other.getRewardAmount()==null) || 
             (this.rewardAmount!=null &&
              this.rewardAmount.equals(other.getRewardAmount()))) &&
            ((this.targetBalanceName==null && other.getTargetBalanceName()==null) || 
             (this.targetBalanceName!=null &&
              this.targetBalanceName.equals(other.getTargetBalanceName()))) &&
            ((this.expOffset==null && other.getExpOffset()==null) || 
             (this.expOffset!=null &&
              this.expOffset.equals(other.getExpOffset()))) &&
            ((this.chargeCode==null && other.getChargeCode()==null) || 
             (this.chargeCode!=null &&
              this.chargeCode.equals(other.getChargeCode()))) &&
            ((this.currencyISO==null && other.getCurrencyISO()==null) || 
             (this.currencyISO!=null &&
              this.currencyISO.equals(other.getCurrencyISO()))) &&
            ((this.serviceProvider==null && other.getServiceProvider()==null) || 
             (this.serviceProvider!=null &&
              this.serviceProvider.equals(other.getServiceProvider())));
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
        if (getBonusPlanID() != null) {
            _hashCode += getBonusPlanID().hashCode();
        }
        if (getBonusPlanName() != null) {
            _hashCode += getBonusPlanName().hashCode();
        }
        if (getAccumulatorName() != null) {
            _hashCode += getAccumulatorName().hashCode();
        }
        if (getThreshold() != null) {
            _hashCode += getThreshold().hashCode();
        }
        if (getRewardAmount() != null) {
            _hashCode += getRewardAmount().hashCode();
        }
        if (getTargetBalanceName() != null) {
            _hashCode += getTargetBalanceName().hashCode();
        }
        if (getExpOffset() != null) {
            _hashCode += getExpOffset().hashCode();
        }
        if (getChargeCode() != null) {
            _hashCode += getChargeCode().hashCode();
        }
        if (getCurrencyISO() != null) {
            _hashCode += getCurrencyISO().hashCode();
        }
        if (getServiceProvider() != null) {
            _hashCode += getServiceProvider().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(BonusPlan.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlanID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "bonusPlanID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "bonusPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accumulatorName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "accumulatorName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("threshold");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "threshold"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rewardAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "rewardAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("targetBalanceName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "targetBalanceName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "expOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "chargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyISO");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "currencyISO"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceProvider");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceProvider"));
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
