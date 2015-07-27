package za.co.ebridge.sccp.impl.router;

import java.util.HashMap;
import java.util.Map;

import javolution.util.FastMap;
import javolution.xml.XMLFormat;
import javolution.xml.XMLSerializable;
import javolution.xml.stream.XMLStreamException;
import za.co.ebridge.sccp.api.Mtp3Destination;
import za.co.ebridge.sccp.api.Mtp3ServiceAccessPoint;
import za.co.ebridge.sccp.impl.oam.SccpOAMMessage;

public class Mtp3ServiceAccessPointImpl
        implements Mtp3ServiceAccessPoint, XMLSerializable
{
    private static final String MTP3_ID = "mtp3Id";
    private static final String OPC = "opc";
    private static final String NI = "ni";
    // private static final String DPC_LIST = "dpcList";

    private int mtp3Id;
    private int opc;
    private int ni;

    private Mtp3DestinationMap<Integer, Mtp3Destination> dpcList = new Mtp3DestinationMap<Integer, Mtp3Destination>();

    public Mtp3ServiceAccessPointImpl()
    {
    }

    public Mtp3ServiceAccessPointImpl(int mtp3Id, int opc, int ni)
    {
        this.mtp3Id = mtp3Id;
        this.opc = opc;
        this.ni = ni;
    }

    public int getMtp3Id()
    {
        return mtp3Id;
    }

    public int getOpc()
    {
        return opc;
    }

    public int getNi()
    {
        return ni;
    }

    public Mtp3Destination getMtp3Destination(int destId)
    {
        return this.dpcList.get(destId);
    }

    public Map<Integer, Mtp3Destination> getMtp3Destinations()
    {
        Map<Integer, Mtp3Destination> dpcListTmp = new HashMap<Integer, Mtp3Destination>();
        dpcListTmp.putAll(dpcList);
        return dpcListTmp;
    }

    public void addMtp3Destination(int destId, int firstDpc, int lastDpc, int firstSls, int lastSls, int slsMask)
            throws
            Exception
    {

        if (getMtp3Destination(destId) != null)
        {
            throw new Exception(SccpOAMMessage.DEST_ALREADY_EXIST);
        }

        Mtp3Destination dest = new Mtp3DestinationImpl(firstDpc, lastDpc, firstSls, lastSls, slsMask);

        synchronized (this)
        {
            Mtp3DestinationMap<Integer, Mtp3Destination> newDpcList = new Mtp3DestinationMap<Integer,
                    Mtp3Destination>();
            newDpcList.putAll(this.dpcList);
            newDpcList.put(destId, dest);
            this.dpcList = newDpcList;
        }
    }

    public void modifyMtp3Destination(int destId, int firstDpc, int lastDpc, int firstSls, int lastSls, int slsMask)
            throws
            Exception
    {
        if (getMtp3Destination(destId) == null)
        {
            throw new Exception(SccpOAMMessage.DEST_DOESNT_EXIST);
        }

        Mtp3DestinationImpl dest = new Mtp3DestinationImpl(firstDpc, lastDpc, firstSls, lastSls, slsMask);

        synchronized (this)
        {
            Mtp3DestinationMap<Integer, Mtp3Destination> newDpcList = new Mtp3DestinationMap<Integer,
                    Mtp3Destination>();
            newDpcList.putAll(this.dpcList);
            newDpcList.put(destId, dest);
            this.dpcList = newDpcList;
        }
    }

    public void removeMtp3Destination(int destId)
            throws
            Exception
    {

        if (getMtp3Destination(destId) == null)
        {
            throw new Exception(SccpOAMMessage.DEST_DOESNT_EXIST);
        }

        synchronized (this)
        {
            Mtp3DestinationMap<Integer, Mtp3Destination> newDpcList = new Mtp3DestinationMap<Integer,
                    Mtp3Destination>();
            newDpcList.putAll(this.dpcList);
            newDpcList.remove(destId);
            this.dpcList = newDpcList;
        }
    }

    public boolean matches(int dpc, int sls)
    {

        for (Mtp3Destination item : this.dpcList.values())
        {
            if (item.match(dpc, sls))
                return true;
        }
        return false;
    }

    @Override
    public String toString()
    {
        StringBuffer sb = new StringBuffer();
        sb.append("mtp3Id=").append(this.mtp3Id).append(", opc=").append(this.opc).append(", ni=").append(this.ni)
                .append(", dpcList=[");

        boolean isFirst = true;

        for (Integer id : this.dpcList.keySet())
        {

            Mtp3Destination dest = this.dpcList.get(id);
            if (isFirst)
                isFirst = false;
            else
                sb.append(", ");
            sb.append("[key=");
            sb.append(id);
            sb.append(", ");
            sb.append(dest.toString());
            sb.append("], ");
        }
        sb.append("]");

        return sb.toString();
    }

    protected static final XMLFormat<Mtp3ServiceAccessPointImpl> XML = new XMLFormat<Mtp3ServiceAccessPointImpl>()
    {

        public void write(Mtp3ServiceAccessPointImpl sap, OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(MTP3_ID, sap.mtp3Id);
            xml.setAttribute(OPC, sap.opc);
            xml.setAttribute(NI, sap.ni);

            // XMLStreamWriter writer = xml.getStreamWriter();

            xml.add(sap.dpcList);
        }

        public void read(InputElement xml, Mtp3ServiceAccessPointImpl sap)
                throws
                XMLStreamException
        {
            sap.mtp3Id = xml.getAttribute(MTP3_ID).toInt();
            sap.opc = xml.getAttribute(OPC).toInt();
            sap.ni = xml.getAttribute(NI).toInt();

            sap.dpcList = xml.getNext();
        }
    };
}
