package za.co.ebridge.map.impl;

import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

import za.co.ebridge.map.api.*;
import za.co.ebridge.map.api.errors.MAPErrorMessage;
import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.TCAPException;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import za.co.ebridge.tcap.api.asn.comp.Problem;

/**
 * This class must be the super class of all MAP services
 */
public abstract class MAPServiceBaseImpl
        implements MAPServiceBase
{
    protected Boolean _isActivated = false;
    // protected Set<MAPServiceListener> serviceListeners = new HashSet<MAPServiceListener>();
    protected List<MAPServiceListener> serviceListeners = new CopyOnWriteArrayList<MAPServiceListener>();
    protected MAPProviderImpl mapProviderImpl = null;

    protected MAPServiceBaseImpl(MAPProviderImpl mapProviderImpl)
    {
        this.mapProviderImpl = mapProviderImpl;
    }

    public MAPProvider getMAPProvider()
    {
        return this.mapProviderImpl;
    }

    /**
     * Creation a MAP Dialog implementation for the specific service
     *
     * @param appCntx
     * @param tcapDialog
     * @return
     */
    protected abstract MAPDialogImpl createNewDialogIncoming(MAPApplicationContext appCntx, Dialog tcapDialog);

    /**
     * Creating new outgoing TCAP Dialog. Used when creating a new outgoing MAP Dialog
     *
     * @param origAddress
     * @param destAddress
     * @return
     * @throws MAPException
     */
    protected Dialog createNewTCAPDialog(SccpAddress origAddress, SccpAddress destAddress, Integer ssn, Long localTrId)
            throws
            MAPException
    {
        try
        {
            return this.mapProviderImpl.getTCAPProvider().getNewDialog(origAddress, destAddress, ssn, localTrId);
        }
        catch (TCAPException e)
        {
            throw new MAPException(e.getMessage(), e);
        }
    }

    public abstract void processComponent(
            ComponentType compType, OperationCode oc, Parameter parameter, MAPDialog mapDialog,
            Long invokeId, Long linkedId, Invoke linkedInvoke)
            throws
            MAPParsingComponentException;

    /**
     * Adding MAP Dialog into MAPProviderImpl.dialogs Used when creating a new outgoing MAP Dialog
     *
     * @param dialog
     */
    protected void putMAPDialogIntoCollection(MAPDialogImpl dialog)
    {
        this.mapProviderImpl.addDialog((MAPDialogImpl) dialog);
    }

    protected void addMAPServiceListener(MAPServiceListener mapServiceListener)
    {
        this.serviceListeners.add(mapServiceListener);
    }

    protected void removeMAPServiceListener(MAPServiceListener mapServiceListener)
    {
        this.serviceListeners.remove(mapServiceListener);
    }

    /**
     * {@inheritDoc}
     */
    public MAPApplicationContext getMAPv1ApplicationContext(int operationCode, Invoke invoke)
    {
        return null;
    }

    /**
     * Returns a list of linked operations for operCode operation
     *
     * @param operCode
     * @return
     */
    public long[] getLinkedOperationList(long operCode)
    {
        return null;
    }

    /**
     * This method is invoked when MAPProviderImpl.onInvokeTimeOut() is invoked. An InvokeTimeOut may be a normal
     * situation for
     * the component class 2, 3, or 4. In this case checkInvokeTimeOut() should return true and deliver to the
     * MAP-user correct
     * indication
     *
     * @param dialog
     * @param invoke
     * @return
     */
    public boolean checkInvokeTimeOut(MAPDialog dialog, Invoke invoke)
    {
        return false;
    }

    /**
     * {@inheritDoc}
     */
    public boolean isActivated()
    {
        return this._isActivated;
    }

    /**
     * {@inheritDoc}
     */
    public void acivate()
    {
        this._isActivated = true;
    }

    /**
     * {@inheritDoc}
     */
    public void deactivate()
    {
        this._isActivated = false;

        // TODO: abort all active dialogs ?
    }

    protected void deliverErrorComponent(MAPDialog mapDialog, Long invokeId, MAPErrorMessage mapErrorMessage)
    {
        for (MAPServiceListener serLis : this.serviceListeners)
        {
            serLis.onErrorComponent(mapDialog, invokeId, mapErrorMessage);
        }
    }

    protected void deliverRejectComponent(
            MAPDialog mapDialog,
            Long invokeId,
            Problem problem,
            boolean isLocalOriginated)
    {
        for (MAPServiceListener serLis : this.serviceListeners)
        {
            serLis.onRejectComponent(mapDialog, invokeId, problem, isLocalOriginated);
        }
    }

    // protected void deliverProviderErrorComponent(MAPDialog mapDialog, Long invokeId, MAPProviderError
    // providerError) {
    // for (MAPServiceListener serLis : this.serviceListeners) {
    // serLis.onProviderErrorComponent(mapDialog, invokeId, providerError);
    // }
    // }

    protected void deliverInvokeTimeout(MAPDialog mapDialog, Invoke invoke)
    {
        for (MAPServiceListener serLis : this.serviceListeners)
        {
            serLis.onInvokeTimeout(mapDialog, invoke.getInvokeId());
        }
    }

}
