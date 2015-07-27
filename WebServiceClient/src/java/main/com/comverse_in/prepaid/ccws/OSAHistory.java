/**
 * OSAHistory.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class OSAHistory  implements java.io.Serializable {
    private String SPName;

    private String subscriberID;

    private String chargecode;

    private java.util.Calendar startCallDateTime;

    private java.util.Calendar endCallDateTime;

    private String activityType;

    private Long usageAmount;

    private String description;

    private String reason;

    private String applicationName;

    private String subTypeName;

    private String SLUID;

    private String unitTypeName;

    private String merchantName;

    private String sessionDescription;

    private Long correlationID;

    private Long correlationType;

    private Long accountID;

    private String applicationDescription;

    private String OSAItem;

    private String OSASubType;

    private String QOS;

    private String serviceCatalog1;

    private String serviceCatalog2;

    private String serviceCatalog3;

    private String serviceCatalog4;

    private String paramConfirmID;

    private String paramContract;

    private String locationA;

    private Long locationAType;

    private String locationB;

    private Long locationBType;

    private String IMSI;

    private String infoParameter;

    private String currency;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String identity;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private java.util.Calendar ORPDate;

    private com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType;

    private String groupID;

    private String isoCode;

    private String previousISOCode;

    private Double conversionRate;

    public OSAHistory() {
    }

    public OSAHistory(
           String SPName,
           String subscriberID,
           String chargecode,
           java.util.Calendar startCallDateTime,
           java.util.Calendar endCallDateTime,
           String activityType,
           Long usageAmount,
           String description,
           String reason,
           String applicationName,
           String subTypeName,
           String SLUID,
           String unitTypeName,
           String merchantName,
           String sessionDescription,
           Long correlationID,
           Long correlationType,
           Long accountID,
           String applicationDescription,
           String OSAItem,
           String OSASubType,
           String QOS,
           String serviceCatalog1,
           String serviceCatalog2,
           String serviceCatalog3,
           String serviceCatalog4,
           String paramConfirmID,
           String paramContract,
           String locationA,
           Long locationAType,
           String locationB,
           Long locationBType,
           String IMSI,
           String infoParameter,
           String currency,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String identity,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           java.util.Calendar ORPDate,
           com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType,
           String groupID,
           String isoCode,
           String previousISOCode,
           Double conversionRate) {
           this.SPName = SPName;
           this.subscriberID = subscriberID;
           this.chargecode = chargecode;
           this.startCallDateTime = startCallDateTime;
           this.endCallDateTime = endCallDateTime;
           this.activityType = activityType;
           this.usageAmount = usageAmount;
           this.description = description;
           this.reason = reason;
           this.applicationName = applicationName;
           this.subTypeName = subTypeName;
           this.SLUID = SLUID;
           this.unitTypeName = unitTypeName;
           this.merchantName = merchantName;
           this.sessionDescription = sessionDescription;
           this.correlationID = correlationID;
           this.correlationType = correlationType;
           this.accountID = accountID;
           this.applicationDescription = applicationDescription;
           this.OSAItem = OSAItem;
           this.OSASubType = OSASubType;
           this.QOS = QOS;
           this.serviceCatalog1 = serviceCatalog1;
           this.serviceCatalog2 = serviceCatalog2;
           this.serviceCatalog3 = serviceCatalog3;
           this.serviceCatalog4 = serviceCatalog4;
           this.paramConfirmID = paramConfirmID;
           this.paramContract = paramContract;
           this.locationA = locationA;
           this.locationAType = locationAType;
           this.locationB = locationB;
           this.locationBType = locationBType;
           this.IMSI = IMSI;
           this.infoParameter = infoParameter;
           this.currency = currency;
           this.balances = balances;
           this.identity = identity;
           this.accountType = accountType;
           this.ORPDate = ORPDate;
           this.fundUsageType = fundUsageType;
           this.groupID = groupID;
           this.isoCode = isoCode;
           this.previousISOCode = previousISOCode;
           this.conversionRate = conversionRate;
    }


    /**
     * Gets the SPName value for this OSAHistory.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this OSAHistory.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the subscriberID value for this OSAHistory.
     * 
     * @return subscriberID
     */
    public String getSubscriberID() {
        return subscriberID;
    }


    /**
     * Sets the subscriberID value for this OSAHistory.
     * 
     * @param subscriberID
     */
    public void setSubscriberID(String subscriberID) {
        this.subscriberID = subscriberID;
    }


    /**
     * Gets the chargecode value for this OSAHistory.
     * 
     * @return chargecode
     */
    public String getChargecode() {
        return chargecode;
    }


    /**
     * Sets the chargecode value for this OSAHistory.
     * 
     * @param chargecode
     */
    public void setChargecode(String chargecode) {
        this.chargecode = chargecode;
    }


    /**
     * Gets the startCallDateTime value for this OSAHistory.
     * 
     * @return startCallDateTime
     */
    public java.util.Calendar getStartCallDateTime() {
        return startCallDateTime;
    }


    /**
     * Sets the startCallDateTime value for this OSAHistory.
     * 
     * @param startCallDateTime
     */
    public void setStartCallDateTime(java.util.Calendar startCallDateTime) {
        this.startCallDateTime = startCallDateTime;
    }


    /**
     * Gets the endCallDateTime value for this OSAHistory.
     * 
     * @return endCallDateTime
     */
    public java.util.Calendar getEndCallDateTime() {
        return endCallDateTime;
    }


    /**
     * Sets the endCallDateTime value for this OSAHistory.
     * 
     * @param endCallDateTime
     */
    public void setEndCallDateTime(java.util.Calendar endCallDateTime) {
        this.endCallDateTime = endCallDateTime;
    }


    /**
     * Gets the activityType value for this OSAHistory.
     * 
     * @return activityType
     */
    public String getActivityType() {
        return activityType;
    }


    /**
     * Sets the activityType value for this OSAHistory.
     * 
     * @param activityType
     */
    public void setActivityType(String activityType) {
        this.activityType = activityType;
    }


    /**
     * Gets the usageAmount value for this OSAHistory.
     * 
     * @return usageAmount
     */
    public Long getUsageAmount() {
        return usageAmount;
    }


    /**
     * Sets the usageAmount value for this OSAHistory.
     * 
     * @param usageAmount
     */
    public void setUsageAmount(Long usageAmount) {
        this.usageAmount = usageAmount;
    }


    /**
     * Gets the description value for this OSAHistory.
     * 
     * @return description
     */
    public String getDescription() {
        return description;
    }


    /**
     * Sets the description value for this OSAHistory.
     * 
     * @param description
     */
    public void setDescription(String description) {
        this.description = description;
    }


    /**
     * Gets the reason value for this OSAHistory.
     * 
     * @return reason
     */
    public String getReason() {
        return reason;
    }


    /**
     * Sets the reason value for this OSAHistory.
     * 
     * @param reason
     */
    public void setReason(String reason) {
        this.reason = reason;
    }


    /**
     * Gets the applicationName value for this OSAHistory.
     * 
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }


    /**
     * Sets the applicationName value for this OSAHistory.
     * 
     * @param applicationName
     */
    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }


    /**
     * Gets the subTypeName value for this OSAHistory.
     * 
     * @return subTypeName
     */
    public String getSubTypeName() {
        return subTypeName;
    }


    /**
     * Sets the subTypeName value for this OSAHistory.
     * 
     * @param subTypeName
     */
    public void setSubTypeName(String subTypeName) {
        this.subTypeName = subTypeName;
    }


    /**
     * Gets the SLUID value for this OSAHistory.
     * 
     * @return SLUID
     */
    public String getSLUID() {
        return SLUID;
    }


    /**
     * Sets the SLUID value for this OSAHistory.
     * 
     * @param SLUID
     */
    public void setSLUID(String SLUID) {
        this.SLUID = SLUID;
    }


    /**
     * Gets the unitTypeName value for this OSAHistory.
     * 
     * @return unitTypeName
     */
    public String getUnitTypeName() {
        return unitTypeName;
    }


    /**
     * Sets the unitTypeName value for this OSAHistory.
     * 
     * @param unitTypeName
     */
    public void setUnitTypeName(String unitTypeName) {
        this.unitTypeName = unitTypeName;
    }


    /**
     * Gets the merchantName value for this OSAHistory.
     * 
     * @return merchantName
     */
    public String getMerchantName() {
        return merchantName;
    }


    /**
     * Sets the merchantName value for this OSAHistory.
     * 
     * @param merchantName
     */
    public void setMerchantName(String merchantName) {
        this.merchantName = merchantName;
    }


    /**
     * Gets the sessionDescription value for this OSAHistory.
     * 
     * @return sessionDescription
     */
    public String getSessionDescription() {
        return sessionDescription;
    }


    /**
     * Sets the sessionDescription value for this OSAHistory.
     * 
     * @param sessionDescription
     */
    public void setSessionDescription(String sessionDescription) {
        this.sessionDescription = sessionDescription;
    }


    /**
     * Gets the correlationID value for this OSAHistory.
     * 
     * @return correlationID
     */
    public Long getCorrelationID() {
        return correlationID;
    }


    /**
     * Sets the correlationID value for this OSAHistory.
     * 
     * @param correlationID
     */
    public void setCorrelationID(Long correlationID) {
        this.correlationID = correlationID;
    }


    /**
     * Gets the correlationType value for this OSAHistory.
     * 
     * @return correlationType
     */
    public Long getCorrelationType() {
        return correlationType;
    }


    /**
     * Sets the correlationType value for this OSAHistory.
     * 
     * @param correlationType
     */
    public void setCorrelationType(Long correlationType) {
        this.correlationType = correlationType;
    }


    /**
     * Gets the accountID value for this OSAHistory.
     * 
     * @return accountID
     */
    public Long getAccountID() {
        return accountID;
    }


    /**
     * Sets the accountID value for this OSAHistory.
     * 
     * @param accountID
     */
    public void setAccountID(Long accountID) {
        this.accountID = accountID;
    }


    /**
     * Gets the applicationDescription value for this OSAHistory.
     * 
     * @return applicationDescription
     */
    public String getApplicationDescription() {
        return applicationDescription;
    }


    /**
     * Sets the applicationDescription value for this OSAHistory.
     * 
     * @param applicationDescription
     */
    public void setApplicationDescription(String applicationDescription) {
        this.applicationDescription = applicationDescription;
    }


    /**
     * Gets the OSAItem value for this OSAHistory.
     * 
     * @return OSAItem
     */
    public String getOSAItem() {
        return OSAItem;
    }


    /**
     * Sets the OSAItem value for this OSAHistory.
     * 
     * @param OSAItem
     */
    public void setOSAItem(String OSAItem) {
        this.OSAItem = OSAItem;
    }


    /**
     * Gets the OSASubType value for this OSAHistory.
     * 
     * @return OSASubType
     */
    public String getOSASubType() {
        return OSASubType;
    }


    /**
     * Sets the OSASubType value for this OSAHistory.
     * 
     * @param OSASubType
     */
    public void setOSASubType(String OSASubType) {
        this.OSASubType = OSASubType;
    }


    /**
     * Gets the QOS value for this OSAHistory.
     * 
     * @return QOS
     */
    public String getQOS() {
        return QOS;
    }


    /**
     * Sets the QOS value for this OSAHistory.
     * 
     * @param QOS
     */
    public void setQOS(String QOS) {
        this.QOS = QOS;
    }


    /**
     * Gets the serviceCatalog1 value for this OSAHistory.
     * 
     * @return serviceCatalog1
     */
    public String getServiceCatalog1() {
        return serviceCatalog1;
    }


    /**
     * Sets the serviceCatalog1 value for this OSAHistory.
     * 
     * @param serviceCatalog1
     */
    public void setServiceCatalog1(String serviceCatalog1) {
        this.serviceCatalog1 = serviceCatalog1;
    }


    /**
     * Gets the serviceCatalog2 value for this OSAHistory.
     * 
     * @return serviceCatalog2
     */
    public String getServiceCatalog2() {
        return serviceCatalog2;
    }


    /**
     * Sets the serviceCatalog2 value for this OSAHistory.
     * 
     * @param serviceCatalog2
     */
    public void setServiceCatalog2(String serviceCatalog2) {
        this.serviceCatalog2 = serviceCatalog2;
    }


    /**
     * Gets the serviceCatalog3 value for this OSAHistory.
     * 
     * @return serviceCatalog3
     */
    public String getServiceCatalog3() {
        return serviceCatalog3;
    }


    /**
     * Sets the serviceCatalog3 value for this OSAHistory.
     * 
     * @param serviceCatalog3
     */
    public void setServiceCatalog3(String serviceCatalog3) {
        this.serviceCatalog3 = serviceCatalog3;
    }


    /**
     * Gets the serviceCatalog4 value for this OSAHistory.
     * 
     * @return serviceCatalog4
     */
    public String getServiceCatalog4() {
        return serviceCatalog4;
    }


    /**
     * Sets the serviceCatalog4 value for this OSAHistory.
     * 
     * @param serviceCatalog4
     */
    public void setServiceCatalog4(String serviceCatalog4) {
        this.serviceCatalog4 = serviceCatalog4;
    }


    /**
     * Gets the paramConfirmID value for this OSAHistory.
     * 
     * @return paramConfirmID
     */
    public String getParamConfirmID() {
        return paramConfirmID;
    }


    /**
     * Sets the paramConfirmID value for this OSAHistory.
     * 
     * @param paramConfirmID
     */
    public void setParamConfirmID(String paramConfirmID) {
        this.paramConfirmID = paramConfirmID;
    }


    /**
     * Gets the paramContract value for this OSAHistory.
     * 
     * @return paramContract
     */
    public String getParamContract() {
        return paramContract;
    }


    /**
     * Sets the paramContract value for this OSAHistory.
     * 
     * @param paramContract
     */
    public void setParamContract(String paramContract) {
        this.paramContract = paramContract;
    }


    /**
     * Gets the locationA value for this OSAHistory.
     * 
     * @return locationA
     */
    public String getLocationA() {
        return locationA;
    }


    /**
     * Sets the locationA value for this OSAHistory.
     * 
     * @param locationA
     */
    public void setLocationA(String locationA) {
        this.locationA = locationA;
    }


    /**
     * Gets the locationAType value for this OSAHistory.
     * 
     * @return locationAType
     */
    public Long getLocationAType() {
        return locationAType;
    }


    /**
     * Sets the locationAType value for this OSAHistory.
     * 
     * @param locationAType
     */
    public void setLocationAType(Long locationAType) {
        this.locationAType = locationAType;
    }


    /**
     * Gets the locationB value for this OSAHistory.
     * 
     * @return locationB
     */
    public String getLocationB() {
        return locationB;
    }


    /**
     * Sets the locationB value for this OSAHistory.
     * 
     * @param locationB
     */
    public void setLocationB(String locationB) {
        this.locationB = locationB;
    }


    /**
     * Gets the locationBType value for this OSAHistory.
     * 
     * @return locationBType
     */
    public Long getLocationBType() {
        return locationBType;
    }


    /**
     * Sets the locationBType value for this OSAHistory.
     * 
     * @param locationBType
     */
    public void setLocationBType(Long locationBType) {
        this.locationBType = locationBType;
    }


    /**
     * Gets the IMSI value for this OSAHistory.
     * 
     * @return IMSI
     */
    public String getIMSI() {
        return IMSI;
    }


    /**
     * Sets the IMSI value for this OSAHistory.
     * 
     * @param IMSI
     */
    public void setIMSI(String IMSI) {
        this.IMSI = IMSI;
    }


    /**
     * Gets the infoParameter value for this OSAHistory.
     * 
     * @return infoParameter
     */
    public String getInfoParameter() {
        return infoParameter;
    }


    /**
     * Sets the infoParameter value for this OSAHistory.
     * 
     * @param infoParameter
     */
    public void setInfoParameter(String infoParameter) {
        this.infoParameter = infoParameter;
    }


    /**
     * Gets the currency value for this OSAHistory.
     * 
     * @return currency
     */
    public String getCurrency() {
        return currency;
    }


    /**
     * Sets the currency value for this OSAHistory.
     * 
     * @param currency
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }


    /**
     * Gets the balances value for this OSAHistory.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this OSAHistory.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the identity value for this OSAHistory.
     * 
     * @return identity
     */
    public String getIdentity() {
        return identity;
    }


    /**
     * Sets the identity value for this OSAHistory.
     * 
     * @param identity
     */
    public void setIdentity(String identity) {
        this.identity = identity;
    }


    /**
     * Gets the accountType value for this OSAHistory.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this OSAHistory.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the ORPDate value for this OSAHistory.
     * 
     * @return ORPDate
     */
    public java.util.Calendar getORPDate() {
        return ORPDate;
    }


    /**
     * Sets the ORPDate value for this OSAHistory.
     * 
     * @param ORPDate
     */
    public void setORPDate(java.util.Calendar ORPDate) {
        this.ORPDate = ORPDate;
    }


    /**
     * Gets the fundUsageType value for this OSAHistory.
     * 
     * @return fundUsageType
     */
    public com.comverse_in.prepaid.ccws.FundsUsageType getFundUsageType() {
        return fundUsageType;
    }


    /**
     * Sets the fundUsageType value for this OSAHistory.
     * 
     * @param fundUsageType
     */
    public void setFundUsageType(com.comverse_in.prepaid.ccws.FundsUsageType fundUsageType) {
        this.fundUsageType = fundUsageType;
    }


    /**
     * Gets the groupID value for this OSAHistory.
     * 
     * @return groupID
     */
    public String getGroupID() {
        return groupID;
    }


    /**
     * Sets the groupID value for this OSAHistory.
     * 
     * @param groupID
     */
    public void setGroupID(String groupID) {
        this.groupID = groupID;
    }


    /**
     * Gets the isoCode value for this OSAHistory.
     * 
     * @return isoCode
     */
    public String getIsoCode() {
        return isoCode;
    }


    /**
     * Sets the isoCode value for this OSAHistory.
     * 
     * @param isoCode
     */
    public void setIsoCode(String isoCode) {
        this.isoCode = isoCode;
    }


    /**
     * Gets the previousISOCode value for this OSAHistory.
     * 
     * @return previousISOCode
     */
    public String getPreviousISOCode() {
        return previousISOCode;
    }


    /**
     * Sets the previousISOCode value for this OSAHistory.
     * 
     * @param previousISOCode
     */
    public void setPreviousISOCode(String previousISOCode) {
        this.previousISOCode = previousISOCode;
    }


    /**
     * Gets the conversionRate value for this OSAHistory.
     * 
     * @return conversionRate
     */
    public Double getConversionRate() {
        return conversionRate;
    }


    /**
     * Sets the conversionRate value for this OSAHistory.
     * 
     * @param conversionRate
     */
    public void setConversionRate(Double conversionRate) {
        this.conversionRate = conversionRate;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof OSAHistory)) return false;
        OSAHistory other = (OSAHistory) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName()))) &&
            ((this.subscriberID==null && other.getSubscriberID()==null) || 
             (this.subscriberID!=null &&
              this.subscriberID.equals(other.getSubscriberID()))) &&
            ((this.chargecode==null && other.getChargecode()==null) || 
             (this.chargecode!=null &&
              this.chargecode.equals(other.getChargecode()))) &&
            ((this.startCallDateTime==null && other.getStartCallDateTime()==null) || 
             (this.startCallDateTime!=null &&
              this.startCallDateTime.equals(other.getStartCallDateTime()))) &&
            ((this.endCallDateTime==null && other.getEndCallDateTime()==null) || 
             (this.endCallDateTime!=null &&
              this.endCallDateTime.equals(other.getEndCallDateTime()))) &&
            ((this.activityType==null && other.getActivityType()==null) || 
             (this.activityType!=null &&
              this.activityType.equals(other.getActivityType()))) &&
            ((this.usageAmount==null && other.getUsageAmount()==null) || 
             (this.usageAmount!=null &&
              this.usageAmount.equals(other.getUsageAmount()))) &&
            ((this.description==null && other.getDescription()==null) || 
             (this.description!=null &&
              this.description.equals(other.getDescription()))) &&
            ((this.reason==null && other.getReason()==null) || 
             (this.reason!=null &&
              this.reason.equals(other.getReason()))) &&
            ((this.applicationName==null && other.getApplicationName()==null) || 
             (this.applicationName!=null &&
              this.applicationName.equals(other.getApplicationName()))) &&
            ((this.subTypeName==null && other.getSubTypeName()==null) || 
             (this.subTypeName!=null &&
              this.subTypeName.equals(other.getSubTypeName()))) &&
            ((this.SLUID==null && other.getSLUID()==null) || 
             (this.SLUID!=null &&
              this.SLUID.equals(other.getSLUID()))) &&
            ((this.unitTypeName==null && other.getUnitTypeName()==null) || 
             (this.unitTypeName!=null &&
              this.unitTypeName.equals(other.getUnitTypeName()))) &&
            ((this.merchantName==null && other.getMerchantName()==null) || 
             (this.merchantName!=null &&
              this.merchantName.equals(other.getMerchantName()))) &&
            ((this.sessionDescription==null && other.getSessionDescription()==null) || 
             (this.sessionDescription!=null &&
              this.sessionDescription.equals(other.getSessionDescription()))) &&
            ((this.correlationID==null && other.getCorrelationID()==null) || 
             (this.correlationID!=null &&
              this.correlationID.equals(other.getCorrelationID()))) &&
            ((this.correlationType==null && other.getCorrelationType()==null) || 
             (this.correlationType!=null &&
              this.correlationType.equals(other.getCorrelationType()))) &&
            ((this.accountID==null && other.getAccountID()==null) || 
             (this.accountID!=null &&
              this.accountID.equals(other.getAccountID()))) &&
            ((this.applicationDescription==null && other.getApplicationDescription()==null) || 
             (this.applicationDescription!=null &&
              this.applicationDescription.equals(other.getApplicationDescription()))) &&
            ((this.OSAItem==null && other.getOSAItem()==null) || 
             (this.OSAItem!=null &&
              this.OSAItem.equals(other.getOSAItem()))) &&
            ((this.OSASubType==null && other.getOSASubType()==null) || 
             (this.OSASubType!=null &&
              this.OSASubType.equals(other.getOSASubType()))) &&
            ((this.QOS==null && other.getQOS()==null) || 
             (this.QOS!=null &&
              this.QOS.equals(other.getQOS()))) &&
            ((this.serviceCatalog1==null && other.getServiceCatalog1()==null) || 
             (this.serviceCatalog1!=null &&
              this.serviceCatalog1.equals(other.getServiceCatalog1()))) &&
            ((this.serviceCatalog2==null && other.getServiceCatalog2()==null) || 
             (this.serviceCatalog2!=null &&
              this.serviceCatalog2.equals(other.getServiceCatalog2()))) &&
            ((this.serviceCatalog3==null && other.getServiceCatalog3()==null) || 
             (this.serviceCatalog3!=null &&
              this.serviceCatalog3.equals(other.getServiceCatalog3()))) &&
            ((this.serviceCatalog4==null && other.getServiceCatalog4()==null) || 
             (this.serviceCatalog4!=null &&
              this.serviceCatalog4.equals(other.getServiceCatalog4()))) &&
            ((this.paramConfirmID==null && other.getParamConfirmID()==null) || 
             (this.paramConfirmID!=null &&
              this.paramConfirmID.equals(other.getParamConfirmID()))) &&
            ((this.paramContract==null && other.getParamContract()==null) || 
             (this.paramContract!=null &&
              this.paramContract.equals(other.getParamContract()))) &&
            ((this.locationA==null && other.getLocationA()==null) || 
             (this.locationA!=null &&
              this.locationA.equals(other.getLocationA()))) &&
            ((this.locationAType==null && other.getLocationAType()==null) || 
             (this.locationAType!=null &&
              this.locationAType.equals(other.getLocationAType()))) &&
            ((this.locationB==null && other.getLocationB()==null) || 
             (this.locationB!=null &&
              this.locationB.equals(other.getLocationB()))) &&
            ((this.locationBType==null && other.getLocationBType()==null) || 
             (this.locationBType!=null &&
              this.locationBType.equals(other.getLocationBType()))) &&
            ((this.IMSI==null && other.getIMSI()==null) || 
             (this.IMSI!=null &&
              this.IMSI.equals(other.getIMSI()))) &&
            ((this.infoParameter==null && other.getInfoParameter()==null) || 
             (this.infoParameter!=null &&
              this.infoParameter.equals(other.getInfoParameter()))) &&
            ((this.currency==null && other.getCurrency()==null) || 
             (this.currency!=null &&
              this.currency.equals(other.getCurrency()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.identity==null && other.getIdentity()==null) || 
             (this.identity!=null &&
              this.identity.equals(other.getIdentity()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
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
            ((this.previousISOCode==null && other.getPreviousISOCode()==null) || 
             (this.previousISOCode!=null &&
              this.previousISOCode.equals(other.getPreviousISOCode()))) &&
            ((this.conversionRate==null && other.getConversionRate()==null) || 
             (this.conversionRate!=null &&
              this.conversionRate.equals(other.getConversionRate())));
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
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        if (getSubscriberID() != null) {
            _hashCode += getSubscriberID().hashCode();
        }
        if (getChargecode() != null) {
            _hashCode += getChargecode().hashCode();
        }
        if (getStartCallDateTime() != null) {
            _hashCode += getStartCallDateTime().hashCode();
        }
        if (getEndCallDateTime() != null) {
            _hashCode += getEndCallDateTime().hashCode();
        }
        if (getActivityType() != null) {
            _hashCode += getActivityType().hashCode();
        }
        if (getUsageAmount() != null) {
            _hashCode += getUsageAmount().hashCode();
        }
        if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
        if (getReason() != null) {
            _hashCode += getReason().hashCode();
        }
        if (getApplicationName() != null) {
            _hashCode += getApplicationName().hashCode();
        }
        if (getSubTypeName() != null) {
            _hashCode += getSubTypeName().hashCode();
        }
        if (getSLUID() != null) {
            _hashCode += getSLUID().hashCode();
        }
        if (getUnitTypeName() != null) {
            _hashCode += getUnitTypeName().hashCode();
        }
        if (getMerchantName() != null) {
            _hashCode += getMerchantName().hashCode();
        }
        if (getSessionDescription() != null) {
            _hashCode += getSessionDescription().hashCode();
        }
        if (getCorrelationID() != null) {
            _hashCode += getCorrelationID().hashCode();
        }
        if (getCorrelationType() != null) {
            _hashCode += getCorrelationType().hashCode();
        }
        if (getAccountID() != null) {
            _hashCode += getAccountID().hashCode();
        }
        if (getApplicationDescription() != null) {
            _hashCode += getApplicationDescription().hashCode();
        }
        if (getOSAItem() != null) {
            _hashCode += getOSAItem().hashCode();
        }
        if (getOSASubType() != null) {
            _hashCode += getOSASubType().hashCode();
        }
        if (getQOS() != null) {
            _hashCode += getQOS().hashCode();
        }
        if (getServiceCatalog1() != null) {
            _hashCode += getServiceCatalog1().hashCode();
        }
        if (getServiceCatalog2() != null) {
            _hashCode += getServiceCatalog2().hashCode();
        }
        if (getServiceCatalog3() != null) {
            _hashCode += getServiceCatalog3().hashCode();
        }
        if (getServiceCatalog4() != null) {
            _hashCode += getServiceCatalog4().hashCode();
        }
        if (getParamConfirmID() != null) {
            _hashCode += getParamConfirmID().hashCode();
        }
        if (getParamContract() != null) {
            _hashCode += getParamContract().hashCode();
        }
        if (getLocationA() != null) {
            _hashCode += getLocationA().hashCode();
        }
        if (getLocationAType() != null) {
            _hashCode += getLocationAType().hashCode();
        }
        if (getLocationB() != null) {
            _hashCode += getLocationB().hashCode();
        }
        if (getLocationBType() != null) {
            _hashCode += getLocationBType().hashCode();
        }
        if (getIMSI() != null) {
            _hashCode += getIMSI().hashCode();
        }
        if (getInfoParameter() != null) {
            _hashCode += getInfoParameter().hashCode();
        }
        if (getCurrency() != null) {
            _hashCode += getCurrency().hashCode();
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
        if (getPreviousISOCode() != null) {
            _hashCode += getPreviousISOCode().hashCode();
        }
        if (getConversionRate() != null) {
            _hashCode += getConversionRate().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(OSAHistory.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAHistory"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("SPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SPName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("activityType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ActivityType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("usageAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "UsageAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
        elemField.setFieldName("merchantName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "MerchantName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("sessionDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SessionDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CorrelationID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("correlationType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CorrelationType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccountID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("applicationDescription");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ApplicationDescription"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSAItem");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSAItem"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("OSASubType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "OSASubType"));
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
        elemField.setFieldName("serviceCatalog1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceCatalog1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCatalog2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceCatalog2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCatalog3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceCatalog3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceCatalog4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ServiceCatalog4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramConfirmID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ParamConfirmID"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paramContract");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "ParamContract"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationA");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LocationA"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationAType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LocationAType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationB");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LocationB"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationBType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LocationBType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("IMSI");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IMSI"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("infoParameter");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "InfoParameter"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currency");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Currency"));
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
