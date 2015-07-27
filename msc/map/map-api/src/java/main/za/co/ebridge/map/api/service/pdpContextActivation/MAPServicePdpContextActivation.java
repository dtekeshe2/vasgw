package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPServiceBase;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface MAPServicePdpContextActivation
        extends MAPServiceBase
{

    MAPDialogPdpContextActivation createNewDialog(
            MAPApplicationContext appCntx,
            SccpAddress origAddress,
            AddressString origReference,
            SccpAddress destAddress,
            AddressString destReference,
            Integer ssn,
            Long localTrId)
            throws
            MAPException;

    MAPDialogPdpContextActivation createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress,
            AddressString origReference, SccpAddress destAddress, AddressString destReference, Integer ssn)
            throws
            MAPException;

    void addMAPServiceListener(MAPServicePdpContextActivationListener mapServiceListener);

    void removeMAPServiceListener(MAPServicePdpContextActivationListener mapServiceListener);

}
