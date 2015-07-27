package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.errors.MAPErrorMessage;
import org.apache.log4j.Logger;

public class ErrorComponentProcessor
{

    private static Logger log = Logger.getLogger("ErrorComponentProcessor.class");

    public static void process(MAPDialog mapDialog, Long invokeId, MAPErrorMessage mapErrorMessage)
    {
        log.error(
                String.format(
                        "onErrorComponent for Dialog=%d and invokeId=%d MAPErrorMessage=%s",
                        mapDialog.getLocalDialogId(),
                        invokeId,
                        mapErrorMessage));
    }
}
