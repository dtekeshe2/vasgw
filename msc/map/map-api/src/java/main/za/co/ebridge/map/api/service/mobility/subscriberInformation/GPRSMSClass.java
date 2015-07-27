/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberInformation;

import java.io.Serializable;

/**
 * GPRSMSClass ::= SEQUENCE { mSNetworkCapability [0] MSNetworkCapability, mSRadioAccessCapability [1] MSRadioAccessCapability
 * OPTIONAL }
 *
 * @author amit bhayani
 *
 */
public interface GPRSMSClass extends Serializable {
    MSNetworkCapability getMSNetworkCapability();

    MSRadioAccessCapability getMSRadioAccessCapability();
}
