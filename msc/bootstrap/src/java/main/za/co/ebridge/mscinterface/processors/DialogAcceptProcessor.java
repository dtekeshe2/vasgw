package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import org.apache.log4j.Logger;

public class DialogAcceptProcessor
{

    private static Logger log = Logger.getLogger("DialogAcceptProcessor.class");

    public static void process(MAPDialog mapDialog, MAPExtensionContainer extensionContainer)
    {
        log.debug(
                String.format(
                        "onDialogAccept for DialogId=%d MAPExtensionContainer=%s",
                        mapDialog.getLocalDialogId(),
                        extensionContainer));
    }
}
