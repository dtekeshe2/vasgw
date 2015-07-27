package za.co.ebridge.mtp.api;

public class Mtp3PausePrimitive
        extends Mtp3Primitive
{

    public Mtp3PausePrimitive(int affectedDpc)
    {
        super(PAUSE, affectedDpc);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MTP-PAUSE: AffectedDpc=");
        sb.append(this.affectedDpc);

        return sb.toString();
    }
}
