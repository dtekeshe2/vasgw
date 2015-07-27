package za.co.ebridge.sccp.api.indicator;

/**
 * The Routing Indicator (RI) specifies whether GTT is required; it determines whether routing based on PC+SSN or GT. If routing
 * is based on the GT, the GT in the address is used for routing. If routing is based on PC+SSN, the PC and SSN in the
 * Called/Calling Party Address are used.
 */
public enum RoutingIndicator
{

    // Route on GT
    ROUTING_BASED_ON_GLOBAL_TITLE(0),

    // Route on PC + SSN
    ROUTING_BASED_ON_DPC_AND_SSN(1);

    private int ind;

    private RoutingIndicator(int ind)
    {
        this.ind = ind;
    }

    public int getIndicator()
    {
        return this.ind;
    }

    public static RoutingIndicator valueOf(int v)
    {
        switch (v)
        {
            case 0:
                return ROUTING_BASED_ON_GLOBAL_TITLE;
            case 1:
                return ROUTING_BASED_ON_DPC_AND_SSN;
            default:
                return null;
        }

    }
}
