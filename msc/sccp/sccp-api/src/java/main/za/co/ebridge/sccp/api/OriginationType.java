package za.co.ebridge.sccp.api;

public enum OriginationType
{
    LocalOriginated("LocalOriginated"), RemoteOriginated("RemoteOriginated"), All("All");

    private static final String LOCAL_ORIGINATED = "LocalOriginated";
    private static final String REMOTE_ORIGINATED = "RemoteOriginated";
    private static final String ALL = "All";

    private final String type;

    private OriginationType(String type)
    {
        this.type = type;
    }

    public static OriginationType getInstance(String type)
    {
        if (LOCAL_ORIGINATED.equalsIgnoreCase(type))
        {
            return LocalOriginated;
        } else if (REMOTE_ORIGINATED.equalsIgnoreCase(type))
        {
            return RemoteOriginated;
        } else if (ALL.equalsIgnoreCase(type))
        {
            return All;
        }

        return null;
    }

    public String getType()
    {
        return this.type;
    }

}
