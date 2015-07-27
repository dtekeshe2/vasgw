package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.EMLPPInfo;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class EMLPPInfoImpl
        extends SequenceBase
        implements EMLPPInfo
{

    private int maximumentitledPriority = 0;
    private int defaultPriority = 0;
    private MAPExtensionContainer extensionContainer = null;

    public EMLPPInfoImpl()
    {
        super("EMLPPInfo");
    }

    /**
     *
     */
    public EMLPPInfoImpl(int maximumentitledPriority, int defaultPriority, MAPExtensionContainer extensionContainer)
    {
        super("EMLPPInfo");

        this.maximumentitledPriority = maximumentitledPriority;
        this.defaultPriority = defaultPriority;
        this.extensionContainer = extensionContainer;
    }

    public int getMaximumentitledPriority()
    {
        return this.maximumentitledPriority;
    }

    public int getDefaultPriority()
    {
        return this.defaultPriority;
    }

    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    protected void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        this.maximumentitledPriority = 0;
        this.defaultPriority = 0;
        this.extensionContainer = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        int num = 0;
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (num)
            {
                case 0: // maximumentitledPriority
                    if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || tag != Tag.INTEGER || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".maximumentitledPriority: bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.maximumentitledPriority = (int) ais.readInteger();
                    break;

                case 1: // defaultPriority
                    if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || tag != Tag.INTEGER || !ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".defaultPriority: bad tag or tag class or not primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);
                    this.defaultPriority = (int) ais.readInteger();
                    break;

                default:
                    switch (ais.getTagClass())
                    {
                        case Tag.CLASS_UNIVERSAL:
                            switch (tag)
                            {
                                case Tag.SEQUENCE:
                                    if (ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".extensionContainer: is primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.extensionContainer = new MAPExtensionContainerImpl();
                                    ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                                    break;
                                default:
                                    ais.advanceElement();
                                    break;
                            }
                            break;

                        default:
                            ais.advanceElement();
                            break;
                    }
            }
            num++;
        }

        if (num < 2)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": maximumentitledPriority and defaultPriority required but not found.",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (this.maximumentitledPriority < 0 || this.maximumentitledPriority > 15)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ".maximumentitledPriority: must be from 0 to 15, found:" + this.maximumentitledPriority,
                    MAPParsingComponentExceptionReason.MistypedParameter);

        if (this.defaultPriority < 0 || this.defaultPriority > 15)
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ".defaultPriority: must be from 0 to 15, found:" + this.defaultPriority,
                    MAPParsingComponentExceptionReason.MistypedParameter);
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeData (com.ebridge
     * .protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.maximumentitledPriority < 0 || this.maximumentitledPriority > 15)
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": maximumentitledPriority required value from 0 to 15.");

        if (this.defaultPriority < 0 || this.defaultPriority > 15)
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": maximumentitledPriority required value from 0 to 15.");

        try
        {
            asnOs.writeInteger(this.maximumentitledPriority);

            asnOs.writeInteger(this.defaultPriority);

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs);
        }
        catch (IOException e)
        {
            throw new MAPException("IOException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        sb.append("maximumentitledPriority=");
        sb.append(this.maximumentitledPriority);
        sb.append(", ");

        sb.append("defaultPriority=");
        sb.append(this.defaultPriority);
        sb.append(", ");

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(this.extensionContainer.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();
    }

}
