package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.dialog.MAPRefuseReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import org.apache.log4j.Logger;

public class DialogRejectProcessor
{

    private static Logger log = Logger.getLogger("DialogRejectProcessor.class");

    public static void process(
            MAPDialog mapDialog,
            MAPRefuseReason refuseReason,
            ApplicationContextName alternativeApplicationContext,
            MAPExtensionContainer extensionContainer)
    {

        log.error(
                String.format(
                        "onDialogReject for " +
                                "DialogId=%d MAPRefuseReason=%s ApplicationContextName=%s MAPExtensionContainer=%s",
                        mapDialog.getLocalDialogId(), refuseReason, alternativeApplicationContext,
                        extensionContainer));
    }
}
