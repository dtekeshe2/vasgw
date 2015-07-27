package za.co.ebridge.mscinterface.processors;


import za.co.ebridge.map.api.service.supplementary.UnstructuredSSRequest;
import org.apache.log4j.Logger;

/**
 * @author david@tekeshe.com
 *
 */
public class UnstructuredSSRequestProcessor {

    private static Logger log = Logger.getLogger("UnstructuredSSRequestProcessor.class");

    public static void process(UnstructuredSSRequest unstructuredSSRequest) {

        // Server shouldn't be getting UnstructuredSSRequestIndication
        log.error(
                String.format(
                        "onUnstructuredSSRequestIndication for Dialog=%d and invokeId=%d",
                        unstructuredSSRequest.getMAPDialog().getLocalDialogId(),
                        unstructuredSSRequest.getInvokeId()));
    }
}
