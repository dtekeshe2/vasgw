/**
 * CallHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class CallHistory  implements java.io.Serializable {
    private String chargecode;

    private Double usageAmount;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String subscriberID;

    private java.util.Calendar startCallDateTime;

    private java.util.Calendar endCallDateTime;

    private String calledNumber;

    private Long callDuration;

    private String callType;

    private String description;

    private String reason;

    private String additionalNumber;

    private String CUGCode;

    private String masterSubID;

    private String applicationName;

    private String subTypeName;

    private String MSCID;

    private String cellID;

    private String SLUID;

    private String unitTypeName;

    private String APN;

    private String QOS;

    private Long CRN;

    private String identity;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private java.util.Calendar ORPTime;

    private com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType;

    private String groupID;

    private String isoCode;

    private String previousISOCode;

    private Double conversionRate;

    private String SPName;

    private String callingCircle;

    public CallHistory() {
    }

    public CallHistory(
           String chargecode,
           Double usageAmount,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String subscriberID,
           java.util.Calendar startCallDateTime,
           java.util.Calendar endCallDateTime,
           String calledNumber,
           Long callDuration,
           String callType,
           String description,
           String reason,
           String additionalNumber,
           String CUGCode,
           String masterSubID,
           String applicationName,
           String subTypeName,
           String MSCID,
           String cellID,
           String SLUID,
           String unitTypeName,
           String APN,
           String QOS,
           Long CRN,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           java.util.Calendar ORPTime,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String groupID,
           String isoCode,
           String previousISOCode,
           Double conversionRate,
           String SPName,
           String callingCircle) {
           this.chargecode = chargecode;
           this.usageAmount = usageAmount;
           this.balances = balances;
           this.subscriberID = subscriberID;
           this.startCallDateTime = startCallDateTime;
           this.endCallDateTime = endCallDateTime;
           this.calledNumber = calledNumber;
           this.callDuration = callDuration;
           this.callType = callType;
           this.description = description;
           this.reason = reason;
           this.additionalNumber = additionalNumber;
           this.CUGCode = CUGCode;
           this.masterSubID = masterSubID;
           this.applicationName = applicationName;
           this.subTypeName = subTypeName;
           this.MSCID = MSCID;
           this.cellID = cellID;
           this.SLUID = SLUID;
           this.unitTypeName = unitTypeName;
           this.APN = APN;
           this.QOS = QOS;
           this.CRN = CRN;
           this.identity = identity;
           this.accountType = accountType;
           this.ORPTime = ORPTime;
           this.fundUsageType = fundUsageType;
           this.groupID = groupID;
           this.isoCode = isoCode;
           this.previousISOCode = previousISOCode;
           this.conversionRate = conversionRate;
           this.SPName = SPName;
           this.callingCircle = callingCircle;
    }


    /**
     * Gets the chargecode value for this CallHistory.
     * 
     * @return chargecode
     */
    public String getChargecode() {
        return chargecode;
    }


    /**
     * Sets the chargecode value for this CallHistory.
     * 
     * @param chargecode
     */
    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }


    /**
     * Gets the usageAmount value for this CallHistory.
     * 
     * @return usageAmount
     */
    public Double getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this CallHistory.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(Double usageAmount) {
        this.usageAmount = usageAmount;
    }


    /**
     * Gets the balances value for this CallHistory.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this CallHistory.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the subscriberID value for this CallHistory.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this CallHistory.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the startCallDateTime value for this CallHistory.
     * 
     * @return startCallDateTime
     */
    public java.util.Calendar getStartCallDateTime() {
        return startCallDateTime;
    }


    /**
     * Sets the startCallDateTime value for this CallHistory.
     * 
     * @param startCallDateTime
     */
    public void setStartCallDateTime(java.util.Calendar startCallDateTime) {
        this.startCallDateTime = startCallDateTime;
    }


    /**
     * Gets the endCallDateTime value for this CallHistory.
     * 
     * @return endCallDateTime
     */
    public java.util.Calendar getEndCallDateTime() {
        return endCallDateTime;
    }


    /**
     * Sets the endCallDateTime value for this CallHistory.
     * 
     * @param endCallDateTime
     */
    public void setEndCallDateTime(java.util.Calendar endCallDateTime) {
        this.endCallDateTime = endCallDateTime;
    }


    /**
     * Gets the calledNumber value for this CallHistory.
     * 
     * @return calledNumber
     */
    public String getCalledNumber() {
        return calledNumber;
    }


    /**
     * Sets the calledNumber value for this CallHistory.
     * 
     * @param calledNumber
     */
    public void setCalledNumber(String calledNumber) {
        this.calledNumber = calledNumber;
    }


    /**
     * Gets the callDuration value for this CallHistory.
     * 
     * @return callDuration
     */
    public Long getCallDuration() {
        return callDuration;
    }


    /**
     * Sets the callDuration value for this CallHistory.
     * 
     * @param callDuration
     */
    public void setCallDuration(Long callDuration) {
        this.callDuration = callDuration;
    }


    /**
     * Gets the callType value for this CallHistory.
     * 
     * @return callType
     */
    public String getCallType() {
        return callType;
    }


    /**
     * Sets the callType value for this CallHistory.
     * 
     * @param callType
     */
    public void setCallType(String callType) {
        this.callType = callType;
    }


    /**
     * Gets the description value for this CallHistory.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this CallHistory.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the reason value for this CallHistory.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this CallHistory.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the additionalNumber value for this CallHistory.
     * 
     * @return additionalNumber
     */
    public String getAdditionalNumber() {
        return additionalNumber;
    }


    /**
     * Sets the additionalNumber value for this CallHistory.
     * 
     * @param additionalNumber
     */
    public void setAdditionalNumber(String additionalNumber) {
        this.additionalNumber = additionalNumber;
    }


    /**
     * Gets the CUGCode value for this CallHistory.
     * 
     * @return CUGCode
     */
    public String getCUGCode() {
        return CUGCode;
    }


    /**
     * Sets the CUGCode value for this CallHistory.
     * 
     * @param CUGCode
     */
    public void setCUGCode(String CUGCode) {
        this.CUGCode = CUGCode;
    }


    /**
     * Gets the masterSubID value for this CallHistory.
     * 
     * @return masterSubID
     */
    public String getMasterSubID() {
        return masterSubID;
    }


    /**
     * Sets the masterSubID value for this CallHistory.
     * 
     * @param masterSubID
     */
    public void setMasterSubID(String masterSubID) {
        this.masterSubID = masterSubID;
    }


    /**
     * Gets the applicationName value for this CallHistory.
     * 
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this CallHistory.
     * 
     * @param applicationName
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the subTypeName value for this CallHistory.
     * 
     * @return subTypeName
     */
    public String getSubTypeName() {
        return subTypeName;
    }


    /**
     * Sets the subTypeName value for this CallHistory.
     * 
     * @param subTypeName
     */
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }


    /**
     * Gets the MSCID value for this CallHistory.
     * 
     * @return MSCID
     */
    public String getMSCID() {
        return MSCID;
    }


    /**
     * Sets the MSCID value for this CallHistory.
     * 
     * @param MSCID
     */
    public void setMSCID(String MSCID) {
        this.MSCID = MSCID;
    }


    /**
     * Gets the cellID value for this CallHistory.
     * 
     * @return cellID
     */
    public String getCellID() {
        return cellID;
    }


    /**
     * Sets the cellID value for this CallHistory.
     * 
     * @param cellID
     */
    public void setCellID(String cellID) {
        this.cellID = cellID;
    }


    /**
     * Gets the SLUID value for this CallHistory.
     * 
     * @return SLUID
     */
    public String getSLUID() {
        return SLUID;
    }


    /**
     * Sets the SLUID value for this CallHistory.
     * 
     * @param SLUID
     */
    public void setSLUID(String SLUID) {
        this.SLUID = SLUID;
    }


    /**
     * Gets the unitTypeName value for this CallHistory.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this CallHistory.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the APN value for this CallHistory.
     * 
     * @return APN
     */
    public String getAPN() {
        return APN;
    }


    /**
     * Sets the APN value for this CallHistory.
     * 
     * @param APN
     */
    public void setAPN(String APN) {
        this.APN = APN;
    }


    /**
     * Gets the QOS value for this CallHistory.
     * 
     * @return QOS
     */
    public String getQOS() {
        return QOS;
    }


    /**
     * Sets the QOS value for this CallHistory.
     * 
     * @param QOS
     */
    public void setQOS(String QOS) {
        this.QOS = QOS;
    }


    /**
     * Gets the CRN value for this CallHistory.
     * 
     * @return CRN
     */
    public Long getCRN() {
        return CRN;
    }


    /**
     * Sets the CRN value for this CallHistory.
     * 
     * @param CRN
     */
    public void setCRN(Long CRN) {
        this.CRN = CRN;
    }


    /**
     * Gets the identity value for this CallHistory.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this CallHistory.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accountType value for this CallHistory.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this CallHistory.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the ORPTime value for this CallHistory.
     * 
     * @return ORPTime
     */
    public java.util.Calendar getORPTime() {
        return ORPTime;
    }


    /**
     * Sets the ORPTime value for this CallHistory.
     * 
     * @param ORPTime
     */
    public void setORPTime(java.util.Calendar ORPTime) {
        this.ORPTime = ORPTime;
    }


    /**
     * Gets the fundUsageType value for this CallHistory.
     * 
     * @return fundUsageType
     */
    public com.comverse_in.prepaid.ccws.FundsUsageType getFundUsageType() {
        return fundUsageType;
    }


    /**
     * Sets the fundUsageType value for this CallHistory.
     * 
     * @param fundUsageType
     */
    public void setFundUsageType(com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType) {
        this.fundUsageType = fundUsageType;
    }


    /**
     * Gets the groupID value for this CallHistory.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this CallHistory.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isoCode value for this CallHistory.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this CallHistory.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the previousISOCode value for this CallHistory.
     * 
     * @return previousISOCode
     */
    public String getPreviousISOCode() {
        return previousISOCode;
    }


    /**
     * Sets the previousISOCode value for this CallHistory.
     * 
     * @param previousISOCode
     */
    public void setPreviousISOCode(String previousISOCode) {
        this.previousISOCode = previousISOCode;
    }


    /**
     * Gets the conversionRate value for this CallHistory.
     * 
     * @return conversionRate
     */
    public Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this CallHistory.
     * 
     * @param conversionRate
     */
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the SPName value for this CallHistory.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this CallHistory.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the callingCircle value for this CallHistory.
     * 
     * @return callingCircle
     */
    public String getCallingCircle() {
        return callingCircle;
    }


    /**
     * Sets the callingCircle value for this CallHistory.
     * 
     * @param callingCircle
     */
    public void setCallingCircle(String callingCircle) {
        this.callingCircle = callingCircle;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof CallHistory)) return false;
        CallHistory other = (CallHistory) obj;
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
            ((this.usageAmount==null && other.getUsageAmount()==null) || 
             (this.usageAmount!=null &&
              this.usageAmount.equals(other.getUsageAmount()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.startCallDateTime==null && other.getStartCallDateTime()==null) || 
             (this.startCallDateTime!=null &&
              this.startCallDateTime.equals(other.getStartCallDateTime()))) &&
            ((this.endCallDateTime==null && other.getEndCallDateTime()==null) || 
             (this.endCallDateTime!=null &&
              this.endCallDateTime.equals(other.getEndCallDateTime()))) &&
            ((this.calledNumber==null && other.getCalledNumber()==null) || 
             (this.calledNumber!=null &&
              this.calledNumber.equals(other.getCalledNumber()))) &&
            ((this.callDuration==null && other.getCallDuration()==null) || 
             (this.callDuration!=null &&
              this.callDuration.equals(other.getCallDuration()))) &&
            ((this.callType==null && other.getCallType()==null) || 
             (this.callType!=null &&
              this.callType.equals(other.getCallType()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.additionalNumber==null && other.getAdditionalNumber()==null) || 
             (this.additionalNumber!=null &&
              this.additionalNumber.equals(other.getAdditionalNumber()))) &&
            ((this.CUGCode==null && other.getCUGCode()==null) || 
             (this.CUGCode!=null &&
              this.CUGCode.equals(other.getCUGCode()))) &&
            ((this.masterSubID==null && other.getMasterSubID()==null) || 
             (this.masterSubID!=null &&
              this.masterSubID.equals(other.getMasterSubID()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.subTypeName==null && other.getSubTypeName()==null) || 
             (this.subTypeName!=null &&
              this.subTypeName.equals(other.getSubTypeName()))) &&
            ((this.MSCID==null && other.getMSCID()==null) || 
             (this.MSCID!=null &&
              this.MSCID.equals(other.getMSCID()))) &&
            ((this.cellID==null && other.getCellID()==null) || 
             (this.cellID!=null &&
              this.cellID.equals(other.getCellID()))) &&
            ((this.SLUID==null && other.getSLUID()==null) || 
             (this.SLUID!=null &&
              this.SLUID.equals(other.getSLUID()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.APN==null && other.getAPN()==null) || 
             (this.APN!=null &&
              this.APN.equals(other.getAPN()))) &&
            ((this.QOS==null && other.getQOS()==null) || 
             (this.QOS!=null &&
              this.QOS.equals(other.getQOS()))) &&
            ((this.CRN==null && other.getCRN()==null) || 
             (this.CRN!=null &&
              this.CRN.equals(other.getCRN()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.ORPTime==null && other.getORPTime()==null) || 
             (this.ORPTime!=null &&
              this.ORPTime.equals(other.getORPTime()))) &&
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
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName()))) &&
            ((this.callingCircle==null && other.getCallingCircle()==null) || 
             (this.callingCircle!=null &&
              this.callingCircle.equals(other.getCallingCircle())));
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
        if (getUsageAmount() != null) {
            _hashCode += getUsageAmount().hashCode();
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
        if (getStartCallDateTime() != null) {
            _hashCode += getStartCallDateTime().hashCode();
        }
        if (getEndCallDateTime() != null) {
            _hashCode += getEndCallDateTime().hashCode();
        }
        if (getCalledNumber() != null) {
            _hashCode += getCalledNumber().hashCode();
        }
        if (getCallDuration() != null) {
            _hashCode += getCallDuration().hashCode();
        }
        if (getCallType() != null) {
            _hashCode += getCallType().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getAdditionalNumber() != null) {
            _hashCode += getAdditionalNumber().hashCode();
        }
        if (getCUGCode() != null) {
            _hashCode += getCUGCode().hashCode();
        }
        if (getMasterSubID() != null) {
            _hashCode += getMasterSubID().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getSubTypeName() != null) {
            _hashCode += getSubTypeName().hashCode();
        }
        if (getMSCID() != null) {
            _hashCode += getMSCID().hashCode();
        }
        if (getCellID() != null) {
            _hashCode += getCellID().hashCode();
        }
        if (getSLUID() != null) {
            _hashCode += getSLUID().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        if (getAPN() != null) {
            _hashCode += getAPN().hashCode();
        }
        if (getQOS() != null) {
            _hashCode += getQOS().hashCode();
        }
        if (getCRN() != null) {
            _hashCode += getCRN().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getORPTime() != null) {
            _hashCode += getORPTime().hashCode();
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
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        if (getCallingCircle() != null) {
            _hashCode += getCallingCircle().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(CallHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("chargecode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Chargecode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UsageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("startCallDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "StartCallDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("endCallDateTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "EndCallDateTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("calledNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CalledNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callDuration");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallDuration"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("reason");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Reason"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("additionalNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AdditionalNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CUGCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CUGCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("masterSubID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MasterSubID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ApplicationName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subTypeName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubTypeName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("MSCID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MSCID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("cellID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CellID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SLUID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SLUID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("APN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "APN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("QOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "QOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CRN");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CRN"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("ORPTime");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ORPTime"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("SPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SPName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("callingCircle");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CallingCircle"));
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
