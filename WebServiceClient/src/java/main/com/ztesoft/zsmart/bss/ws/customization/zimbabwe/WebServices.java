/**
 * WebServices.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.ztesoft.zsmart.bss.ws.customization.zimbabwe;

public interface WebServices extends java.rmi.Remote {
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountRetDto queryBalanceAndUsageAmount(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryBalanceAndUsageAmountReqDto queryBalanceAndUsageAmountReqDto) throws java.rmi.RemoteException;
    public void addUserAcctByIndiPricePlanSubs(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanSubsReqDto addUserAcctByIndiPricePlanSubsReqDto) throws java.rmi.RemoteException;
    public void addUserAcctByIndiPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddUserAcctByIndiPricePlanReqDto addUserAcctByIndiPricePlanReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageRetDto querySubsUsage(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsageReqDto querySubsUsageReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanRetDto querySubsUsagePricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QuerySubsUsagePricePlanReqDto querySubsUsagePricePlanReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeRetDto queryPUKCode(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryPUKCodeReqDto queryPUKCodeReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordRetDto queryCustomerPassword(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryCustomerPasswordReqDto queryCustomerPasswordReqDto) throws java.rmi.RemoteException;
    public void addVAS(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.AddVASReqDto addVASReqDto) throws java.rmi.RemoteException;
    public void removeVAS(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RemoveVASReqDto removeVASReqDto) throws java.rmi.RemoteException;
    public void changePricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangePricePlanReqDto changePricePlanReqDto) throws java.rmi.RemoteException;
    public void newConnection(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.NewConnectionReqDto newConnectionReqDto) throws java.rmi.RemoteException;
    public void termination(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.TerminationReqDto terminationReqDto) throws java.rmi.RemoteException;
    public void suspensionUnderReq(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SuspensionUnderReqReqDto suspensionUnderReqReqDto) throws java.rmi.RemoteException;
    public void reactivationUnderReq(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReactivationUnderReqReqDto reactivationUnderReqReqDto) throws java.rmi.RemoteException;
    public void changeUserNumber(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserNumberReqDto changeUserNumberReqDto) throws java.rmi.RemoteException;
    public void changeUserBrand(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeUserBrandReqDto changeUserBrandReqDto) throws java.rmi.RemoteException;
    public void releaseRCBlacklist(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ReleaseRCBlacklistReqDto releaseRCBlacklistReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileRetDto queryUserProfile(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryUserProfileReqDto queryUserProfileReqDto) throws java.rmi.RemoteException;
    public void modUserIndiPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModUserIndiPricePlanReqDto modUserIndiPricePlanReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanRetDto queryIndividualPricePlan(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryIndividualPricePlanReqDto queryIndividualPricePlanReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalRetDto queryAcctBal(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcctBalReqDto queryAcctBalReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalRetDto queryAcmBal(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.QueryAcmBalReqDto queryAcmBalReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeRetDto recharge(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.RechargeReqDto rechargeReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferRetDto balTransfer(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.BalTransferReqDto balTransferReqDto) throws java.rmi.RemoteException;
    public void subscriberRegister(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.SubscriberRegisterReqDto subscriberRegisterReqDto) throws java.rmi.RemoteException;
    public void prePaidSubscriberRegister(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PrePaidSubscriberRegisterReqDto prePaidSubscriberRegisterReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyRetDto cellPhoneNumberIdentify(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CellPhoneNumberIdentifyReqDto cellPhoneNumberIdentifyReqDto) throws java.rmi.RemoteException;
    public com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeRetDto deductFee(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.DeductFeeReqDto deductFeeReqDto) throws java.rmi.RemoteException;
    public void modProdState(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ModProdStateReqDto modProdStateReqDto) throws java.rmi.RemoteException;
    public void changeFreeNumberForHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.ChangeFreeNumberForHybridReqDto changeFreeNumberForHybridReqDto) throws java.rmi.RemoteException;
    public void addMemberIntoCUG(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto addMemberIntoCUGReqDto) throws java.rmi.RemoteException;
    public void removeMemberFromCUG(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.CUGMemberReqDto removeMemberFromCUGReqDto) throws java.rmi.RemoteException;
    public void prepaidToHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto prepaidToHybridReqDto) throws java.rmi.RemoteException;
    public void postpaidToHybrid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridReqDto postpaidToHybridReqDto) throws java.rmi.RemoteException;
    public void hybridToPrepaid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPrepaidReqDto hybridToPrepaidReqDto) throws java.rmi.RemoteException;
    public void hybridToPostpaid(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.HybridToPostpaidReqDto hybridToPostpaidReqDto) throws java.rmi.RemoteException;
    public void paymentReverse(com.ztesoft.zsmart.bss.ws.customization.zimbabwe.PaymentReverseReqDto paymentReverseReqDto) throws java.rmi.RemoteException;
}
