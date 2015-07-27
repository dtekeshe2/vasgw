/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.util.ArrayList;

import za.co.ebridge.map.api.service.mobility.MobilityMessage;

/**
 *
 MAP V1: RESULT sentParameterList SentParameterList
 *
 * SentParameterList ::= SEQUENCE SIZE (1..6) OF SentParameter
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SendParametersResponse extends MobilityMessage {

    ArrayList<SentParameter> getSentParameterList();

}
