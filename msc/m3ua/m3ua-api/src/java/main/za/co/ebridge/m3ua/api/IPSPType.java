package za.co.ebridge.m3ua.api;

public enum IPSPType
{
    CLIENT("CLIENT"),
    SERVER("SERVER");

    private static final String TYPE_CLIENT = "CLIENT";
    private static final String TYPE_SERVER = "SERVER";

    private String type = null;

    private IPSPType(String type)
    {
        this.type = type;
    }

    public static IPSPType getIPSPType(String type)
    {
        if (TYPE_CLIENT.equalsIgnoreCase(type))
            return CLIENT;
        else if (TYPE_SERVER.equalsIgnoreCase(type))
            return SERVER;
        return null;
    }

    public String getType()
    {
        return this.type;
    }
}
