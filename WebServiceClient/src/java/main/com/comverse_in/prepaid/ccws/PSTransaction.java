/**
 * PSTransaction.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class PSTransaction  implements java.io.Serializable {
    private String subscriberID;

    private String typeOfCharge;

    private String chargecode;

    private Double usageAmount;

    private String unitTypeName;

    private Long transID1;

    private Long transID2;

    private java.util.Calendar dateTimeTrans;

    private String subscriberType;

    private String messageType;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String subID2;

    private String refundFlag;

    private Long refundTransID1;

    private Long refundTransID2;

    private String applicationName;

    private String subTypeName;

    private String identity;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private String contentType;

    private java.util.Calendar ORPDate;

    private com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType;

    private String groupID;

    private String isoCode;

    private Double conversionRate;

    private String requestedISOCode;

    private String MSCID;

    private String SPName;

    private String callingCircle;

    public PSTransaction() {
    }

    public PSTransaction(
           String subscriberID,
           String typeOfCharge,
           String chargecode,
           Double usageAmount,
           String unitTypeName,
           Long transID1,
           Long transID2,
           java.util.Calendar dateTimeTrans,
           String subscriberType,
           String messageType,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String subID2,
           String refundFlag,
           Long refundTransID1,
           Long refundTransID2,
           String applicationName,
           String subTypeName,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           String contentType,
           java.util.Calendar ORPDate,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String groupID,
           String isoCode,
           Double conversionRate,
           String requestedISOCode,
           String MSCID,
           String SPName,
           String callingCircle) {
           this.subscriberID = subscriberID;
           this.typeOfCharge = typeOfCharge;
           this.chargecode = chargecode;
           this.usageAmount = usageAmount;
           this.unitTypeName = unitTypeName;
           this.transID1 = transID1;
           this.transID2 = transID2;
           this.dateTimeTrans = dateTimeTrans;
           this.subscriberType = subscriberType;
           this.messageType = messageType;
           this.balances = balances;
           this.subID2 = subID2;
           this.refundFlag = refundFlag;
           this.refundTransID1 = refundTransID1;
           this.refundTransID2 = refundTransID2;
           this.applicationName = applicationName;
           this.subTypeName = subTypeName;
           this.identity = identity;
           this.accountType = accountType;
           this.contentType = contentType;
           this.ORPDate = ORPDate;
           this.fundUsageType = fundUsageType;
           this.groupID = groupID;
           this.isoCode = isoCode;
           this.conversionRate = conversionRate;
           this.requestedISOCode = requestedISOCode;
           this.MSCID = MSCID;
           this.SPName = SPName;
           this.callingCircle = callingCircle;
    }


    /**
     * Gets the subscriberID value for this PSTransaction.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this PSTransaction.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the typeOfCharge value for this PSTransaction.
     * 
     * @return typeOfCharge
     */
    public String getTypeOfCharge() {
        return typeOfCharge;
    }


    /**
     * Sets the typeOfCharge value for this PSTransaction.
     * 
     * @param typeOfCharge
     */
    public void setTypeOfCharge(String typeOfCharge) {
        this.typeOfCharge = typeOfCharge;
    }


    /**
     * Gets the chargecode value for this PSTransaction.
     * 
     * @return chargecode
     */
    public String getChargecode() {
        return chargecode;
    }


    /**
     * Sets the chargecode value for this PSTransaction.
     * 
     * @param chargecode
     */
    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }


    /**
     * Gets the usageAmount value for this PSTransaction.
     * 
     * @return usageAmount
     */
    public Double getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this PSTransaction.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(Double usageAmount) {
        this.usageAmount = usageAmount;
    }


    /**
     * Gets the unitTypeName value for this PSTransaction.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this PSTransaction.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the transID1 value for this PSTransaction.
     * 
     * @return transID1
     */
    public Long getTransID1() {
        return transID1;
    }


    /**
     * Sets the transID1 value for this PSTransaction.
     * 
     * @param transID1
     */
    public void setTransID1(Long transID1) {
        this.transID1 = transID1;
    }


    /**
     * Gets the transID2 value for this PSTransaction.
     * 
     * @return transID2
     */
    public Long getTransID2() {
        return transID2;
    }


    /**
     * Sets the transID2 value for this PSTransaction.
     * 
     * @param transID2
     */
    public void setTransID2(Long transID2) {
        this.transID2 = transID2;
    }


    /**
     * Gets the dateTimeTrans value for this PSTransaction.
     * 
     * @return dateTimeTrans
     */
    public java.util.Calendar getDateTimeTrans() {
        return dateTimeTrans;
    }


    /**
     * Sets the dateTimeTrans value for this PSTransaction.
     * 
     * @param dateTimeTrans
     */
    public void setDateTimeTrans(java.util.Calendar dateTimeTrans) {
        this.dateTimeTrans = dateTimeTrans;
    }


    /**
     * Gets the subscriberType value for this PSTransaction.
     * 
     * @return subscriberType
     */
    public String getSubscriberType() {
        return subscriberType;
    }


    /**
     * Sets the subscriberType value for this PSTransaction.
     * 
     * @param subscriberType
     */
    public void setSubscriberType(String subscriberType) {
        this.subscriberType = subscriberType;
    }


    /**
     * Gets the messageType value for this PSTransaction.
     * 
     * @return messageType
     */
    public String getMessageType() {
        return messageType;
    }


    /**
     * Sets the messageType value for this PSTransaction.
     * 
     * @param messageType
     */
    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }


    /**
     * Gets the balances value for this PSTransaction.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this PSTransaction.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the subID2 value for this PSTransaction.
     * 
     * @return subID2
     */
    public String getSubID2() {
        return subID2;
    }


    /**
     * Sets the subID2 value for this PSTransaction.
     * 
     * @param subID2
     */
    public void setSubID2(String subID2) {
        this.subID2 = subID2;
    }


    /**
     * Gets the refundFlag value for this PSTransaction.
     * 
     * @return refundFlag
     */
    public String getRefundFlag() {
        return refundFlag;
    }


    /**
     * Sets the refundFlag value for this PSTransaction.
     * 
     * @param refundFlag
     */
    public void setRefundFlag(String refundFlag) {
        this.refundFlag = refundFlag;
    }


    /**
     * Gets the refundTransID1 value for this PSTransaction.
     * 
     * @return refundTransID1
     */
    public Long getRefundTransID1() {
        return refundTransID1;
    }


    /**
     * Sets the refundTransID1 value for this PSTransaction.
     * 
     * @param refundTransID1
     */
    public void setRefundTransID1(Long refundTransID1) {
        this.refundTransID1 = refundTransID1;
    }


    /**
     * Gets the refundTransID2 value for this PSTransaction.
     * 
     * @return refundTransID2
     */
    public Long getRefundTransID2() {
        return refundTransID2;
    }


    /**
     * Sets the refundTransID2 value for this PSTransaction.
     * 
     * @param refundTransID2
     */
    public void setRefundTransID2(Long refundTransID2) {
        this.refundTransID2 = refundTransID2;
    }


    /**
     * Gets the applicationName value for this PSTransaction.
     * 
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this PSTransaction.
     * 
     * @param applicationName
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the subTypeName value for this PSTransaction.
     * 
     * @return subTypeName
     */
    public String getSubTypeName() {
        return subTypeName;
    }


    /**
     * Sets the subTypeName value for this PSTransaction.
     * 
     * @param subTypeName
     */
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }


    /**
     * Gets the identity value for this PSTransaction.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this PSTransaction.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accountType value for this PSTransaction.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this PSTransaction.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the contentType value for this PSTransaction.
     * 
     * @return contentType
     */
    public String getContentType() {
        return contentType;
    }


    /**
     * Sets the contentType value for this PSTransaction.
     * 
     * @param contentType
     */
    public void setContentType(String contentType) {
        this.contentType = contentType;
    }


    /**
     * Gets the ORPDate value for this PSTransaction.
     * 
     * @return ORPDate
     */
    public java.util.Calendar getORPDate() {
        return ORPDate;
    }


    /**
     * Sets the ORPDate value for this PSTransaction.
     * 
     * @param ORPDate
     */
    public void setORPDate(java.util.Calendar ORPDate) {
        this.ORPDate = ORPDate;
    }


    /**
     * Gets the fundUsageType value for this PSTransaction.
     * 
     * @return fundUsageType
     */
    public com.comverse_in.prepaid.ccws.FundsUsageType getFundUsageType() {
        return fundUsageType;
    }


    /**
     * Sets the fundUsageType value for this PSTransaction.
     * 
     * @param fundUsageType
     */
    public void setFundUsageType(com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType) {
        this.fundUsageType = fundUsageType;
    }


    /**
     * Gets the groupID value for this PSTransaction.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this PSTransaction.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isoCode value for this PSTransaction.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this PSTransaction.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the conversionRate value for this PSTransaction.
     * 
     * @return conversionRate
     */
    public Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this PSTransaction.
     * 
     * @param conversionRate
     */
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }


    /**
     * Gets the requestedISOCode value for this PSTransaction.
     * 
     * @return requestedISOCode
     */
    public String getRequestedISOCode() {
        return requestedISOCode;
    }


    /**
     * Sets the requestedISOCode value for this PSTransaction.
     * 
     * @param requestedISOCode
     */
    public void setRequestedISOCode(String requestedISOCode) {
        this.requestedISOCode = requestedISOCode;
    }


    /**
     * Gets the MSCID value for this PSTransaction.
     * 
     * @return MSCID
     */
    public String getMSCID() {
        return MSCID;
    }


    /**
     * Sets the MSCID value for this PSTransaction.
     * 
     * @param MSCID
     */
    public void setMSCID(String MSCID) {
        this.MSCID = MSCID;
    }


    /**
     * Gets the SPName value for this PSTransaction.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this PSTransaction.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the callingCircle value for this PSTransaction.
     * 
     * @return callingCircle
     */
    public String getCallingCircle() {
        return callingCircle;
    }


    /**
     * Sets the callingCircle value for this PSTransaction.
     * 
     * @param callingCircle
     */
    public void setCallingCircle(String callingCircle) {
        this.callingCircle = callingCircle;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof PSTransaction)) return false;
        PSTransaction other = (PSTransaction) obj;
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
            ((this.typeOfCharge==null && other.getTypeOfCharge()==null) || 
             (this.typeOfCharge!=null &&
              this.typeOfCharge.equals(other.getTypeOfCharge()))) &&
            ((this.chargecode==null && other.getChargecode()==null) || 
             (this.chargecode!=null &&
              this.chargecode.equals(other.getChargecode()))) &&
            ((this.usageAmount==null && other.getUsageAmount()==null) || 
             (this.usageAmount!=null &&
              this.usageAmount.equals(other.getUsageAmount()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.transID1==null && other.getTransID1()==null) || 
             (this.transID1!=null &&
              this.transID1.equals(other.getTransID1()))) &&
            ((this.transID2==null && other.getTransID2()==null) || 
             (this.transID2!=null &&
              this.transID2.equals(other.getTransID2()))) &&
            ((this.dateTimeTrans==null && other.getDateTimeTrans()==null) || 
             (this.dateTimeTrans!=null &&
              this.dateTimeTrans.equals(other.getDateTimeTrans()))) &&
            ((this.subscriberType==null && other.getSubscriberType()==null) || 
             (this.subscriberType!=null &&
              this.subscriberType.equals(other.getSubscriberType()))) &&
            ((this.messageType==null && other.getMessageType()==null) || 
             (this.messageType!=null &&
              this.messageType.equals(other.getMessageType()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.subID2==null && other.getSubID2()==null) || 
             (this.subID2!=null &&
              this.subID2.equals(other.getSubID2()))) &&
            ((this.refundFlag==null && other.getRefundFlag()==null) || 
             (this.refundFlag!=null &&
              this.refundFlag.equals(other.getRefundFlag()))) &&
            ((this.refundTransID1==null && other.getRefundTransID1()==null) || 
             (this.refundTransID1!=null &&
              this.refundTransID1.equals(other.getRefundTransID1()))) &&
            ((this.refundTransID2==null && other.getRefundTransID2()==null) || 
             (this.refundTransID2!=null &&
              this.refundTransID2.equals(other.getRefundTransID2()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.subTypeName==null && other.getSubTypeName()==null) || 
             (this.subTypeName!=null &&
              this.subTypeName.equals(other.getSubTypeName()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.contentType==null && other.getContentType()==null) || 
             (this.contentType!=null &&
              this.contentType.equals(other.getContentType()))) &&
            ((this.ORPDate==null && other.getORPDate()==null) || 
             (this.ORPDate!=null &&
              this.ORPDate.equals(other.getORPDate()))) &&
            ((this.fundUsageType==null && other.getFundUsageType()==null) || 
             (this.fundUsageType!=null &&
              this.fundUsageType.equals(other.getFundUsageType()))) &&
            ((this.groupID==null && other.getGroupID()==null) || 
             (this.groupID!=null &&
              this.groupID.equals(other.getGroupID()))) &&
            ((this.isoCode==null && other.getIsoCode()==null) || 
             (this.isoCode!=null &&
              this.isoCode.equals(other.getIsoCode()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate()))) &&
            ((this.requestedISOCode==null && other.getRequestedISOCode()==null) || 
             (this.requestedISOCode!=null &&
              this.requestedISOCode.equals(other.getRequestedISOCode()))) &&
            ((this.MSCID==null && other.getMSCID()==null) || 
             (this.MSCID!=null &&
              this.MSCID.equals(other.getMSCID()))) &&
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
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getTypeOfCharge() != null) {
            _hashCode += getTypeOfCharge().hashCode();
        }
        if (getChargecode() != null) {
            _hashCode += getChargecode().hashCode();
        }
        if (getUsageAmount() != null) {
            _hashCode += getUsageAmount().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        if (getTransID1() != null) {
            _hashCode += getTransID1().hashCode();
        }
        if (getTransID2() != null) {
            _hashCode += getTransID2().hashCode();
        }
        if (getDateTimeTrans() != null) {
            _hashCode += getDateTimeTrans().hashCode();
        }
        if (getSubscriberType() != null) {
            _hashCode += getSubscriberType().hashCode();
        }
        if (getMessageType() != null) {
            _hashCode += getMessageType().hashCode();
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
        if (getSubID2() != null) {
            _hashCode += getSubID2().hashCode();
        }
        if (getRefundFlag() != null) {
            _hashCode += getRefundFlag().hashCode();
        }
        if (getRefundTransID1() != null) {
            _hashCode += getRefundTransID1().hashCode();
        }
        if (getRefundTransID2() != null) {
            _hashCode += getRefundTransID2().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getSubTypeName() != null) {
            _hashCode += getSubTypeName().hashCode();
        }
        if (getIdentity() != null) {
            _hashCode += getIdentity().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getContentType() != null) {
            _hashCode += getContentType().hashCode();
        }
        if (getORPDate() != null) {
            _hashCode += getORPDate().hashCode();
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
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        if (getRequestedISOCode() != null) {
            _hashCode += getRequestedISOCode().hashCode();
        }
        if (getMSCID() != null) {
            _hashCode += getMSCID().hashCode();
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
        new org.apache.axis.description.TypeDesc(PSTransaction.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PSTransaction"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("typeOfCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TypeOfCharge"));
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
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UsageAmount"));
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
        elemField.setFieldName("transID1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TransID1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("transID2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TransID2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateTimeTrans");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DateTimeTrans"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("subscriberType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("messageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MessageType"));
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
        elemField.setFieldName("subID2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubID2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundFlag");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RefundFlag"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransID1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RefundTransID1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refundTransID2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RefundTransID2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("contentType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ContentType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("ORPDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ORPDate"));
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
        elemField.setFieldName("conversionRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ConversionRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("requestedISOCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RequestedISOCode"));
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
