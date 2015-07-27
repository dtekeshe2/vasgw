package za.co.ebridge.tcap.api.asn;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.Parameter;

public class ParameterImpl
        implements Parameter
{

    private byte[] data;
    private Parameter[] parameters;
    private boolean primitive = true;
    private int tag;
    private int tagClass;
    private int encodingLength = -1;

    public byte[] getData()
    {

        return data;
    }

    public boolean isPrimitive()
    {

        return primitive;
    }

    public void setData(byte[] b)
    {
        this.data = b;
        if (data != null)
            this.setParameters(null);

    }

    public void setPrimitive(boolean b)
    {
        if (this.parameters != null && b)
        {
            // bad
            throw new IllegalArgumentException("Can not set primitive flag since Parameter[] is present!");
        }
        this.primitive = b;
    }

    public int getEncodingLength()
    {
        if (encodingLength >= 0)
        {
            return encodingLength;
        } else if (this.data != null)
        {
            return this.data.length;
        } else
        {
            return 0;
        }
    }

    public void setEncodingLength(int val)
    {
        encodingLength = val;
    }

    /**
     * @return the tag
     */
    public int getTag()
    {
        return tag;
    }

    /**
     * @param tag the tag to set
     */
    public void setTag(int tag)
    {
        this.tag = tag;
    }

    /**
     * @return the tagClass
     */
    public int getTagClass()
    {
        return tagClass;
    }

    /**
     * @param tagClass the tagClass to set
     */
    public void setTagClass(int tagClass)
    {
        this.tagClass = tagClass;
    }

    public String toString()
    {
        return "Parameter[data=" + Arrays.toString(data) + ", parameters=" + Arrays.toString(parameters) + ", " +
                "primitive="
                + primitive + ", tag=" + tag + ", tagClass=" + tagClass + ", encodingLength=" + this
                .getEncodingLength() + "]";
    }

    public Parameter[] getParameters()
    {

        if (this.parameters == null && !this.isPrimitive())
        {
            // we may want to decode
            if (this.data == null)
            {
                return this.parameters;
            }
            List<Parameter> paramsList = new ArrayList<Parameter>();
            // else we try to decode :)
            try
            {
                AsnInputStream ais = new AsnInputStream(this.data);
                while (ais.available() > 0)
                {
                    int tag = ais.readTag();
                    Parameter _p = TcapFactory.createParameter(tag, ais, false);
                    paramsList.add(_p);

                }

                this.parameters = new Parameter[paramsList.size()];
                this.parameters = paramsList.toArray(this.parameters);
            }
            catch (Exception e)
            {
                throw new IllegalArgumentException("Failed to parse raw data into constructed parameter", e);
            }
        }
        return this.parameters;
    }

    public void setParameters(Parameter[] paramss)
    {
        this.parameters = paramss;
        if (this.parameters != null)
        {
            this.setData(null);
            this.setPrimitive(false);
        }

    }

    private boolean singleParameterInAsn = false;

    public void setSingleParameterInAsn()
    {
        singleParameterInAsn = true;
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {
        try
        {
            primitive = ais.isTagPrimitive();
            tagClass = ais.getTagClass();
            data = ais.readSequence();
            this.encodingLength = data.length;
            if (singleParameterInAsn && ais.available() > 0)
            { // extra data found after main array
                byte[] buf = new byte[data.length + ais.available()];
                System.arraycopy(data, 0, buf, 0, data.length);
                ais.read(buf, data.length, ais.available());
                data = buf;
            }

        }
        catch (IOException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "IOException while decoding the parameter: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent,
                    "AsnException while decoding the parameter: " + e.getMessage(), e);
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {
        if (data == null && parameters == null)
        {
            throw new EncodeException("Parameter data not set.");
        }

        try
        {
            aos.writeTag(tagClass, primitive, tag);
            if (data == null)
            {

                AsnOutputStream localAos = new AsnOutputStream();
                for (Parameter p : this.parameters)
                {
                    p.encode(localAos);
                }
                data = localAos.toByteArray();
            }

            if (this.encodingLength >= 0)
                aos.writeLength(this.encodingLength);
            else
                aos.writeLength(data.length);
            aos.write(data);
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
