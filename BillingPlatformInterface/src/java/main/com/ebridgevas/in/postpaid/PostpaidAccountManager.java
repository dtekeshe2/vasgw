//package com.ebridgevas.in.postpaid;
//
//import com.ebridge.commons.dao.CreditAccountRequestDao;
//import com.ebridge.commons.dao.CreditAccountResponseDao;
//import com.ebridge.commons.dto.PduDto;
//import com.ebridgevas.dao.TxnDAO;
//import com.ebridgevas.dto.TxnDto;
//import com.ebridgevas.in.AbstractAccountManager;
//import com.ebridgevas.in.AccountManager;
//import com.ebridgevas.in.util.AccountTransferUtils;
//import com.ebridgevas.model.BalanceDTO;
//import com.ebridgevas.model.MTSM;
//import com.ztesoft.zsmart.bss.ws.customization.zimbabwe.*;
//import org.apache.log4j.Logger;
//import org.joda.time.DateTime;
//
//import javax.xml.rpc.ServiceException;
//import java.math.BigDecimal;
//import java.math.RoundingMode;
//import java.rmi.RemoteException;
//import java.text.DecimalFormat;
//import java.text.SimpleDateFormat;
//import java.util.*;
//
///**
// * Created with IntelliJ IDEA.
// * User: David
// * Date: 11/29/12
// * Time: 6:49 AM
// * To change this template use File | Settings | File Templates.
// */
//public class PostpaidAccountManager extends AbstractAccountManager implements AccountManager {
//
//    private WebServices_PortType postpaidService;
//
////    private WebServices postpaidService;
//
//    private Logger log = Logger.getLogger(PostpaidAccountManager.class.getName());
//
//    private TxnDAO txnDao;
//
//    private String errorMessage;
//
//    public static final Map<String, String> USER_STATE;
//
//    static {
//
//        /*
//        A : Active
//G : Inactive
//D : One-Way Block
//E : Two-Way Block
//B : Termination
//         */
//
//        USER_STATE = new HashMap<String, String>();
//        USER_STATE.put("A","active");
//        USER_STATE.put("G","inactive");
//        USER_STATE.put("D","one-way block");
//        USER_STATE.put("E","two-way block");
//        USER_STATE.put("B","termination");
//
//
//    }
//
//    public PostpaidAccountManager() {
//
//
//
//
//        WebServicesService locator = new WebServicesServiceLocator();
//        try {
//            log.debug("Postpaid web service init...");
//            postpaidService = locator.getWebServices();
//            log.debug("Postpaid web service initialized.");
//        } catch (ServiceException e) {
//            e.printStackTrace();
//            postpaidService = null;
//        }
//    }
//
//    @Override
//    public String getClassOfService( String msisdn ) {
//        return null;
//    }
//
//    @Override
//    public String getAccountBalance( String msisdn ) {
//        QueryAcmBalReqDto bal = new QueryAcmBalReqDto();
//        bal.setMSISDN(msisdn);
//        String plan = "166";
//        bal.setPricePlanID(plan);
//        QueryAcmBalRetDto balResponse = null;
//        try {
//            balResponse = postpaidService.queryAcmBal(bal);
//            Double balanceMb = ( Double.parseDouble(balResponse.getBalance()) / 1048576.00 );
//            String expiryDate = balResponse.getExpDate();
//
////            DBAdapter.log(stmt, uuid, msisdn, "", "balanceEnquiry", null, "V=" + voiceBalance + "|D=" + dataBalance );
//
////            if (dataBalance == null){
////                dataBalance = BigDecimal.ZERO;
////            } else {
////                expiryDate = getExpiryDate(balances.get(dataBalanceName).getExpiryDate());
////            }
//            BigDecimal balance = new BigDecimal(balanceMb);
//            balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);
//            String result = "Your GPRS bal= " + balance + "mb exp on " + expiryDate;
//
//            log.debug("{ balance : msisdn : " + msisdn + ", payload : " + result + "}");
//
//            return result;
//        } catch (RemoteException e) {
//            e.printStackTrace();
//            String message = e.getMessage();
//            if ( (message != null) && (message.trim().toLowerCase().startsWith("errorcode")) ) {
//                errorMessage = message.split("=")[2].trim().substring(1);
//                errorMessage = errorMessage.substring(0, errorMessage.length() - 1);
//
//                /* Transilating
//                    errorCode = [S-WS-02019] errorDesc = [The price plan instance is expiry.]
//                    to
//                    data bundle = 0MB
//                */
//                System.out.println(message);
//                String errorCode = message.split("=")[1].trim().substring(1);
//
//                errorCode = errorCode.split(" ")[0].trim();
//                errorCode = errorCode.substring(0, errorCode.length() - 1);
//                System.out.println("errorCode : (" + errorCode + ")");
//                if ("S-WS-02019".equalsIgnoreCase(errorCode)) {    // TODO parameters error code
//                    errorMessage = "data bundle = 0MB exp on " + new SimpleDateFormat("dd/MM/yyyy.").format(new Date());
//                }
//            }
//            log.info("{txnType : bundle-purchase, msisdn : " + msisdn + ", error-message : " + errorMessage + "}");
//            return errorMessage;
//        }
//    }
//
//    @Override
//    public String debitAccount(TxnDto txn) {
//        return purchaseDataBundle(txn, Boolean.FALSE, Boolean.TRUE);
//    }
//
//    @Override
//    public String creditAccount(TxnDto txn) {
//        return purchaseDataBundle(txn, Boolean.TRUE, Boolean.FALSE);
//    }
//
//    @Override
//    public String purchaseDataBundle(TxnDto txn, Boolean creditOnly, Boolean debitOnly) {
//
//        try {
//
//            Date expiry = AccountTransferUtils.getExpiryDateByType(txn.getProductCode(), Boolean.FALSE);
//
//            AddUserAcctByIndiPricePlanSubsReqDto request = new AddUserAcctByIndiPricePlanSubsReqDto();
//            request.setBundleType(txn.getProductCode());
//            request.setEffDate(new Date());
//            request.setExpDate(expiry);
//            request.setMSISDN(txn.getSourceId()); //263733474747       :String
//            request.setPricePlanID("166");
//
//            String plan = "166";
//
//            try {
//
//                String payload = "";
//
//                /* Check state. */
//                try {
//
//                    QueryUserProfileReqDto profileRequest = new QueryUserProfileReqDto();
//                    profileRequest.setMSISDN(txn.getSourceId());
//                    QueryUserProfileRetDto userProfile = postpaidService.queryUserProfile(profileRequest);
//                    String userState = userProfile.getUserProfileDto().getState();
////                    System.out.println("#### DT 17.02.2014 : userState : " + userState );
//
//                    if (userState != null) {
//                        userState = userState.toUpperCase();
//                    } else {
//                        return " account state unknown.";
//                    }
//
//                    String userStateDescription = USER_STATE.get(userState);
//                    if (userStateDescription == null)
//                        return " account state unknown.";
//
//                    if (! "A".equalsIgnoreCase(userState) ) {
//                        return " account " + userStateDescription;
//                    }
//
//                } catch(Exception e) {
//                    /* Postpaid system might throw an error if new data balance. */
//                    /* Just ignore*/
//                }
//                /* End of Check state */
//
//                QueryAcmBalReqDto bal = new QueryAcmBalReqDto();
//                bal.setMSISDN(txn.getSourceId());
//                bal.setPricePlanID(plan);  // 166 for all balance queries    :String
//                QueryAcmBalRetDto balResponse = null;
//                String expiryDate = null;
//                try {
//
//                    balResponse = postpaidService.queryAcmBal(bal);
//                    expiryDate = balResponse.getExpDate();
//
//                    if (new DateTime(request.getExpDate()).isBefore(new DateTime(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(expiryDate)))) {
//                        request.setExpDate(new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").parse(expiryDate));
//                    }
//                } catch(Exception e) {
//                    /* Postpaid system might throw an error if new data balance. */
//                    /* Just ignore*/
//                }
//
//                postpaidService.addUserAcctByIndiPricePlanSubs(request);
//
//                balResponse = postpaidService.queryAcmBal(bal);
//                Double balanceMb = ( Double.parseDouble(balResponse.getBalance()) / 1048576.0 );
//                expiryDate = balResponse.getExpDate();
//
//                BigDecimal balance = new BigDecimal(balanceMb);
//                balance = balance.setScale(2, BigDecimal.ROUND_HALF_UP);
//
//                String result = "Your GPRS bal= " + balance + "mb exp on " + expiryDate;
//                // You have bought the 10.00mb bundle. Your bal = 0.00usd. Data bundle= 10.00mb exp on 14/04/2014
//                payload = "" +
//                        "You have bought the " +
//                        getBundleSizeFor(txn.getProductCode(), Boolean.TRUE) +
//                        " bundle. Your data bal = " +
//                        balance +
//                        "mb exp on " + expiryDate;
//                log.debug("{ balance : msisdn : " + txn.getSourceId() + ", payload : " + payload + "}");
//
//                return /* getUssdMessagePrefix(Boolean.TRUE, sessionId) + */ payload;
//            } catch (RemoteException e) {
//                e.printStackTrace();  //To change body of catch statement use File | Settings | File Templates.
////                String raw = "errorCode = [S-PRF-00131] errorDesc = [The subscriber has been terminated.]";
//                String errorMessage = e.getMessage();
//                if ( (errorMessage != null) && (errorMessage.trim().toLowerCase().startsWith("errorcode")) ) {
//                    errorMessage = errorMessage.split("=")[2].trim().substring(1);
//                    errorMessage = errorMessage.substring(0, errorMessage.length() - 1);
//                }
//                log.info("{txnType : bundle-purchase, msisdn : " + txn.getSourceId() + ", error-message : " + errorMessage + "}");
//
//                txn.setTransactionType("BonusCredit");
//                txn.setStatusCode("096");
//                txn.setNarrative(errorMessage);
//                txn.setShortMessage(errorMessage);
//                txn.setAccountType("POSTPAID");
//                txnDao.persist(txn);
//
//                return errorMessage;
//            }
//
//
////            DBAdapter.log(stmt, uuid, msisdn, "", "DataBundlePurchase", price, "V=" + voiceBalance + "|D=" + dataBalance, "000", expiryDate, "144" );
//
//
//
//            // } catch (Exception e) {
//
////            String msg = e.getMessage();
////            if (msg != null && msg.toLowerCase().startsWith("subscriber account is ")) {
////                msg = "Subscriber not active";
////            }
////
////            if (msg != null && msg.toLowerCase().startsWith("failed to retrieve subscriber")) {
////                msg = "Subscriber retrieval failure";
////            }
////
////            if (msg != null && msg.toLowerCase().startsWith("insufficient credit for selected bundle")) {
////                msg = "Insufficient credit for selected bundle";
////            }
////
////            DBAdapter.log(stmt, uuid, msisdn, "", "DataBundlePurchaseError", null, msg);
////            return getUssdMessagePrefix(Boolean.TRUE, sessionId) + e.getMessage();
//        } catch(Exception e ) {
//            e.printStackTrace();
//            return e.getMessage();
////            DBAdapter.log(stmt, uuid, msisdn, "", "DataBundlePurchaseError", null, Messages.SYSTEM_ERROR);
////            return /*getUssdMessagePrefix(Boolean.TRUE, sessionId) + */ "An error occurred. Please try again.";
//        }
//    }
//
//    @Override
//    public List<BalanceDTO> getAccountBalances(String msisdn) {
//
//        try {
//
////            Date expiry = AccountTransferUtils.getExpiryDateByType(bundleType);
//
////            AddUserAcctByIndiPricePlanSubsReqDto request = new AddUserAcctByIndiPricePlanSubsReqDto();
////            request.setBundleType(bundleType);
////            request.setEffDate(new Date());
////            request.setExpDate(expiry);
////            request.setMSISDN(msisdn); //263733474747       :String
////            request.setPricePlanID("166");
//
//            QueryAcctBalReqDto request = new QueryAcctBalReqDto();
//            request.setMSISDN(msisdn);
//            QueryAcctBalRetDto result = postpaidService.queryAcctBal(request);
//            List<BalanceDTO> balances = new ArrayList<BalanceDTO>();
//            for ( BalDto bal : result.getBalDtoList() ){
//
//                //String walletId, String walletDescription, String balance, String
//                if ( "USD".equalsIgnoreCase(bal.getAcctResName())) {
//                    Date expDate = (bal.getExpDate() != null ? bal.getExpDate() : new DateTime().plus(30).toDate());
//                    String bal2 = bal.getBalance();
//                    String balance = "$0.00";
//                    if (bal2 != null) {
//                        balance = "$" + new DecimalFormat("###,####.##").format(new BigDecimal(bal2).divide(new BigDecimal("10000"), 2, RoundingMode.HALF_UP).doubleValue());
//                    }
//                    balances.add(new BalanceDTO("Core", "Main account ", balance,
//                            String.format("%1$tY-%1$tm-%1$td", expDate )
//                    ));
//
//                    System.out.println("getAcctResID : " + bal.getAcctResID());
//                    System.out.println( "getBalType : " +  bal.getBalType() );
//                    System.out.println( "getAcctResName : " +  bal.getAcctResName() );
//                    System.out.println( "getBalance : " +  bal.getBalance() );
//                    System.out.println( "getExpDate : " +  bal.getExpDate() );
//                    System.out.println( "getBalID : " + bal.getBalID() );
//                    break;
//                }
//            }
//
//            QueryAcmBalReqDto bal = new QueryAcmBalReqDto();
//            bal.setMSISDN(msisdn);
//            String plan = "166";
//            bal.setPricePlanID(plan);
//            QueryAcmBalRetDto balResponse = null;
//            try {
//                balResponse = postpaidService.queryAcmBal(bal);
//
//                Double balanceMb = ( Double.parseDouble(balResponse.getBalance()) / 1048576.00 );
//                String dataBalance = "0.00 MB";
//                if (balanceMb != null) {
//                    dataBalance = new DecimalFormat("###,###.##").format(balanceMb) + " MB";
//                }
//                String expiryDate = balResponse.getExpDate();
//
////            DBAdapter.log(stmt, uuid, msisdn, "", "balanceEnquiry", null, "V=" + voiceBalance + "|D=" + dataBalance );
//
////            if (dataBalance == null){
////                dataBalance = BigDecimal.ZERO;
////            } else {
////                expiryDate = getExpiryDate(balances.get(dataBalanceName).getExpiryDate());
////            }
//
////                result = "Your GPRS bal= " + balanceMb + "mb exp on " + expiryDate;
//
////                Date expDate = (expiryDate != null ? expiryDate : new DateTime().plus(30).toDate());
//                log.debug("{ balance : msisdn : " + msisdn + ", payload : " + result + "}");
//
//                if (expiryDate != null) {
//                    expiryDate = expiryDate.substring(0,11);
//                } else {
//                    expiryDate = String.format("%1$td/%1$tm/%1$tY", new DateTime().plus(30).toDate());
//                }
//                balances.add(new BalanceDTO("Data", "Internet browsing wallet ", dataBalance,
//                        expiryDate
//                ));
//
//            } catch (RemoteException e) {
//                String errorMessage = e.getMessage();
//                if ( (errorMessage != null) && (errorMessage.trim().toLowerCase().startsWith("errorcode")) ) {
//                    errorMessage = errorMessage.split("=")[2].trim().substring(1);
//                    errorMessage = errorMessage.substring(0, errorMessage.length() - 1);
//                }
//                log.info("{txnType : bundle-purchase, msisdn : " + msisdn + ", error-message : " + errorMessage + "}");
//            }
//            return balances;
//        } catch(Exception e ) {
//            e.printStackTrace();
//            errorMessage = e.getMessage();
//            return null;
//        }
//    }
//
//    @Override
//    public List<MTSM> transfer(PduDto pdu, String beneficiaryMsisdn, BigDecimal airtimeTransferAmount) {
//        return null;
//    }
//
//    @Override
//    public List<MTSM> voucherRecharge(PduDto pdu, String beneficiaryMsisdn, String rechargeVoucher) {
//        return null;
//    }
//
//    @Override
//    public void setTxnDao(TxnDAO txnDao) {
//       this.txnDao = txnDao;
//    }
//
//    @Override
//    public TxnDAO getTxnDao() {
//        return txnDao;
//    }
//
//    public void setRequestDao(CreditAccountRequestDao requestDao) {
//    }
//
//    public void setResponseDao(CreditAccountResponseDao responseDao) {
//    }
//}
