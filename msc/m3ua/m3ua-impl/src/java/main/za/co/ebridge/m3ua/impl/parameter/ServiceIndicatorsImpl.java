package za.co.ebridge.m3ua.impl.parameter;

import java.util.Arrays;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.api.parameter.ServiceIndicators;

public class ServiceIndicatorsImpl
        extends ParameterImpl
        implements ServiceIndicators, XMLSerializable
{
    private static final String INDICATOR = "indicator";
    private static final String ARRAY_SIZE = "size";

    private short[] indicators;
    private byte[] value = null;

    public ServiceIndicatorsImpl()
    {
        this.tag = Parameter.Service_Indicators;
    }

    protected ServiceIndicatorsImpl(short[] indicators)
    {
        this.tag = Parameter.Service_Indicators;
        this.indicators = indicators;

        this.encode();
    }

    protected ServiceIndicatorsImpl(byte[] value)
    {
        this.tag = Parameter.Service_Indicators;
        this.indicators = new short[value.length];
        for (int i = 0; i < value.length; i++)
        {
            this.indicators[i] = value[i];
        }
        this.value = value;
    }

    private void encode()
    {
        // create byte array taking into account data, point codes and
        // indicators;
        this.value = new byte[indicators.length];
        int count = 0;
        // encode routing context
        while (count < value.length)
        {
            value[count] = (byte) indicators[count++];
        }
    }

    @Override
    protected byte[] getValue()
    {
        return this.value;
    }

    public short[] getIndicators()
    {
        return this.indicators;
    }

    @Override
    public String toString()
    {
        return String.format("ServiceIndicators ids=%s", Arrays.toString(this.indicators));
    }

    /**
     * XML Serialization/De-serialization
     */
    protected static final XMLFormat<ServiceIndicatorsImpl> RC_XML = new XMLFormat<ServiceIndicatorsImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, ServiceIndicatorsImpl si)
                throws XMLStreamException
        {
            int size = xml.getAttribute(ARRAY_SIZE).toInt();
            si.indicators = new short[size];
            size = 0;
            while (xml.hasNext())
            {
                si.indicators[size++] = xml.get(INDICATOR);
            }

            si.encode();
        }

        @Override
        public void write(ServiceIndicatorsImpl si, javolution.xml.XMLFormat.OutputElement xml)
                throws XMLStreamException
        {
            xml.setAttribute(ARRAY_SIZE, si.indicators.length);
            for (Short s : si.indicators)
            {
                xml.add(s, INDICATOR);
            }
        }
    };
}
