/**
 * SubscriberEntity.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberEntity  extends com.comverse_in.prepaid.ccws.SubscriberMainBase  implements java.io.Serializable {
    private String bonusPlan1Name;

    private String bonusPlan2Name;

    private String bonusPlan3Name;

    private String bonusPlan4Name;

    private String bonusPlan5Name;

    private String bonusPlan6Name;

    private String bonusPlan7Name;

    private String AC1ZeroDay;

    private String AC2ZeroDay;

    private String AC3ZeroDay;

    private String AC4ZeroDay;

    private String AC5ZeroDay;

    private String AC6ZeroDay;

    private String AC7ZeroDay;

    private java.util.Calendar nextResetAc1TS;

    private java.util.Calendar nextResetAc2TS;

    private java.util.Calendar nextResetAc3TS;

    private java.util.Calendar nextResetAc4TS;

    private java.util.Calendar nextResetAc5TS;

    private java.util.Calendar nextResetAc6TS;

    private java.util.Calendar nextResetAc7TS;

    private com.comverse_in.prepaid.ccws.BalanceEntity[] balances;

    private String SPName;

    private java.util.Calendar creationDate;

    private java.util.Calendar dateEnterActive;

    private String previousState;

    private java.util.Calendar prevTransDate;

    private java.util.Calendar lastTransDate;

    private Long period1;

    private Long period2;

    private Long period3;

    private Long period4;

    private Long period5;

    private Long period6;

    private Long period7;

    private Double AC1;

    private Double AC2;

    private Double AC3;

    private Double AC4;

    private Double AC5;

    private Double AC6;

    private Double AC7;

    private com.comverse_in.prepaid.ccws.SubscriberAccountType accountType;

    private String groupName;

    private Double lastCallCharge;

    private String freeFFChgAllowance;

    private String FFChangeCount;

    private String currencyCode;

    private Double promisedPaymentAmount;

    private java.util.Calendar promisedPaymentDueDate;

    private Integer promisedPaymentBalanceID;

    public SubscriberEntity() {
    }

    public SubscriberEntity(
           String notificationLanguage,
           String roamingCreditLimitAsString,
           String currentState,
           String COSName,
           String PIN,
           Boolean PINChangeNeeded,
           String languageName,
           String timeZone,
           String IMSI,
           String numberFreeAnCallsString,
           String CFUNumber,
           String CFBNumber,
           String CFNANumber,
           String CFISNumber,
           String inFocusIdentity,
           String ESN,
           String HLR_ID,
           String otherSysID,
           String accountNumber,
           String billCycleDay,
           String notificationLevel,
           String bonusPlan1Name,
           String bonusPlan2Name,
           String bonusPlan3Name,
           String bonusPlan4Name,
           String bonusPlan5Name,
           String bonusPlan6Name,
           String bonusPlan7Name,
           String AC1ZeroDay,
           String AC2ZeroDay,
           String AC3ZeroDay,
           String AC4ZeroDay,
           String AC5ZeroDay,
           String AC6ZeroDay,
           String AC7ZeroDay,
           java.util.Calendar nextResetAc1TS,
           java.util.Calendar nextResetAc2TS,
           java.util.Calendar nextResetAc3TS,
           java.util.Calendar nextResetAc4TS,
           java.util.Calendar nextResetAc5TS,
           java.util.Calendar nextResetAc6TS,
           java.util.Calendar nextResetAc7TS,
           com.comverse_in.prepaid.ccws.BalanceEntity[] balances,
           String SPName,
           java.util.Calendar creationDate,
           java.util.Calendar dateEnterActive,
           String previousState,
           java.util.Calendar prevTransDate,
           java.util.Calendar lastTransDate,
           Long period1,
           Long period2,
           Long period3,
           Long period4,
           Long period5,
           Long period6,
           Long period7,
           Double AC1,
           Double AC2,
           Double AC3,
           Double AC4,
           Double AC5,
           Double AC6,
           Double AC7,
           com.comverse_in.prepaid.ccws.SubscriberAccountType accountType,
           String groupName,
           Double lastCallCharge,
           String freeFFChgAllowance,
           String FFChangeCount,
           String currencyCode,
           Double promisedPaymentAmount,
           java.util.Calendar promisedPaymentDueDate,
           Integer promisedPaymentBalanceID) {
        super(
            notificationLanguage,
            roamingCreditLimitAsString,
            currentState,
            COSName,
            PIN,
            PINChangeNeeded,
            languageName,
            timeZone,
            IMSI,
            numberFreeAnCallsString,
            CFUNumber,
            CFBNumber,
            CFNANumber,
            CFISNumber,
            inFocusIdentity,
            ESN,
            HLR_ID,
            otherSysID,
            accountNumber,
            billCycleDay,
            notificationLevel);
        this.bonusPlan1Name = bonusPlan1Name;
        this.bonusPlan2Name = bonusPlan2Name;
        this.bonusPlan3Name = bonusPlan3Name;
        this.bonusPlan4Name = bonusPlan4Name;
        this.bonusPlan5Name = bonusPlan5Name;
        this.bonusPlan6Name = bonusPlan6Name;
        this.bonusPlan7Name = bonusPlan7Name;
        this.AC1ZeroDay = AC1ZeroDay;
        this.AC2ZeroDay = AC2ZeroDay;
        this.AC3ZeroDay = AC3ZeroDay;
        this.AC4ZeroDay = AC4ZeroDay;
        this.AC5ZeroDay = AC5ZeroDay;
        this.AC6ZeroDay = AC6ZeroDay;
        this.AC7ZeroDay = AC7ZeroDay;
        this.nextResetAc1TS = nextResetAc1TS;
        this.nextResetAc2TS = nextResetAc2TS;
        this.nextResetAc3TS = nextResetAc3TS;
        this.nextResetAc4TS = nextResetAc4TS;
        this.nextResetAc5TS = nextResetAc5TS;
        this.nextResetAc6TS = nextResetAc6TS;
        this.nextResetAc7TS = nextResetAc7TS;
        this.balances = balances;
        this.SPName = SPName;
        this.creationDate = creationDate;
        this.dateEnterActive = dateEnterActive;
        this.previousState = previousState;
        this.prevTransDate = prevTransDate;
        this.lastTransDate = lastTransDate;
        this.period1 = period1;
        this.period2 = period2;
        this.period3 = period3;
        this.period4 = period4;
        this.period5 = period5;
        this.period6 = period6;
        this.period7 = period7;
        this.AC1 = AC1;
        this.AC2 = AC2;
        this.AC3 = AC3;
        this.AC4 = AC4;
        this.AC5 = AC5;
        this.AC6 = AC6;
        this.AC7 = AC7;
        this.accountType = accountType;
        this.groupName = groupName;
        this.lastCallCharge = lastCallCharge;
        this.freeFFChgAllowance = freeFFChgAllowance;
        this.FFChangeCount = FFChangeCount;
        this.currencyCode = currencyCode;
        this.promisedPaymentAmount = promisedPaymentAmount;
        this.promisedPaymentDueDate = promisedPaymentDueDate;
        this.promisedPaymentBalanceID = promisedPaymentBalanceID;
    }


    /**
     * Gets the bonusPlan1Name value for this SubscriberEntity.
     * 
     * @return bonusPlan1Name
     */
    public String getBonusPlan1Name() {
        return bonusPlan1Name;
    }


    /**
     * Sets the bonusPlan1Name value for this SubscriberEntity.
     * 
     * @param bonusPlan1Name
     */
    public void setBonusPlan1Name(String bonusPlan1Name) {
        this.bonusPlan1Name = bonusPlan1Name;
    }


    /**
     * Gets the bonusPlan2Name value for this SubscriberEntity.
     * 
     * @return bonusPlan2Name
     */
    public String getBonusPlan2Name() {
        return bonusPlan2Name;
    }


    /**
     * Sets the bonusPlan2Name value for this SubscriberEntity.
     * 
     * @param bonusPlan2Name
     */
    public void setBonusPlan2Name(String bonusPlan2Name) {
        this.bonusPlan2Name = bonusPlan2Name;
    }


    /**
     * Gets the bonusPlan3Name value for this SubscriberEntity.
     * 
     * @return bonusPlan3Name
     */
    public String getBonusPlan3Name() {
        return bonusPlan3Name;
    }


    /**
     * Sets the bonusPlan3Name value for this SubscriberEntity.
     * 
     * @param bonusPlan3Name
     */
    public void setBonusPlan3Name(String bonusPlan3Name) {
        this.bonusPlan3Name = bonusPlan3Name;
    }


    /**
     * Gets the bonusPlan4Name value for this SubscriberEntity.
     * 
     * @return bonusPlan4Name
     */
    public String getBonusPlan4Name() {
        return bonusPlan4Name;
    }


    /**
     * Sets the bonusPlan4Name value for this SubscriberEntity.
     * 
     * @param bonusPlan4Name
     */
    public void setBonusPlan4Name(String bonusPlan4Name) {
        this.bonusPlan4Name = bonusPlan4Name;
    }


    /**
     * Gets the bonusPlan5Name value for this SubscriberEntity.
     * 
     * @return bonusPlan5Name
     */
    public String getBonusPlan5Name() {
        return bonusPlan5Name;
    }


    /**
     * Sets the bonusPlan5Name value for this SubscriberEntity.
     * 
     * @param bonusPlan5Name
     */
    public void setBonusPlan5Name(String bonusPlan5Name) {
        this.bonusPlan5Name = bonusPlan5Name;
    }


    /**
     * Gets the bonusPlan6Name value for this SubscriberEntity.
     * 
     * @return bonusPlan6Name
     */
    public String getBonusPlan6Name() {
        return bonusPlan6Name;
    }


    /**
     * Sets the bonusPlan6Name value for this SubscriberEntity.
     * 
     * @param bonusPlan6Name
     */
    public void setBonusPlan6Name(String bonusPlan6Name) {
        this.bonusPlan6Name = bonusPlan6Name;
    }


    /**
     * Gets the bonusPlan7Name value for this SubscriberEntity.
     * 
     * @return bonusPlan7Name
     */
    public String getBonusPlan7Name() {
        return bonusPlan7Name;
    }


    /**
     * Sets the bonusPlan7Name value for this SubscriberEntity.
     * 
     * @param bonusPlan7Name
     */
    public void setBonusPlan7Name(String bonusPlan7Name) {
        this.bonusPlan7Name = bonusPlan7Name;
    }


    /**
     * Gets the AC1ZeroDay value for this SubscriberEntity.
     * 
     * @return AC1ZeroDay
     */
    public String getAC1ZeroDay() {
        return AC1ZeroDay;
    }


    /**
     * Sets the AC1ZeroDay value for this SubscriberEntity.
     * 
     * @param AC1ZeroDay
     */
    public void setAC1ZeroDay(String AC1ZeroDay) {
        this.AC1ZeroDay = AC1ZeroDay;
    }


    /**
     * Gets the AC2ZeroDay value for this SubscriberEntity.
     * 
     * @return AC2ZeroDay
     */
    public String getAC2ZeroDay() {
        return AC2ZeroDay;
    }


    /**
     * Sets the AC2ZeroDay value for this SubscriberEntity.
     * 
     * @param AC2ZeroDay
     */
    public void setAC2ZeroDay(String AC2ZeroDay) {
        this.AC2ZeroDay = AC2ZeroDay;
    }


    /**
     * Gets the AC3ZeroDay value for this SubscriberEntity.
     * 
     * @return AC3ZeroDay
     */
    public String getAC3ZeroDay() {
        return AC3ZeroDay;
    }


    /**
     * Sets the AC3ZeroDay value for this SubscriberEntity.
     * 
     * @param AC3ZeroDay
     */
    public void setAC3ZeroDay(String AC3ZeroDay) {
        this.AC3ZeroDay = AC3ZeroDay;
    }


    /**
     * Gets the AC4ZeroDay value for this SubscriberEntity.
     * 
     * @return AC4ZeroDay
     */
    public String getAC4ZeroDay() {
        return AC4ZeroDay;
    }


    /**
     * Sets the AC4ZeroDay value for this SubscriberEntity.
     * 
     * @param AC4ZeroDay
     */
    public void setAC4ZeroDay(String AC4ZeroDay) {
        this.AC4ZeroDay = AC4ZeroDay;
    }


    /**
     * Gets the AC5ZeroDay value for this SubscriberEntity.
     * 
     * @return AC5ZeroDay
     */
    public String getAC5ZeroDay() {
        return AC5ZeroDay;
    }


    /**
     * Sets the AC5ZeroDay value for this SubscriberEntity.
     * 
     * @param AC5ZeroDay
     */
    public void setAC5ZeroDay(String AC5ZeroDay) {
        this.AC5ZeroDay = AC5ZeroDay;
    }


    /**
     * Gets the AC6ZeroDay value for this SubscriberEntity.
     * 
     * @return AC6ZeroDay
     */
    public String getAC6ZeroDay() {
        return AC6ZeroDay;
    }


    /**
     * Sets the AC6ZeroDay value for this SubscriberEntity.
     * 
     * @param AC6ZeroDay
     */
    public void setAC6ZeroDay(String AC6ZeroDay) {
        this.AC6ZeroDay = AC6ZeroDay;
    }


    /**
     * Gets the AC7ZeroDay value for this SubscriberEntity.
     * 
     * @return AC7ZeroDay
     */
    public String getAC7ZeroDay() {
        return AC7ZeroDay;
    }


    /**
     * Sets the AC7ZeroDay value for this SubscriberEntity.
     * 
     * @param AC7ZeroDay
     */
    public void setAC7ZeroDay(String AC7ZeroDay) {
        this.AC7ZeroDay = AC7ZeroDay;
    }


    /**
     * Gets the nextResetAc1TS value for this SubscriberEntity.
     * 
     * @return nextResetAc1TS
     */
    public java.util.Calendar getNextResetAc1TS() {
        return nextResetAc1TS;
    }


    /**
     * Sets the nextResetAc1TS value for this SubscriberEntity.
     * 
     * @param nextResetAc1TS
     */
    public void setNextResetAc1TS(java.util.Calendar nextResetAc1TS) {
        this.nextResetAc1TS = nextResetAc1TS;
    }


    /**
     * Gets the nextResetAc2TS value for this SubscriberEntity.
     * 
     * @return nextResetAc2TS
     */
    public java.util.Calendar getNextResetAc2TS() {
        return nextResetAc2TS;
    }


    /**
     * Sets the nextResetAc2TS value for this SubscriberEntity.
     * 
     * @param nextResetAc2TS
     */
    public void setNextResetAc2TS(java.util.Calendar nextResetAc2TS) {
        this.nextResetAc2TS = nextResetAc2TS;
    }


    /**
     * Gets the nextResetAc3TS value for this SubscriberEntity.
     * 
     * @return nextResetAc3TS
     */
    public java.util.Calendar getNextResetAc3TS() {
        return nextResetAc3TS;
    }


    /**
     * Sets the nextResetAc3TS value for this SubscriberEntity.
     * 
     * @param nextResetAc3TS
     */
    public void setNextResetAc3TS(java.util.Calendar nextResetAc3TS) {
        this.nextResetAc3TS = nextResetAc3TS;
    }


    /**
     * Gets the nextResetAc4TS value for this SubscriberEntity.
     * 
     * @return nextResetAc4TS
     */
    public java.util.Calendar getNextResetAc4TS() {
        return nextResetAc4TS;
    }


    /**
     * Sets the nextResetAc4TS value for this SubscriberEntity.
     * 
     * @param nextResetAc4TS
     */
    public void setNextResetAc4TS(java.util.Calendar nextResetAc4TS) {
        this.nextResetAc4TS = nextResetAc4TS;
    }


    /**
     * Gets the nextResetAc5TS value for this SubscriberEntity.
     * 
     * @return nextResetAc5TS
     */
    public java.util.Calendar getNextResetAc5TS() {
        return nextResetAc5TS;
    }


    /**
     * Sets the nextResetAc5TS value for this SubscriberEntity.
     * 
     * @param nextResetAc5TS
     */
    public void setNextResetAc5TS(java.util.Calendar nextResetAc5TS) {
        this.nextResetAc5TS = nextResetAc5TS;
    }


    /**
     * Gets the nextResetAc6TS value for this SubscriberEntity.
     * 
     * @return nextResetAc6TS
     */
    public java.util.Calendar getNextResetAc6TS() {
        return nextResetAc6TS;
    }


    /**
     * Sets the nextResetAc6TS value for this SubscriberEntity.
     * 
     * @param nextResetAc6TS
     */
    public void setNextResetAc6TS(java.util.Calendar nextResetAc6TS) {
        this.nextResetAc6TS = nextResetAc6TS;
    }


    /**
     * Gets the nextResetAc7TS value for this SubscriberEntity.
     * 
     * @return nextResetAc7TS
     */
    public java.util.Calendar getNextResetAc7TS() {
        return nextResetAc7TS;
    }


    /**
     * Sets the nextResetAc7TS value for this SubscriberEntity.
     * 
     * @param nextResetAc7TS
     */
    public void setNextResetAc7TS(java.util.Calendar nextResetAc7TS) {
        this.nextResetAc7TS = nextResetAc7TS;
    }


    /**
     * Gets the balances value for this SubscriberEntity.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntity[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this SubscriberEntity.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntity[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the SPName value for this SubscriberEntity.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this SubscriberEntity.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the creationDate value for this SubscriberEntity.
     * 
     * @return creationDate
     */
    public java.util.Calendar getCreationDate() {
        return creationDate;
    }


    /**
     * Sets the creationDate value for this SubscriberEntity.
     * 
     * @param creationDate
     */
    public void setCreationDate(java.util.Calendar creationDate) {
        this.creationDate = creationDate;
    }


    /**
     * Gets the dateEnterActive value for this SubscriberEntity.
     * 
     * @return dateEnterActive
     */
    public java.util.Calendar getDateEnterActive() {
        return dateEnterActive;
    }


    /**
     * Sets the dateEnterActive value for this SubscriberEntity.
     * 
     * @param dateEnterActive
     */
    public void setDateEnterActive(java.util.Calendar dateEnterActive) {
        this.dateEnterActive = dateEnterActive;
    }


    /**
     * Gets the previousState value for this SubscriberEntity.
     * 
     * @return previousState
     */
    public String getPreviousState() {
        return previousState;
    }


    /**
     * Sets the previousState value for this SubscriberEntity.
     * 
     * @param previousState
     */
    public void setPreviousState(String previousState) {
        this.previousState = previousState;
    }


    /**
     * Gets the prevTransDate value for this SubscriberEntity.
     * 
     * @return prevTransDate
     */
    public java.util.Calendar getPrevTransDate() {
        return prevTransDate;
    }


    /**
     * Sets the prevTransDate value for this SubscriberEntity.
     * 
     * @param prevTransDate
     */
    public void setPrevTransDate(java.util.Calendar prevTransDate) {
        this.prevTransDate = prevTransDate;
    }


    /**
     * Gets the lastTransDate value for this SubscriberEntity.
     * 
     * @return lastTransDate
     */
    public java.util.Calendar getLastTransDate() {
        return lastTransDate;
    }


    /**
     * Sets the lastTransDate value for this SubscriberEntity.
     * 
     * @param lastTransDate
     */
    public void setLastTransDate(java.util.Calendar lastTransDate) {
        this.lastTransDate = lastTransDate;
    }


    /**
     * Gets the period1 value for this SubscriberEntity.
     * 
     * @return period1
     */
    public Long getPeriod1() {
        return period1;
    }


    /**
     * Sets the period1 value for this SubscriberEntity.
     * 
     * @param period1
     */
    public void setPeriod1(Long period1) {
        this.period1 = period1;
    }


    /**
     * Gets the period2 value for this SubscriberEntity.
     * 
     * @return period2
     */
    public Long getPeriod2() {
        return period2;
    }


    /**
     * Sets the period2 value for this SubscriberEntity.
     * 
     * @param period2
     */
    public void setPeriod2(Long period2) {
        this.period2 = period2;
    }


    /**
     * Gets the period3 value for this SubscriberEntity.
     * 
     * @return period3
     */
    public Long getPeriod3() {
        return period3;
    }


    /**
     * Sets the period3 value for this SubscriberEntity.
     * 
     * @param period3
     */
    public void setPeriod3(Long period3) {
        this.period3 = period3;
    }


    /**
     * Gets the period4 value for this SubscriberEntity.
     * 
     * @return period4
     */
    public Long getPeriod4() {
        return period4;
    }


    /**
     * Sets the period4 value for this SubscriberEntity.
     * 
     * @param period4
     */
    public void setPeriod4(Long period4) {
        this.period4 = period4;
    }


    /**
     * Gets the period5 value for this SubscriberEntity.
     * 
     * @return period5
     */
    public Long getPeriod5() {
        return period5;
    }


    /**
     * Sets the period5 value for this SubscriberEntity.
     * 
     * @param period5
     */
    public void setPeriod5(Long period5) {
        this.period5 = period5;
    }


    /**
     * Gets the period6 value for this SubscriberEntity.
     * 
     * @return period6
     */
    public Long getPeriod6() {
        return period6;
    }


    /**
     * Sets the period6 value for this SubscriberEntity.
     * 
     * @param period6
     */
    public void setPeriod6(Long period6) {
        this.period6 = period6;
    }


    /**
     * Gets the period7 value for this SubscriberEntity.
     * 
     * @return period7
     */
    public Long getPeriod7() {
        return period7;
    }


    /**
     * Sets the period7 value for this SubscriberEntity.
     * 
     * @param period7
     */
    public void setPeriod7(Long period7) {
        this.period7 = period7;
    }


    /**
     * Gets the AC1 value for this SubscriberEntity.
     * 
     * @return AC1
     */
    public Double getAC1() {
        return AC1;
    }


    /**
     * Sets the AC1 value for this SubscriberEntity.
     * 
     * @param AC1
     */
    public void setAC1(Double AC1) {
        this.AC1 = AC1;
    }


    /**
     * Gets the AC2 value for this SubscriberEntity.
     * 
     * @return AC2
     */
    public Double getAC2() {
        return AC2;
    }


    /**
     * Sets the AC2 value for this SubscriberEntity.
     * 
     * @param AC2
     */
    public void setAC2(Double AC2) {
        this.AC2 = AC2;
    }


    /**
     * Gets the AC3 value for this SubscriberEntity.
     * 
     * @return AC3
     */
    public Double getAC3() {
        return AC3;
    }


    /**
     * Sets the AC3 value for this SubscriberEntity.
     * 
     * @param AC3
     */
    public void setAC3(Double AC3) {
        this.AC3 = AC3;
    }


    /**
     * Gets the AC4 value for this SubscriberEntity.
     * 
     * @return AC4
     */
    public Double getAC4() {
        return AC4;
    }


    /**
     * Sets the AC4 value for this SubscriberEntity.
     * 
     * @param AC4
     */
    public void setAC4(Double AC4) {
        this.AC4 = AC4;
    }


    /**
     * Gets the AC5 value for this SubscriberEntity.
     * 
     * @return AC5
     */
    public Double getAC5() {
        return AC5;
    }


    /**
     * Sets the AC5 value for this SubscriberEntity.
     * 
     * @param AC5
     */
    public void setAC5(Double AC5) {
        this.AC5 = AC5;
    }


    /**
     * Gets the AC6 value for this SubscriberEntity.
     * 
     * @return AC6
     */
    public Double getAC6() {
        return AC6;
    }


    /**
     * Sets the AC6 value for this SubscriberEntity.
     * 
     * @param AC6
     */
    public void setAC6(Double AC6) {
        this.AC6 = AC6;
    }


    /**
     * Gets the AC7 value for this SubscriberEntity.
     * 
     * @return AC7
     */
    public Double getAC7() {
        return AC7;
    }


    /**
     * Sets the AC7 value for this SubscriberEntity.
     * 
     * @param AC7
     */
    public void setAC7(Double AC7) {
        this.AC7 = AC7;
    }


    /**
     * Gets the accountType value for this SubscriberEntity.
     * 
     * @return accountType
     */
    public com.comverse_in.prepaid.ccws.SubscriberAccountType getAccountType() {
        return accountType;
    }


    /**
     * Sets the accountType value for this SubscriberEntity.
     * 
     * @param accountType
     */
    public void setAccountType(com.comverse_in.prepaid.ccws.SubscriberAccountType accountType) {
        this.accountType = accountType;
    }


    /**
     * Gets the groupName value for this SubscriberEntity.
     * 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this SubscriberEntity.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the lastCallCharge value for this SubscriberEntity.
     * 
     * @return lastCallCharge
     */
    public Double getLastCallCharge() {
        return lastCallCharge;
    }


    /**
     * Sets the lastCallCharge value for this SubscriberEntity.
     * 
     * @param lastCallCharge
     */
    public void setLastCallCharge(Double lastCallCharge) {
        this.lastCallCharge = lastCallCharge;
    }


    /**
     * Gets the freeFFChgAllowance value for this SubscriberEntity.
     * 
     * @return freeFFChgAllowance
     */
    public String getFreeFFChgAllowance() {
        return freeFFChgAllowance;
    }


    /**
     * Sets the freeFFChgAllowance value for this SubscriberEntity.
     * 
     * @param freeFFChgAllowance
     */
    public void setFreeFFChgAllowance(String freeFFChgAllowance) {
        this.freeFFChgAllowance = freeFFChgAllowance;
    }


    /**
     * Gets the FFChangeCount value for this SubscriberEntity.
     * 
     * @return FFChangeCount
     */
    public String getFFChangeCount() {
        return FFChangeCount;
    }


    /**
     * Sets the FFChangeCount value for this SubscriberEntity.
     * 
     * @param FFChangeCount
     */
    public void setFFChangeCount(String FFChangeCount) {
        this.FFChangeCount = FFChangeCount;
    }


    /**
     * Gets the currencyCode value for this SubscriberEntity.
     * 
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this SubscriberEntity.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the promisedPaymentAmount value for this SubscriberEntity.
     * 
     * @return promisedPaymentAmount
     */
    public Double getPromisedPaymentAmount() {
        return promisedPaymentAmount;
    }


    /**
     * Sets the promisedPaymentAmount value for this SubscriberEntity.
     * 
     * @param promisedPaymentAmount
     */
    public void setPromisedPaymentAmount(Double promisedPaymentAmount) {
        this.promisedPaymentAmount = promisedPaymentAmount;
    }


    /**
     * Gets the promisedPaymentDueDate value for this SubscriberEntity.
     * 
     * @return promisedPaymentDueDate
     */
    public java.util.Calendar getPromisedPaymentDueDate() {
        return promisedPaymentDueDate;
    }


    /**
     * Sets the promisedPaymentDueDate value for this SubscriberEntity.
     * 
     * @param promisedPaymentDueDate
     */
    public void setPromisedPaymentDueDate(java.util.Calendar promisedPaymentDueDate) {
        this.promisedPaymentDueDate = promisedPaymentDueDate;
    }


    /**
     * Gets the promisedPaymentBalanceID value for this SubscriberEntity.
     * 
     * @return promisedPaymentBalanceID
     */
    public Integer getPromisedPaymentBalanceID() {
        return promisedPaymentBalanceID;
    }


    /**
     * Sets the promisedPaymentBalanceID value for this SubscriberEntity.
     * 
     * @param promisedPaymentBalanceID
     */
    public void setPromisedPaymentBalanceID(Integer promisedPaymentBalanceID) {
        this.promisedPaymentBalanceID = promisedPaymentBalanceID;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberEntity)) return false;
        SubscriberEntity other = (SubscriberEntity) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.bonusPlan1Name==null && other.getBonusPlan1Name()==null) || 
             (this.bonusPlan1Name!=null &&
              this.bonusPlan1Name.equals(other.getBonusPlan1Name()))) &&
            ((this.bonusPlan2Name==null && other.getBonusPlan2Name()==null) || 
             (this.bonusPlan2Name!=null &&
              this.bonusPlan2Name.equals(other.getBonusPlan2Name()))) &&
            ((this.bonusPlan3Name==null && other.getBonusPlan3Name()==null) || 
             (this.bonusPlan3Name!=null &&
              this.bonusPlan3Name.equals(other.getBonusPlan3Name()))) &&
            ((this.bonusPlan4Name==null && other.getBonusPlan4Name()==null) || 
             (this.bonusPlan4Name!=null &&
              this.bonusPlan4Name.equals(other.getBonusPlan4Name()))) &&
            ((this.bonusPlan5Name==null && other.getBonusPlan5Name()==null) || 
             (this.bonusPlan5Name!=null &&
              this.bonusPlan5Name.equals(other.getBonusPlan5Name()))) &&
            ((this.bonusPlan6Name==null && other.getBonusPlan6Name()==null) || 
             (this.bonusPlan6Name!=null &&
              this.bonusPlan6Name.equals(other.getBonusPlan6Name()))) &&
            ((this.bonusPlan7Name==null && other.getBonusPlan7Name()==null) || 
             (this.bonusPlan7Name!=null &&
              this.bonusPlan7Name.equals(other.getBonusPlan7Name()))) &&
            ((this.AC1ZeroDay==null && other.getAC1ZeroDay()==null) || 
             (this.AC1ZeroDay!=null &&
              this.AC1ZeroDay.equals(other.getAC1ZeroDay()))) &&
            ((this.AC2ZeroDay==null && other.getAC2ZeroDay()==null) || 
             (this.AC2ZeroDay!=null &&
              this.AC2ZeroDay.equals(other.getAC2ZeroDay()))) &&
            ((this.AC3ZeroDay==null && other.getAC3ZeroDay()==null) || 
             (this.AC3ZeroDay!=null &&
              this.AC3ZeroDay.equals(other.getAC3ZeroDay()))) &&
            ((this.AC4ZeroDay==null && other.getAC4ZeroDay()==null) || 
             (this.AC4ZeroDay!=null &&
              this.AC4ZeroDay.equals(other.getAC4ZeroDay()))) &&
            ((this.AC5ZeroDay==null && other.getAC5ZeroDay()==null) || 
             (this.AC5ZeroDay!=null &&
              this.AC5ZeroDay.equals(other.getAC5ZeroDay()))) &&
            ((this.AC6ZeroDay==null && other.getAC6ZeroDay()==null) || 
             (this.AC6ZeroDay!=null &&
              this.AC6ZeroDay.equals(other.getAC6ZeroDay()))) &&
            ((this.AC7ZeroDay==null && other.getAC7ZeroDay()==null) || 
             (this.AC7ZeroDay!=null &&
              this.AC7ZeroDay.equals(other.getAC7ZeroDay()))) &&
            ((this.nextResetAc1TS==null && other.getNextResetAc1TS()==null) || 
             (this.nextResetAc1TS!=null &&
              this.nextResetAc1TS.equals(other.getNextResetAc1TS()))) &&
            ((this.nextResetAc2TS==null && other.getNextResetAc2TS()==null) || 
             (this.nextResetAc2TS!=null &&
              this.nextResetAc2TS.equals(other.getNextResetAc2TS()))) &&
            ((this.nextResetAc3TS==null && other.getNextResetAc3TS()==null) || 
             (this.nextResetAc3TS!=null &&
              this.nextResetAc3TS.equals(other.getNextResetAc3TS()))) &&
            ((this.nextResetAc4TS==null && other.getNextResetAc4TS()==null) || 
             (this.nextResetAc4TS!=null &&
              this.nextResetAc4TS.equals(other.getNextResetAc4TS()))) &&
            ((this.nextResetAc5TS==null && other.getNextResetAc5TS()==null) || 
             (this.nextResetAc5TS!=null &&
              this.nextResetAc5TS.equals(other.getNextResetAc5TS()))) &&
            ((this.nextResetAc6TS==null && other.getNextResetAc6TS()==null) || 
             (this.nextResetAc6TS!=null &&
              this.nextResetAc6TS.equals(other.getNextResetAc6TS()))) &&
            ((this.nextResetAc7TS==null && other.getNextResetAc7TS()==null) || 
             (this.nextResetAc7TS!=null &&
              this.nextResetAc7TS.equals(other.getNextResetAc7TS()))) &&
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName()))) &&
            ((this.creationDate==null && other.getCreationDate()==null) || 
             (this.creationDate!=null &&
              this.creationDate.equals(other.getCreationDate()))) &&
            ((this.dateEnterActive==null && other.getDateEnterActive()==null) || 
             (this.dateEnterActive!=null &&
              this.dateEnterActive.equals(other.getDateEnterActive()))) &&
            ((this.previousState==null && other.getPreviousState()==null) || 
             (this.previousState!=null &&
              this.previousState.equals(other.getPreviousState()))) &&
            ((this.prevTransDate==null && other.getPrevTransDate()==null) || 
             (this.prevTransDate!=null &&
              this.prevTransDate.equals(other.getPrevTransDate()))) &&
            ((this.lastTransDate==null && other.getLastTransDate()==null) || 
             (this.lastTransDate!=null &&
              this.lastTransDate.equals(other.getLastTransDate()))) &&
            ((this.period1==null && other.getPeriod1()==null) || 
             (this.period1!=null &&
              this.period1.equals(other.getPeriod1()))) &&
            ((this.period2==null && other.getPeriod2()==null) || 
             (this.period2!=null &&
              this.period2.equals(other.getPeriod2()))) &&
            ((this.period3==null && other.getPeriod3()==null) || 
             (this.period3!=null &&
              this.period3.equals(other.getPeriod3()))) &&
            ((this.period4==null && other.getPeriod4()==null) || 
             (this.period4!=null &&
              this.period4.equals(other.getPeriod4()))) &&
            ((this.period5==null && other.getPeriod5()==null) || 
             (this.period5!=null &&
              this.period5.equals(other.getPeriod5()))) &&
            ((this.period6==null && other.getPeriod6()==null) || 
             (this.period6!=null &&
              this.period6.equals(other.getPeriod6()))) &&
            ((this.period7==null && other.getPeriod7()==null) || 
             (this.period7!=null &&
              this.period7.equals(other.getPeriod7()))) &&
            ((this.AC1==null && other.getAC1()==null) || 
             (this.AC1!=null &&
              this.AC1.equals(other.getAC1()))) &&
            ((this.AC2==null && other.getAC2()==null) || 
             (this.AC2!=null &&
              this.AC2.equals(other.getAC2()))) &&
            ((this.AC3==null && other.getAC3()==null) || 
             (this.AC3!=null &&
              this.AC3.equals(other.getAC3()))) &&
            ((this.AC4==null && other.getAC4()==null) || 
             (this.AC4!=null &&
              this.AC4.equals(other.getAC4()))) &&
            ((this.AC5==null && other.getAC5()==null) || 
             (this.AC5!=null &&
              this.AC5.equals(other.getAC5()))) &&
            ((this.AC6==null && other.getAC6()==null) || 
             (this.AC6!=null &&
              this.AC6.equals(other.getAC6()))) &&
            ((this.AC7==null && other.getAC7()==null) || 
             (this.AC7!=null &&
              this.AC7.equals(other.getAC7()))) &&
            ((this.accountType==null && other.getAccountType()==null) || 
             (this.accountType!=null &&
              this.accountType.equals(other.getAccountType()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.lastCallCharge==null && other.getLastCallCharge()==null) || 
             (this.lastCallCharge!=null &&
              this.lastCallCharge.equals(other.getLastCallCharge()))) &&
            ((this.freeFFChgAllowance==null && other.getFreeFFChgAllowance()==null) || 
             (this.freeFFChgAllowance!=null &&
              this.freeFFChgAllowance.equals(other.getFreeFFChgAllowance()))) &&
            ((this.FFChangeCount==null && other.getFFChangeCount()==null) || 
             (this.FFChangeCount!=null &&
              this.FFChangeCount.equals(other.getFFChangeCount()))) &&
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.promisedPaymentAmount==null && other.getPromisedPaymentAmount()==null) || 
             (this.promisedPaymentAmount!=null &&
              this.promisedPaymentAmount.equals(other.getPromisedPaymentAmount()))) &&
            ((this.promisedPaymentDueDate==null && other.getPromisedPaymentDueDate()==null) || 
             (this.promisedPaymentDueDate!=null &&
              this.promisedPaymentDueDate.equals(other.getPromisedPaymentDueDate()))) &&
            ((this.promisedPaymentBalanceID==null && other.getPromisedPaymentBalanceID()==null) || 
             (this.promisedPaymentBalanceID!=null &&
              this.promisedPaymentBalanceID.equals(other.getPromisedPaymentBalanceID())));
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
        if (getBonusPlan1Name() != null) {
            _hashCode += getBonusPlan1Name().hashCode();
        }
        if (getBonusPlan2Name() != null) {
            _hashCode += getBonusPlan2Name().hashCode();
        }
        if (getBonusPlan3Name() != null) {
            _hashCode += getBonusPlan3Name().hashCode();
        }
        if (getBonusPlan4Name() != null) {
            _hashCode += getBonusPlan4Name().hashCode();
        }
        if (getBonusPlan5Name() != null) {
            _hashCode += getBonusPlan5Name().hashCode();
        }
        if (getBonusPlan6Name() != null) {
            _hashCode += getBonusPlan6Name().hashCode();
        }
        if (getBonusPlan7Name() != null) {
            _hashCode += getBonusPlan7Name().hashCode();
        }
        if (getAC1ZeroDay() != null) {
            _hashCode += getAC1ZeroDay().hashCode();
        }
        if (getAC2ZeroDay() != null) {
            _hashCode += getAC2ZeroDay().hashCode();
        }
        if (getAC3ZeroDay() != null) {
            _hashCode += getAC3ZeroDay().hashCode();
        }
        if (getAC4ZeroDay() != null) {
            _hashCode += getAC4ZeroDay().hashCode();
        }
        if (getAC5ZeroDay() != null) {
            _hashCode += getAC5ZeroDay().hashCode();
        }
        if (getAC6ZeroDay() != null) {
            _hashCode += getAC6ZeroDay().hashCode();
        }
        if (getAC7ZeroDay() != null) {
            _hashCode += getAC7ZeroDay().hashCode();
        }
        if (getNextResetAc1TS() != null) {
            _hashCode += getNextResetAc1TS().hashCode();
        }
        if (getNextResetAc2TS() != null) {
            _hashCode += getNextResetAc2TS().hashCode();
        }
        if (getNextResetAc3TS() != null) {
            _hashCode += getNextResetAc3TS().hashCode();
        }
        if (getNextResetAc4TS() != null) {
            _hashCode += getNextResetAc4TS().hashCode();
        }
        if (getNextResetAc5TS() != null) {
            _hashCode += getNextResetAc5TS().hashCode();
        }
        if (getNextResetAc6TS() != null) {
            _hashCode += getNextResetAc6TS().hashCode();
        }
        if (getNextResetAc7TS() != null) {
            _hashCode += getNextResetAc7TS().hashCode();
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
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        if (getCreationDate() != null) {
            _hashCode += getCreationDate().hashCode();
        }
        if (getDateEnterActive() != null) {
            _hashCode += getDateEnterActive().hashCode();
        }
        if (getPreviousState() != null) {
            _hashCode += getPreviousState().hashCode();
        }
        if (getPrevTransDate() != null) {
            _hashCode += getPrevTransDate().hashCode();
        }
        if (getLastTransDate() != null) {
            _hashCode += getLastTransDate().hashCode();
        }
        if (getPeriod1() != null) {
            _hashCode += getPeriod1().hashCode();
        }
        if (getPeriod2() != null) {
            _hashCode += getPeriod2().hashCode();
        }
        if (getPeriod3() != null) {
            _hashCode += getPeriod3().hashCode();
        }
        if (getPeriod4() != null) {
            _hashCode += getPeriod4().hashCode();
        }
        if (getPeriod5() != null) {
            _hashCode += getPeriod5().hashCode();
        }
        if (getPeriod6() != null) {
            _hashCode += getPeriod6().hashCode();
        }
        if (getPeriod7() != null) {
            _hashCode += getPeriod7().hashCode();
        }
        if (getAC1() != null) {
            _hashCode += getAC1().hashCode();
        }
        if (getAC2() != null) {
            _hashCode += getAC2().hashCode();
        }
        if (getAC3() != null) {
            _hashCode += getAC3().hashCode();
        }
        if (getAC4() != null) {
            _hashCode += getAC4().hashCode();
        }
        if (getAC5() != null) {
            _hashCode += getAC5().hashCode();
        }
        if (getAC6() != null) {
            _hashCode += getAC6().hashCode();
        }
        if (getAC7() != null) {
            _hashCode += getAC7().hashCode();
        }
        if (getAccountType() != null) {
            _hashCode += getAccountType().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getLastCallCharge() != null) {
            _hashCode += getLastCallCharge().hashCode();
        }
        if (getFreeFFChgAllowance() != null) {
            _hashCode += getFreeFFChgAllowance().hashCode();
        }
        if (getFFChangeCount() != null) {
            _hashCode += getFFChangeCount().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getPromisedPaymentAmount() != null) {
            _hashCode += getPromisedPaymentAmount().hashCode();
        }
        if (getPromisedPaymentDueDate() != null) {
            _hashCode += getPromisedPaymentDueDate().hashCode();
        }
        if (getPromisedPaymentBalanceID() != null) {
            _hashCode += getPromisedPaymentBalanceID().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberEntity.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberEntity"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan1Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan1Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan2Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan2Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan3Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan3Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan4Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan4Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan5Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan5Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan6Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan6Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bonusPlan7Name");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BonusPlan7Name"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC1ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC1ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC2ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC2ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC3ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC3ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC4ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC4ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC5ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC5ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC6ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC6ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC7ZeroDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC7ZeroDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc1TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc1TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc2TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc2TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc3TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc3TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc4TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc4TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc5TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc5TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc6TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc6TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("nextResetAc7TS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NextResetAc7TS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
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
        elemField.setFieldName("SPName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SPName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("creationDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CreationDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("dateEnterActive");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DateEnterActive"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("previousState");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PreviousState"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("prevTransDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PrevTransDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastTransDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LastTransDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("period7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Period7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
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
        elemField.setFieldName("groupName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lastCallCharge");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "LastCallCharge"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("freeFFChgAllowance");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FreeFFChgAllowance"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("FFChangeCount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FFChangeCount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promisedPaymentAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "double"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promisedPaymentDueDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentDueDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "dateTime"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("promisedPaymentBalanceID");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PromisedPaymentBalanceID"));
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
