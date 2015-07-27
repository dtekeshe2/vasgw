package za.co.ebridge.sccp.impl.parameter;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

import za.co.ebridge.sccp.api.indicator.AddressIndicator;
import za.co.ebridge.sccp.api.indicator.GlobalTitleIndicator;
import za.co.ebridge.sccp.api.parameter.GlobalTitle;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public class SccpAddressCodec
{

    private static final byte ROUTE_ON_PC_FLAG = 0x40;

    private static final short REMOVE_PC_FLAG = 0xFE;

    private static final byte PC_PRESENT_FLAG = 0x01;

    // private GTCodec gtCodec = new GTCodec();
    // private boolean removeSpc = false;

    // /** Creates a new instance of UnitDataMandatoryVariablePart */
    // public SccpAddressCodec(boolean removeSpc) {
    // this.removeSpc = removeSpc;
    // }

    public static SccpAddress decode(byte[] buffer)
            throws
            IOException
    {
        ByteArrayInputStream bin = new ByteArrayInputStream(buffer);

        int b = bin.read() & 0xff;
        AddressIndicator addressIndicator = new AddressIndicator((byte) b);

        int pc = 0;
        if (addressIndicator.pcPresent())
        {
            int b1 = bin.read() & 0xff;
            int b2 = bin.read() & 0xff;

            pc = ((b2 & 0x3f) << 8) | b1;
        }

        int ssn = 0;
        if (addressIndicator.ssnPresent())
        {
            ssn = bin.read() & 0xff;
        }

        GlobalTitle globalTitle = GTCodec.decode(addressIndicator.getGlobalTitleIndicator(), bin);
        return new SccpAddress(addressIndicator.getRoutingIndicator(), pc, globalTitle, ssn);
    }

    public static byte[] encode(SccpAddress address, boolean removeSpc)
            throws
            IOException
    {
        ByteArrayOutputStream out = new ByteArrayOutputStream();

        AddressIndicator ai = address.getAddressIndicator();
        byte aiValue = ai.getValue();

        if (removeSpc && ((aiValue & ROUTE_ON_PC_FLAG) == 0x00))
        {
            // Routing on GT so lets remove PC flag

            aiValue = (byte) (aiValue & REMOVE_PC_FLAG);
        }

        out.write(aiValue);

        if ((aiValue & PC_PRESENT_FLAG) == PC_PRESENT_FLAG)
        {
            // If Point Code included in SCCP Address
            byte b1 = (byte) address.getSignalingPointCode();
            byte b2 = (byte) ((address.getSignalingPointCode() >> 8) & 0x3f);

            out.write(b1);
            out.write(b2);
        }

        if (ai.ssnPresent())
        {
            out.write((byte) address.getSubsystemNumber());
        }

        if (ai.getGlobalTitleIndicator() != GlobalTitleIndicator.NO_GLOBAL_TITLE_INCLUDED)
        {
            GTCodec.encode(address.getGlobalTitle(), out);
        }
        return out.toByteArray();

    }

}
