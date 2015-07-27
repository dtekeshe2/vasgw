package za.co.ebridge.mscinterface.processors;

import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.ussd.menu.USSDServer;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPProvider;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.GSMCharset;
import za.co.ebridge.sccp.api.indicator.NatureOfAddress;
import za.co.ebridge.sccp.api.indicator.RoutingIndicator;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.AddressNature;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.NumberingPlan;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.MAPDialogSupplementary;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSRequest;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

import org.apache.log4j.Logger;

import java.nio.charset.Charset;

public class ProcessUnstructuredSSRequestProcessor
{

    private static Logger log = Logger.getLogger("ProcessUnstructuredSSRequestProcessor.class");

    public static void process(
            ProcessUnstructuredSSRequest processUnstructuredSSRequest,
            MAPProvider mapProvider
                                /*ServiceMenuTree serviceMenuTree */)
    {

        log(processUnstructuredSSRequest);
        try
        {

            long invokeId = processUnstructuredSSRequest.getInvokeId();
            log.debug("current invoke id : " + invokeId);
//            ++invokeId;

//            String input = "901 33495 " + processUnstructuredSSRequest.getMSISDNAddressString().getAddress() + " 80";

//            USSDString ussdString =
//                    mapProvider.getMAPParameterFactory()
//                            .createUSSDString( serviceMenuTree.process( input ).getShortMessage() );
            String mobileNumber = processUnstructuredSSRequest.getMSISDNAddressString().getAddress();
            CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl((byte) 0x0F);

            Charset gsm8Charset = GSMCharset.defaultCharset();
            String payload = processUnstructuredSSRequest.getUSSDString().getString(gsm8Charset);
            Long localDialogId = processUnstructuredSSRequest.getMAPDialog().getLocalDialogId();

            log.debug("####################### USSDServer.process( " +
                    "mobileNumber : " + mobileNumber + ", localDialogId : " + localDialogId
                    + "payload : " + payload + " )");

            Authorisation response = USSDServer.process(mobileNumber, localDialogId, payload);

            log.debug("####################### RESPONSE " + response);
            String ussdResponseString = response.getNarrative1();
            log.debug("####################### ussdResponseString " + ussdResponseString);

            USSDString ussdString =
                    mapProvider.getMAPParameterFactory()
                            .createUSSDString(ussdResponseString);

            // byte ussdDataCodingScheme = (byte) 0x0F;
//            CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl((byte)0x0F);

            MAPDialogSupplementary dialog = processUnstructuredSSRequest.getMAPDialog();

            SccpAddress localAddress = dialog.getRemoteAddress();
            SccpAddress remoteAddress = dialog.getLocalAddress();
            dialog.setLocalAddress(localAddress);
            dialog.setRemoteAddress(remoteAddress);

            log.debug("new invoke id : " + invokeId);
            dialog.setUserObject(invokeId);

            ISDNAddressString msisdn =
                    mapProvider.getMAPParameterFactory()
                            .createISDNAddressString(
                                    AddressNature.international_number,
                                    NumberingPlan.ISDN,
                                    processUnstructuredSSRequest.getMSISDNAddressString().getAddress());

            dialog.addUnstructuredSSRequest(ussdDataCodingScheme, ussdString, null, msisdn);
            log.debug("---> { UnstructuredSSRequest : { ussdDataCodingScheme : " + ussdDataCodingScheme +
                    ", ussdString : " + ussdString + ", invokeId : " + invokeId + "} }");

            dialog.setLocalAddress(
                    new SccpAddress(
                            RoutingIndicator.ROUTING_BASED_ON_GLOBAL_TITLE,
                            1216,
                            GlobalTitle.getInstance(0,
                                    za.co.ebridge.sccp.api.indicator.NumberingPlan.ISDN_TELEPHONY,
                                    NatureOfAddress.INTERNATIONAL,
                                    "263730100066"),
                            5));

            dialog.setRemoteAddress(
                    new SccpAddress(
                            RoutingIndicator.ROUTING_BASED_ON_GLOBAL_TITLE,
                            9,
                            GlobalTitle.getInstance(0,
                                    za.co.ebridge.sccp.api.indicator.NumberingPlan.ISDN_TELEPHONY,
                                    NatureOfAddress.INTERNATIONAL,
                                    "263730100040"),
                            5));

            log.debug("Storing Dialog for later use ...");
            // TODO Check if an answer is expected before storing

            dialog.send();

        }
        catch (MAPException e)
        {
            log.error("Error while sending UnstructuredSSRequest ", e);
        }
    }

    private static void log(ProcessUnstructuredSSRequest processUnstructuredSSRequest)
    {
        try
        {
            log.debug(
                    String.format(
                            "<-- ProcessUnstructuredSSRequest for DialogId=%d. Ussd String=%s, msisdn=%s",
                            processUnstructuredSSRequest.getMAPDialog().getLocalDialogId(),
                            processUnstructuredSSRequest.getUSSDString().getString(Charset.defaultCharset()),
                            processUnstructuredSSRequest.getMSISDNAddressString().getAddress()));
        }
        catch (MAPException e)
        {
            e.printStackTrace(); // TODO implement exception handler
        }
    }
}
