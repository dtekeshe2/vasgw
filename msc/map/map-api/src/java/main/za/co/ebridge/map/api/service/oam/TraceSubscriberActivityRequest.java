/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.map.api.primitives.AddressString;
import za.co.ebridge.map.api.primitives.IMSI;

/**
 *
 MAP V1: TraceSubscriberActivity ::= OPERATION--Timer s ARGUMENT traceSubscriberActivityArg TraceSubscriberActivityArg
 *
 * TraceSubscriberActivityArg ::= SEQUENCE { imsi [0] IMSI OPTIONAL, traceReference [1] TraceReference, traceType [2] TraceType,
 * omc-Id [3] AddressString OPTIONAL, callReference [4] CallReference OPTIONAL}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface TraceSubscriberActivityRequest extends OamMessage {

    IMSI getImsi();

    TraceReference getTraceReference();

    TraceType getTraceType();

    AddressString getOmcId();

    CallReference getCallReference();

}
