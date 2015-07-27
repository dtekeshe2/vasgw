/**
 * MonetaryTransactionRecord.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class MonetaryTransactionRecord  implements java.io.Serializable {
    private String subscriberID;

    private String chargecode;

    private String PPSAccount;

    private String loginName;

    private java.util.Calendar modDate;

    private String MTRComment;

    private String discountPlanName;

    private String bonusPlanName;

    private Double bonusAwarded;

    private Double discountAwarded;

    private String unitTypeName;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String identity;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private String accumulator;

    private Double newAccumulator;

    private Double changeAccumulator;

    private com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType;

    private String groupID;

    private String isoCode;

    private String previousISOCode;

    private Double conversionRate;

    private String previousCOSName;

    private String currentCOSName;

    private String SPName;

    public MonetaryTransactionRecord() {
    }

    public MonetaryTransactionRecord(
           String subscriberID,
           String chargecode,
           String PPSAccount,
           String loginName,
           java.util.Calendar modDate,
           String MTRComment,
           String discountPlanName,
           String bonusPlanName,
           Double bonusAwarded,
           Double discountAwarded,
           String unitTypeName,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           String accumulator,
           Double newAccumulator,
           Double changeAccumulator,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String groupID,
           String isoCode,
           String previousISOCode,
           Double conversionRate,
           String previousCOSName,
           String currentCOSName,
           String SPName) {
           this.subscriberID = subscriberID;
           this.chargecode = chargecode;
           this.PPSAccount = PPSAccount;
           this.loginName = loginName;
           this.modDate = modDate;
           this.MTRComment = MTRComment;
           this.discountPlanName = discountPlanName;
           this.bonusPlanName = bonusPlanName;
           this.bonusAwarded = bonusAwarded;
           this.discountAwarded = discountAwarded;
           this.unitTypeName = unitTypeName;
           this.balances = balances;
           this.identity = identity;
           this.accountType = accountType;
           this.accumulator = accumulator;
           this.newAccumulator = newAccumulator;
           this.changeAccumulator = changeAccumulator;
           this.fundUsageType = fundUsageType;
           this.groupID = groupID;
           this.isoCode = isoCode;
           this.previousISOCode = previousISOCode;
           this.conversionRate = conversionRate;
           this.previousCOSName = previousCOSName;
           this.currentCOSName = currentCOSName;
           this.SPName = SPName;
    }


    /**
     * Gets the subscriberID value for this MonetaryTransactionRecord.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this MonetaryTransactionRecord.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the chargecode value for this MonetaryTransactionRecord.
     * 
     * @return chargecode
     */
    public String getChargecode() {
        return chargecode;
    }


    /**
     * Sets the chargecode value for this MonetaryTransactionRecord.
     * 
     * @param chargecode
     */
    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }


    /**
     * Gets the PPSAccount value for this MonetaryTransactionRecord.
     * 
     * @return PPSAccount
     */
    public String getPPSAccount() {
        return PPSAccount;
    }


    /**
     * Sets the PPSAccount value for this MonetaryTransactionRecord.
     * 
     * @param PPSAccount
     */
    public void setPPSAccount(String PPSAccount) {
        this.PPSAccount = PPSAccount;
    }


    /**
     * Gets the loginName value for this MonetaryTransactionRecord.
     * 
     * @return loginName
     */
    public String getLoginName() {
        return loginName;
    }


    /**
     * Sets the loginName value for this MonetaryTransactionRecord.
     * 
     * @param loginName
     */
    public void setLoginName(String loginName) {
        this.loginName = loginName;
    }


    /**
     * Gets the modDate value for this MonetaryTransactionRecord.
     * 
     * @return modDate
     */
    public java.util.Calendar getModDate() {
        return modDate;
    }


    /**
     * Sets the modDate value for this MonetaryTransactionRecord.
     * 
     * @param modDate
     */
    public void setModDate(java.util.Calendar modDate) {
        this.modDate = modDate;
    }


    /**
     * Gets the MTRComment value for this MonetaryTransactionRecord.
     * 
     * @return MTRComment
     */
    public String getMTRComment() {
        return MTRComment;
    }


    /**
     * Sets the MTRComment value for this MonetaryTransactionRecord.
     * 
     * @param MTRComment
     */
    public void setMTRComment(String MTRComment) {
        this.MTRComment = MTRComment;
    }


    /**
     * Gets the discountPlanName value for this MonetaryTransactionRecord.
     * 
     * @return discountPlanName
     */
    public String getDiscountPlanName() {
        return discountPlanName;
    }


    /**
     * Sets the discountPlanName value for this MonetaryTransactionRecord.
     * 
     * @param discountPlanName
     */
    public void setDiscountPlanName(String discountPlanName) {
        this.discountPlanName = discountPlanName;
    }


    /**
     * Gets the bonusPlanName value for this MonetaryTransactionRecord.
     * 
     * @return bonusPlanName
     */
    public String getBonusPlanName() {
        return bonusPlanName;
    }


    /**
     * Sets the bonusPlanName value for this MonetaryTransactionRecord.
     * 
     * @param bonusPlanName
     */
    public void setBonusPlanName(String bonusPlanName) {
        this.bonusPlanName = bonusPlanName;
    }


    /**
     * Gets the bonusAwarded value for this MonetaryTransactionRecord.
     * 
     * @return bonusAwarded
     */
    public Double getBonusAwarded() {
        return bonusAwarded;
    }


    /**
     * Sets the bonusAwarded value for this MonetaryTransactionRecord.
     * 
     * @param bonusAwarded
     */
    public void setBonusAwarded(Double bonusAwarded) {
        this.bonusAwarded = bonusAwarded;
    }


    /**
     * Gets the discountAwarded value for this MonetaryTransactionRecord.
     * 
     * @return discountAwarded
     */
    public Double getDiscountAwarded() {
        return discountAwarded;
    }


    /**
     * Sets the discountAwarded value for this MonetaryTransactionRecord.
     * 
     * @param discountAwarded
     */
    public void setDiscountAwarded(Double discountAwarded) {
        this.discountAwarded = discountAwarded;
    }


    /**
     * Gets the unitTypeName value for this MonetaryTransactionRecord.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this MonetaryTransactionRecord.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the balances value for this MonetaryTransactionRecord.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this MonetaryTransactionRecord.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the identity value for this MonetaryTransactionRecord.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this MonetaryTransactionRecord.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accountType value for this MonetaryTransactionRecord.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this MonetaryTransactionRecord.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the accumulator value for this MonetaryTransactionRecord.
     * 
     * @return accumulator
     */
    public String getAccumulator() {
        return accumulator;
    }


    /**
     * Sets the accumulator value for this MonetaryTransactionRecord.
     * 
     * @param accumulator
     */
    public void setAccumulator(String accumulator) {
        this.accumulator = accumulator;
    }


    /**
     * Gets the newAccumulator value for this MonetaryTransactionRecord.
     * 
     * @return newAccumulator
     */
    public Double getNewAccumulator() {
        return newAccumulator;
    }


    /**
     * Sets the newAccumulator value for this MonetaryTransactionRecord.
     * 
     * @param newAccumulator
     */
    public void setNewAccumulator(Double newAccumulator) {
        this.newAccumulator = newAccumulator;
    }


    /**
     * Gets the changeAccumulator value for this MonetaryTransactionRecord.
     * 
     * @return changeAccumulator
     */
    public Double getChangeAccumulator() {
        return changeAccumulator;
    }


    /**
     * Sets the changeAccumulator value for this MonetaryTransactionRecord.
     * 
     * @param changeAccumulator
     */
    public void setChangeAccumulator(Double changeAccumulator) {
        this.changeAccumulator = changeAccumulator;
    }


    /**
     * Gets the fundUsageType value for this MonetaryTransactionRecord.
     * 
     * @return fundUsageType
     */
    public com.comverse_in.prepaid.ccws.FundsUsageType getFundUsageType() {
        return fundUsageType;
    }


    /**
     * Sets the fundUsageType value for this MonetaryTransactionRecord.
     * 
     * @param fundUsageType
     */
    public void setFundUsageType(com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType) {
        this.fundUsageType = fundUsageType;
    }


    /**
     * Gets the groupID value for this MonetaryTransactionRecord.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this MonetaryTransactionRecord.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isoCode value for this MonetaryTransactionRecord.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this MonetaryTransactionRecord.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the previousISOCode value for this MonetaryTransactionRecord.
     * 
     * @return previousISOCode
     */
    public String getPreviousISOCode() {
        return previousISOCode;
    }


    /**
     * Sets the previousISOCode value for this MonetaryTransactionRecord.
     * 
     * @param previousISOCode
     */
    public void setPreviousISOCode(String previousISOCode) {
        this.previousISOCode = previousISOCode;
    }


    /**
     * Gets the conversionRate value for this MonetaryTransactionRecord.
     * 
     * @return conversionRate
     */
    public Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this MonetaryTransactionRecord.
     * 
     * @param conversionRate
     */
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the previousCOSName value for this MonetaryTransactionRecord.
     * 
     * @return previousCOSName
     */
    public String getPreviousCOSName() {
        return previousCOSName;
    }


    /**
     * Sets the previousCOSName value for this MonetaryTransactionRecord.
     * 
     * @param previousCOSName
     */
    public void setPreviousCOSName(String previousCOSName) {
        this.previousCOSName = previousCOSName;
    }


    /**
     * Gets the currentCOSName value for this MonetaryTransactionRecord.
     * 
     * @return currentCOSName
     */
    public String getCurrentCOSName() {
        return currentCOSName;
    }


    /**
     * Sets the currentCOSName value for this MonetaryTransactionRecord.
     * 
     * @param currentCOSName
     */
    public void setCurrentCOSName(String currentCOSName) {
        this.currentCOSName = currentCOSName;
    }


    /**
     * Gets the SPName value for this MonetaryTransactionRecord.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this MonetaryTransactionRecord.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof MonetaryTransactionRecord)) return false;
        MonetaryTransactionRecord other = (MonetaryTransactionRecord) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.chargecode==null && other.getChargecode()==null) || 
             (this.chargecode!=null &&
              this.chargecode.equals(other.getChargecode()))) &&
            ((this.PPSAccount==null && other.getPPSAccount()==null) || 
             (this.PPSAccount!=null &&
              this.PPSAccount.equals(other.getPPSAccount()))) &&
            ((this.loginName==null && other.getLoginName()==null) || 
             (this.loginName!=null &&
              this.loginName.equals(other.getLoginName()))) &&
            ((this.modDate==null && other.getModDate()==null) || 
             (this.modDate!=null &&
              this.modDate.equals(other.getModDate()))) &&
            ((this.MTRComment==null && other.getMTRComment()==null) || 
             (this.MTRComment!=null &&
              this.MTRComment.equals(other.getMTRComment()))) &&
            ((this.discountPlanName==null && other.getDiscountPlanName()==null) || 
             (this.discountPlanName!=null &&
              this.discountPlanName.equals(other.getDiscountPlanName()))) &&
            ((this.bonusPlanName==null && other.getBonusPlanName()==null) || 
             (this.bonusPlanName!=null &&
              this.bonusPlanName.equals(other.getBonusPlanName()))) &&
            ((this.bonusAwarded==null && other.getBonusAwarded()==null) || 
             (this.bonusAwarded!=null &&
              this.bonusAwarded.equals(other.getBonusAwarded()))) &&
            ((this.discountAwarded==null && other.getDiscountAwarded()==null) || 
             (this.discountAwarded!=null &&
              this.discountAwarded.equals(other.getDiscountAwarded()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.accumulator==null && other.getAccumulator()==null) || 
             (this.accumulator!=null &&
              this.accumulator.equals(other.getAccumulator()))) &&
            ((this.newAccumulator==null && other.getNewAccumulator()==null) || 
             (this.newAccumulator!=null &&
              this.newAccumulator.equals(other.getNewAccumulator()))) &&
            ((this.changeAccumulator==null && other.getChangeAccumulator()==null) || 
             (this.changeAccumulator!=null &&
              this.changeAccumulator.equals(other.getChangeAccumulator()))) &&
            ((this.fundUsageType==null && other.getFundUsageType()==null) || 
             (this.fundUsageType!=null &&
              this.fundUsageType.equals(other.getFundUsageType()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.previousISOCode==null && other.getPreviousISOCode()==null) || 
             (this.previousISOCode!=null &&
              this.previousISOCode.equals(other.getPreviousISOCode()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate()))) &&
            ((this.previousCOSName==null && other.getPreviousCOSName()==null) || 
             (this.previousCOSName!=null &&
              this.previousCOSName.equals(other.getPreviousCOSName()))) &&
            ((this.currentCOSName==null && other.getCurrentCOSName()==null) || 
             (this.currentCOSName!=null &&
              this.currentCOSName.equals(other.getCurrentCOSName()))) &&
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
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getChargecode() != null) {
            _hashCode += getChargecode().hashCode();
        }
        if (getPPSAccount() != null) {
            _hashCode += getPPSAccount().hashCode();
        }
        if (getLoginName() != null) {
            _hashCode += getLoginName().hashCode();
        }
        if (getModDate() != null) {
            _hashCode += getModDate().hashCode();
        }
        if (getMTRComment() != null) {
            _hashCode += getMTRComment().hashCode();
        }
        if (getDiscountPlanName() != null) {
            _hashCode += getDiscountPlanName().hashCode();
        }
        if (getBonusPlanName() != null) {
            _hashCode += getBonusPlanName().hashCode();
        }
        if (getBonusAwarded() != null) {
            _hashCode += getBonusAwarded().hashCode();
        }
        if (getDiscountAwarded() != null) {
            _hashCode += getDiscountAwarded().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
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
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getAccumulator() != null) {
            _hashCode += getAccumulator().hashCode();
        }
        if (getNewAccumulator() != null) {
            _hashCode += getNewAccumulator().hashCode();
        }
        if (getChangeAccumulator() != null) {
            _hashCode += getChangeAccumulator().hashCode();
        }
        if (getFundUsageType() != null) {
            _hashCode += getFundUsageType().hashCode();
        }
        if (getGroupID() != null) {
            _hashCode += getGroupID().hashCode();
        }
        if (getIsoCode() != null) {
            _hashCode += getIsoCode().hashCode();
        }
        if (getPreviousISOCode() != null) {
            _hashCode += getPreviousISOCode().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        if (getPreviousCOSName() != null) {
            _hashCode += getPreviousCOSName().hashCode();
        }
        if (getCurrentCOSName() != null) {
            _hashCode += getCurrentCOSName().hashCode();
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(MonetaryTransactionRecord.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MonetaryTransactionRecord"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Chargecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("PPSAccount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PPSAccount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("loginName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LoginName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("modDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ModDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MTRComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MTRComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlanName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlanName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusAwarded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusAwarded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discountAwarded");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DiscountAwarded"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("unitTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UnitTypeName"));
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
        elemField.setFieldName("accumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Accumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("newAccumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NewAccumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("changeAccumulator");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ChangeAccumulator"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsUsageType"));
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
        elemField.setFieldName("previousISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreviousISOCode"));
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
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousCOSName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreviousCOSName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currentCOSName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrentCOSName"));
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
