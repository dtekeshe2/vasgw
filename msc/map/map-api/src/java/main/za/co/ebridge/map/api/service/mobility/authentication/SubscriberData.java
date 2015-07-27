/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.authentication;

import java.io.Serializable;
import java.util.ArrayList;

import za.co.ebridge.map.api.primitives.ISDNAddressString;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.BearerServiceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.Category;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ODBData;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.SubscriberStatus;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.TeleserviceCode;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.ZoneCode;
import za.co.ebridge.map.api.service.supplementary.SSInfo;

/**
 *
 SubscriberData ::= SEQUENCE { msisdn [1] ISDN-AddressString OPTIONAL, category [2] Category OPTIONAL, subscriberStatus [3]
 * SubscriberStatus OPTIONAL, bearerServiceList [4] BearerServiceList OPTIONAL, teleserviceList [6] TeleserviceList OPTIONAL,
 * provisionedSS [7] SS-InfoList OPTIONAL, odb-Data [8] ODB-Data OPTIONAL, -- odb-Data must be absent in version 1
 * roamingRestrictionDueToUnsupportedFeature [9] NULL OPTIONAL, -- roamingRestrictionDueToUnsupportedFeature must be absent --
 * in version 1 regionalSubscriptionData [10] ZoneCodeList OPTIONAL -- regionalSubscriptionData must be absent in version 1 }
 *
 * BearerServiceList ::= SEQUENCE SIZE (1..50) OF BearerServiceCode
 *
 * TeleserviceList ::= SEQUENCE SIZE (1..20) OF TeleserviceCode
 *
 * SS-InfoList ::= SEQUENCE SIZE (1..30) OF SS-Info
 *
 * ZoneCodeList ::= SEQUENCE SIZE (1..10) OF ZoneCode
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface SubscriberData extends Serializable {

    ISDNAddressString getMsisdn();

    Category getCategory();

    SubscriberStatus getSubscriberStatus();

    ArrayList<BearerServiceCode> getBearerServiceList();

    ArrayList<TeleserviceCode> getTeleserviceList();

    ArrayList<SSInfo> getProvisionedSS();

    ODBData getOdbData();

    boolean getRoamingRestrictionDueToUnsupportedFeature();

    ArrayList<ZoneCode> getRegionalSubscriptionData();

}
