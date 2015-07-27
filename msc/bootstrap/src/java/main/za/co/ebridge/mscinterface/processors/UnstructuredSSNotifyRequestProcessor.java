package za.co.ebridge.mscinterface.processors;


import za.co.ebridge.map.api.service.supplementary.UnstructuredSSNotifyRequest;
import org.apache.log4j.Logger;

/**
 * @author david@tekeshe.com
 *
 */
public class UnstructuredSSNotifyRequestProcessor {

    private static Logger log = Logger.getLogger("UnstructuredSSNotifyRequestProcessor.class");

    public static void process(UnstructuredSSNotifyRequest unstructuredSSNotifyRequest) {

        // This error condition. Client should never receive the
        // UnstructuredSSNotifyRequestIndication
        log.error(
                String.format(
                        "onUnstructuredSSNotifyRequest for Dialog=%d and invokeId=%d",
                        unstructuredSSNotifyRequest.getMAPDialog().getLocalDialogId(),
                        unstructuredSSNotifyRequest.getInvokeId()));
    }
}
