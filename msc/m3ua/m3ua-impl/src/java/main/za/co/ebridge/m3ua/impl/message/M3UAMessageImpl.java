package za.co.ebridge.m3ua.impl.message;

import java.nio.ByteBuffer;

import javolution.text.TextBuilder;
import javolution.util.FastMap;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.Parameter;
import za.co.ebridge.m3ua.impl.parameter.ParameterFactoryImpl;

public abstract class M3UAMessageImpl
        implements M3UAMessage
{

    // header part
    private int messageClass;
    private int messageType;

    private String message;
    protected FastMap<Short, Parameter> parameters = new FastMap<>();

    private ParameterFactoryImpl factory = new ParameterFactoryImpl();

    int initialPosition = 0;

    public M3UAMessageImpl(String message)
    {
        this.message = message;
    }

    protected M3UAMessageImpl(int messageClass, int messageType, String message)
    {
        this(message);
        this.messageClass = messageClass;
        this.messageType = messageType;
    }

    protected abstract void encodeParams(ByteBuffer buffer);

    public void encode(ByteBuffer buffer)
    {

        initialPosition = buffer.position();

        buffer.position(initialPosition + 8);

        encodeParams(buffer);

        int length = buffer.position() - initialPosition;
        // buffer.rewind();

        buffer.put(initialPosition++, (byte) 1);
        buffer.put(initialPosition++, (byte) 0);
        buffer.put(initialPosition++, (byte) messageClass);
        buffer.put(initialPosition++, (byte) messageType);
        buffer.putInt(initialPosition++, length);

        // buffer.position(length);
    }

    protected void decode(byte[] data)
    {
        this.decode(data, 0);
    }

    protected void decode(byte[] data, int initialPos)
    {
        int pos = initialPos;
        while (pos < data.length)
        {
            short tag = (short) ((data[pos] & 0xff) << 8 | (data[pos + 1] & 0xff));
            short len = (short) ((data[pos + 2] & 0xff) << 8 | (data[pos + 3] & 0xff));

            byte[] value = new byte[len - 4];

            System.arraycopy(data, pos + 4, value, 0, value.length);
            pos += len;
            parameters.put(tag, factory.createParameter(tag, value));

            // The Parameter Length does not include any padding octets. We have
            // to consider padding here
            int padding = 4 - (pos % 4);
            if (padding < 4)
            {
                pos += padding;
            }
        }
    }

    public int getMessageClass()
    {
        return messageClass;
    }

    public int getMessageType()
    {
        return messageType;
    }

    @Override
    public String toString()
    {

        TextBuilder builder = new TextBuilder();
        builder.append(this.message).append(" Params(");
        for (Parameter parameter : parameters.values())
        {
            builder.append(parameter.toString());
            builder.append(", ");
        }
        builder.append(")");
        return builder.toString();
    }
}
