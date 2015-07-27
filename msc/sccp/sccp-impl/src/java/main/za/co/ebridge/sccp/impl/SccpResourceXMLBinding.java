package za.co.ebridge.sccp.impl;

import javolution.util.FastMap;
import javolution.xml.XMLBinding;
import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

public class SccpResourceXMLBinding
        extends XMLBinding
{

    public SccpResourceXMLBinding()
    {
        // TODO Auto-generated constructor stub
    }

    protected XMLFormat getFormat(Class forClass)
            throws
            XMLStreamException
    {
        if (RemoteSubSystemMap.class.equals(forClass))
        {
            return REMOTESUBSYSTEMMAP;
        }

        if (RemoteSignalingPointCodeMap.class.equals(forClass))
        {
            return REMOTESIGNALINGPOINTCODEMAP;
        }

        if (ConcernedSignalingPointCodeMap.class.equals(forClass))
        {
            return CONCERNEDSIGNALINGPOINTCODEMAP;
        }

        return super.getFormat(forClass);
    }

    protected final XMLFormat<ConcernedSignalingPointCodeMap> CONCERNEDSIGNALINGPOINTCODEMAP =
            new XMLFormat<ConcernedSignalingPointCodeMap>()
            {

                @Override
                public void write(ConcernedSignalingPointCodeMap map, javolution.xml.XMLFormat.OutputElement xml)
                        throws
                        XMLStreamException
                {

                    for (Integer key : ((FastMap<Integer, ConcernedSignalingPointCodeImpl>) map).keySet())
                    {

                        ConcernedSignalingPointCodeImpl concernedSignalingPointCodeImpl =
                                (ConcernedSignalingPointCodeImpl) map.get(key);


                        xml.add(key, "id", Integer.class);
                        xml.add(concernedSignalingPointCodeImpl, "value", ConcernedSignalingPointCodeImpl.class);
                    }
                }

                @Override
                public void read(javolution.xml.XMLFormat.InputElement xml, ConcernedSignalingPointCodeMap obj)
                        throws
                        XMLStreamException
                {
                    while (xml.hasNext())
                    {
                        Integer id = xml.get("id", Integer.class);
                        ConcernedSignalingPointCodeImpl concernedSignalingPointCodeImpl = xml.get("value",
                                ConcernedSignalingPointCodeImpl.class);

                        obj.put(id, concernedSignalingPointCodeImpl);
                    }
                }

            };

    protected final XMLFormat<RemoteSignalingPointCodeMap> REMOTESIGNALINGPOINTCODEMAP =
            new XMLFormat<RemoteSignalingPointCodeMap>()
            {

                @Override
                public void write(RemoteSignalingPointCodeMap map, javolution.xml.XMLFormat.OutputElement xml)
                        throws
                        XMLStreamException
                {

                    for (Integer key : ((FastMap<Integer, RemoteSignalingPointCodeImpl>) map).keySet())
                    {

                        RemoteSignalingPointCodeImpl remoteSignalingPointCodeImpl = (RemoteSignalingPointCodeImpl)
                                map.get(key);

                        xml.add(key, "id", Integer.class);
                        xml.add(remoteSignalingPointCodeImpl, "value", RemoteSignalingPointCodeImpl.class);
                    }
                }

                @Override
                public void read(javolution.xml.XMLFormat.InputElement xml, RemoteSignalingPointCodeMap obj)
                        throws
                        XMLStreamException
                {
                    while (xml.hasNext())
                    {
                        Integer id = xml.get("id", Integer.class);
                        RemoteSignalingPointCodeImpl remoteSignalingPointCodeImpl = xml
                                .get("value", RemoteSignalingPointCodeImpl.class);

                        obj.put(id, remoteSignalingPointCodeImpl);
                    }
                }

            };

    protected final XMLFormat<RemoteSubSystemMap> REMOTESUBSYSTEMMAP = new XMLFormat<RemoteSubSystemMap>()
    {
        @Override
        public void write(RemoteSubSystemMap map, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            for (Integer key : ((FastMap<Integer, RemoteSubSystemImpl>) map).keySet())
            {

                RemoteSubSystemImpl remoteSubSystemImpl = (RemoteSubSystemImpl) map.get(key);

                xml.add(key, "id", Integer.class);
                xml.add(remoteSubSystemImpl, "value", RemoteSubSystemImpl.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, RemoteSubSystemMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                Integer id = xml.get("id", Integer.class);
                RemoteSubSystemImpl remoteSubSystemImpl = xml.get("value", RemoteSubSystemImpl.class);

                obj.put(id, remoteSubSystemImpl);
            }
        }
    };
}
