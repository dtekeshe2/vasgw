/**
 * RechargeHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class RechargeHistory  implements java.io.Serializable {
    private String chargecode;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String subscriberID;

    private String rechargeOriginator;

    private java.util.Calendar rechargeDate;

    private String cardNumber;

    private Long expirationOffset;

    private Long voucherType;

    private Long batchNumber;

    private Long serialNumber;

    private String comment;

    private Double faceValue;

    private Double billedBalanceAmount;

    private String identity;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private String groupID;

    private String isoCode;

    private Double currencyConversionRate;

    private String voucherISOCode;

    private String SPName;

    public RechargeHistory() {
    }

    public RechargeHistory(
           String chargecode,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String subscriberID,
           String rechargeOriginator,
           java.util.Calendar rechargeDate,
           String cardNumber,
           Long expirationOffset,
           Long voucherType,
           Long batchNumber,
           Long serialNumber,
           String comment,
           Double faceValue,
           Double billedBalanceAmount,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           String groupID,
           String isoCode,
           Double currencyConversionRate,
           String voucherISOCode,
           String SPName) {
           this.chargecode = chargecode;
           this.balances = balances;
           this.subscriberID = subscriberID;
           this.rechargeOriginator = rechargeOriginator;
           this.rechargeDate = rechargeDate;
           this.cardNumber = cardNumber;
           this.expirationOffset = expirationOffset;
           this.voucherType = voucherType;
           this.batchNumber = batchNumber;
           this.serialNumber = serialNumber;
           this.comment = comment;
           this.faceValue = faceValue;
           this.billedBalanceAmount = billedBalanceAmount;
           this.identity = identity;
           this.accountType = accountType;
           this.groupID = groupID;
           this.isoCode = isoCode;
           this.currencyConversionRate = currencyConversionRate;
           this.voucherISOCode = voucherISOCode;
           this.SPName = SPName;
    }


    /**
     * Gets the chargecode value for this RechargeHistory.
     * 
     * @return chargecode
     */
    public String getChargecode() {
        return chargecode;
    }


    /**
     * Sets the chargecode value for this RechargeHistory.
     * 
     * @param chargecode
     */
    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }


    /**
     * Gets the balances value for this RechargeHistory.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this RechargeHistory.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the subscriberID value for this RechargeHistory.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this RechargeHistory.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the rechargeOriginator value for this RechargeHistory.
     * 
     * @return rechargeOriginator
     */
    public String getRechargeOriginator() {
        return rechargeOriginator;
    }


    /**
     * Sets the rechargeOriginator value for this RechargeHistory.
     * 
     * @param rechargeOriginator
     */
    public void setRechargeOriginator(String rechargeOriginator) {
        this.rechargeOriginator = rechargeOriginator;
    }


    /**
     * Gets the rechargeDate value for this RechargeHistory.
     * 
     * @return rechargeDate
     */
    public java.util.Calendar getRechargeDate() {
        return rechargeDate;
    }


    /**
     * Sets the rechargeDate value for this RechargeHistory.
     * 
     * @param rechargeDate
     */
    public void setRechargeDate(java.util.Calendar rechargeDate) {
        this.rechargeDate = rechargeDate;
    }


    /**
     * Gets the cardNumber value for this RechargeHistory.
     * 
     * @return cardNumber
     */
    public String getCardNumber() {
        return cardNumber;
    }


    /**
     * Sets the cardNumber value for this RechargeHistory.
     * 
     * @param cardNumber
     */
    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }


    /**
     * Gets the expirationOffset value for this RechargeHistory.
     * 
     * @return expirationOffset
     */
    public Long getExpirationOffset() {
        return expirationOffset;
    }


    /**
     * Sets the expirationOffset value for this RechargeHistory.
     * 
     * @param expirationOffset
     */
    public void setExpirationOffset(Long expirationOffset) {
        this.expirationOffset = expirationOffset;
    }


    /**
     * Gets the voucherType value for this RechargeHistory.
     * 
     * @return voucherType
     */
    public Long getVoucherType() {
        return voucherType;
    }


    /**
     * Sets the voucherType value for this RechargeHistory.
     * 
     * @param voucherType
     */
    public void setVoucherType(Long voucherType) {
        this.voucherType = voucherType;
    }


    /**
     * Gets the batchNumber value for this RechargeHistory.
     * 
     * @return batchNumber
     */
    public Long getBatchNumber() {
        return batchNumber;
    }


    /**
     * Sets the batchNumber value for this RechargeHistory.
     * 
     * @param batchNumber
     */
    public void setBatchNumber(Long batchNumber) {
        this.batchNumber = batchNumber;
    }


    /**
     * Gets the serialNumber value for this RechargeHistory.
     * 
     * @return serialNumber
     */
    public Long getSerialNumber() {
        return serialNumber;
    }


    /**
     * Sets the serialNumber value for this RechargeHistory.
     * 
     * @param serialNumber
     */
    public void setSerialNumber(Long serialNumber) {
        this.serialNumber = serialNumber;
    }


    /**
     * Gets the comment value for this RechargeHistory.
     * 
     * @return comment
     */
    public String getComment() {
        return comment;
    }


    /**
     * Sets the comment value for this RechargeHistory.
     * 
     * @param comment
     */
    public void setComment(String comment) {
        this.comment = comment;
    }


    /**
     * Gets the faceValue value for this RechargeHistory.
     * 
     * @return faceValue
     */
    public Double getFaceValue() {
        return faceValue;
    }


    /**
     * Sets the faceValue value for this RechargeHistory.
     * 
     * @param faceValue
     */
    public void setFaceValue(Double faceValue) {
        this.faceValue = faceValue;
    }


    /**
     * Gets the billedBalanceAmount value for this RechargeHistory.
     * 
     * @return billedBalanceAmount
     */
    public Double getBilledBalanceAmount() {
        return billedBalanceAmount;
    }


    /**
     * Sets the billedBalanceAmount value for this RechargeHistory.
     * 
     * @param billedBalanceAmount
     */
    public void setBilledBalanceAmount(Double billedBalanceAmount) {
        this.billedBalanceAmount = billedBalanceAmount;
    }


    /**
     * Gets the identity value for this RechargeHistory.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this RechargeHistory.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accountType value for this RechargeHistory.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this RechargeHistory.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the groupID value for this RechargeHistory.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this RechargeHistory.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isoCode value for this RechargeHistory.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this RechargeHistory.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the currencyConversionRate value for this RechargeHistory.
     * 
     * @return currencyConversionRate
     */
    public Double getCurrencyConversionRate() {
        return currencyConversionRate;
    }


    /**
     * Sets the currencyConversionRate value for this RechargeHistory.
     * 
     * @param currencyConversionRate
     */
    public void setCurrencyConversionRate(Double currencyConversionRate) {
        this.currencyConversionRate = currencyConversionRate;
    }


    /**
     * Gets the voucherISOCode value for this RechargeHistory.
     * 
     * @return voucherISOCode
     */
    public String getVoucherISOCode() {
        return voucherISOCode;
    }


    /**
     * Sets the voucherISOCode value for this RechargeHistory.
     * 
     * @param voucherISOCode
     */
    public void setVoucherISOCode(String voucherISOCode) {
        this.voucherISOCode = voucherISOCode;
    }


    /**
     * Gets the SPName value for this RechargeHistory.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this RechargeHistory.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof RechargeHistory)) return false;
        RechargeHistory other = (RechargeHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.chargecode==null && other.getChargecode()==null) || 
             (this.chargecode!=null &&
              this.chargecode.equals(other.getChargecode()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.rechargeOriginator==null && other.getRechargeOriginator()==null) || 
             (this.rechargeOriginator!=null &&
              this.rechargeOriginator.equals(other.getRechargeOriginator()))) &&
            ((this.rechargeDate==null && other.getRechargeDate()==null) || 
             (this.rechargeDate!=null &&
              this.rechargeDate.equals(other.getRechargeDate()))) &&
            ((this.cardNumber==null && other.getCardNumber()==null) || 
             (this.cardNumber!=null &&
              this.cardNumber.equals(other.getCardNumber()))) &&
            ((this.expirationOffset==null && other.getExpirationOffset()==null) || 
             (this.expirationOffset!=null &&
              this.expirationOffset.equals(other.getExpirationOffset()))) &&
            ((this.voucherType==null && other.getVoucherType()==null) || 
             (this.voucherType!=null &&
              this.voucherType.equals(other.getVoucherType()))) &&
            ((this.batchNumber==null && other.getBatchNumber()==null) || 
             (this.batchNumber!=null &&
              this.batchNumber.equals(other.getBatchNumber()))) &&
            ((this.serialNumber==null && other.getSerialNumber()==null) || 
             (this.serialNumber!=null &&
              this.serialNumber.equals(other.getSerialNumber()))) &&
            ((this.comment==null && other.getComment()==null) || 
             (this.comment!=null &&
              this.comment.equals(other.getComment()))) &&
            ((this.faceValue==null && other.getFaceValue()==null) || 
             (this.faceValue!=null &&
              this.faceValue.equals(other.getFaceValue()))) &&
            ((this.billedBalanceAmount==null && other.getBilledBalanceAmount()==null) || 
             (this.billedBalanceAmount!=null &&
              this.billedBalanceAmount.equals(other.getBilledBalanceAmount()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.currencyConversionRate==null && other.getCurrencyConversionRate()==null) || 
             (this.currencyConversionRate!=null &&
              this.currencyConversionRate.equals(other.getCurrencyConversionRate()))) &&
            ((this.voucherISOCode==null && other.getVoucherISOCode()==null) || 
             (this.voucherISOCode!=null &&
              this.voucherISOCode.equals(other.getVoucherISOCode()))) &&
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName())));
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
        if (getChargecode() != null) {
            _hashCode += getChargecode().hashCode();
        }
        if (getBalances() != null) {
            for (int i=0;
                 i<java.lang.reflect.Array.getLength(getBalances());
                 i++) {
                Object obj = java.lang.reflect.Array.get(getBalances(), i);
                if (obj != null &&
                    !obj.getClass().isArray()) {
                    _hashCode += obj.hashCode();
                }
            }
        }
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getRechargeOriginator() != null) {
            _hashCode += getRechargeOriginator().hashCode();
        }
        if (getRechargeDate() != null) {
            _hashCode += getRechargeDate().hashCode();
        }
        if (getCardNumber() != null) {
            _hashCode += getCardNumber().hashCode();
        }
        if (getExpirationOffset() != null) {
            _hashCode += getExpirationOffset().hashCode();
        }
        if (getVoucherType() != null) {
            _hashCode += getVoucherType().hashCode();
        }
        if (getBatchNumber() != null) {
            _hashCode += getBatchNumber().hashCode();
        }
        if (getSerialNumber() != null) {
            _hashCode += getSerialNumber().hashCode();
        }
        if (getComment() != null) {
            _hashCode += getComment().hashCode();
        }
        if (getFaceValue() != null) {
            _hashCode += getFaceValue().hashCode();
        }
        if (getBilledBalanceAmount() != null) {
            _hashCode += getBilledBalanceAmount().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        if (getCurrencyConversionRate() != null) {
            _hashCode += getCurrencyConversionRate().hashCode();
        }
        if (getVoucherISOCode() != null) {
            _hashCode += getVoucherISOCode().hashCode();
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(RechargeHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Chargecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntity"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeOriginator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeOriginator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("rechargeDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RechargeDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cardNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CardNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("expirationOffset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ExpirationOffset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BatchNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serialNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SerialNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("comment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Comment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("faceValue");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FaceValue"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("billedBalanceAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BilledBalanceAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("identity");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Identity"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccountType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberAccountType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isoCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsoCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyConversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyConversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("voucherISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "VoucherISOCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SPName"));
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
