package za.co.ebridge.mscinterface.processors;


import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSResponse;
import org.apache.log4j.Logger;

/**
 * @author david@tekeshe.com
 *
 */
public class ProcessUnstructuredSSResponseProcessor {

    private static Logger log = Logger.getLogger("ProcessUnstructuredSSResponseProcessor.class");

    public static void process(ProcessUnstructuredSSResponse processUnstructuredSSResponse) {

        // Server shouldn't be getting ProcessUnstructuredSSResponseIndication
        log.error(
                String.format(
                        "onProcessUnstructuredSSResponseIndication for Dialog=%d and invokeId=%d",
                        processUnstructuredSSResponse.getMAPDialog().getLocalDialogId(),
                        processUnstructuredSSResponse.getInvokeId()));
    }
}
