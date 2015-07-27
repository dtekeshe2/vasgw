package za.co.ebridge.tcap.api.api;

import java.io.Serializable;

import za.co.ebridge.sccp.api.parameter.SccpAddress;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;

public interface TCAPProvider
        extends Serializable
{

    /**
     * Create new structured dialog.
     *
     * @param localAddress  - desired local address
     * @param remoteAddress - initial remote address, it can change after first TCContinue.
     * @return
     */
    Dialog getNewDialog(SccpAddress localAddress, SccpAddress remoteAddress)
            throws
            TCAPException;

    /**
     * Create new structured dialog with predefined local TransactionId.
     * We do not normally invoke this method. Use it only when you need this and only this local TransactionId
     * (for example if we need of recreating a Dialog for which a peer already has in memory)
     * If a Dialog with local TransactionId is already present there will be TCAPException
     *
     * @param localAddress  - desired local address
     * @param remoteAddress - initial remote address, it can change after first TCContinue.
     * @param localTrId     - predefined local TransactionId
     * @return
     */
    Dialog getNewDialog(SccpAddress localAddress, SccpAddress remoteAddress, Integer ssn, Long localTrId)
            throws
            TCAPException;

    /**
     * Create new unstructured dialog.
     *
     * @param localAddress
     * @param remoteAddress
     * @return
     * @throws TCAPException
     */
    Dialog getNewUnstructuredDialog(SccpAddress localAddress, SccpAddress remoteAddress, Integer ssn)
            throws
            TCAPException;

    // /////////////
    // Factories //
    // /////////////

    DialogPrimitiveFactory getDialogPrimitiveFactory();

    ComponentPrimitiveFactory getComponentPrimitiveFactory();

    // /////////////
    // Listeners //
    // /////////////

    void addTCListener(TCListener lst);

    void removeTCListener(TCListener lst);

    boolean getPreviewMode();
}
