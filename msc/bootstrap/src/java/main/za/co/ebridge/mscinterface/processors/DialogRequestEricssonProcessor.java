package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.IMSI;
import org.apache.log4j.Logger;

public class DialogRequestEricssonProcessor
{

    private static Logger log = Logger.getLogger("DialogRequestEricssonProcessor.class");

    public static void process(
            MAPDialog mapDialog,
            AddressString destinationReference,
            AddressString originatingReference,
            IMSI imsi,
            AddressString vlr)
    {

        log.debug(
                String.format(
                        "onDialogRequestEricsson for " +
                                "DialogId=%d DestinationReference=%s OriginReference=%s ",
                        mapDialog.getLocalDialogId(),
                        destinationReference,
                        originatingReference));
    }
}
