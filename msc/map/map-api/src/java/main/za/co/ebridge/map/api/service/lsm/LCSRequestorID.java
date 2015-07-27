/* eBridge SS7 */

package za.co.ebridge.map.api.service.lsm;

import java.io.Serializable;

import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.USSDString;

/**
 * LCSRequestorID ::= SEQUENCE { dataCodingScheme [0] USSD-DataCodingScheme, requestorIDString [1] RequestorIDString, ...,
 * lcs-FormatIndicator [2] LCS-FormatIndicator OPTIONAL }
 *
 * @author amit bhayani
 *
 */
public interface LCSRequestorID extends Serializable {
    CBSDataCodingScheme getDataCodingScheme();

    /**
     * RequestorIDString ::= USSD-String (SIZE (1..maxRequestorIDStringLength))
     *
     * @return
     */
    USSDString getRequestorIDString();

    LCSFormatIndicator getLCSFormatIndicator();
}
