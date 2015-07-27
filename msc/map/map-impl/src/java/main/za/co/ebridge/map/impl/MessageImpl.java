package za.co.ebridge.map.impl;

import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;
import za.co.ebridge.map.api.MAPDialog;
import za.co.ebridge.map.api.MAPMessage;

public abstract class MessageImpl
        implements MAPMessage
{

    private static final String INVOKE_ID = "invokeId";

    private long invokeId;
    private MAPDialog mapDialog;

    public long getInvokeId()
    {
        return this.invokeId;
    }

    public MAPDialog getMAPDialog()
    {
        return this.mapDialog;
    }

    public void setInvokeId(long invokeId)
    {
        this.invokeId = invokeId;
    }

    public void setMAPDialog(MAPDialog mapDialog)
    {
        this.mapDialog = mapDialog;
    }

    /**
     * XML Serialization/Deserialization
     */
    protected static final XMLFormat<MessageImpl> MAP_MESSAGE_XML = new XMLFormat<MessageImpl>()
    {

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, MessageImpl message)
                throws
                XMLStreamException
        {
            message.invokeId = xml.getAttribute(INVOKE_ID, -1L);
        }

        @Override
        public void write(MessageImpl message, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(INVOKE_ID, message.invokeId);
        }
    };

}
