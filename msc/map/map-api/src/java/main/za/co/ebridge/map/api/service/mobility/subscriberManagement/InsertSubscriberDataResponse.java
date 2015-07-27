/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.subscriberManagement;

import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.MobilityMessage;
import za.co.ebridge.map.api.service.mobility.locationManagement.SupportedFeatures;
import za.co.ebridge.map.api.service.supplementary.SSCode;

/**
 *
 MAP V3: InsertSubscriberDataRes ::= SEQUENCE { teleserviceList [1] TeleserviceList OPTIONAL, bearerServiceList [2]
 * BearerServiceList OPTIONAL, ss-List [3] SS-List OPTIONAL, odb-GeneralData [4] ODB-GeneralData OPTIONAL,
 * regionalSubscriptionResponse [5] RegionalSubscriptionResponse OPTIONAL, supportedCamelPhases [6] SupportedCamelPhases
 * OPTIONAL, extensionContainer [7] ExtensionContainer OPTIONAL, ... , offeredCamel4CSIs [8] OfferedCamel4CSIs OPTIONAL,
 * supportedFeatures [9] SupportedFeatures OPTIONAL }
 *
 *
 * MAP V2: InsertSubscriberDataRes ::= SEQUENCE { teleserviceList[1] TeleserviceList OPTIONAL, bearerServiceList[2]
 * BearerServiceList OPTIONAL, ss-List[3] SS-List OPTIONAL, odb-GeneralData[4] ODB-GeneralData OPTIONAL,
 * regionalSubscriptionResponse [5] RegionalSubscriptionResponse OPTIONAL, -- regionalSubscriptionResponse must be absent in
 * version 1 ...}
 *
 * TeleserviceList ::= SEQUENCE SIZE (1..20) OF Ext-TeleserviceCode
 *
 * BearerServiceList ::= SEQUENCE SIZE (1..50) OF Ext-BearerServiceCode
 *
 * SS-List ::= SEQUENCE SIZE (1..30) OF SS-Code
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface InsertSubscriberDataResponse extends MobilityMessage {

    ArrayList<ExtTeleserviceCode> getTeleserviceList();

    ArrayList<ExtBearerServiceCode> getBearerServiceList();

    ArrayList<SSCode> getSSList();

    ODBGeneralData getODBGeneralData();

    RegionalSubscriptionResponse getRegionalSubscriptionResponse();

    SupportedCamelPhases getSupportedCamelPhases();

    MAPExtensionContainer getExtensionContainer();

    OfferedCamel4CSIs getOfferedCamel4CSIs();

    SupportedFeatures getSupportedFeatures();

}
