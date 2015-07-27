package za.co.ebridge.tcap.api.asn;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;

import java.io.IOException;
import java.nio.ByteBuffer;

public final class Utils
{

    public static long readTransactionId(AsnInputStream ais)
            throws
            AsnException,
            IOException
    {
        // here we have AIS, with txid - this is integer, but its coded as
        // octet string so no extra byte is added....
        byte[] data = ais.readOctetString();
        byte[] longRep = new byte[8];
        // copy data so longRep = {0,0,0,...,data};
        System.arraycopy(data, 0, longRep, longRep.length - data.length, data.length);
        ByteBuffer bb = ByteBuffer.wrap(longRep);
        return bb.getLong();

    }

    public static void writeTransactionId(AsnOutputStream aos, long txId, int tagClass, int tag)
            throws
            AsnException,
            IOException
    {
        // txId may only be up to 4 bytes, that is 0xFF FF FF FF
        byte[] data = new byte[4];
        // long ll = txId.longValue();
        // data[3] = (byte) ll;
        // data[2] = (byte) (ll>> 8);
        // data[1] = (byte) (ll>>16);
        // data[0] = (byte) (ll >> 24);
        data[3] = (byte) txId;
        data[2] = (byte) (txId >> 8);
        data[1] = (byte) (txId >> 16);
        data[0] = (byte) (txId >> 24);

        aos.writeOctetString(tagClass, tag, data);

    }

    public static long decodeTransactionId(byte[] data)
    {
        byte[] longRep = new byte[8];
        // copy data so longRep = {0,0,0,...,data};
        System.arraycopy(data, 0, longRep, longRep.length - data.length, data.length);
        ByteBuffer bb = ByteBuffer.wrap(longRep);
        return bb.getLong();

    }

    public static byte[] encodeTransactionId(long txId)
    {
        // txId may only be up to 4 bytes, that is 0xFF FF FF FF
        byte[] data = new byte[4];
        // long ll = txId.longValue();
        // data[3] = (byte) ll;
        // data[2] = (byte) (ll>> 8);
        // data[1] = (byte) (ll>>16);
        // data[0] = (byte) (ll >> 24);
        data[3] = (byte) txId;
        data[2] = (byte) (txId >> 8);
        data[1] = (byte) (txId >> 16);
        data[0] = (byte) (txId >> 24);

        return data;
    }
}
