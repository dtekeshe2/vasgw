package com.ebridgevas.ussd.menu.stub;

import static com.ebridge.billinginterface.util.BillingUtils.*;
import com.comverse_in.prepaid.ccws.*;

import java.math.BigDecimal;
import java.rmi.RemoteException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class PrepaidServiceSoapStub
        implements ServiceSoap
{

    private static final String TEL_COS = "TEL_COS";
    private static final String STAFF_SPOUSE = "Staff Spouse";

    @Override
    public SubscriberRetrieve retrieveSubscriberWithIdentityNoHistory(
            String subscriberID, String identity, Integer informationToRetrieve)
            throws
            RemoteException
    {
        SubscriberRetrieve subscriberRetrieve = new SubscriberRetrieve();
        SubscriberEntity subscriberData = new SubscriberEntity();
        if ("733661588".equals(subscriberID))
        {

            Calendar expiry = Calendar.getInstance();
            try
            {
                expiry.setTime( new SimpleDateFormat("dd/MM/yyyy").parse("15/08/2015"));
            }
            catch (ParseException e)
            {
                e.printStackTrace();
            }

            subscriberData.setCOSName(TEL_COS);

            BalanceEntity[] balances = new BalanceEntity[2];
            balances[0] = new BalanceEntity();
            balances[0].setBalanceName(CORE_BALANCE);
            balances[0].setAvailableBalance(10.00);
            balances[0].setAccountExpiration( expiry );

            balances[1] = new BalanceEntity();
            balances[1].setBalanceName(TEL_COS_DATA_BALANCE);
            balances[1].setAvailableBalance(0.1128);
            balances[1].setAccountExpiration(expiry);

            subscriberData.setBalances(balances);
        }
        else if("733803480".equals(subscriberID))
        {

            subscriberData.setCOSName(STAFF_SPOUSE);
        }
        else
        {
            return null;
        }
        subscriberRetrieve.setSubscriberData(subscriberData);
        return subscriberRetrieve;
    }

    @Override
    public Integer getVersionId()
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public ClientCache getCache()
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public NonVersionCache getNonVersionCache(Boolean reloadData)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public String[] getLocations()
            throws
            RemoteException
    {
        return new String[0];
    }

    @Override
    public Boolean changePassword(String newPassword)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public String[] getRoles()
            throws
            RemoteException
    {
        return new String[0];
    }

    @Override
    public VoucherEntity retrieveVoucherByBatchSerial(
            Long batchNumber, Long serialNumber)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public VoucherEntity retrieveVoucherBySecretCode(String secretCode)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Integer deleteVoucher(
            BigDecimal batchNumber, BigDecimal startSerial, BigDecimal endSerial)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Integer modifyVoucher(
            BigDecimal batchNumber, String newStateName, BigDecimal startSerial, BigDecimal endSerial)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Integer useVoucher(String secretCode, Calendar useDate, String subscriberId, String identity)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean createVoucher(VoucherEntity voucher)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean modifySubscriber(SubscriberModify subscriber)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean createSubscriber(SubscriberCreate subscriber)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public String getUserConfig()
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void setUserConfig(String config)
            throws
            RemoteException
    {

    }

    @Override
    public DeltaBalance[] rechargeAccountBySubscriber(
            String subscriberId, String identity, String secretCode, String rechargeComment)
            throws
            RemoteException
    {
        return new DeltaBalance[0];
    }

    @Override
    public Boolean rechargeAccount4250(String subscriberId, String secretCode, String rechargeComment)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean nonVoucherRecharge(
            String subscriberId, String identity, Double rechValue, Integer rechDays, String rechComm)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean creditAccount(
            String subscriberID,
            String identity,
            BalanceCreditAccount[] subCreditBalances,
            String balanceChangeCode,
            String balanceChangeComment)
            throws
            RemoteException
    {
        return Boolean.FALSE;
    }

    @Override
    public Boolean sendSMSNotification(
            String subscriberId, String identity, String notificationMSG, String notificationInterFaceName)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean deleteSubscriber(String subscriberId, String identity)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean cancelReservation(
            String subscriberId,
            String identity,
            Long reservationId,
            String sluName,
            String processName,
            String crn)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Identity[] getSubscriberIdentities(String subscriberID)
            throws
            RemoteException
    {
        return new Identity[0];
    }

    @Override
    public SubscriberRetrieve retrieveSubscriberWithIdentityWithHistoryForMultipleIdentities(
            String subscriberID,
            String identity,
            Integer informationToRetrieve,
            Calendar startDate,
            Calendar endDate,
            Boolean isAllIdentity)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public SubscriberRetrieve fastSubscriberRetrieve(
            String subscriberID,
            String identity,
            Integer informationToRetrieve,
            Calendar startDate,
            Calendar endDate,
            Boolean isAllIdentity)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void changeSubscriberID(String oldSubscriberID, String newSubscriberID)
            throws
            RemoteException
    {

    }

    @Override
    public String[] getChargeCodes(Boolean reloadData)
            throws
            RemoteException
    {
        return new String[0];
    }

    @Override
    public Identity[] getGlobalIdentities(Boolean reloadData)
            throws
            RemoteException
    {
        return new Identity[0];
    }

    @Override
    public ServiceParameter[] getServiceParameters(Boolean reloadData)
            throws
            RemoteException
    {
        return new ServiceParameter[0];
    }

    @Override
    public Range[] getRangeMap(Boolean reloadData)
            throws
            RemoteException
    {
        return new Range[0];
    }

    @Override
    public void postpaidCreditLimitReset(Integer billCycle, Calendar billPeriod, String tableName)
            throws
            RemoteException
    {

    }

    @Override
    public void catalogSync(Integer versionID)
            throws
            RemoteException
    {

    }

    @Override
    public void changeSubStatusAllIdentities(
            String subscriberID, IdentityStatus[] identityStatus)
            throws
            RemoteException
    {

    }

    @Override
    public void createGroupAccount(GroupAccountCreate groupAccountCreate)
            throws
            RemoteException
    {

    }

    @Override
    public void modifyGroupAccount(GroupAccountModify groupAccountModify)
            throws
            RemoteException
    {

    }

    @Override
    public void deleteGroupAccount(String groupName)
            throws
            RemoteException
    {

    }

    @Override
    public GroupAccountRetrieve getGroupAccount(String groupName)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Long getGroupCount(String groupName)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public DeltaBalance[] rechargeAccountByGroupName(String groupName, String secretCode, String rechargeComment)
            throws
            RemoteException
    {
        return new DeltaBalance[0];
    }

    @Override
    public SubscriberBasic getGroupOwner(String groupName)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void addMemberToGroup(
            String groupName,
            String subscriberID,
            String identityName,
            Boolean enableDefaults,
            Boolean rechargeAllowed)
            throws
            RemoteException
    {

    }

    @Override
    public void removeMemberFromGroup(String subscriberID, String identity)
            throws
            RemoteException
    {

    }

    @Override
    public SubscriberRetrieve[] getAllGroupMembers(String groupName)
            throws
            RemoteException
    {
        return new SubscriberRetrieve[0];
    }

    @Override
    public BilledBalance retrievePostpaidBilledBalance(String subscriberId, String identity)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public PostpaidDeltaBalance rechargeBilledAccount(
            String subscriberId, String identity, String secretCode, String rechargeComment)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public AccessNumberInfo[] getAccessNumbers()
            throws
            RemoteException
    {
        return new AccessNumberInfo[0];
    }

    @Override
    public void updateNP(String originalNumber, String routedNumber)
            throws
            RemoteException
    {

    }

    @Override
    public NPEntity retrieveNP(String originalNumber)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void deleteNP(String originalNumber)
            throws
            RemoteException
    {

    }

    @Override
    public VoucherEntity reserveVoucher(
            String subscriberId, String identity, Integer INSwitchID, String secreteCode)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public VoucherEntity unReserveVoucher(String secreteCode)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public VoucherEntity consumeVoucher(
            String subscriberId, String identity, Integer INSwitchID, String secreteCode)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean externalNonVoucherRecharge(
            String subscriberId,
            String identity,
            Double rechValue,
            Integer rechDays,
            String rechComm,
            Integer INSwitchID,
            BigDecimal currencyConversionRate)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean addCurrencyConversion(CurrencyConversionCreate currencyConversion)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public Boolean modifyCurrencyConversion(CurrencyConversionModify currencyConversion)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public CurrencyConversionRetrieve[] retrieveCurrencyConversion(CurrencyConversionDelete currencyConversion)
            throws
            RemoteException
    {
        return new CurrencyConversionRetrieve[0];
    }

    @Override
    public Boolean deleteCurrencyConversion(CurrencyConversionDelete currencyConversion)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void creditAccumulator(
            String subscriberId, String identity, CreditAccumulator[] credits)
            throws
            RemoteException
    {

    }

    @Override
    public NonVoucherRechargeResponse nonVoucherRechargeGeneric(NonVoucherRechargeRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public ChangeCOSResponse changeCOS(ChangeCOSRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public HomeLocationResponse createHomeLocation(CreateHomeLocationRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public HomeLocationResponse deleteHomeLocation(DeleteHomeLocationRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public PhonebookNumberResponse createPhonebookNumber(CreatePhonebookNumberRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public PhonebookNumberResponse deletePhonebookNumber(DeletePhonebookNumberRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public PeriodicChargeResponse createPeriodicCharge(CreatePeriodicChargeRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public PeriodicChargeResponse deletePeriodicCharge(DeletePeriodicChargeRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public ChangeCallingCircleResponse changeCallingCircle(ChangeCallingCircleRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public DeleteCallingCircleResponse deleteCallingCircle(DeleteCallingCircleRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public CallingCircle[] retrieveCallingCircles(RetrieveCallingCirclesRequest request)
            throws
            RemoteException
    {
        return new CallingCircle[0];
    }

    @Override
    public CircleOperationResponse[] modifyCallingCircleMembers(CircleMemberOperation[] request)
            throws
            RemoteException
    {
        return new CircleOperationResponse[0];
    }

    @Override
    public CircleMember[] retrieveCircleMembers(RetrieveCircleMembersRequest request)
            throws
            RemoteException
    {
        return new CircleMember[0];
    }

    @Override
    public SetAccumulatorValueResponse setAccumulatorValue(SetAccumulatorValueRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public RetrieveAccumulatorValueResponse retrieveAccumulatorValue(RetrieveAccumulatorValueRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public AssignBonusPlanResponse assignBonusPlan(AssignBonusPlanRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public RemoveBonusPlanResponse removeBonusPlan(RemoveBonusPlanRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public GetSubscriberDataForAllIdentityResponse getSubscriberDataForAllIdentities(
            GetSubscriberDataForAllIdentityRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public UpdateSubscriberDataForAllIdentityResponse updateSubscriberDataForAllIdentities(
            UpdateSubscriberDataForAllIdentityRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public void auditEvent(AuditEvent auditEvent)
            throws
            RemoteException
    {

    }

    @Override
    public PromisedPaymentResponse promisedPayment(PromisedPaymentRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public RechargeAccountPIResponse rechargeAccountWithPI(RechargeAccountPIRequest request)
            throws
            RemoteException
    {
        return null;
    }

    @Override
    public P2PBalanceTransferResponse p2PBalanceTransfer(P2PBalanceTransferRequest p2PBalTransferRequest)
            throws
            RemoteException
    {
        return null;
    }
}
