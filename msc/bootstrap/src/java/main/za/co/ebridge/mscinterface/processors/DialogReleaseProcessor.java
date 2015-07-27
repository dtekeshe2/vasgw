package za.co.ebridge.mscinterface.processors;

import org.apache.log4j.Logger;
import za.co.ebridge.map.api.MAPDialog;

public class DialogReleaseProcessor
{

    private static Logger log = Logger.getLogger("DialogReleaseProcessor.class");

    public static void process(MAPDialog mapDialog)
    {

        log.debug(String.format("onDialogResease for DialogId=%d", mapDialog.getLocalDialogId()));
    }
}
