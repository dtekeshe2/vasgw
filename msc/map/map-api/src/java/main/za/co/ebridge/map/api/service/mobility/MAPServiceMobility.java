/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility;

import za.co.ebridge.map.api.MAPApplicationContext;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPServiceBase;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

/**
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPServiceMobility extends MAPServiceBase {

    MAPDialogMobility createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress, AddressString origReference, SccpAddress destAddress,
            AddressString destReference, Integer ssn, Long localTrId) throws MAPException;

    MAPDialogMobility createNewDialog(MAPApplicationContext appCntx, SccpAddress origAddress,
            AddressString origReference, SccpAddress destAddress, AddressString destReference, Integer ssn) throws MAPException;

    void addMAPServiceListener(MAPServiceMobilityListener mapServiceListener);

    void removeMAPServiceListener(MAPServiceMobilityListener mapServiceListener);

}
