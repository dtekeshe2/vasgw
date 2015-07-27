package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.tcap.api.asn.comp.Problem;
import org.apache.log4j.Logger;

public class RejectComponentProcessor
{

    private static Logger log = Logger.getLogger("");

    public static void process(MAPDialog mapDialog, Long invokeId, Problem problem, boolean isLocalOriginated)
    {
        log.debug("Component reject. map id : " + mapDialog.getLocalDialogId());
    }
}
