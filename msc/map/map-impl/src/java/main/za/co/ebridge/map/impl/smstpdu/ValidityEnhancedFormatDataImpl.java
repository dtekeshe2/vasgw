package za.co.ebridge.map.impl.smstpdu;

import za.co.ebridge.map.api.smstpdu.ValidityEnhancedFormatData;

public class ValidityEnhancedFormatDataImpl
        implements ValidityEnhancedFormatData
{

    public byte[] data;

    public ValidityEnhancedFormatDataImpl(byte[] data)
    {
        this.data = data;
    }

    public byte[] getData()
    {
        return this.data;
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();

        sb.append("ValidityEnhancedFormatData [");

        sb.append(printDataArr(data));
        sb.append("]");

        return sb.toString();
    }

    private String printDataArr(byte[] arr)
    {
        if (arr == null)
            return null;

        StringBuilder sb = new StringBuilder();
        for (int b : arr)
        {
            sb.append(b);
            sb.append(", ");
        }

        return sb.toString();
    }
}
