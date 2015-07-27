package za.co.ebridge.mtp.api;

public class Mtp3StatusPrimitive
        extends Mtp3Primitive
{

    private Mtp3StatusCause cause;

    /**
     * Dialogic: Congestion status (if status = 0x02).
     * This field is set to the current congestion level in the range 0 to 3,
     * where 0 means no congestion and 3 means maximum congestion.
     * Many networks use only a single level of congestion (that is, 1)
     */
    private int congestionLevel;

    public Mtp3StatusPrimitive(int affectedDpc, Mtp3StatusCause cause, int congestionLevel)
    {
        super(STATUS, affectedDpc);
        this.cause = cause;
        this.congestionLevel = congestionLevel;
    }

    public Mtp3StatusCause getCause()
    {
        return this.cause;
    }

    public int getCongestionLevel()
    {
        return this.congestionLevel;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MTP-STATUS: AffectedDpc=");
        sb.append(this.affectedDpc);
        sb.append("Cause=");
        sb.append(this.cause.toString());
        sb.append("CongLevel=");
        sb.append(this.congestionLevel);

        return sb.toString();
    }
}
