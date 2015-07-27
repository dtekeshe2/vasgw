package za.co.ebridge.sccp.impl.router;

import javolution.util.FastMap;
import javolution.xml.XMLBinding;
import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;

import za.co.ebridge.sccp.api.parameter.SccpAddress;

public class SccpRouterXMLBinding
        extends XMLBinding
{

    /**
     *
     */
    public SccpRouterXMLBinding()
    {
        // TODO Auto-generated constructor stub
    }

    protected XMLFormat getFormat(Class forClass)
            throws
            XMLStreamException
    {
        if (Mtp3DestinationMap.class.equals(forClass))
        {
            return MTP3DESTINATIONMAP;
        }

        if (Mtp3ServiceAccessPointMap.class.equals(forClass))
        {
            return MTP3SERVICEACCESSPOINTMAP;
        }

        if (LongMessageRuleMap.class.equals(forClass))
        {
            return LONGMESSAGERULEMAP;
        }

        if (SccpAddressMap.class.equals(forClass))
        {
            return SCCPADDRESSMAP;
        }

        if (RuleMap.class.equals(forClass))
        {
            return RULEMAP;
        }

        return super.getFormat(forClass);
    }

    protected final XMLFormat<RuleMap> RULEMAP = new XMLFormat<RuleMap>()
    {

        @Override
        public void write(RuleMap obj, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            for (Integer id : ((FastMap<Integer, RuleImpl>) obj).keySet())
            {

                RuleImpl rule = (RuleImpl) obj.get(id);

                xml.add(id, "id", Integer.class);
                xml.add(rule, "value", RuleImpl.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, RuleMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                Integer id = xml.get("id", Integer.class);
                RuleImpl rule = xml.get("value", RuleImpl.class);
                obj.put(id, rule);
            }
        }

    };

    protected final XMLFormat<SccpAddressMap> SCCPADDRESSMAP = new XMLFormat<SccpAddressMap>()
    {

        @Override
        public void write(SccpAddressMap obj, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            for (Integer id : ((FastMap<Integer, SccpAddress>) obj).keySet())
            {

                SccpAddress sccpAddress = (SccpAddress) obj.get(id);

                xml.add(id, "id", Integer.class);
                xml.add(sccpAddress, "sccpAddress", SccpAddress.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, SccpAddressMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                Integer id = xml.get("id", Integer.class);
                SccpAddress sccpAddress = xml.get("sccpAddress", SccpAddress.class);

                obj.put(id, sccpAddress);
            }
        }

    };

    protected final XMLFormat<LongMessageRuleMap> LONGMESSAGERULEMAP = new XMLFormat<LongMessageRuleMap>()
    {

        @Override
        public void write(LongMessageRuleMap obj, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            for (Integer id : ((FastMap<Integer, LongMessageRuleImpl>) obj).keySet())
            {

                LongMessageRuleImpl longMessageRule = (LongMessageRuleImpl) obj.get(id);

                xml.add(id, "id", Integer.class);
                xml.add(longMessageRule, "value", LongMessageRuleImpl.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, LongMessageRuleMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                Integer id = xml.get("id", Integer.class);
                LongMessageRuleImpl longMessageRule = xml.get("value", LongMessageRuleImpl.class);

                obj.put(id, longMessageRule);
            }
        }

    };

    protected final XMLFormat<Mtp3ServiceAccessPointMap> MTP3SERVICEACCESSPOINTMAP =
            new XMLFormat<Mtp3ServiceAccessPointMap>()
            {

                @Override
                public void write(Mtp3ServiceAccessPointMap obj, javolution.xml.XMLFormat.OutputElement xml)
                        throws
                        XMLStreamException
                {

                    for (Integer id : ((FastMap<Integer, Mtp3ServiceAccessPointImpl>) obj).keySet())
                    {

                        Mtp3ServiceAccessPointImpl mtp3ServiceAccessPoint = (Mtp3ServiceAccessPointImpl) obj.get(id);

                        xml.add(id, "id", Integer.class);
                        xml.add(mtp3ServiceAccessPoint, "value", Mtp3ServiceAccessPointImpl.class);
                    }
                }

                @Override
                public void read(javolution.xml.XMLFormat.InputElement xml, Mtp3ServiceAccessPointMap obj)
                        throws
                        XMLStreamException
                {
                    while (xml.hasNext())
                    {
                        Integer id = xml.get("id", Integer.class);
                        Mtp3ServiceAccessPointImpl mtp3ServiceAccessPoint = xml.get("value",
                                Mtp3ServiceAccessPointImpl.class);

                        obj.put(id, mtp3ServiceAccessPoint);
                    }
                }

            };

    protected final XMLFormat<Mtp3DestinationMap> MTP3DESTINATIONMAP = new XMLFormat<Mtp3DestinationMap>()
    {

        @Override
        public void write(Mtp3DestinationMap obj, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            for (Integer id : ((FastMap<Integer, Mtp3DestinationImpl>) obj).keySet())
            {

                Mtp3DestinationImpl mtp3Destination = (Mtp3DestinationImpl) obj.get(id);

                xml.add(id, "id", Integer.class);
                xml.add(mtp3Destination, "value", Mtp3DestinationImpl.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, Mtp3DestinationMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                Integer id = xml.get("id", Integer.class);
                Mtp3DestinationImpl mtp3Destination = xml.get("value", Mtp3DestinationImpl.class);

                obj.put(id, mtp3Destination);
            }
        }

    };

}
