package za.co.ebridge.mscinterface.processors;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPDialog;

public class InvokeTimeoutProcessor
{

    private static Logger log = Logger.getLogger("InvokeTimeoutProcessor.class");

    public static void process(MAPDialog mapDialog, Long invokeId)
    {

        log.error(
                String.format(
                        "onInvokeTimeout for Dialog=%d and invokeId=%d", mapDialog.getLocalDialogId(), invokeId));
    }
}
