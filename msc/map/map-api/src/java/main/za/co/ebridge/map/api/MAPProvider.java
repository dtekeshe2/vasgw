package za.co.ebridge.map.api;

import java.io.Serializable;

import za.co.ebridge.map.api.errors.MAPErrorMessageFactory;
import za.co.ebridge.map.api.service.callhandling.MAPServiceCallHandling;
import za.co.ebridge.map.api.service.lsm.MAPServiceLsm;
import za.co.ebridge.map.api.service.mobility.MAPServiceMobility;
import za.co.ebridge.map.api.service.oam.MAPServiceOam;
import za.co.ebridge.map.api.service.pdpContextActivation.MAPServicePdpContextActivation;
import za.co.ebridge.map.api.service.sms.MAPServiceSms;
import za.co.ebridge.map.api.service.supplementary.MAPServiceSupplementary;
import za.co.ebridge.tcap.api.api.TCAPProvider;

public interface MAPProvider
        extends Serializable
{

    // int NETWORK_UNSTRUCTURED_SS_CONTEXT_V2 = 1;

    /**
     * Add MAP Dialog listener to the Stack
     *
     * @param mapDialogListener
     */
    void addMAPDialogListener(MAPDialogListener mapDialogListener);

    /**
     * Remove MAP DIalog Listener from the stack
     *
     * @param mapDialogListener
     */
    void removeMAPDialogListener(MAPDialogListener mapDialogListener);

    /**
     * Get the {@link MAPParameterFactory}
     *
     * @return
     */
    MAPParameterFactory getMAPParameterFactory();

    /**
     * Get the {@link MAPErrorMessageFactory}
     *
     * @return
     */
    MAPErrorMessageFactory getMAPErrorMessageFactory();

    /**
     * Get {@link MAPDialog} corresponding to passed dialogId
     *
     * @param dialogId
     * @return
     */
    MAPDialog getMAPDialog(Long dialogId);

    /**
     * @return
     */
    MAPSmsTpduParameterFactory getMAPSmsTpduParameterFactory();

    MAPServiceMobility getMAPServiceMobility();

    MAPServiceCallHandling getMAPServiceCallHandling();

    MAPServiceOam getMAPServiceOam();

    MAPServicePdpContextActivation getMAPServicePdpContextActivation();

    MAPServiceSupplementary getMAPServiceSupplementary();

    MAPServiceSms getMAPServiceSms();

    MAPServiceLsm getMAPServiceLsm();

}
