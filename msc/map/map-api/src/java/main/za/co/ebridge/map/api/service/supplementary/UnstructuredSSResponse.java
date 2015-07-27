/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.USSDString;

/**
 *
 RESULT USSD-Res -- optional
 *
 *
 * @author amit bhayani
 *
 */
public interface UnstructuredSSResponse extends SupplementaryMessage {

    CBSDataCodingScheme getDataCodingScheme();

    USSDString getUSSDString();

}