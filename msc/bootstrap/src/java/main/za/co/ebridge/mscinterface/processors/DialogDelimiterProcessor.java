package za.co.ebridge.mscinterface.processors;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPDialog;

public class DialogDelimiterProcessor
{

    private static Logger log = Logger.getLogger("DialogDelimiterProcessor.class");

    public static void process(MAPDialog mapDialog)
    {
        log.debug(String.format("onDialogDelimiter for DialogId=%d", mapDialog.getLocalDialogId()));
    }
}
