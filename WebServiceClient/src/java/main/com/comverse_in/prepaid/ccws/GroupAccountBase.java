/**
 * GroupAccountBase.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public class GroupAccountBase  implements java.io.Serializable {
    private String adminName;

    private String adminPassword;

    private String groupName;

    private com.comverse_in.prepaid.ccws.DatePeriod refurbishPeriod;

    private Long refurbishDay;

    private com.comverse_in.prepaid.ccws.GroupMemberType notificationHandling;

    private String groupCUG;

    private Boolean differentMemberCUG;

    private String COSName;

    private String SPName;

    private Boolean differentMemberCOS;

    private com.comverse_in.prepaid.ccws.GroupMemberType periodicChargeApply;

    private String timeZone;

    private String homeL1;

    private String homeL2;

    private String homeL3;

    private String homeL4;

    private String CFUNumber;

    private String CFBNumber;

    private String CFNANumber;

    private String CFISNumber;

    private com.comverse_in.prepaid.ccws.FundsType fundsAvailable;

    private com.comverse_in.prepaid.ccws.PrecedenceOrderType precedenceOrder;

    private com.comverse_in.prepaid.ccws.FinancialHandlingType financialHandling;

    private Boolean accountToAccountTransferAllowed;

    private Long balanceTransferMinimum;

    private Long balanceTransferMaximum;

    private java.math.BigDecimal balanceTransferResidualAmount;

    private Boolean spendingLimitOverride;

    private Boolean isReactivationFeeApplied;

    private Boolean balanceToBalanceTransferAllowed;

    private Long groupMaximumSize;

    public GroupAccountBase() {
    }

    public GroupAccountBase(
           String adminName,
           String adminPassword,
           String groupName,
           com.comverse_in.prepaid.ccws.DatePeriod refurbishPeriod,
           Long refurbishDay,
           com.comverse_in.prepaid.ccws.GroupMemberType notificationHandling,
           String groupCUG,
           Boolean differentMemberCUG,
           String COSName,
           String SPName,
           Boolean differentMemberCOS,
           com.comverse_in.prepaid.ccws.GroupMemberType periodicChargeApply,
           String timeZone,
           String homeL1,
           String homeL2,
           String homeL3,
           String homeL4,
           String CFUNumber,
           String CFBNumber,
           String CFNANumber,
           String CFISNumber,
           com.comverse_in.prepaid.ccws.FundsType fundsAvailable,
           com.comverse_in.prepaid.ccws.PrecedenceOrderType precedenceOrder,
           com.comverse_in.prepaid.ccws.FinancialHandlingType financialHandling,
           Boolean accountToAccountTransferAllowed,
           Long balanceTransferMinimum,
           Long balanceTransferMaximum,
           java.math.BigDecimal balanceTransferResidualAmount,
           Boolean spendingLimitOverride,
           Boolean isReactivationFeeApplied,
           Boolean balanceToBalanceTransferAllowed,
           Long groupMaximumSize) {
           this.adminName = adminName;
           this.adminPassword = adminPassword;
           this.groupName = groupName;
           this.refurbishPeriod = refurbishPeriod;
           this.refurbishDay = refurbishDay;
           this.notificationHandling = notificationHandling;
           this.groupCUG = groupCUG;
           this.differentMemberCUG = differentMemberCUG;
           this.COSName = COSName;
           this.SPName = SPName;
           this.differentMemberCOS = differentMemberCOS;
           this.periodicChargeApply = periodicChargeApply;
           this.timeZone = timeZone;
           this.homeL1 = homeL1;
           this.homeL2 = homeL2;
           this.homeL3 = homeL3;
           this.homeL4 = homeL4;
           this.CFUNumber = CFUNumber;
           this.CFBNumber = CFBNumber;
           this.CFNANumber = CFNANumber;
           this.CFISNumber = CFISNumber;
           this.fundsAvailable = fundsAvailable;
           this.precedenceOrder = precedenceOrder;
           this.financialHandling = financialHandling;
           this.accountToAccountTransferAllowed = accountToAccountTransferAllowed;
           this.balanceTransferMinimum = balanceTransferMinimum;
           this.balanceTransferMaximum = balanceTransferMaximum;
           this.balanceTransferResidualAmount = balanceTransferResidualAmount;
           this.spendingLimitOverride = spendingLimitOverride;
           this.isReactivationFeeApplied = isReactivationFeeApplied;
           this.balanceToBalanceTransferAllowed = balanceToBalanceTransferAllowed;
           this.groupMaximumSize = groupMaximumSize;
    }


    /**
     * Gets the adminName value for this GroupAccountBase.
     * 
     * @return adminName
     */
    public String getAdminName() {
        return adminName;
    }


    /**
     * Sets the adminName value for this GroupAccountBase.
     * 
     * @param adminName
     */
    public void setAdminName(String adminName) {
        this.adminName = adminName;
    }


    /**
     * Gets the adminPassword value for this GroupAccountBase.
     * 
     * @return adminPassword
     */
    public String getAdminPassword() {
        return adminPassword;
    }


    /**
     * Sets the adminPassword value for this GroupAccountBase.
     * 
     * @param adminPassword
     */
    public void setAdminPassword(String adminPassword) {
        this.adminPassword = adminPassword;
    }


    /**
     * Gets the groupName value for this GroupAccountBase.
     * 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }


    /**
     * Sets the groupName value for this GroupAccountBase.
     * 
     * @param groupName
     */
    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }


    /**
     * Gets the refurbishPeriod value for this GroupAccountBase.
     * 
     * @return refurbishPeriod
     */
    public com.comverse_in.prepaid.ccws.DatePeriod getRefurbishPeriod() {
        return refurbishPeriod;
    }


    /**
     * Sets the refurbishPeriod value for this GroupAccountBase.
     * 
     * @param refurbishPeriod
     */
    public void setRefurbishPeriod(com.comverse_in.prepaid.ccws.DatePeriod refurbishPeriod) {
        this.refurbishPeriod = refurbishPeriod;
    }


    /**
     * Gets the refurbishDay value for this GroupAccountBase.
     * 
     * @return refurbishDay
     */
    public Long getRefurbishDay() {
        return refurbishDay;
    }


    /**
     * Sets the refurbishDay value for this GroupAccountBase.
     * 
     * @param refurbishDay
     */
    public void setRefurbishDay(Long refurbishDay) {
        this.refurbishDay = refurbishDay;
    }


    /**
     * Gets the notificationHandling value for this GroupAccountBase.
     * 
     * @return notificationHandling
     */
    public com.comverse_in.prepaid.ccws.GroupMemberType getNotificationHandling() {
        return notificationHandling;
    }


    /**
     * Sets the notificationHandling value for this GroupAccountBase.
     * 
     * @param notificationHandling
     */
    public void setNotificationHandling(com.comverse_in.prepaid.ccws.GroupMemberType notificationHandling) {
        this.notificationHandling = notificationHandling;
    }


    /**
     * Gets the groupCUG value for this GroupAccountBase.
     * 
     * @return groupCUG
     */
    public String getGroupCUG() {
        return groupCUG;
    }


    /**
     * Sets the groupCUG value for this GroupAccountBase.
     * 
     * @param groupCUG
     */
    public void setGroupCUG(String groupCUG) {
        this.groupCUG = groupCUG;
    }


    /**
     * Gets the differentMemberCUG value for this GroupAccountBase.
     * 
     * @return differentMemberCUG
     */
    public Boolean getDifferentMemberCUG() {
        return differentMemberCUG;
    }


    /**
     * Sets the differentMemberCUG value for this GroupAccountBase.
     * 
     * @param differentMemberCUG
     */
    public void setDifferentMemberCUG(Boolean differentMemberCUG) {
        this.differentMemberCUG = differentMemberCUG;
    }


    /**
     * Gets the COSName value for this GroupAccountBase.
     * 
     * @return COSName
     */
    public String getCOSName() {
        return COSName;
    }


    /**
     * Sets the COSName value for this GroupAccountBase.
     * 
     * @param COSName
     */
    public void setCOSName(String COSName) {
        this.COSName = COSName;
    }


    /**
     * Gets the SPName value for this GroupAccountBase.
     * 
     * @return SPName
     */
    public String getSPName() {
        return SPName;
    }


    /**
     * Sets the SPName value for this GroupAccountBase.
     * 
     * @param SPName
     */
    public void setSPName(String SPName) {
        this.SPName = SPName;
    }


    /**
     * Gets the differentMemberCOS value for this GroupAccountBase.
     * 
     * @return differentMemberCOS
     */
    public Boolean getDifferentMemberCOS() {
        return differentMemberCOS;
    }


    /**
     * Sets the differentMemberCOS value for this GroupAccountBase.
     * 
     * @param differentMemberCOS
     */
    public void setDifferentMemberCOS(Boolean differentMemberCOS) {
        this.differentMemberCOS = differentMemberCOS;
    }


    /**
     * Gets the periodicChargeApply value for this GroupAccountBase.
     * 
     * @return periodicChargeApply
     */
    public com.comverse_in.prepaid.ccws.GroupMemberType getPeriodicChargeApply() {
        return periodicChargeApply;
    }


    /**
     * Sets the periodicChargeApply value for this GroupAccountBase.
     * 
     * @param periodicChargeApply
     */
    public void setPeriodicChargeApply(com.comverse_in.prepaid.ccws.GroupMemberType periodicChargeApply) {
        this.periodicChargeApply = periodicChargeApply;
    }


    /**
     * Gets the timeZone value for this GroupAccountBase.
     * 
     * @return timeZone
     */
    public String getTimeZone() {
        return timeZone;
    }


    /**
     * Sets the timeZone value for this GroupAccountBase.
     * 
     * @param timeZone
     */
    public void setTimeZone(String timeZone) {
        this.timeZone = timeZone;
    }


    /**
     * Gets the homeL1 value for this GroupAccountBase.
     * 
     * @return homeL1
     */
    public String getHomeL1() {
        return homeL1;
    }


    /**
     * Sets the homeL1 value for this GroupAccountBase.
     * 
     * @param homeL1
     */
    public void setHomeL1(String homeL1) {
        this.homeL1 = homeL1;
    }


    /**
     * Gets the homeL2 value for this GroupAccountBase.
     * 
     * @return homeL2
     */
    public String getHomeL2() {
        return homeL2;
    }


    /**
     * Sets the homeL2 value for this GroupAccountBase.
     * 
     * @param homeL2
     */
    public void setHomeL2(String homeL2) {
        this.homeL2 = homeL2;
    }


    /**
     * Gets the homeL3 value for this GroupAccountBase.
     * 
     * @return homeL3
     */
    public String getHomeL3() {
        return homeL3;
    }


    /**
     * Sets the homeL3 value for this GroupAccountBase.
     * 
     * @param homeL3
     */
    public void setHomeL3(String homeL3) {
        this.homeL3 = homeL3;
    }


    /**
     * Gets the homeL4 value for this GroupAccountBase.
     * 
     * @return homeL4
     */
    public String getHomeL4() {
        return homeL4;
    }


    /**
     * Sets the homeL4 value for this GroupAccountBase.
     * 
     * @param homeL4
     */
    public void setHomeL4(String homeL4) {
        this.homeL4 = homeL4;
    }


    /**
     * Gets the CFUNumber value for this GroupAccountBase.
     * 
     * @return CFUNumber
     */
    public String getCFUNumber() {
        return CFUNumber;
    }


    /**
     * Sets the CFUNumber value for this GroupAccountBase.
     * 
     * @param CFUNumber
     */
    public void setCFUNumber(String CFUNumber) {
        this.CFUNumber = CFUNumber;
    }


    /**
     * Gets the CFBNumber value for this GroupAccountBase.
     * 
     * @return CFBNumber
     */
    public String getCFBNumber() {
        return CFBNumber;
    }


    /**
     * Sets the CFBNumber value for this GroupAccountBase.
     * 
     * @param CFBNumber
     */
    public void setCFBNumber(String CFBNumber) {
        this.CFBNumber = CFBNumber;
    }


    /**
     * Gets the CFNANumber value for this GroupAccountBase.
     * 
     * @return CFNANumber
     */
    public String getCFNANumber() {
        return CFNANumber;
    }


    /**
     * Sets the CFNANumber value for this GroupAccountBase.
     * 
     * @param CFNANumber
     */
    public void setCFNANumber(String CFNANumber) {
        this.CFNANumber = CFNANumber;
    }


    /**
     * Gets the CFISNumber value for this GroupAccountBase.
     * 
     * @return CFISNumber
     */
    public String getCFISNumber() {
        return CFISNumber;
    }


    /**
     * Sets the CFISNumber value for this GroupAccountBase.
     * 
     * @param CFISNumber
     */
    public void setCFISNumber(String CFISNumber) {
        this.CFISNumber = CFISNumber;
    }


    /**
     * Gets the fundsAvailable value for this GroupAccountBase.
     * 
     * @return fundsAvailable
     */
    public com.comverse_in.prepaid.ccws.FundsType getFundsAvailable() {
        return fundsAvailable;
    }


    /**
     * Sets the fundsAvailable value for this GroupAccountBase.
     * 
     * @param fundsAvailable
     */
    public void setFundsAvailable(com.comverse_in.prepaid.ccws.FundsType fundsAvailable) {
        this.fundsAvailable = fundsAvailable;
    }


    /**
     * Gets the precedenceOrder value for this GroupAccountBase.
     * 
     * @return precedenceOrder
     */
    public com.comverse_in.prepaid.ccws.PrecedenceOrderType getPrecedenceOrder() {
        return precedenceOrder;
    }


    /**
     * Sets the precedenceOrder value for this GroupAccountBase.
     * 
     * @param precedenceOrder
     */
    public void setPrecedenceOrder(com.comverse_in.prepaid.ccws.PrecedenceOrderType precedenceOrder) {
        this.precedenceOrder = precedenceOrder;
    }


    /**
     * Gets the financialHandling value for this GroupAccountBase.
     * 
     * @return financialHandling
     */
    public com.comverse_in.prepaid.ccws.FinancialHandlingType getFinancialHandling() {
        return financialHandling;
    }


    /**
     * Sets the financialHandling value for this GroupAccountBase.
     * 
     * @param financialHandling
     */
    public void setFinancialHandling(com.comverse_in.prepaid.ccws.FinancialHandlingType financialHandling) {
        this.financialHandling = financialHandling;
    }


    /**
     * Gets the accountToAccountTransferAllowed value for this GroupAccountBase.
     * 
     * @return accountToAccountTransferAllowed
     */
    public Boolean getAccountToAccountTransferAllowed() {
        return accountToAccountTransferAllowed;
    }


    /**
     * Sets the accountToAccountTransferAllowed value for this GroupAccountBase.
     * 
     * @param accountToAccountTransferAllowed
     */
    public void setAccountToAccountTransferAllowed(Boolean accountToAccountTransferAllowed) {
        this.accountToAccountTransferAllowed = accountToAccountTransferAllowed;
    }


    /**
     * Gets the balanceTransferMinimum value for this GroupAccountBase.
     * 
     * @return balanceTransferMinimum
     */
    public Long getBalanceTransferMinimum() {
        return balanceTransferMinimum;
    }


    /**
     * Sets the balanceTransferMinimum value for this GroupAccountBase.
     * 
     * @param balanceTransferMinimum
     */
    public void setBalanceTransferMinimum(Long balanceTransferMinimum) {
        this.balanceTransferMinimum = balanceTransferMinimum;
    }


    /**
     * Gets the balanceTransferMaximum value for this GroupAccountBase.
     * 
     * @return balanceTransferMaximum
     */
    public Long getBalanceTransferMaximum() {
        return balanceTransferMaximum;
    }


    /**
     * Sets the balanceTransferMaximum value for this GroupAccountBase.
     * 
     * @param balanceTransferMaximum
     */
    public void setBalanceTransferMaximum(Long balanceTransferMaximum) {
        this.balanceTransferMaximum = balanceTransferMaximum;
    }


    /**
     * Gets the balanceTransferResidualAmount value for this GroupAccountBase.
     * 
     * @return balanceTransferResidualAmount
     */
    public java.math.BigDecimal getBalanceTransferResidualAmount() {
        return balanceTransferResidualAmount;
    }


    /**
     * Sets the balanceTransferResidualAmount value for this GroupAccountBase.
     * 
     * @param balanceTransferResidualAmount
     */
    public void setBalanceTransferResidualAmount(java.math.BigDecimal balanceTransferResidualAmount) {
        this.balanceTransferResidualAmount = balanceTransferResidualAmount;
    }


    /**
     * Gets the spendingLimitOverride value for this GroupAccountBase.
     * 
     * @return spendingLimitOverride
     */
    public Boolean getSpendingLimitOverride() {
        return spendingLimitOverride;
    }


    /**
     * Sets the spendingLimitOverride value for this GroupAccountBase.
     * 
     * @param spendingLimitOverride
     */
    public void setSpendingLimitOverride(Boolean spendingLimitOverride) {
        this.spendingLimitOverride = spendingLimitOverride;
    }


    /**
     * Gets the isReactivationFeeApplied value for this GroupAccountBase.
     * 
     * @return isReactivationFeeApplied
     */
    public Boolean getIsReactivationFeeApplied() {
        return isReactivationFeeApplied;
    }


    /**
     * Sets the isReactivationFeeApplied value for this GroupAccountBase.
     * 
     * @param isReactivationFeeApplied
     */
    public void setIsReactivationFeeApplied(Boolean isReactivationFeeApplied) {
        this.isReactivationFeeApplied = isReactivationFeeApplied;
    }


    /**
     * Gets the balanceToBalanceTransferAllowed value for this GroupAccountBase.
     * 
     * @return balanceToBalanceTransferAllowed
     */
    public Boolean getBalanceToBalanceTransferAllowed() {
        return balanceToBalanceTransferAllowed;
    }


    /**
     * Sets the balanceToBalanceTransferAllowed value for this GroupAccountBase.
     * 
     * @param balanceToBalanceTransferAllowed
     */
    public void setBalanceToBalanceTransferAllowed(Boolean balanceToBalanceTransferAllowed) {
        this.balanceToBalanceTransferAllowed = balanceToBalanceTransferAllowed;
    }


    /**
     * Gets the groupMaximumSize value for this GroupAccountBase.
     * 
     * @return groupMaximumSize
     */
    public Long getGroupMaximumSize() {
        return groupMaximumSize;
    }


    /**
     * Sets the groupMaximumSize value for this GroupAccountBase.
     * 
     * @param groupMaximumSize
     */
    public void setGroupMaximumSize(Long groupMaximumSize) {
        this.groupMaximumSize = groupMaximumSize;
    }

    private Object __equalsCalc = null;
    public synchronized boolean equals(Object obj) {
        if (!(obj instanceof GroupAccountBase)) return false;
        GroupAccountBase other = (GroupAccountBase) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true && 
            ((this.adminName==null && other.getAdminName()==null) || 
             (this.adminName!=null &&
              this.adminName.equals(other.getAdminName()))) &&
            ((this.adminPassword==null && other.getAdminPassword()==null) || 
             (this.adminPassword!=null &&
              this.adminPassword.equals(other.getAdminPassword()))) &&
            ((this.groupName==null && other.getGroupName()==null) || 
             (this.groupName!=null &&
              this.groupName.equals(other.getGroupName()))) &&
            ((this.refurbishPeriod==null && other.getRefurbishPeriod()==null) || 
             (this.refurbishPeriod!=null &&
              this.refurbishPeriod.equals(other.getRefurbishPeriod()))) &&
            ((this.refurbishDay==null && other.getRefurbishDay()==null) || 
             (this.refurbishDay!=null &&
              this.refurbishDay.equals(other.getRefurbishDay()))) &&
            ((this.notificationHandling==null && other.getNotificationHandling()==null) || 
             (this.notificationHandling!=null &&
              this.notificationHandling.equals(other.getNotificationHandling()))) &&
            ((this.groupCUG==null && other.getGroupCUG()==null) || 
             (this.groupCUG!=null &&
              this.groupCUG.equals(other.getGroupCUG()))) &&
            ((this.differentMemberCUG==null && other.getDifferentMemberCUG()==null) || 
             (this.differentMemberCUG!=null &&
              this.differentMemberCUG.equals(other.getDifferentMemberCUG()))) &&
            ((this.COSName==null && other.getCOSName()==null) || 
             (this.COSName!=null &&
              this.COSName.equals(other.getCOSName()))) &&
            ((this.SPName==null && other.getSPName()==null) || 
             (this.SPName!=null &&
              this.SPName.equals(other.getSPName()))) &&
            ((this.differentMemberCOS==null && other.getDifferentMemberCOS()==null) || 
             (this.differentMemberCOS!=null &&
              this.differentMemberCOS.equals(other.getDifferentMemberCOS()))) &&
            ((this.periodicChargeApply==null && other.getPeriodicChargeApply()==null) || 
             (this.periodicChargeApply!=null &&
              this.periodicChargeApply.equals(other.getPeriodicChargeApply()))) &&
            ((this.timeZone==null && other.getTimeZone()==null) || 
             (this.timeZone!=null &&
              this.timeZone.equals(other.getTimeZone()))) &&
            ((this.homeL1==null && other.getHomeL1()==null) || 
             (this.homeL1!=null &&
              this.homeL1.equals(other.getHomeL1()))) &&
            ((this.homeL2==null && other.getHomeL2()==null) || 
             (this.homeL2!=null &&
              this.homeL2.equals(other.getHomeL2()))) &&
            ((this.homeL3==null && other.getHomeL3()==null) || 
             (this.homeL3!=null &&
              this.homeL3.equals(other.getHomeL3()))) &&
            ((this.homeL4==null && other.getHomeL4()==null) || 
             (this.homeL4!=null &&
              this.homeL4.equals(other.getHomeL4()))) &&
            ((this.CFUNumber==null && other.getCFUNumber()==null) || 
             (this.CFUNumber!=null &&
              this.CFUNumber.equals(other.getCFUNumber()))) &&
            ((this.CFBNumber==null && other.getCFBNumber()==null) || 
             (this.CFBNumber!=null &&
              this.CFBNumber.equals(other.getCFBNumber()))) &&
            ((this.CFNANumber==null && other.getCFNANumber()==null) || 
             (this.CFNANumber!=null &&
              this.CFNANumber.equals(other.getCFNANumber()))) &&
            ((this.CFISNumber==null && other.getCFISNumber()==null) || 
             (this.CFISNumber!=null &&
              this.CFISNumber.equals(other.getCFISNumber()))) &&
            ((this.fundsAvailable==null && other.getFundsAvailable()==null) || 
             (this.fundsAvailable!=null &&
              this.fundsAvailable.equals(other.getFundsAvailable()))) &&
            ((this.precedenceOrder==null && other.getPrecedenceOrder()==null) || 
             (this.precedenceOrder!=null &&
              this.precedenceOrder.equals(other.getPrecedenceOrder()))) &&
            ((this.financialHandling==null && other.getFinancialHandling()==null) || 
             (this.financialHandling!=null &&
              this.financialHandling.equals(other.getFinancialHandling()))) &&
            ((this.accountToAccountTransferAllowed==null && other.getAccountToAccountTransferAllowed()==null) || 
             (this.accountToAccountTransferAllowed!=null &&
              this.accountToAccountTransferAllowed.equals(other.getAccountToAccountTransferAllowed()))) &&
            ((this.balanceTransferMinimum==null && other.getBalanceTransferMinimum()==null) || 
             (this.balanceTransferMinimum!=null &&
              this.balanceTransferMinimum.equals(other.getBalanceTransferMinimum()))) &&
            ((this.balanceTransferMaximum==null && other.getBalanceTransferMaximum()==null) || 
             (this.balanceTransferMaximum!=null &&
              this.balanceTransferMaximum.equals(other.getBalanceTransferMaximum()))) &&
            ((this.balanceTransferResidualAmount==null && other.getBalanceTransferResidualAmount()==null) || 
             (this.balanceTransferResidualAmount!=null &&
              this.balanceTransferResidualAmount.equals(other.getBalanceTransferResidualAmount()))) &&
            ((this.spendingLimitOverride==null && other.getSpendingLimitOverride()==null) || 
             (this.spendingLimitOverride!=null &&
              this.spendingLimitOverride.equals(other.getSpendingLimitOverride()))) &&
            ((this.isReactivationFeeApplied==null && other.getIsReactivationFeeApplied()==null) || 
             (this.isReactivationFeeApplied!=null &&
              this.isReactivationFeeApplied.equals(other.getIsReactivationFeeApplied()))) &&
            ((this.balanceToBalanceTransferAllowed==null && other.getBalanceToBalanceTransferAllowed()==null) || 
             (this.balanceToBalanceTransferAllowed!=null &&
              this.balanceToBalanceTransferAllowed.equals(other.getBalanceToBalanceTransferAllowed()))) &&
            ((this.groupMaximumSize==null && other.getGroupMaximumSize()==null) || 
             (this.groupMaximumSize!=null &&
              this.groupMaximumSize.equals(other.getGroupMaximumSize())));
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
        if (getAdminName() != null) {
            _hashCode += getAdminName().hashCode();
        }
        if (getAdminPassword() != null) {
            _hashCode += getAdminPassword().hashCode();
        }
        if (getGroupName() != null) {
            _hashCode += getGroupName().hashCode();
        }
        if (getRefurbishPeriod() != null) {
            _hashCode += getRefurbishPeriod().hashCode();
        }
        if (getRefurbishDay() != null) {
            _hashCode += getRefurbishDay().hashCode();
        }
        if (getNotificationHandling() != null) {
            _hashCode += getNotificationHandling().hashCode();
        }
        if (getGroupCUG() != null) {
            _hashCode += getGroupCUG().hashCode();
        }
        if (getDifferentMemberCUG() != null) {
            _hashCode += getDifferentMemberCUG().hashCode();
        }
        if (getCOSName() != null) {
            _hashCode += getCOSName().hashCode();
        }
        if (getSPName() != null) {
            _hashCode += getSPName().hashCode();
        }
        if (getDifferentMemberCOS() != null) {
            _hashCode += getDifferentMemberCOS().hashCode();
        }
        if (getPeriodicChargeApply() != null) {
            _hashCode += getPeriodicChargeApply().hashCode();
        }
        if (getTimeZone() != null) {
            _hashCode += getTimeZone().hashCode();
        }
        if (getHomeL1() != null) {
            _hashCode += getHomeL1().hashCode();
        }
        if (getHomeL2() != null) {
            _hashCode += getHomeL2().hashCode();
        }
        if (getHomeL3() != null) {
            _hashCode += getHomeL3().hashCode();
        }
        if (getHomeL4() != null) {
            _hashCode += getHomeL4().hashCode();
        }
        if (getCFUNumber() != null) {
            _hashCode += getCFUNumber().hashCode();
        }
        if (getCFBNumber() != null) {
            _hashCode += getCFBNumber().hashCode();
        }
        if (getCFNANumber() != null) {
            _hashCode += getCFNANumber().hashCode();
        }
        if (getCFISNumber() != null) {
            _hashCode += getCFISNumber().hashCode();
        }
        if (getFundsAvailable() != null) {
            _hashCode += getFundsAvailable().hashCode();
        }
        if (getPrecedenceOrder() != null) {
            _hashCode += getPrecedenceOrder().hashCode();
        }
        if (getFinancialHandling() != null) {
            _hashCode += getFinancialHandling().hashCode();
        }
        if (getAccountToAccountTransferAllowed() != null) {
            _hashCode += getAccountToAccountTransferAllowed().hashCode();
        }
        if (getBalanceTransferMinimum() != null) {
            _hashCode += getBalanceTransferMinimum().hashCode();
        }
        if (getBalanceTransferMaximum() != null) {
            _hashCode += getBalanceTransferMaximum().hashCode();
        }
        if (getBalanceTransferResidualAmount() != null) {
            _hashCode += getBalanceTransferResidualAmount().hashCode();
        }
        if (getSpendingLimitOverride() != null) {
            _hashCode += getSpendingLimitOverride().hashCode();
        }
        if (getIsReactivationFeeApplied() != null) {
            _hashCode += getIsReactivationFeeApplied().hashCode();
        }
        if (getBalanceToBalanceTransferAllowed() != null) {
            _hashCode += getBalanceToBalanceTransferAllowed().hashCode();
        }
        if (getGroupMaximumSize() != null) {
            _hashCode += getGroupMaximumSize().hashCode();
        }
        __hashCodeCalc = false;
        return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
        new org.apache.axis.description.TypeDesc(GroupAccountBase.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupAccountBase"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AdminName"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("adminPassword");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AdminPassword"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
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
        elemField.setFieldName("refurbishPeriod");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RefurbishPeriod"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DatePeriod"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("refurbishDay");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "RefurbishDay"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("notificationHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "NotificationHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupMemberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupCUG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupCUG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("differentMemberCUG");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DifferentMemberCUG"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("COSName");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "COSName"));
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
        elemField.setFieldName("differentMemberCOS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "DifferentMemberCOS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("periodicChargeApply");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PeriodicChargeApply"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupMemberType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("timeZone");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "TimeZone"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeL1");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeL1"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeL2");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeL2"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeL3");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeL3"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("homeL4");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "HomeL4"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFUNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFUNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFBNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFBNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFNANumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFNANumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("CFISNumber");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "CFISNumber"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("fundsAvailable");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsAvailable"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FundsType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("precedenceOrder");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PrecedenceOrder"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "PrecedenceOrderType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("financialHandling");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FinancialHandling"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "FinancialHandlingType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("accountToAccountTransferAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "AccountToAccountTransferAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceTransferMinimum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceTransferMinimum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceTransferMaximum");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceTransferMaximum"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceTransferResidualAmount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceTransferResidualAmount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("spendingLimitOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "SpendingLimitOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isReactivationFeeApplied");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "IsReactivationFeeApplied"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("balanceToBalanceTransferAllowed");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "BalanceToBalanceTransferAllowed"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("groupMaximumSize");
        elemField.setXmlName(new javax.xml.namespace.QName("http://comverse-in.com/prepaid/ccws", "GroupMaximumSize"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "long"));
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
