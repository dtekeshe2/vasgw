/**
 * ServiceSoap.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.4 Apr 22, 2006 (06:55:48 PDT) WSDL2Java emitter.
 */

package com.comverse_in.prepaid.ccws;

public interface ServiceSoap extends java.rmi.Remote {
    public Integer getVersionId() throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.ClientCache getCache() throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.NonVersionCache getNonVersionCache(Boolean reloadData) throws java.rmi.RemoteException;
    public String[] getLocations() throws java.rmi.RemoteException;
    public Boolean changePassword(String newPassword) throws java.rmi.RemoteException;
    public String[] getRoles() throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.VoucherEntity retrieveVoucherByBatchSerial(Long batchNumber, Long serialNumber) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.VoucherEntity retrieveVoucherBySecretCode(String secretCode) throws java.rmi.RemoteException;
    public Integer deleteVoucher(
            java.math.BigDecimal batchNumber,
            java.math.BigDecimal startSerial,
            java.math.BigDecimal endSerial) throws java.rmi.RemoteException;
    public Integer modifyVoucher(
            java.math.BigDecimal batchNumber,
            String newStateName,
            java.math.BigDecimal startSerial,
            java.math.BigDecimal endSerial) throws java.rmi.RemoteException;
    public Integer useVoucher(String secretCode, java.util.Calendar useDate, String subscriberId, String identity)
            throws java.rmi.RemoteException;
    public Boolean createVoucher(com.comverse_in.prepaid.ccws.VoucherEntity voucher) throws java.rmi.RemoteException;
    public Boolean modifySubscriber(com.comverse_in.prepaid.ccws.SubscriberModify subscriber) throws java.rmi
            .RemoteException;
    public Boolean createSubscriber(com.comverse_in.prepaid.ccws.SubscriberCreate subscriber) throws java.rmi.RemoteException;
    public String getUserConfig() throws java.rmi.RemoteException;
    public void setUserConfig(String config) throws java.rmi.RemoteException;

    /**
     * Recharges the subscriber account based on the subscriber ID
     */
    public com.comverse_in.prepaid.ccws.DeltaBalance[] rechargeAccountBySubscriber(
            String subscriberId,
            String identity,
            String secretCode,
            String rechargeComment) throws java.rmi.RemoteException;

    /**
     * Recharges the subscriber based only on subscriber ID
     */
    public Boolean rechargeAccount4250(String subscriberId, String secretCode, String rechargeComment) throws java.rmi.RemoteException;
    public Boolean nonVoucherRecharge(
            String subscriberId,
            String identity,
            Double rechValue,
            Integer rechDays,
            String rechComm) throws java.rmi.RemoteException;
    public Boolean creditAccount(
            String subscriberID,
            String identity,
            com.comverse_in.prepaid.ccws.BalanceCreditAccount[] subCreditBalances,
            String balanceChangeCode,
            String balanceChangeComment) throws java.rmi.RemoteException;
    public Boolean sendSMSNotification(
            String subscriberId,
            String identity,
            String notificationMSG,
            String notificationInterFaceName) throws java.rmi.RemoteException;
    public Boolean deleteSubscriber(String subscriberId, String identity) throws java.rmi.RemoteException;
    public Boolean cancelReservation(
            String subscriberId,
            String identity,
            Long reservationId,
            String sluName,
            String processName,
            String crn) throws java.rmi.RemoteException;

    /**
     * Retrieves all the identities of a Subscriber
     */
    public com.comverse_in.prepaid.ccws.Identity[] getSubscriberIdentities(String subscriberID) throws java.rmi.RemoteException;

    /**
     * Retrieves Subsriber information based on SubscriberID, informationToRetrieve
     * and Identity
     */
    public com.comverse_in.prepaid.ccws.SubscriberRetrieve retrieveSubscriberWithIdentityNoHistory(
            String subscriberID,
            String identity,
            Integer informationToRetrieve) throws java.rmi.RemoteException;

    /**
     * Retrieves Subsriber information based on SubscriberID, informationToRetrieve
     * and Identity
     */
    public com.comverse_in.prepaid.ccws.SubscriberRetrieve retrieveSubscriberWithIdentityWithHistoryForMultipleIdentities(
            String subscriberID,
            String identity,
            Integer informationToRetrieve,
            java.util.Calendar startDate,
            java.util.Calendar endDate,
            Boolean isAllIdentity) throws java.rmi.RemoteException;

    /**
     * Retrieves Subsriber information based on SubscriberID, informationToRetrieve
     * and Identity
     */
    public com.comverse_in.prepaid.ccws.SubscriberRetrieve fastSubscriberRetrieve(
            String subscriberID,
            String identity,
            Integer informationToRetrieve,
            java.util.Calendar startDate,
            java.util.Calendar endDate,
            Boolean isAllIdentity) throws java.rmi.RemoteException;

    /**
     * Changes the Old SubscriberID with New Subscriber ID
     */
    public void changeSubscriberID(String oldSubscriberID, String newSubscriberID) throws java.rmi.RemoteException;

    /**
     * Gets all the charge codes
     */
    public String[] getChargeCodes(Boolean reloadData) throws java.rmi.RemoteException;

    /**
     * Gets all the global identities
     */
    public com.comverse_in.prepaid.ccws.Identity[] getGlobalIdentities(Boolean reloadData) throws java.rmi.RemoteException;

    /**
     * Gets all the service parameters
     */
    public com.comverse_in.prepaid.ccws.ServiceParameter[] getServiceParameters(Boolean reloadData) throws java.rmi.RemoteException;

    /**
     * Gets all the range map
     */
    public com.comverse_in.prepaid.ccws.Range[] getRangeMap(Boolean reloadData) throws java.rmi.RemoteException;

    /**
     * Credit limit reset process
     */
    public void postpaidCreditLimitReset(Integer billCycle, java.util.Calendar billPeriod, String tableName) throws java.rmi.RemoteException;

    /**
     * Synchronization of data between LEAP and PPS
     */
    public void catalogSync(Integer versionID) throws java.rmi.RemoteException;

    /**
     * Changes the subscriber state for all the identities
     */
    public void changeSubStatusAllIdentities(
            String subscriberID,
            com.comverse_in.prepaid.ccws.IdentityStatus[] identityStatus) throws java.rmi.RemoteException;

    /**
     * Adds a member to a group account.
     */
    public void createGroupAccount(com.comverse_in.prepaid.ccws.GroupAccountCreate groupAccountCreate) throws java.rmi.RemoteException;

    /**
     * Modifies group account.
     */
    public void modifyGroupAccount(com.comverse_in.prepaid.ccws.GroupAccountModify groupAccountModify) throws java.rmi.RemoteException;

    /**
     * Deletes group account.
     */
    public void deleteGroupAccount(String groupName) throws java.rmi.RemoteException;

    /**
     * Gets a group account.
     */
    public com.comverse_in.prepaid.ccws.GroupAccountRetrieve getGroupAccount(String groupName) throws java.rmi.RemoteException;

    /**
     * Retrieves the number of members in the group account.
     */
    public Long getGroupCount(String groupName) throws java.rmi.RemoteException;

    /**
     * Recharges the Group Account based on the Group Name
     */
    public com.comverse_in.prepaid.ccws.DeltaBalance[] rechargeAccountByGroupName(
            String groupName,
            String secretCode,
            String rechargeComment) throws java.rmi.RemoteException;

    /**
     * Retrieves the group Owner from group name
     */
    public com.comverse_in.prepaid.ccws.SubscriberBasic getGroupOwner(String groupName) throws java.rmi.RemoteException;

    /**
     * Adds a member to a group account.
     */
    public void addMemberToGroup(
            String groupName,
            String subscriberID,
            String identityName,
            Boolean enableDefaults,
            Boolean rechargeAllowed) throws java.rmi.RemoteException;

    /**
     * Removes a member from a group account.
     */
    public void removeMemberFromGroup(String subscriberID, String identity) throws java.rmi.RemoteException;

    /**
     * Gets all members for a group account.
     */
    public com.comverse_in.prepaid.ccws.SubscriberRetrieve[] getAllGroupMembers(String groupName) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.BilledBalance retrievePostpaidBilledBalance(
            String subscriberId,
            String identity) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.PostpaidDeltaBalance rechargeBilledAccount(
            String subscriberId,
            String identity,
            String secretCode,
            String rechargeComment) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.AccessNumberInfo[] getAccessNumbers() throws java.rmi.RemoteException;
    public void updateNP(String originalNumber, String routedNumber) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.NPEntity retrieveNP(String originalNumber) throws java.rmi.RemoteException;
    public void deleteNP(String originalNumber) throws java.rmi.RemoteException;

    /**
     * Reserves the Voucher for the requested INSwitch, Subscriber
     * and Identity
     */
    public com.comverse_in.prepaid.ccws.VoucherEntity reserveVoucher(
            String subscriberId,
            String identity,
            Integer INSwitchID,
            String secreteCode) throws java.rmi.RemoteException;

    /**
     * UnReserves the Voucher based on the card number
     */
    public com.comverse_in.prepaid.ccws.VoucherEntity unReserveVoucher(String secreteCode) throws java.rmi
            .RemoteException;

    /**
     * Consumes the Voucher for the requested INSwitch, Subscriber
     * and Identity
     */
    public com.comverse_in.prepaid.ccws.VoucherEntity consumeVoucher(
            String subscriberId,
            String identity,
            Integer INSwitchID,
            String secreteCode) throws java.rmi.RemoteException;

    /**
     * Calls external recharge server to recharge based on INSwitch,
     * Subscriber and Identity
     */
    public Boolean externalNonVoucherRecharge(
            String subscriberId,
            String identity,
            Double rechValue,
            Integer rechDays,
            String rechComm,
            Integer INSwitchID,
            java.math.BigDecimal currencyConversionRate) throws java.rmi.RemoteException;

    /**
     * Adds the requested currency conversion information to the system
     */
    public Boolean addCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionCreate currencyConversion) throws java.rmi.RemoteException;

    /**
     * Modifies the requested currency conversion information to the
     * system
     */
    public Boolean modifyCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionModify currencyConversion) throws java.rmi.RemoteException;

    /**
     * Retrieves the requested currency conversion information from
     * the system
     */
    public com.comverse_in.prepaid.ccws.CurrencyConversionRetrieve[] retrieveCurrencyConversion(com.comverse_in
            .prepaid.ccws.CurrencyConversionDelete currencyConversion) throws java.rmi.RemoteException;

    /**
     * Deletes the requested currency conversion information from
     * the system
     */
    public Boolean deleteCurrencyConversion(com.comverse_in.prepaid.ccws.CurrencyConversionDelete currencyConversion)
            throws java.rmi.RemoteException;
    public void creditAccumulator(
            String subscriberId,
            String identity,
            com.comverse_in.prepaid.ccws.CreditAccumulator[] credits) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.NonVoucherRechargeResponse nonVoucherRechargeGeneric(com.comverse_in.prepaid
            .ccws.NonVoucherRechargeRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.ChangeCOSResponse changeCOS(com.comverse_in.prepaid.ccws.ChangeCOSRequest
            request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.HomeLocationResponse createHomeLocation(com.comverse_in.prepaid.ccws.CreateHomeLocationRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.HomeLocationResponse deleteHomeLocation(com.comverse_in.prepaid.ccws.DeleteHomeLocationRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.PhonebookNumberResponse createPhonebookNumber(com.comverse_in.prepaid.ccws.CreatePhonebookNumberRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.PhonebookNumberResponse deletePhonebookNumber(com.comverse_in.prepaid.ccws.DeletePhonebookNumberRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.PeriodicChargeResponse createPeriodicCharge(com.comverse_in.prepaid.ccws.CreatePeriodicChargeRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.PeriodicChargeResponse deletePeriodicCharge(com.comverse_in.prepaid.ccws.DeletePeriodicChargeRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.ChangeCallingCircleResponse changeCallingCircle(com.comverse_in.prepaid.ccws.ChangeCallingCircleRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.DeleteCallingCircleResponse deleteCallingCircle(com.comverse_in.prepaid.ccws.DeleteCallingCircleRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.CallingCircle[] retrieveCallingCircles(com.comverse_in.prepaid.ccws.RetrieveCallingCirclesRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.CircleOperationResponse[] modifyCallingCircleMembers(com.comverse_in.prepaid.ccws.CircleMemberOperation[] request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.CircleMember[] retrieveCircleMembers(com.comverse_in.prepaid.ccws.RetrieveCircleMembersRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.SetAccumulatorValueResponse setAccumulatorValue(com.comverse_in.prepaid.ccws.SetAccumulatorValueRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueResponse retrieveAccumulatorValue(com.comverse_in.prepaid.ccws.RetrieveAccumulatorValueRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.AssignBonusPlanResponse assignBonusPlan(com.comverse_in.prepaid.ccws.AssignBonusPlanRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.RemoveBonusPlanResponse removeBonusPlan(com.comverse_in.prepaid.ccws.RemoveBonusPlanRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityResponse getSubscriberDataForAllIdentities(com
            .comverse_in.prepaid.ccws.GetSubscriberDataForAllIdentityRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityResponse updateSubscriberDataForAllIdentities(
            com.comverse_in.prepaid.ccws.UpdateSubscriberDataForAllIdentityRequest request) throws java.rmi.RemoteException;
    public void auditEvent(com.comverse_in.prepaid.ccws.AuditEvent auditEvent) throws java.rmi.RemoteException;

    /**
     * Applies promised payment to subscriber
     */
    public com.comverse_in.prepaid.ccws.PromisedPaymentResponse promisedPayment(com.comverse_in.prepaid.ccws.PromisedPaymentRequest request) throws java.rmi.RemoteException;
    public com.comverse_in.prepaid.ccws.RechargeAccountPIResponse rechargeAccountWithPI(com.comverse_in.prepaid.ccws.RechargeAccountPIRequest request) throws java.rmi.RemoteException;

    /**
     * P2P Balance Transfer between / within subscriber(s)
     */
    public com.comverse_in.prepaid.ccws.P2PBalanceTransferResponse p2PBalanceTransfer(com.comverse_in.prepaid.ccws.P2PBalanceTransferRequest p2PBalTransferRequest) throws java.rmi.RemoteException;
}
