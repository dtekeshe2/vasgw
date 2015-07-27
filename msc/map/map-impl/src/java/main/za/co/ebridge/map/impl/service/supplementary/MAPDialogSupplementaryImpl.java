/* eBridge SS7 */

package za.co.ebridge.map.impl.service.supplementary;

import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.map.impl.MAPDialogImpl;
import za.co.ebridge.map.impl.MAPProviderImpl;
import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPOperationCode;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.USSDString;
import za.co.ebridge.map.api.service.supplementary.MAPDialogSupplementary;
import za.co.ebridge.map.api.service.supplementary.MAPServiceSupplementary;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.Return;
import za.co.ebridge.tcap.api.asn.comp.ReturnResultLast;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class MAPDialogSupplementaryImpl extends MAPDialogImpl implements MAPDialogSupplementary {

    protected MAPDialogSupplementaryImpl(MAPApplicationContext appCntx, Dialog tcapDialog, MAPProviderImpl mapProviderImpl,
            MAPServiceSupplementary mapService, AddressString origReference, AddressString destReference) {
        super(appCntx, tcapDialog, mapProviderImpl, mapService, origReference, destReference);
    }

    public Long addProcessUnstructuredSSRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {
        return this.addProcessUnstructuredSSRequest(_Timer_Default, ussdDataCodingScheme, ussdString, alertingPatter, msisdn);
    }

    public Long addProcessUnstructuredSSRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(600000); // 10 minutes
        else
            invoke.setTimeout(customInvokeTimeout);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.processUnstructuredSS_Request);
        invoke.setOperationCode(oc);

        ProcessUnstructuredSSRequestImpl req = new ProcessUnstructuredSSRequestImpl(ussdDataCodingScheme, ussdString,
                alertingPatter, msisdn);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        invoke.setParameter(p);

        Long invokeId;
        try {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);

        return invokeId;

    }

    public void addProcessUnstructuredSSResponse(long invokeId, CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString)
            throws MAPException {
        Return returnResult = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCResultLastRequest();

        returnResult.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.processUnstructuredSS_Request);
        returnResult.setOperationCode(oc);

        ProcessUnstructuredSSResponseImpl req = new ProcessUnstructuredSSResponseImpl(ussdDataCodingScheme, ussdString);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        returnResult.setParameter(p);

        this.sendReturnResultLastComponent((ReturnResultLast) returnResult);
    }

    public Long addUnstructuredSSRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {
        return this.addUnstructuredSSRequest(_Timer_Default, ussdDataCodingScheme, ussdString, alertingPatter, msisdn);
    }

    public Long addUnstructuredSSRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_ml);
        else
            invoke.setTimeout(customInvokeTimeout);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.unstructuredSS_Request);
        invoke.setOperationCode(oc);

        UnstructuredSSRequestImpl req = new UnstructuredSSRequestImpl(ussdDataCodingScheme, ussdString, alertingPatter, msisdn);
        AsnOutputStream aos = new AsnOutputStream();
        req.encodeData(aos);

        Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
        p.setTagClass(req.getTagClass());
        p.setPrimitive(req.getIsPrimitive());
        p.setTag(req.getTag());
        p.setData(aos.toByteArray());
        invoke.setParameter(p);

        Long invokeId;
        try {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);

        return invokeId;
    }

    public Long addUnstructuredSSNotifyRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {
        return this.addUnstructuredSSNotifyRequest(_Timer_Default, ussdDataCodingScheme, ussdString, alertingPatter, msisdn);
    }

    public Long addUnstructuredSSNotifyRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException {

        Invoke invoke = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCInvokeRequest();
        if (customInvokeTimeout == _Timer_Default)
            invoke.setTimeout(_Timer_ml);
        else
            invoke.setTimeout(customInvokeTimeout);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.unstructuredSS_Notify);
        invoke.setOperationCode(oc);

        if (ussdString != null) {
            UnstructuredSSRequestImpl req = new UnstructuredSSRequestImpl(ussdDataCodingScheme, ussdString, alertingPatter, msisdn);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            invoke.setParameter(p);
        }

        Long invokeId;
        try {
            invokeId = this.tcapDialog.getNewInvokeId();
            invoke.setInvokeId(invokeId);
        } catch (TCAPException e) {
            throw new MAPException(e.getMessage(), e);
        }

        this.sendInvokeComponent(invoke);

        return invokeId;
    }

    public void addUnstructuredSSResponse(long invokeId, CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString)
            throws MAPException {

        Return returnResult = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createTCResultLastRequest();

        returnResult.setInvokeId(invokeId);

        // Operation Code
        OperationCode oc = TcapFactory.createOperationCode();
        oc.setLocalOperationCode((long) MAPOperationCode.unstructuredSS_Request);
        returnResult.setOperationCode(oc);

        if (ussdString != null) {
            UnstructuredSSResponseImpl req = new UnstructuredSSResponseImpl(ussdDataCodingScheme, ussdString);
            AsnOutputStream aos = new AsnOutputStream();
            req.encodeData(aos);

            Parameter p = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory().createParameter();
            p.setTagClass(req.getTagClass());
            p.setPrimitive(req.getIsPrimitive());
            p.setTag(req.getTag());
            p.setData(aos.toByteArray());
            returnResult.setParameter(p);
        }

        this.sendReturnResultLastComponent((ReturnResultLast) returnResult);
    }

    public void addUnstructuredSSNotifyResponse(long invokeId) throws MAPException {

        ReturnResultLast resultLast = this.mapProviderImpl.getTCAPProvider().getComponentPrimitiveFactory()
                .createTCResultLastRequest();

        resultLast.setInvokeId(invokeId);

        // we need not Operation Code because no answer

        this.sendReturnResultLastComponent(resultLast);
    }

}
