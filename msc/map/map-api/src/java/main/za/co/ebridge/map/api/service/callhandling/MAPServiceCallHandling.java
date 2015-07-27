package za.co.ebridge.map.api.service.callhandling;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPServiceBase;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface MAPServiceCallHandling
        extends MAPServiceBase
{
    MAPDialogCallHandling createNewDialog(
            MAPApplicationContext appCntx,
            SccpAddress origAddress,
            AddressString origReference,
            SccpAddress destAddress,
            AddressString destReference,
            Integer ssn,
            Long localTrId)
            throws
            MAPException;

    MAPDialogCallHandling createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress,
            AddressString origReference, SccpAddress destAddress, AddressString destReference, Integer ssn)
            throws
            MAPException;

    void addMAPServiceListener(MAPServiceCallHandlingListener mapServiceListener);

    void removeMAPServiceListener(MAPServiceCallHandlingListener mapServiceListener);
}