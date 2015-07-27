/**
 * SubscriberPPS.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class SubscriberPPS  extends com.comverse_in.prepaid.ccws.SubscriberMainBase  implements java.io.Serializable {
    private String currencyCode;

    private String SPName;

    private String AC1ZeroDay;

    private String AC2ZeroDay;

    private String AC3ZeroDay;

    private String AC4ZeroDay;

    private String AC5ZeroDay;

    private String AC6ZeroDay;

    private String AC7ZeroDay;

    private String AC1;

    private String AC2;

    private String AC3;

    private String AC4;

    private String AC5;

    private String AC6;

    private String AC7;

    private String bonusPlan1Name;

    private String bonusPlan2Name;

    private String bonusPlan3Name;

    private String bonusPlan4Name;

    private String bonusPlan5Name;

    private String bonusPlan6Name;

    private String bonusPlan7Name;

    private com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances;

    private Boolean AC1Reset;

    private Boolean AC2Reset;

    private Boolean AC3Reset;

    private Boolean AC4Reset;

    private Boolean AC5Reset;

    private Boolean AC6Reset;

    private Boolean AC7Reset;

    private Boolean BP1Reset;

    private Boolean BP2Reset;

    private Boolean BP3Reset;

    private Boolean BP4Reset;

    private Boolean BP5Reset;

    private Boolean BP6Reset;

    private Boolean BP7Reset;

    private String balanceChangeChargeCode;

    private String balanceChangeComment;

    private String freeFFChgAllowance;

    private String FFChangeCount;

    public SubscriberPPS() {
    }

    public SubscriberPPS(
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
           String currencyCode,
           String SPName,
           String AC1ZeroDay,
           String AC2ZeroDay,
           String AC3ZeroDay,
           String AC4ZeroDay,
           String AC5ZeroDay,
           String AC6ZeroDay,
           String AC7ZeroDay,
           String AC1,
           String AC2,
           String AC3,
           String AC4,
           String AC5,
           String AC6,
           String AC7,
           String bonusPlan1Name,
           String bonusPlan2Name,
           String bonusPlan3Name,
           String bonusPlan4Name,
           String bonusPlan5Name,
           String bonusPlan6Name,
           String bonusPlan7Name,
           com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances,
           Boolean AC1Reset,
           Boolean AC2Reset,
           Boolean AC3Reset,
           Boolean AC4Reset,
           Boolean AC5Reset,
           Boolean AC6Reset,
           Boolean AC7Reset,
           Boolean BP1Reset,
           Boolean BP2Reset,
           Boolean BP3Reset,
           Boolean BP4Reset,
           Boolean BP5Reset,
           Boolean BP6Reset,
           Boolean BP7Reset,
           String balanceChangeChargeCode,
           String balanceChangeComment,
           String freeFFChgAllowance,
           String FFChangeCount) {
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
        this.currencyCode = currencyCode;
        this.SPName = SPName;
        this.AC1ZeroDay = AC1ZeroDay;
        this.AC2ZeroDay = AC2ZeroDay;
        this.AC3ZeroDay = AC3ZeroDay;
        this.AC4ZeroDay = AC4ZeroDay;
        this.AC5ZeroDay = AC5ZeroDay;
        this.AC6ZeroDay = AC6ZeroDay;
        this.AC7ZeroDay = AC7ZeroDay;
        this.AC1 = AC1;
        this.AC2 = AC2;
        this.AC3 = AC3;
        this.AC4 = AC4;
        this.AC5 = AC5;
        this.AC6 = AC6;
        this.AC7 = AC7;
        this.bonusPlan1Name = bonusPlan1Name;
        this.bonusPlan2Name = bonusPlan2Name;
        this.bonusPlan3Name = bonusPlan3Name;
        this.bonusPlan4Name = bonusPlan4Name;
        this.bonusPlan5Name = bonusPlan5Name;
        this.bonusPlan6Name = bonusPlan6Name;
        this.bonusPlan7Name = bonusPlan7Name;
        this.balances = balances;
        this.AC1Reset = AC1Reset;
        this.AC2Reset = AC2Reset;
        this.AC3Reset = AC3Reset;
        this.AC4Reset = AC4Reset;
        this.AC5Reset = AC5Reset;
        this.AC6Reset = AC6Reset;
        this.AC7Reset = AC7Reset;
        this.BP1Reset = BP1Reset;
        this.BP2Reset = BP2Reset;
        this.BP3Reset = BP3Reset;
        this.BP4Reset = BP4Reset;
        this.BP5Reset = BP5Reset;
        this.BP6Reset = BP6Reset;
        this.BP7Reset = BP7Reset;
        this.balanceChangeChargeCode = balanceChangeChargeCode;
        this.balanceChangeComment = balanceChangeComment;
        this.freeFFChgAllowance = freeFFChgAllowance;
        this.FFChangeCount = FFChangeCount;
    }


    /**
     * Gets the currencyCode value for this SubscriberPPS.
     * 
     * @return currencyCode
     */
    public String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this SubscriberPPS.
     * 
     * @param currencyCode
     */
    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the SPName value for this SubscriberPPS.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this SubscriberPPS.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the AC1ZeroDay value for this SubscriberPPS.
     * 
     * @return AC1ZeroDay
     */
    public String getAC1ZeroDay() {
        return AC1ZeroDay;
    }


    /**
     * Sets the AC1ZeroDay value for this SubscriberPPS.
     * 
     * @param AC1ZeroDay
     */
    public void setAC1ZeroDay(String AC1ZeroDay) {
        this.AC1ZeroDay = AC1ZeroDay;
    }


    /**
     * Gets the AC2ZeroDay value for this SubscriberPPS.
     * 
     * @return AC2ZeroDay
     */
    public String getAC2ZeroDay() {
        return AC2ZeroDay;
    }


    /**
     * Sets the AC2ZeroDay value for this SubscriberPPS.
     * 
     * @param AC2ZeroDay
     */
    public void setAC2ZeroDay(String AC2ZeroDay) {
        this.AC2ZeroDay = AC2ZeroDay;
    }


    /**
     * Gets the AC3ZeroDay value for this SubscriberPPS.
     * 
     * @return AC3ZeroDay
     */
    public String getAC3ZeroDay() {
        return AC3ZeroDay;
    }


    /**
     * Sets the AC3ZeroDay value for this SubscriberPPS.
     * 
     * @param AC3ZeroDay
     */
    public void setAC3ZeroDay(String AC3ZeroDay) {
        this.AC3ZeroDay = AC3ZeroDay;
    }


    /**
     * Gets the AC4ZeroDay value for this SubscriberPPS.
     * 
     * @return AC4ZeroDay
     */
    public String getAC4ZeroDay() {
        return AC4ZeroDay;
    }


    /**
     * Sets the AC4ZeroDay value for this SubscriberPPS.
     * 
     * @param AC4ZeroDay
     */
    public void setAC4ZeroDay(String AC4ZeroDay) {
        this.AC4ZeroDay = AC4ZeroDay;
    }


    /**
     * Gets the AC5ZeroDay value for this SubscriberPPS.
     * 
     * @return AC5ZeroDay
     */
    public String getAC5ZeroDay() {
        return AC5ZeroDay;
    }


    /**
     * Sets the AC5ZeroDay value for this SubscriberPPS.
     * 
     * @param AC5ZeroDay
     */
    public void setAC5ZeroDay(String AC5ZeroDay) {
        this.AC5ZeroDay = AC5ZeroDay;
    }


    /**
     * Gets the AC6ZeroDay value for this SubscriberPPS.
     * 
     * @return AC6ZeroDay
     */
    public String getAC6ZeroDay() {
        return AC6ZeroDay;
    }


    /**
     * Sets the AC6ZeroDay value for this SubscriberPPS.
     * 
     * @param AC6ZeroDay
     */
    public void setAC6ZeroDay(String AC6ZeroDay) {
        this.AC6ZeroDay = AC6ZeroDay;
    }


    /**
     * Gets the AC7ZeroDay value for this SubscriberPPS.
     * 
     * @return AC7ZeroDay
     */
    public String getAC7ZeroDay() {
        return AC7ZeroDay;
    }


    /**
     * Sets the AC7ZeroDay value for this SubscriberPPS.
     * 
     * @param AC7ZeroDay
     */
    public void setAC7ZeroDay(String AC7ZeroDay) {
        this.AC7ZeroDay = AC7ZeroDay;
    }


    /**
     * Gets the AC1 value for this SubscriberPPS.
     * 
     * @return AC1
     */
    public String getAC1() {
        return AC1;
    }


    /**
     * Sets the AC1 value for this SubscriberPPS.
     * 
     * @param AC1
     */
    public void setAC1(String AC1) {
        this.AC1 = AC1;
    }


    /**
     * Gets the AC2 value for this SubscriberPPS.
     * 
     * @return AC2
     */
    public String getAC2() {
        return AC2;
    }


    /**
     * Sets the AC2 value for this SubscriberPPS.
     * 
     * @param AC2
     */
    public void setAC2(String AC2) {
        this.AC2 = AC2;
    }


    /**
     * Gets the AC3 value for this SubscriberPPS.
     * 
     * @return AC3
     */
    public String getAC3() {
        return AC3;
    }


    /**
     * Sets the AC3 value for this SubscriberPPS.
     * 
     * @param AC3
     */
    public void setAC3(String AC3) {
        this.AC3 = AC3;
    }


    /**
     * Gets the AC4 value for this SubscriberPPS.
     * 
     * @return AC4
     */
    public String getAC4() {
        return AC4;
    }


    /**
     * Sets the AC4 value for this SubscriberPPS.
     * 
     * @param AC4
     */
    public void setAC4(String AC4) {
        this.AC4 = AC4;
    }


    /**
     * Gets the AC5 value for this SubscriberPPS.
     * 
     * @return AC5
     */
    public String getAC5() {
        return AC5;
    }


    /**
     * Sets the AC5 value for this SubscriberPPS.
     * 
     * @param AC5
     */
    public void setAC5(String AC5) {
        this.AC5 = AC5;
    }


    /**
     * Gets the AC6 value for this SubscriberPPS.
     * 
     * @return AC6
     */
    public String getAC6() {
        return AC6;
    }


    /**
     * Sets the AC6 value for this SubscriberPPS.
     * 
     * @param AC6
     */
    public void setAC6(String AC6) {
        this.AC6 = AC6;
    }


    /**
     * Gets the AC7 value for this SubscriberPPS.
     * 
     * @return AC7
     */
    public String getAC7() {
        return AC7;
    }


    /**
     * Sets the AC7 value for this SubscriberPPS.
     * 
     * @param AC7
     */
    public void setAC7(String AC7) {
        this.AC7 = AC7;
    }


    /**
     * Gets the bonusPlan1Name value for this SubscriberPPS.
     * 
     * @return bonusPlan1Name
     */
    public String getBonusPlan1Name() {
        return bonusPlan1Name;
    }


    /**
     * Sets the bonusPlan1Name value for this SubscriberPPS.
     * 
     * @param bonusPlan1Name
     */
    public void setBonusPlan1Name(String bonusPlan1Name) {
        this.bonusPlan1Name = bonusPlan1Name;
    }


    /**
     * Gets the bonusPlan2Name value for this SubscriberPPS.
     * 
     * @return bonusPlan2Name
     */
    public String getBonusPlan2Name() {
        return bonusPlan2Name;
    }


    /**
     * Sets the bonusPlan2Name value for this SubscriberPPS.
     * 
     * @param bonusPlan2Name
     */
    public void setBonusPlan2Name(String bonusPlan2Name) {
        this.bonusPlan2Name = bonusPlan2Name;
    }


    /**
     * Gets the bonusPlan3Name value for this SubscriberPPS.
     * 
     * @return bonusPlan3Name
     */
    public String getBonusPlan3Name() {
        return bonusPlan3Name;
    }


    /**
     * Sets the bonusPlan3Name value for this SubscriberPPS.
     * 
     * @param bonusPlan3Name
     */
    public void setBonusPlan3Name(String bonusPlan3Name) {
        this.bonusPlan3Name = bonusPlan3Name;
    }


    /**
     * Gets the bonusPlan4Name value for this SubscriberPPS.
     * 
     * @return bonusPlan4Name
     */
    public String getBonusPlan4Name() {
        return bonusPlan4Name;
    }


    /**
     * Sets the bonusPlan4Name value for this SubscriberPPS.
     * 
     * @param bonusPlan4Name
     */
    public void setBonusPlan4Name(String bonusPlan4Name) {
        this.bonusPlan4Name = bonusPlan4Name;
    }


    /**
     * Gets the bonusPlan5Name value for this SubscriberPPS.
     * 
     * @return bonusPlan5Name
     */
    public String getBonusPlan5Name() {
        return bonusPlan5Name;
    }


    /**
     * Sets the bonusPlan5Name value for this SubscriberPPS.
     * 
     * @param bonusPlan5Name
     */
    public void setBonusPlan5Name(String bonusPlan5Name) {
        this.bonusPlan5Name = bonusPlan5Name;
    }


    /**
     * Gets the bonusPlan6Name value for this SubscriberPPS.
     * 
     * @return bonusPlan6Name
     */
    public String getBonusPlan6Name() {
        return bonusPlan6Name;
    }


    /**
     * Sets the bonusPlan6Name value for this SubscriberPPS.
     * 
     * @param bonusPlan6Name
     */
    public void setBonusPlan6Name(String bonusPlan6Name) {
        this.bonusPlan6Name = bonusPlan6Name;
    }


    /**
     * Gets the bonusPlan7Name value for this SubscriberPPS.
     * 
     * @return bonusPlan7Name
     */
    public String getBonusPlan7Name() {
        return bonusPlan7Name;
    }


    /**
     * Sets the bonusPlan7Name value for this SubscriberPPS.
     * 
     * @param bonusPlan7Name
     */
    public void setBonusPlan7Name(String bonusPlan7Name) {
        this.bonusPlan7Name = bonusPlan7Name;
    }


    /**
     * Gets the balances value for this SubscriberPPS.
     * 
     * @return balances
     */
    public com.comverse_in.prepaid.ccws.BalanceEntityBase[] getBalances() {
        return balances;
    }


    /**
     * Sets the balances value for this SubscriberPPS.
     * 
     * @param balances
     */
    public void setBalances(com.comverse_in.prepaid.ccws.BalanceEntityBase[] balances) {
        this.balances = balances;
    }


    /**
     * Gets the AC1Reset value for this SubscriberPPS.
     * 
     * @return AC1Reset
     */
    public Boolean getAC1Reset() {
        return AC1Reset;
    }


    /**
     * Sets the AC1Reset value for this SubscriberPPS.
     * 
     * @param AC1Reset
     */
    public void setAC1Reset(Boolean AC1Reset) {
        this.AC1Reset = AC1Reset;
    }


    /**
     * Gets the AC2Reset value for this SubscriberPPS.
     * 
     * @return AC2Reset
     */
    public Boolean getAC2Reset() {
        return AC2Reset;
    }


    /**
     * Sets the AC2Reset value for this SubscriberPPS.
     * 
     * @param AC2Reset
     */
    public void setAC2Reset(Boolean AC2Reset) {
        this.AC2Reset = AC2Reset;
    }


    /**
     * Gets the AC3Reset value for this SubscriberPPS.
     * 
     * @return AC3Reset
     */
    public Boolean getAC3Reset() {
        return AC3Reset;
    }


    /**
     * Sets the AC3Reset value for this SubscriberPPS.
     * 
     * @param AC3Reset
     */
    public void setAC3Reset(Boolean AC3Reset) {
        this.AC3Reset = AC3Reset;
    }


    /**
     * Gets the AC4Reset value for this SubscriberPPS.
     * 
     * @return AC4Reset
     */
    public Boolean getAC4Reset() {
        return AC4Reset;
    }


    /**
     * Sets the AC4Reset value for this SubscriberPPS.
     * 
     * @param AC4Reset
     */
    public void setAC4Reset(Boolean AC4Reset) {
        this.AC4Reset = AC4Reset;
    }


    /**
     * Gets the AC5Reset value for this SubscriberPPS.
     * 
     * @return AC5Reset
     */
    public Boolean getAC5Reset() {
        return AC5Reset;
    }


    /**
     * Sets the AC5Reset value for this SubscriberPPS.
     * 
     * @param AC5Reset
     */
    public void setAC5Reset(Boolean AC5Reset) {
        this.AC5Reset = AC5Reset;
    }


    /**
     * Gets the AC6Reset value for this SubscriberPPS.
     * 
     * @return AC6Reset
     */
    public Boolean getAC6Reset() {
        return AC6Reset;
    }


    /**
     * Sets the AC6Reset value for this SubscriberPPS.
     * 
     * @param AC6Reset
     */
    public void setAC6Reset(Boolean AC6Reset) {
        this.AC6Reset = AC6Reset;
    }


    /**
     * Gets the AC7Reset value for this SubscriberPPS.
     * 
     * @return AC7Reset
     */
    public Boolean getAC7Reset() {
        return AC7Reset;
    }


    /**
     * Sets the AC7Reset value for this SubscriberPPS.
     * 
     * @param AC7Reset
     */
    public void setAC7Reset(Boolean AC7Reset) {
        this.AC7Reset = AC7Reset;
    }


    /**
     * Gets the BP1Reset value for this SubscriberPPS.
     * 
     * @return BP1Reset
     */
    public Boolean getBP1Reset() {
        return BP1Reset;
    }


    /**
     * Sets the BP1Reset value for this SubscriberPPS.
     * 
     * @param BP1Reset
     */
    public void setBP1Reset(Boolean BP1Reset) {
        this.BP1Reset = BP1Reset;
    }


    /**
     * Gets the BP2Reset value for this SubscriberPPS.
     * 
     * @return BP2Reset
     */
    public Boolean getBP2Reset() {
        return BP2Reset;
    }


    /**
     * Sets the BP2Reset value for this SubscriberPPS.
     * 
     * @param BP2Reset
     */
    public void setBP2Reset(Boolean BP2Reset) {
        this.BP2Reset = BP2Reset;
    }


    /**
     * Gets the BP3Reset value for this SubscriberPPS.
     * 
     * @return BP3Reset
     */
    public Boolean getBP3Reset() {
        return BP3Reset;
    }


    /**
     * Sets the BP3Reset value for this SubscriberPPS.
     * 
     * @param BP3Reset
     */
    public void setBP3Reset(Boolean BP3Reset) {
        this.BP3Reset = BP3Reset;
    }


    /**
     * Gets the BP4Reset value for this SubscriberPPS.
     * 
     * @return BP4Reset
     */
    public Boolean getBP4Reset() {
        return BP4Reset;
    }


    /**
     * Sets the BP4Reset value for this SubscriberPPS.
     * 
     * @param BP4Reset
     */
    public void setBP4Reset(Boolean BP4Reset) {
        this.BP4Reset = BP4Reset;
    }


    /**
     * Gets the BP5Reset value for this SubscriberPPS.
     * 
     * @return BP5Reset
     */
    public Boolean getBP5Reset() {
        return BP5Reset;
    }


    /**
     * Sets the BP5Reset value for this SubscriberPPS.
     * 
     * @param BP5Reset
     */
    public void setBP5Reset(Boolean BP5Reset) {
        this.BP5Reset = BP5Reset;
    }


    /**
     * Gets the BP6Reset value for this SubscriberPPS.
     * 
     * @return BP6Reset
     */
    public Boolean getBP6Reset() {
        return BP6Reset;
    }


    /**
     * Sets the BP6Reset value for this SubscriberPPS.
     * 
     * @param BP6Reset
     */
    public void setBP6Reset(Boolean BP6Reset) {
        this.BP6Reset = BP6Reset;
    }


    /**
     * Gets the BP7Reset value for this SubscriberPPS.
     * 
     * @return BP7Reset
     */
    public Boolean getBP7Reset() {
        return BP7Reset;
    }


    /**
     * Sets the BP7Reset value for this SubscriberPPS.
     * 
     * @param BP7Reset
     */
    public void setBP7Reset(Boolean BP7Reset) {
        this.BP7Reset = BP7Reset;
    }


    /**
     * Gets the balanceChangeChargeCode value for this SubscriberPPS.
     * 
     * @return balanceChangeChargeCode
     */
    public String getBalanceChangeChargeCode() {
        return balanceChangeChargeCode;
    }


    /**
     * Sets the balanceChangeChargeCode value for this SubscriberPPS.
     * 
     * @param balanceChangeChargeCode
     */
    public void setBalanceChangeChargeCode(String balanceChangeChargeCode) {
        this.balanceChangeChargeCode = balanceChangeChargeCode;
    }


    /**
     * Gets the balanceChangeComment value for this SubscriberPPS.
     * 
     * @return balanceChangeComment
     */
    public String getBalanceChangeComment() {
        return balanceChangeComment;
    }


    /**
     * Sets the balanceChangeComment value for this SubscriberPPS.
     * 
     * @param balanceChangeComment
     */
    public void setBalanceChangeComment(String balanceChangeComment) {
        this.balanceChangeComment = balanceChangeComment;
    }


    /**
     * Gets the freeFFChgAllowance value for this SubscriberPPS.
     * 
     * @return freeFFChgAllowance
     */
    public String getFreeFFChgAllowance() {
        return freeFFChgAllowance;
    }


    /**
     * Sets the freeFFChgAllowance value for this SubscriberPPS.
     * 
     * @param freeFFChgAllowance
     */
    public void setFreeFFChgAllowance(String freeFFChgAllowance) {
        this.freeFFChgAllowance = freeFFChgAllowance;
    }


    /**
     * Gets the FFChangeCount value for this SubscriberPPS.
     * 
     * @return FFChangeCount
     */
    public String getFFChangeCount() {
        return FFChangeCount;
    }


    /**
     * Sets the FFChangeCount value for this SubscriberPPS.
     * 
     * @param FFChangeCount
     */
    public void setFFChangeCount(String FFChangeCount) {
        this.FFChangeCount = FFChangeCount;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof SubscriberPPS)) return false;
        SubscriberPPS other = (SubscriberPPS) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = super.equals(obj) && 
            ((this.currencyCode==null && other.getCurrencyCode()==null) || 
             (this.currencyCode!=null &&
              this.currencyCode.equals(other.getCurrencyCode()))) &&
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName()))) &&
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
            ((this.balances==null && other.getBalances()==null) || 
             (this.balances!=null &&
              java.util.Arrays.equals(this.balances, other.getBalances()))) &&
            ((this.AC1Reset==null && other.getAC1Reset()==null) || 
             (this.AC1Reset!=null &&
              this.AC1Reset.equals(other.getAC1Reset()))) &&
            ((this.AC2Reset==null && other.getAC2Reset()==null) || 
             (this.AC2Reset!=null &&
              this.AC2Reset.equals(other.getAC2Reset()))) &&
            ((this.AC3Reset==null && other.getAC3Reset()==null) || 
             (this.AC3Reset!=null &&
              this.AC3Reset.equals(other.getAC3Reset()))) &&
            ((this.AC4Reset==null && other.getAC4Reset()==null) || 
             (this.AC4Reset!=null &&
              this.AC4Reset.equals(other.getAC4Reset()))) &&
            ((this.AC5Reset==null && other.getAC5Reset()==null) || 
             (this.AC5Reset!=null &&
              this.AC5Reset.equals(other.getAC5Reset()))) &&
            ((this.AC6Reset==null && other.getAC6Reset()==null) || 
             (this.AC6Reset!=null &&
              this.AC6Reset.equals(other.getAC6Reset()))) &&
            ((this.AC7Reset==null && other.getAC7Reset()==null) || 
             (this.AC7Reset!=null &&
              this.AC7Reset.equals(other.getAC7Reset()))) &&
            ((this.BP1Reset==null && other.getBP1Reset()==null) || 
             (this.BP1Reset!=null &&
              this.BP1Reset.equals(other.getBP1Reset()))) &&
            ((this.BP2Reset==null && other.getBP2Reset()==null) || 
             (this.BP2Reset!=null &&
              this.BP2Reset.equals(other.getBP2Reset()))) &&
            ((this.BP3Reset==null && other.getBP3Reset()==null) || 
             (this.BP3Reset!=null &&
              this.BP3Reset.equals(other.getBP3Reset()))) &&
            ((this.BP4Reset==null && other.getBP4Reset()==null) || 
             (this.BP4Reset!=null &&
              this.BP4Reset.equals(other.getBP4Reset()))) &&
            ((this.BP5Reset==null && other.getBP5Reset()==null) || 
             (this.BP5Reset!=null &&
              this.BP5Reset.equals(other.getBP5Reset()))) &&
            ((this.BP6Reset==null && other.getBP6Reset()==null) || 
             (this.BP6Reset!=null &&
              this.BP6Reset.equals(other.getBP6Reset()))) &&
            ((this.BP7Reset==null && other.getBP7Reset()==null) || 
             (this.BP7Reset!=null &&
              this.BP7Reset.equals(other.getBP7Reset()))) &&
            ((this.balanceChangeChargeCode==null && other.getBalanceChangeChargeCode()==null) || 
             (this.balanceChangeChargeCode!=null &&
              this.balanceChangeChargeCode.equals(other.getBalanceChangeChargeCode()))) &&
            ((this.balanceChangeComment==null && other.getBalanceChangeComment()==null) || 
             (this.balanceChangeComment!=null &&
              this.balanceChangeComment.equals(other.getBalanceChangeComment()))) &&
            ((this.freeFFChgAllowance==null && other.getFreeFFChgAllowance()==null) || 
             (this.freeFFChgAllowance!=null &&
              this.freeFFChgAllowance.equals(other.getFreeFFChgAllowance()))) &&
            ((this.FFChangeCount==null && other.getFFChangeCount()==null) || 
             (this.FFChangeCount!=null &&
              this.FFChangeCount.equals(other.getFFChangeCount())));
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
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
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
        if (getAC1Reset() != null) {
            _hashCode += getAC1Reset().hashCode();
        }
        if (getAC2Reset() != null) {
            _hashCode += getAC2Reset().hashCode();
        }
        if (getAC3Reset() != null) {
            _hashCode += getAC3Reset().hashCode();
        }
        if (getAC4Reset() != null) {
            _hashCode += getAC4Reset().hashCode();
        }
        if (getAC5Reset() != null) {
            _hashCode += getAC5Reset().hashCode();
        }
        if (getAC6Reset() != null) {
            _hashCode += getAC6Reset().hashCode();
        }
        if (getAC7Reset() != null) {
            _hashCode += getAC7Reset().hashCode();
        }
        if (getBP1Reset() != null) {
            _hashCode += getBP1Reset().hashCode();
        }
        if (getBP2Reset() != null) {
            _hashCode += getBP2Reset().hashCode();
        }
        if (getBP3Reset() != null) {
            _hashCode += getBP3Reset().hashCode();
        }
        if (getBP4Reset() != null) {
            _hashCode += getBP4Reset().hashCode();
        }
        if (getBP5Reset() != null) {
            _hashCode += getBP5Reset().hashCode();
        }
        if (getBP6Reset() != null) {
            _hashCode += getBP6Reset().hashCode();
        }
        if (getBP7Reset() != null) {
            _hashCode += getBP7Reset().hashCode();
        }
        if (getBalanceChangeChargeCode() != null) {
            _hashCode += getBalanceChangeChargeCode().hashCode();
        }
        if (getBalanceChangeComment() != null) {
            _hashCode += getBalanceChangeComment().hashCode();
        }
        if (getFreeFFChgAllowance() != null) {
            _hashCode += getFreeFFChgAllowance().hashCode();
        }
        if (getFFChangeCount() != null) {
            _hashCode += getFFChangeCount().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(SubscriberPPS.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SubscriberPPS"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CurrencyCode"));
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
        elemField.setFieldName("AC1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC5");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC5"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC6");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC6"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC7");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC7"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
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
        elemField.setFieldName("balances");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balances"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceEntityBase"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        elemField.setItemQName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "Balance"));
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC1Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC1Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC2Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC2Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC3Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC3Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC4Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC4Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC5Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC5Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC6Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC6Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("AC7Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AC7Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP1Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP1Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP2Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP2Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP3Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP3Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP4Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP4Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP5Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP5Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP6Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP6Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("BP7Reset");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BP7Reset"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceChangeChargeCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceChangeChargeCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceChangeComment");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceChangeComment"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
