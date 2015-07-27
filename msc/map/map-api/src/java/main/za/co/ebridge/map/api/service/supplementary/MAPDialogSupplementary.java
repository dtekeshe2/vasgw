/* eBridge SS7 */

package za.co.ebridge.map.api.service.supplementary;

import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.datacoding.CBSDataCodingScheme;
import za.co.ebridge.map.api.primitives.AlertingPattern;
import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.primitives.USSDString;

/**
 *
 * @author amit bhayani
 * @author david@tekeshe.com
 *
 */
public interface MAPDialogSupplementary extends MAPDialog {

    /**
     * Add's a new Process Unstructured SS Request as Component.
     *
     * @param ussdDataCodingScheme The Data Coding Scheme for this USSD String as defined in GSM 03.38
     * @param ussdString Ussd String
     * @param alertingPatter The optional alerting pattern. See {@link AlertingPattern}
     * @param msisdn The optional MSISDN in {@link ISDNAddressString} format.
     * @return invokeId
     * @throws MAPException
     */
    Long addProcessUnstructuredSSRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    Long addProcessUnstructuredSSRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    /**
     * Add's a new ProcessUnstructured SS Response as Component.
     *
     * @param invokeId The original invoke ID retrieved from {@link ProcessUnstructuredSSResponse}
     * @param ussdDataCodingScheme The Data Coding Scheme for this USSD String as defined in GSM 03.38
     * @param ussdString Ussd String {@link USSDString}
     * @throws MAPException
     */
    void addProcessUnstructuredSSResponse(long invokeId, CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString)
            throws MAPException;

    /**
     * Add's a new Unstructured SS Request
     *
     * @param ussdDataCodingScheme The Data Coding Scheme for this USSD String as defined in GSM 03.38
     * @param ussdString Ussd String {@link USSDString}
     * @param alertingPatter The optional alerting pattern. See {@link AlertingPattern}
     * @param msisdn The optional MSISDN in {@link ISDNAddressString} format.
     * @return invokeId
     * @throws MAPException
     */
    Long addUnstructuredSSRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    Long addUnstructuredSSRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    /**
     * Add's a new Unstructured SS Response
     *
     * @param invokeId The original invoke ID retrieved from {@link UnstructuredSSResponse}
     * @param ussdDataCodingScheme The Data Coding Scheme for this USSD String as defined in GSM 03.38
     * @param ussdString Ussd String {@link USSDString}
     * @throws MAPException
     */
    void addUnstructuredSSResponse(long invokeId, CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString)
            throws MAPException;

    /**
     * Add's a new Unstructured SS Notify
     *
     * @param ussdDataCodingScheme The Data Coding Scheme for this USSD String as defined in GSM 03.38
     * @param ussdString Ussd String {@link USSDString}
     * @param alertingPatter The optional alerting pattern. See {@link AlertingPattern}
     * @param msisdn The optional MSISDN in {@link ISDNAddressString} format.
     * @return invokeId
     * @throws MAPException
     */
    Long addUnstructuredSSNotifyRequest(CBSDataCodingScheme ussdDataCodingScheme, USSDString ussdString,
            AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    Long addUnstructuredSSNotifyRequest(int customInvokeTimeout, CBSDataCodingScheme ussdDataCodingScheme,
            USSDString ussdString, AlertingPattern alertingPatter, ISDNAddressString msisdn) throws MAPException;

    void addUnstructuredSSNotifyResponse(long invokeId) throws MAPException;

}