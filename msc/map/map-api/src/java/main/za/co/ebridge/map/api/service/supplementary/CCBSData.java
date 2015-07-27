/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import java.io.Serializable;

import za.co.ebridge.map.api.primitives.ExternalSignalInfo;
import za.co.ebridge.map.api.primitives.ISDNAddressString;

/**
 *
 CCBS-Data ::= SEQUENCE { ccbs-Feature [0] CCBS-Feature, translatedB-Number [1] ISDN-AddressString, serviceIndicator [2]
 * ServiceIndicator OPTIONAL, callInfo [3] ExternalSignalInfo, networkSignalInfo [4] ExternalSignalInfo, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface CCBSData extends Serializable {

    CCBSFeature getCcbsFeature();

    ISDNAddressString getTranslatedBNumber();

    ServiceIndicator getServiceIndicator();

    ExternalSignalInfo getCallInfo();

    ExternalSignalInfo getNetworkSignalInfo();

}
