package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.dialog.MAPUserAbortChoice;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import org.apache.log4j.Logger;

public class DialogUserAbortProcessor
{

    private static Logger log = Logger.getLogger("DialogUserAbortProcessor.class");

    public static void process(
            MAPDialog mapDialog,
            MAPUserAbortChoice userReason,
            MAPExtensionContainer extensionContainer)
    {

        log.error(
                String.format(
                        "onDialogUserAbort for DialogId=%d MAPUserAbortChoice=%s MAPExtensionContainer=%s",
                        mapDialog.getLocalDialogId(), userReason, extensionContainer));
    }
}
