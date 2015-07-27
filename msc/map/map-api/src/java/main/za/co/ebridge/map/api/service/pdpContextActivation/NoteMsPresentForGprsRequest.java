/* eBridge SS7 */

package za.co.ebridge.map.api.service.pdpContextActivation;

import za.co.ebridge.map.api.primitives.GSNAddress;
import za.co.ebridge.map.api.primitives.IMSI;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 MAP V3:
 *
 * noteMsPresentForGprs OPERATION ::= { --Timer m ARGUMENT NoteMsPresentForGprsArg RESULT NoteMsPresentForGprsRes -- optional
 * ERRORS { systemFailure | dataMissing | unexpectedDataValue | unknownSubscriber} CODE local:26 }
 *
 * NoteMsPresentForGprsArg ::= SEQUENCE { imsi [0] IMSI, sgsn-Address [1] GSN-Address, ggsn-Address [2] GSN-Address OPTIONAL,
 * extensionContainer [3] ExtensionContainer OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface NoteMsPresentForGprsRequest extends PdpContextActivationMessage {

    IMSI getImsi();

    GSNAddress getSgsnAddress();

    GSNAddress getGgsnAddress();

    MAPExtensionContainer getExtensionContainer();

}
