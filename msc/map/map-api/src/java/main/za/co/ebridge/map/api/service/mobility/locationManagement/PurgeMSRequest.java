/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.locationManagement;

import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
MAP V2-3:

MAP V3: purgeMS OPERATION ::= {
--Timer m
ARGUMENT PurgeMS-Arg RESULT
  PurgeMS-Res  -- optional
  ERRORS { dataMissing | unexpectedDataValue| unknownSubscriber}
CODE local:67 }

MAP V2: PurgeMS ::= OPERATION
--Timer m
ARGUMENT purgeMS-Arg PurgeMS-Arg
RESULT

MAP V3: PurgeMS-Arg ::= [3] SEQUENCE {
  imsi         IMSI,
  vlr-Number   [0] ISDN-AddressString OPTIONAL,
  sgsn-Number  [1] ISDN-AddressString OPTIONAL,
  extensionContainer ExtensionContainer OPTIONAL,
  ...
}

MAP V2: PurgeMS-Arg ::= SEQUENCE {
  imsi         IMSI,
  vlr-Number   ISDN-AddressString,
  ...
}

 *
 * @author david@tekeshe.com
 *
 */
public interface PurgeMSRequest extends MobilityMessage {

    IMSI getImsi();

    ISDNAddressString getVlrNumber();

    ISDNAddressString getSgsnNumber();

    MAPExtensionContainer getExtensionContainer();

}
