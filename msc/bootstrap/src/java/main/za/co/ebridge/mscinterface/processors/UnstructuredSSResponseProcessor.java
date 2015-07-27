package za.co.ebridge.mscinterface.processors;

import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.ussd.menu.USSDServer;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPProvider;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.AddressNature;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.NumberingPlan;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.MAPDialogSupplementary;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSResponse;
import org.apache.log4j.Logger;
import za.co.ebridge.map.impl.CBSDataCodingSchemeImpl;
import za.co.ebridge.map.impl.GSMCharset;

import java.nio.charset.Charset;

public class UnstructuredSSResponseProcessor
{

    private static Logger log = Logger.getLogger("UnstructuredSSResponseProcessor.class");

    public static void process(UnstructuredSSResponse unstructuredSSResponse, MAPProvider mapProvider)
    {

        /*
         * TODO Save state in dialogs map
         * TODO Send request to Billing Platform using SCTP / SCCP / MAP
         * TODO Retrieve state from dialogs and forward response to device
         */
        log(unstructuredSSResponse);

        try
        {
            Long localDialogId = unstructuredSSResponse.getMAPDialog().getLocalDialogId();

            Charset gsm8Charset = GSMCharset.defaultCharset();
            String payload = unstructuredSSResponse.getUSSDString().getString(gsm8Charset);

            log.debug("####################### USSDServer.process( " +
                    "mobileNumber : null"  + ", localDialogId : " + localDialogId
                    + "payload : " + payload + " )");

            Authorisation response = USSDServer.process(null, localDialogId, payload);

            log.debug("####################### RESPONSE " + response);
            String ussdResponseString = response.getNarrative1();
            log.debug("####################### ussdResponseString " + ussdResponseString);

            USSDString ussdString =
                    mapProvider.getMAPParameterFactory()
                            .createUSSDString(ussdResponseString);

            CBSDataCodingScheme ussdDataCodingScheme = new CBSDataCodingSchemeImpl((byte) 0x0F);
            MAPDialogSupplementary dialog = unstructuredSSResponse.getMAPDialog();

            dialog
                .addProcessUnstructuredSSResponse(
                        ((Long) dialog.getUserObject()).longValue(), ussdDataCodingScheme, ussdString);

            dialog.close(false);

        }
        catch (MAPException e)
        {
            log.error("Error while sending UnstructuredSSRequest ", e);
        }
    }

    private static void log(UnstructuredSSResponse unstructuredSSResponse)
    {

        try
        {
            log.debug(
                    String.format(
                            "onUnstructuredSSResponseIndication for DialogId=%d Ussd String=%s",
                            unstructuredSSResponse.getMAPDialog().getLocalDialogId(),
                            unstructuredSSResponse.getUSSDString().getString(Charset.defaultCharset())));
        }
        catch (MAPException e)
        {
            e.printStackTrace();  // TODO implement exception handler
        }
    }
}
