/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 RESULT accessSignalInfo ExternalSignalInfo
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface PerformSubsequentHandoverResponse extends MobilityMessage {

    ExternalSignalInfo getAccessSignalInfo();

}
