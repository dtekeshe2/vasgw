package za.co.ebridge.mscinterface.processors;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPDialog;

public class DialogCloseProcessor
{

    private static Logger log = Logger.getLogger("DialogCloseProcessor.class");

    public static void process(MAPDialog mapDialog)
    {
        log.debug(String.format("onDialogClose for Dialog=%d", mapDialog.getLocalDialogId()));
    }
}
