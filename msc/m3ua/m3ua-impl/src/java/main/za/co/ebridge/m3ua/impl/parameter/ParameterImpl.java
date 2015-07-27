package za.co.ebridge.m3ua.impl.parameter;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.parameter.Parameter;

public abstract class ParameterImpl
        implements Parameter
{
    protected volatile short tag;
    protected volatile short length;

    public short getTag()
    {
        return tag;
    }

    protected abstract byte[] getValue();

    // public void encode(OutputStream out) throws IOException {
    // // obtain encoded value
    // byte[] value = getValue();
    //
    // // encode tag
    // out.write((byte) (tag >> 8));
    // out.write((byte) (tag));
    //
    // // encode length including value, tag and length field itself
    // length = (short) (value.length + 4);
    //
    // out.write((byte) (length >> 8));
    // out.write((byte) (length));
    //
    // // encode value
    // out.write(value);
    // }

    public void write(ByteBuffer buffer)
    {
        // obtain encoded value
        byte[] value = getValue();

        // encode tag
        buffer.put((byte) (tag >> 8));
        buffer.put((byte) (tag));

        // encode length including value, tag and length field itself
        length = (short) (value.length + 4);

        buffer.put((byte) (length >> 8));
        buffer.put((byte) (length));

        // encode value
        buffer.put(value);

        /*
         * The total length of a parameter (including Tag, Parameter Length, and Value fields) MUST be a multiple of 4 octets.
         * If the length of the parameter is not a multiple of 4 octets, the sender pads the Parameter at the end (i.e., after
         * the Parameter Value field) with all zero octets. The length of the padding is NOT included in the parameter length
         * field. A sender MUST NOT pad with more than 3 octets. The receiver MUST ignore the padding octets.
         */
        int remainder = (4 - length % 4);
        if (remainder < 4)
        {
            while (remainder > 0)
            {
                buffer.put((byte) 0x00);
                remainder--;
            }
        }
    }
}
