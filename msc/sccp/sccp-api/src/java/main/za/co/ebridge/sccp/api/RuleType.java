package za.co.ebridge.sccp.api;

public enum RuleType
{
    Solitary("Solitary"), Dominant("Dominant"), Loadshared("Loadshared"), Broadcast("Broadcast");

    private static final String SOLITARY = "Solitary";
    private static final String DOMINANT = "Dominant";
    private static final String LOADSHARED = "Loadshared";
    private static final String BROADCAST = "Broadcast";

    private final String type;

    private RuleType(String type)
    {
        this.type = type;
    }

    public static RuleType getInstance(String type)
    {
        if (SOLITARY.equalsIgnoreCase(type))
        {
            return Solitary;
        } else if (DOMINANT.equalsIgnoreCase(type))
        {
            return Dominant;
        } else if (LOADSHARED.equalsIgnoreCase(type))
        {
            return Loadshared;
        } else if (BROADCAST.equalsIgnoreCase(type))
        {
            return Broadcast;
        }

        return null;
    }

    public String getType()
    {
        return this.type;
    }
}
