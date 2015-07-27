package za.co.ebridge.mtp.api;

public abstract class Mtp3Primitive
{

    // SI flag is 0
    // public static final int SERVICE_INDICATOR = 0;

    // Type definition
    public static final int PAUSE = 3;
    public static final int RESUME = 4;
    public static final int STATUS = 5;

    protected int type;
    protected int affectedDpc;

    public Mtp3Primitive()
    {
    }

    public Mtp3Primitive(int type, int affectedDpc)
    {
        this.type = type;
        this.affectedDpc = affectedDpc;
    }

    public int getAffectedDpc()
    {
        return affectedDpc;
    }

    public int getType()
    {
        return type;
    }
}
