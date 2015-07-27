/* eBridge SS7 */

package za.co.ebridge.map.api.service.oam;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.GlobalCellId;
import za.co.ebridge.map.api.primitives.LAIFixedLength;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.EUtranCgi;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.RAIdentity;
import za.co.ebridge.map.api.service.mobility.subscriberInformation.TAId;

/**
 *
 AreaScope ::= SEQUENCE { cgi-List [0] CGI-List OPTIONAL, e-utran-cgi-List [1] E-UTRAN-CGI-List OPTIONAL, routingAreaId-List
 * [2] RoutingAreaId-List OPTIONAL, locationAreaId-List [3] LocationAreaId-List OPTIONAL, trackingAreaId-List [4]
 * TrackingAreaId-List OPTIONAL, extensionContainer [5] ExtensionContainer OPTIONAL, ... }
 *
 * CGI-List ::= SEQUENCE SIZE (1..32) OF GlobalCellId E-UTRAN-CGI-List ::= SEQUENCE SIZE (1..32) OF E-UTRAN-CGI
 * RoutingAreaId-List ::= SEQUENCE SIZE (1..8) OF RAIdentity LocationAreaId-List ::= SEQUENCE SIZE (1..8) OF LAIFixedLength
 * TrackingAreaId-List ::= SEQUENCE SIZE (1..8) OF TA-Id
 *
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface AreaScope extends Serializable {

    ArrayList<GlobalCellId> getCgiList();

    ArrayList<EUtranCgi> getEUutranCgiList();

    ArrayList<RAIdentity> getRoutingAreaIdList();

    ArrayList<LAIFixedLength> getLocationAreaIdList();

    ArrayList<TAId> getTrackingAreaIdList();

    MAPExtensionContainer getExtensionContainer();

}
