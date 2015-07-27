package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.dialog.MAPAbortProviderReason;
import za.co.ebridge.map.api.dialog.MAPAbortSource;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import org.apache.log4j.Logger;

public class DialogProviderAbortProcessor
{

    private static Logger log = Logger.getLogger("DialogProviderAbortProcessor.class");

    public static void process(
            MAPDialog mapDialog,
            MAPAbortProviderReason abortProviderReason,
            MAPAbortSource abortSource,
            MAPExtensionContainer extensionContainer)
    {

        log.error(
                String.format(
                        "onDialogProviderAbort for " +
                                "DialogId=%d MAPAbortProviderReason=%s MAPAbortSource=%s MAPExtensionContainer=%s",
                        mapDialog.getLocalDialogId(), abortProviderReason, abortSource, extensionContainer));
    }
}
