package za.co.ebridge.m3ua.impl.parameter;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.TrafficModeType;

public class TrafficModeTypeImpl
        extends ParameterImpl
        implements TrafficModeType, XMLSerializable
{
    private static final String MODE = "mode";

    private int mode = 0;
    private byte[] value;

    public TrafficModeTypeImpl()
    {
        this.tag = Parameter.Traffic_Mode_Type;
    }

    protected TrafficModeTypeImpl(byte[] data)
    {
        this.tag = Parameter.Traffic_Mode_Type;
        this.value = data;
        this.mode = 0;
        this.mode |= data[0] & 0xFF;
        this.mode <<= 8;
        this.mode |= data[1] & 0xFF;
        this.mode <<= 8;
        this.mode |= data[2] & 0xFF;
        this.mode <<= 8;
        this.mode |= data[3] & 0xFF;
    }

    protected TrafficModeTypeImpl(int trafficMode)
    {
        this.tag = Parameter.Traffic_Mode_Type;
        mode = trafficMode;
        encode();
    }

    private void encode()
    {
        // create byte array taking into account data, point codes and
        // indicators;
        this.value = new byte[4];
        // encode routing context
        value[0] = (byte) (mode >> 24);
        value[1] = (byte) (mode >> 16);
        value[2] = (byte) (mode >> 8);
        value[3] = (byte) (mode);
    }

    public int getMode()
    {
        return mode;
    }

    @Override
    protected byte[] getValue()
    {
        return value;
    }

    @Override
    public String toString()
    {
        return String.format("TrafficModeType mode=%d", mode);
    }

    /**
     * XML Serialization/De-serialization
     */
    protected static final XMLFormat<TrafficModeTypeImpl> RC_XML = new XMLFormat<TrafficModeTypeImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, TrafficModeTypeImpl trafficMode)
                throws XMLStreamException
        {
            trafficMode.mode = xml.getAttribute(MODE).toInt();
            trafficMode.encode();
        }

        @Override
        public void write(TrafficModeTypeImpl trafficMode, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException
        {
            xml.setAttribute(MODE, trafficMode.mode);
        }
    };
}
