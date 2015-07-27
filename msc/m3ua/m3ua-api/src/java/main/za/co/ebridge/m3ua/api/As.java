package za.co.ebridge.m3ua.api;

import java.util.Set;

import za.co.ebridge.m3ua.api.parameter.NetworkAppearance;
import za.co.ebridge.m3ua.api.parameter.RoutingContext;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;

/**
 * Application Server (AS) is a logical entity serving a specific Routing Key.
 * For example a virtual switch element handling all call processing for a signalling relation,
 * identified by an SS7 DPC/OPC.
 * Another example is a virtual database element, handling all HLR transactions for a particular SS7 SIO/DPC/OPC
 * combination.
 * The AS contains a set of one or more unique Application Server Processes,
 * of which one or more is normally actively processing traffic
 */

public interface As
{

    /**
     * Each As in M3UA stack is uniquely identified by its name
     */
    String getName();

    /**
     * Returns true if at least one {@link Asp} in this As is ACTIVE and exchanging payload
     */
    boolean isConnected();

    /**
     * Returns true if state of this As is ACTIVE
     */
    boolean isUp();

    /**
     * {@link RoutingContext} associated with this As.
     * Configuring routing context is optional and can return null if not configured.
     * Note that there is a 1:1 relationship between an AS and a Routing Key
     *
     * @return Routing Key
     */
    RoutingContext getRoutingContext();

    /**
     * The {@link Functionality} of this As
     */
    Functionality getFunctionality();

    /**
     * {@link ExchangeType} for this As
     */
    ExchangeType getExchangeType();

    /**
     * {@link IPSPType} for this As.
     * This is useful only if {@link Functionality} for this As is IPSP
     */
    IPSPType getIpspType();

    /**
     * {@link NetworkAppearance} for this As
     */
    NetworkAppearance getNetworkAppearance();

    /**
     * {@link TrafficModeType} for this As
     */
    TrafficModeType getTrafficModeType();

    /**
     * Default {@link TrafficModeType} that this As will assume if TrafficModeType
     * is not negotiated  or not set when defining this As
     */
    TrafficModeType getDefaultTrafficModeType();

    /**
     * The minimum number of {@link Asp} that should be ACTIVE before this As becomes ACTIVE.
     * This value is useful only if {@link TrafficModeType} is loadshare
     */
    int getMinAspActiveForLb();

    /**
     * Number of {@link Asp} assigned to this As
     */
    Set<Asp> getAspSet();

    /**
     * Current state of this As
     */
    State getState();
}
