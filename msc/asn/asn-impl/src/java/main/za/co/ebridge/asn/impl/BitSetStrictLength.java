package za.co.ebridge.asn.impl;

import java.util.BitSet;

public class BitSetStrictLength
        extends BitSet
{

    private int strictLength;

    public BitSetStrictLength(int strictLength)
    {
        this.strictLength = strictLength;
    }

    public int getStrictLength()
    {
        return strictLength;
    }

    public void setStrictLength(int strictLength)
    {
        this.strictLength = strictLength;
    }
}
