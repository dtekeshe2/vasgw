package za.co.ebridge.mscinterface.processors;

//import com.ebridge.billingplatform.inject.BillingPlatformInterfaceModule;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPMessage;
import za.co.ebridge.map.api.MAPProvider;
import za.co.ebridge.map.api.errors.MAPErrorMessage;
import za.co.ebridge.map.api.service.supplementary.*;

import za.co.ebridge.tcap.api.asn.comp.Problem;
//import com.ebridgevas.servicemenutree.menu.ServiceMenuTree;
//import com.ebridgevas.servicemenutree.menu.impl.DatabaseBackedServiceMenuTree;
import za.co.ebridge.mscinterface.processors.*;
//import com.google.inject.Guice;
//import com.google.inject.Injector;

public class MAPServiceSupplementaryProcessor
        implements MAPServiceSupplementaryListener
{

    private MAPProvider mapProvider;

//    private ServiceMenuTree serviceMenuTree;

    public MAPServiceSupplementaryProcessor(MAPProvider mapProvider)
    {

        this.mapProvider = mapProvider;
//        Injector injector = Guice.createInjector(new BillingPlatformInterfaceModule());

//        serviceMenuTree = new DatabaseBackedServiceMenuTree();
    }

    @Override
    public void onProcessUnstructuredSSRequest(ProcessUnstructuredSSRequest processUnstructuredSSRequest)
    {

        ProcessUnstructuredSSRequestProcessor.process(
                processUnstructuredSSRequest, mapProvider/*, serviceMenuTree */);
    }

    @Override
    public void onMAPMessage(MAPMessage mapMessage)
    {

        MAPMessageProcessor.process(mapMessage);
    }

    @Override
    public void onProcessUnstructuredSSResponse(ProcessUnstructuredSSResponse processUnstructuredSSResponse)
    {

        ProcessUnstructuredSSResponseProcessor.process(processUnstructuredSSResponse);
    }

    @Override
    public void onUnstructuredSSRequest(UnstructuredSSRequest unstructuredSSRequest)
    {

        UnstructuredSSRequestProcessor.process(unstructuredSSRequest);
    }

    @Override
    public void onUnstructuredSSNotifyRequest(UnstructuredSSNotifyRequest unstructuredSSNotifyRequest)
    {

        UnstructuredSSNotifyRequestProcessor.process(unstructuredSSNotifyRequest);
    }

    @Override
    public void onUnstructuredSSNotifyResponse(UnstructuredSSNotifyResponse unstructuredSSNotifyResponse)
    {

        UnstructuredSSNotifyResponseProcessor.process(unstructuredSSNotifyResponse);
    }

    @Override
    public void onUnstructuredSSResponse(UnstructuredSSResponse unstructuredSSResponse)
    {

        UnstructuredSSResponseProcessor.process(unstructuredSSResponse, mapProvider);
    }

    @Override
    public void onRejectComponent(MAPDialog mapDialog, Long invokeId, Problem problem, boolean isLocalOriginated)
    {
        RejectComponentProcessor.process(mapDialog, invokeId, problem, isLocalOriginated);
    }

    @Override
    public void onInvokeTimeout(MAPDialog mapDialog, Long invokeId)
    {
        InvokeTimeoutProcessor.process(mapDialog, invokeId);
    }

    @Override
    public void onErrorComponent(MAPDialog mapDialog, Long invokeId, MAPErrorMessage mapErrorMessage)
    {
        ErrorComponentProcessor.process(mapDialog, invokeId, mapErrorMessage);
    }
}
