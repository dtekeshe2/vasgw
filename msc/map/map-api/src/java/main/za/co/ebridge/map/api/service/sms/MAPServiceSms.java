package za.co.ebridge.map.api.service.sms;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPServiceBase;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface MAPServiceSms
        extends MAPServiceBase
{

    MAPDialogSms createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn, Long localTrId)
            throws
            MAPException;

    MAPDialogSms createNewDialog(
            MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference,
            SccpAddress destAddress, AddressString destReference, Integer ssn)
            throws
            MAPException;

    void addMAPServiceListener(MAPServiceSmsListener mapServiceListener);

    void removeMAPServiceListener(MAPServiceSmsListener mapServiceListener);

}
