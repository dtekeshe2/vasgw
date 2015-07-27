package za.co.ebridge.mscinterface.processors;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPDialog;

public class DialogTimeoutProcessor
{

    private static Logger log = Logger.getLogger("DialogTimeoutProcessor.class");

    public static void process(MAPDialog mapDialog)
    {

        log.error(String.format("onDialogTimeout for DialogId=%d", mapDialog.getLocalDialogId()));
    }
}
