package za.co.ebridge.sccp.api;

/**
 * LoadSharingAlgorithm defines bit in SLS to share message between Primary Address and Secondary Address
 */
public enum LoadSharingAlgorithm
{
    Undefined("Undefined"), Bit0("Bit0"), Bit1("Bit1"), Bit2("Bit2"), Bit3("Bit3"), Bit4("Bit4");

    private static final String UNDEFINED = "Undefined";
    private static final String BIT0 = "Bit0";
    private static final String BIT1 = "Bit1";
    private static final String BIT2 = "Bit2";
    private static final String BIT3 = "Bit3";
    private static final String BIT4 = "Bit4";

    private final String algo;

    private LoadSharingAlgorithm(String type)
    {
        this.algo = type;
    }

    public static LoadSharingAlgorithm getInstance(String type)
    {
        if (UNDEFINED.equalsIgnoreCase(type))
        {
            return Undefined;
        } else if (BIT0.equalsIgnoreCase(type))
        {
            return Bit0;
        } else if (BIT1.equalsIgnoreCase(type))
        {
            return Bit1;
        } else if (BIT2.equalsIgnoreCase(type))
        {
            return Bit2;
        } else if (BIT3.equalsIgnoreCase(type))
        {
            return Bit3;
        } else if (BIT4.equalsIgnoreCase(type))
        {
            return Bit4;
        }

        return null;
    }

    public String getAlgo()
    {
        return this.algo;
    }
}
