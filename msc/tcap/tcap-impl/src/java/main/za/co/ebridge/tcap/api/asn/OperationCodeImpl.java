package za.co.ebridge.tcap.api.asn;

import java.io.IOException;
import java.util.Arrays;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.OperationCodeType;

public class OperationCodeImpl
        implements OperationCode
{

    private Long localOperationCode;
    private long[] globalOperationCode;
    private OperationCodeType type;

    public OperationCodeType getOperationType()
    {

        return type;
    }

    public void setOperationType(OperationCodeType t)
    {
        this.type = t;

    }

    public void setOperationCodeType(OperationCodeType type)
    {
        this.type = type;
    }

    public void setLocalOperationCode(Long localOperationCode)
    {
        this.localOperationCode = localOperationCode;
        this.globalOperationCode = null;
        this.type = OperationCodeType.Local;
    }

    public void setGlobalOperationCode(long[] globalOperationCode)
    {
        this.localOperationCode = null;
        this.globalOperationCode = globalOperationCode;
        this.type = OperationCodeType.Global;
    }

    public Long getLocalOperationCode()
    {
        return this.localOperationCode;
    }

    public long[] getGlobalOperationCode()
    {
        return this.globalOperationCode;
    }

    public String getStringValue()
    {
        if (this.localOperationCode != null)
            return this.localOperationCode.toString();
        else if (this.globalOperationCode != null)
            return Arrays.toString(this.globalOperationCode);
        else
            return "empty";
    }

    public String toString()
    {
        if (this.localOperationCode != null)
            return "OperationCode[OperationType=Local, data=" + this.localOperationCode.toString() + "]";
        else if (this.globalOperationCode != null)
            return "OperationCode[OperationType=Global, data=" + Arrays.toString(this.globalOperationCode) + "]";
        else
            return "OperationCode[empty]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            if (this.type == OperationCodeType.Global)
            {
                this.globalOperationCode = ais.readObjectIdentifier();
            } else if (this.type == OperationCodeType.Local)
            {
                this.localOperationCode = ais.readInteger();
            } else
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent);
            }
        }
        catch (IOException e)
        {
            e.printStackTrace();
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "IOException while parsing OperationCode: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            e.printStackTrace();
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "AsnException while parsing OperationCode: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {

        if (this.localOperationCode == null && this.globalOperationCode == null)
            throw new EncodeException("Operation code: No Operation code set!");

        try
        {
            if (this.type == OperationCodeType.Local)
            {
                aos.writeInteger(this.localOperationCode);
            } else if (this.type == OperationCodeType.Global)
            {
                aos.writeObjectIdentifier(this.globalOperationCode);
            } else
            {
                throw new EncodeException();
            }

        }
        catch (IOException e)
        {
            throw new EncodeException(e);
        }
        catch (AsnException e)
        {
            throw new EncodeException(e);
        }
    }

}
