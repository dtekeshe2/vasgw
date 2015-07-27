package za.co.ebridge.mscinterface.processors;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPMessage;
import za.co.ebridge.map.api.MAPMessageType;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.MAPDialogSupplementary;
import za.co.ebridge.map.api.service.supplementary.ProcessUnstructuredSSRequest;
import za.co.ebridge.map.api.service.supplementary.UnstructuredSSResponse;
import za.co.ebridge.map.impl.primitives.USSDStringImpl;
import za.co.ebridge.map.impl.service.supplementary.ProcessUnstructuredSSResponseImpl;
import za.co.ebridge.map.impl.service.supplementary.UnstructuredSSResponseImpl;
import za.co.ebridge.tcap.api.asn.InvokeImpl;
import za.co.ebridge.tcap.api.asn.ReturnResultImpl;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import org.apache.log4j.Logger;
import za.co.ebridge.tcap.api.asn.comp.ReturnResult;

public class MAPMessageProcessor
{

    private static Logger log = Logger.getLogger("MAPMessageProcessor.class");

    public static void process(MAPMessage mapMessage)
    {

//        long invokeId = mapMessage.getInvokeId();
        MAPDialog mapDialog = mapMessage.getMAPDialog();
        mapDialog.getLocalDialogId();
        mapDialog.getApplicationContext().getApplicationContextName();
        mapDialog.getLocalAddress().getGlobalTitle();
        mapDialog.getLocalAddress().getSignalingPointCode();

        MAPMessageType messageType = mapMessage.getMessageType();
        messageType.toString();
//        int operationCode = mapMessage.getOperationCode();


        try
        {

            USSDString ussdStr = null;
            byte[] data = null;

            log.info("message type : " + mapMessage.getMessageType());

            switch (mapMessage.getMessageType())
            {
                case processUnstructuredSSRequest_Request:
                    ProcessUnstructuredSSRequest processUnstructuredSSRequest = (ProcessUnstructuredSSRequest)
                            mapMessage;
                    CBSDataCodingScheme cbsDataCodingScheme = processUnstructuredSSRequest.getDataCodingScheme();

                    log.info("Received ProcessUnstructuredSSRequestIndication USSD String="
                            + processUnstructuredSSRequest.getUSSDString().getString(null));
                    log.debug("application Context : " +
                            processUnstructuredSSRequest
                                    .getMAPDialog()
                                    .getApplicationContext()
                                    .getApplicationContextName()
                                    .getApplicationContextCode());
//                        session.setAttribute("ProcessUnstructuredSSRequest_InvokeId",
//                                processUnstructuredSSRequest.getInvokeId());

                    long invokeId = processUnstructuredSSRequest.getInvokeId();
                    ussdStr =
                            new USSDStringImpl(
                                    "Telecel VAS Service:\n 1. Balance\n 2. Data Bundle", cbsDataCodingScheme, null);
//                    UnstructuredSSRequest unstructuredSSRequestIndication
//                            = new UnstructuredSSRequestImpl( cbsDataCodingScheme, ussdStr, null, null);

                    MAPDialogSupplementary dialog = processUnstructuredSSRequest.getMAPDialog(); //
                    // .addProcessUnstructuredSSResponse(invokeId,cbsDataCodingScheme,ussdStr);
//                    Dialog copy = new Dialog(DialogType.CONTINUE, original.getId(), null, null,
// unstructuredSSRequestIndication);
                    ISDNAddressString msisdn = null;
                    dialog.addUnstructuredSSRequest(cbsDataCodingScheme, ussdStr, null, msisdn);

//                    data = factory.serialize(copy);

//                    response.getOutputStream().write(data);
//                    response.flushBuffer();

//                    Invoke invoke = new InvokeImpl();
//                    invoke.setInvokeId(invokeId);
//                    dialog.sendInvokeComponent(invoke);

                    ReturnResult resultComponent = new ReturnResultImpl();
                    resultComponent.setInvokeId(invokeId);
                    dialog.sendReturnResultComponent(resultComponent);

                    int operationCode = processUnstructuredSSRequest.getOperationCode();
                    log.debug("operationCode : " + operationCode);
                    break;
//                        default:
//                            // This is error. If its begin it should be only Process
//                            // Unstructured SS Request
//                            logger.error("Received Dialog BEGIN but message is not
// ProcessUnstructuredSSRequestIndication. Message="
//                                    + mapMessage);
//                            break;
//                    }

                case unstructuredSSRequest_Response:
                    UnstructuredSSResponse unstructuredSSResponse = (UnstructuredSSResponseImpl) mapMessage;
                    cbsDataCodingScheme = unstructuredSSResponse.getDataCodingScheme();
//                    invokeId = (Long) session.getAttribute("ProcessUnstructuredSSRequest_InvokeId");
                    invokeId = unstructuredSSResponse.getInvokeId();
                    log.info("Received UnstructuredSSResponse USSD String="
                            + unstructuredSSResponse.getUSSDString().getString(null)
                            + " invokeId=" + invokeId);

                    ussdStr = new USSDStringImpl("Thank You!", cbsDataCodingScheme, null);
                    ProcessUnstructuredSSResponseImpl processUnstructuredSSResponseIndication = new
                            ProcessUnstructuredSSResponseImpl(
                            cbsDataCodingScheme, ussdStr);
                    processUnstructuredSSResponseIndication.setInvokeId(invokeId);

//                    Dialog copy1 = new Dialog(DialogType.END, original.getId(),
// processUnstructuredSSResponseIndication);
//
//                    data = factory.serialize(copy1);
//
//                    response.getOutputStream().write(data);
//                    response.response();

//                    try {
//
//                    } catch (Exception e) {
//                        session.invalidate();
//                        logger.error("Error while invalidating HttpSession=" + session.getId());
//                    }
                    break;
//                        default:
//                            // This is error. If its begin it should be only Process
//                            // Unstructured SS Request
//                            logger.error("Received Dialog CONTINUE but message is not
// UnstructuredSSResponseIndication. Message="
//                                    + mapMessage);
//                            break;
            }

//                    break;

//            }

        }
        catch (MAPException e)
        {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }

        log.info("process()");
    }
}
