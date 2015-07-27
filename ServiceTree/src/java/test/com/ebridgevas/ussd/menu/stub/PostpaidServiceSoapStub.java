package com.ebridgevas.ussd.menu.stub;

import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.*;

import java.rmi.RemoteException;

public class PostpaidServiceSoapStub
        implements WebServices
{
    @Override
    public QueryUserProfileRetDto queryUserProfile(QueryUserProfileReqDto queryUserProfileReqDto)
            throws
            RemoteException
    {
        QueryUserProfileRetDto result = new QueryUserProfileRetDto();
        UserProfileDto profile = new UserProfileDto();
        profile.setState("A");
        result.setUserProfileDto(profile);

        return result;
    }

    @Override
    public QueryAcmBalRetDto queryAcmBal(QueryAcmBalReqDto queryAcmBalReqDto)
            throws
            RemoteException
    {
        QueryAcmBalRetDto result = new QueryAcmBalRetDto();
        result.setBalance("10485760.00");
        result.setExpDate("20/08/2016");
        return result;
    }

    @Override
    public QueryBalanceAndUsageAmountRetDto queryBalanceAndUsageAmount(QueryBalanceAndUsageAmountReqDto
            queryBalanceAndUsageAmountReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void addUserAcctByIndiPricePlanSubs(AddUserAcctByIndiPricePlanSubsReqDto
            addUserAcctByIndiPricePlanSubsReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void addUserAcctByIndiPricePlan(AddUserAcctByIndiPricePlanReqDto addUserAcctByIndiPricePlanReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public QuerySubsUsageRetDto querySubsUsage(QuerySubsUsageReqDto querySubsUsageReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public QuerySubsUsagePricePlanRetDto querySubsUsagePricePlan(QuerySubsUsagePricePlanReqDto querySubsUsagePricePlanReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public QueryPUKCodeRetDto queryPUKCode(QueryPUKCodeReqDto queryPUKCodeReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public QueryCustomerPasswordRetDto queryCustomerPassword(QueryCustomerPasswordReqDto queryCustomerPasswordReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void addVAS(AddVASReqDto addVASReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void removeVAS(RemoveVASReqDto removeVASReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void changePricePlan(ChangePricePlanReqDto changePricePlanReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void newConnection(NewConnectionReqDto newConnectionReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void termination(TerminationReqDto terminationReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void suspensionUnderReq(SuspensionUnderReqReqDto suspensionUnderReqReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void reactivationUnderReq(ReactivationUnderReqReqDto reactivationUnderReqReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void changeUserNumber(ChangeUserNumberReqDto changeUserNumberReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void changeUserBrand(ChangeUserBrandReqDto changeUserBrandReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void releaseRCBlacklist(ReleaseRCBlacklistReqDto releaseRCBlacklistReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void modUserIndiPricePlan(ModUserIndiPricePlanReqDto modUserIndiPricePlanReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public QueryIndividualPricePlanRetDto queryIndividualPricePlan(QueryIndividualPricePlanReqDto queryIndividualPricePlanReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public QueryAcctBalRetDto queryAcctBal(QueryAcctBalReqDto queryAcctBalReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public RechargeRetDto recharge(RechargeReqDto rechargeReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public BalTransferRetDto balTransfer(BalTransferReqDto balTransferReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void subscriberRegister(SubscriberRegisterReqDto subscriberRegisterReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void prePaidSubscriberRegister(PrePaidSubscriberRegisterReqDto prePaidSubscriberRegisterReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public CellPhoneNumberIdentifyRetDto cellPhoneNumberIdentify(CellPhoneNumberIdentifyReqDto
            cellPhoneNumberIdentifyReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public DeductFeeRetDto deductFee(DeductFeeReqDto deductFeeReqDto)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void modProdState(ModProdStateReqDto modProdStateReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void changeFreeNumberForHybrid(ChangeFreeNumberForHybridReqDto changeFreeNumberForHybridReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void addMemberIntoCUG(CUGMemberReqDto addMemberIntoCUGReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void removeMemberFromCUG(CUGMemberReqDto removeMemberFromCUGReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void prepaidToHybrid(HybridReqDto prepaidToHybridReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void postpaidToHybrid(HybridReqDto postpaidToHybridReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void hybridToPrepaid(HybridToPrepaidReqDto hybridToPrepaidReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void hybridToPostpaid(HybridToPostpaidReqDto hybridToPostpaidReqDto)
            throws
            RemoteException
    {

    }

    @Override
    public void paymentReverse(PaymentReverseReqDto paymentReverseReqDto)
            throws
            RemoteException
    {

    }
}
