package za.co.ebridge.sccp.impl;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;
import za.co.ebridge.sccp.api.ConcernedSignalingPointCode;

public class ConcernedSignalingPointCodeImpl
        implements ConcernedSignalingPointCode, XMLSerializable
{
    private static final String REMOTE_SPC = "remoteSpc";

    private int remoteSpc;

    public ConcernedSignalingPointCodeImpl()
    {
    }

    public ConcernedSignalingPointCodeImpl(int remoteSpc)
    {
        this.remoteSpc = remoteSpc;
    }

    public int getRemoteSpc()
    {
        return remoteSpc;
    }

    /**
     * @param remoteSpc the remoteSpc to set
     */
    protected void setRemoteSpc(int remoteSpc)
    {
        this.remoteSpc = remoteSpc;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("rsp=").append(this.remoteSpc);
        return sb.toString();
    }

    protected static final XMLFormat<ConcernedSignalingPointCodeImpl> XML = new
            XMLFormat<ConcernedSignalingPointCodeImpl>()
    {

        public void write(ConcernedSignalingPointCodeImpl ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(REMOTE_SPC, ai.remoteSpc);

        }

        public void read(InputElement xml, ConcernedSignalingPointCodeImpl ai)
                throws
                XMLStreamException
        {
            ai.remoteSpc = xml.getAttribute(REMOTE_SPC).toInt();
        }
    };
}
