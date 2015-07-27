package za.co.ebridge.sccp.api;

import java.util.Map;

import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface Router
{

    void addRoutingAddress(int id, SccpAddress routingAddress)
            throws
            Exception;

    void removeRoutingAddress(int id)
            throws
            Exception;

    void modifyRoutingAddress(int routingAddressId, SccpAddress routingAddress)
            throws
            Exception;

    Map<Integer, SccpAddress> getRoutingAddresses();

    SccpAddress getRoutingAddress(int id);

    void addMtp3ServiceAccessPoint(int id, int mtp3Id, int opc, int ni)
            throws
            Exception;

    void modifyMtp3ServiceAccessPoint(int id, int mtp3Id, int opc, int ni)
            throws
            Exception;

    void removeMtp3ServiceAccessPoint(int id)
            throws
            Exception;

    Mtp3ServiceAccessPoint getMtp3ServiceAccessPoint(int id);

    Map<Integer, Mtp3ServiceAccessPoint> getMtp3ServiceAccessPoints();

    void addMtp3Destination(int sapId, int destId, int firstDpc, int lastDpc, int firstSls, int lastSls, int slsMask)
            throws
            Exception;

    void modifyMtp3Destination(int sapId, int destId, int firstDpc, int lastDpc, int firstSls, int lastSls, int slsMask)
            throws
            Exception;

    void removeMtp3Destination(int sapId, int destId)
            throws
            Exception;

    void addLongMessageRule(int id, int firstSpc, int lastSpc, LongMessageRuleType ruleType)
            throws
            Exception;

    void modifyLongMessageRule(int id, int firstSpc, int lastSpc, LongMessageRuleType ruleType)
            throws
            Exception;

    void removeLongMessageRule(int id)
            throws
            Exception;

    LongMessageRule getLongMessageRule(int id);

    Map<Integer, LongMessageRule> getLongMessageRules();

    void addRule(
            int id, RuleType ruleType, LoadSharingAlgorithm algo, OriginationType originationType,
            SccpAddress pattern, String mask, int pAddressId, int sAddressId, Integer newCallingPartyAddressAddressId)
            throws
            Exception;

    void modifyRule(
            int id, RuleType ruleType, LoadSharingAlgorithm algo, OriginationType originationType,
            SccpAddress pattern, String mask, int pAddressId, int sAddressId, Integer newCallingPartyAddressAddressId)
            throws
            Exception;

    Rule getRule(int id);

    void removeRule(int id)
            throws
            Exception;

    Map<Integer, Rule> getRules();
}
