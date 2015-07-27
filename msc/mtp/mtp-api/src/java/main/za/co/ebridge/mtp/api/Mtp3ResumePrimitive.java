package za.co.ebridge.mtp.api;

public class Mtp3ResumePrimitive
        extends Mtp3Primitive
{
    public Mtp3ResumePrimitive(int affectedDpc)
    {
        super(RESUME, affectedDpc);
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append("MTP-RESUME: AffectedDpc=");
        sb.append(this.affectedDpc);

        return sb.toString();
    }
}
