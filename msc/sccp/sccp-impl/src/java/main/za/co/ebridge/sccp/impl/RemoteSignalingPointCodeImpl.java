package za.co.ebridge.sccp.impl;

import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;
import za.co.ebridge.sccp.api.RemoteSignalingPointCode;

public class RemoteSignalingPointCodeImpl
        implements XMLSerializable, RemoteSignalingPointCode
{
    private static final String REMOTE_SPC = "remoteSpc";
    private static final String REMOTE_SPC_FLAG = "remoteSpcFlag";
    private static final String MASK = "mask";

    private int remoteSpc;
    private int remoteSpcFlag;
    private int mask;
    private boolean remoteSpcProhibited;
    private boolean remoteSccpProhibited;

    public RemoteSignalingPointCodeImpl()
    {

    }

    public RemoteSignalingPointCodeImpl(int remoteSpc, int remoteSpcFlag, int mask)
    {
        this.remoteSpc = remoteSpc;
        this.remoteSpcFlag = remoteSpcFlag;
        this.mask = mask;
    }

    public int getRemoteSpc()
    {
        return remoteSpc;
    }

    public int getRemoteSpcFlag()
    {
        return remoteSpcFlag;
    }

    public int getMask()
    {
        return mask;
    }

    public boolean isRemoteSpcProhibited()
    {
        return remoteSpcProhibited;
    }

    public boolean isRemoteSccpProhibited()
    {
        return remoteSccpProhibited;
    }

    protected void setRemoteSpcProhibited(boolean remoteSpcProhibited)
    {
        this.remoteSpcProhibited = remoteSpcProhibited;
    }

    protected void setRemoteSccpProhibited(boolean remoteSccpProhibited)
    {
        this.remoteSccpProhibited = remoteSccpProhibited;
    }

    /**
     * @param remoteSpc the remoteSpc to set
     */
    protected void setRemoteSpc(int remoteSpc)
    {
        this.remoteSpc = remoteSpc;
    }

    /**
     * @param remoteSpcFlag the remoteSpcFlag to set
     */
    protected void setRemoteSpcFlag(int remoteSpcFlag)
    {
        this.remoteSpcFlag = remoteSpcFlag;
    }

    /**
     * @param mask the mask to set
     */
    protected void setMask(int mask)
    {
        this.mask = mask;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("rsp=").append(this.remoteSpc).append(" rsp-flag=").append(this.remoteSpcFlag).append(" mask=")
                .append(this.mask).append(" rsp-prohibited=").append(this.remoteSpcProhibited).append(" " +
                "rsccp-prohibited=")
                .append(this.remoteSccpProhibited);
        return sb.toString();
    }

    protected static final XMLFormat<RemoteSignalingPointCodeImpl> XML = new XMLFormat<RemoteSignalingPointCodeImpl>()
    {

        public void write(RemoteSignalingPointCodeImpl ai, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(REMOTE_SPC, ai.remoteSpc);
            xml.setAttribute(REMOTE_SPC_FLAG, ai.remoteSpcFlag);
            xml.setAttribute(MASK, ai.mask);

        }

        public void read(InputElement xml, RemoteSignalingPointCodeImpl ai)
                throws
                XMLStreamException
        {
            ai.remoteSpc = xml.getAttribute(REMOTE_SPC).toInt();
            ai.remoteSpcFlag = xml.getAttribute(REMOTE_SPC_FLAG).toInt();
            ai.mask = xml.getAttribute(MASK).toInt();
        }
    };

}
