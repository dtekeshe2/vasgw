/* eBridge SS7 */

package za.co.ebridge.map.api.smstpdu;

/**
 * SMS-DELIVER-REPORT pdu
 *
 * @author david@tekeshe.com
 *
 */
public interface SmsDeliverReportTpdu extends SmsTpdu {

    /**
     * @return TP-UDHI field
     */
    boolean getUserDataHeaderIndicator();

    /**
     * @return TP-FCS field Returns null if no failure occured and the result is ACK
     */
    FailureCause getFailureCause();

    /**
     * @return TP-PI field
     */
    ParameterIndicator getParameterIndicator();

    /**
     * @return TP-PID field
     */
    ProtocolIdentifier getProtocolIdentifier();

    /**
     * @return TP-DCS field
     */
    DataCodingScheme getDataCodingScheme();

    /**
     * @return TP-UDL field
     */
    int getUserDataLength();

    /**
     * @return TP-UD field
     */
    UserData getUserData();

}