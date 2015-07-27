package za.co.ebridge.m3ua.impl;

import java.util.Iterator;
import java.util.Map;

import javolution.xml.XMLBinding;
import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;
import za.co.ebridge.m3ua.api.As;

public class M3UAXMLBinding
        extends XMLBinding
{

    private M3UAManagementImpl m3uaManagement = null;

    public void setM3uaManagement(M3UAManagementImpl m3uaManagement)
    {
        this.m3uaManagement = m3uaManagement;
    }

    protected XMLFormat getFormat(Class forClass)
            throws
            XMLStreamException
    {
        if (RouteMap.class.equals(forClass))
        {
            return ROUTEMAP;
        }
        return super.getFormat(forClass);
    }

    protected final XMLFormat<RouteMap> ROUTEMAP = new XMLFormat<RouteMap>()
    {

        @Override
        public void write(RouteMap obj, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {

            final Map map = (Map) obj;
            for (Iterator it = map.entrySet().iterator(); it.hasNext(); )
            {
                Map.Entry entry = (Map.Entry) it.next();
                AsImpl[] asList = (AsImpl[]) entry.getValue();

                if (asList == null)
                {
                    continue;
                }

                xml.add((String) entry.getKey(), "key", String.class);

                StringBuffer sb = new StringBuffer();
                for (int count = 0; count < asList.length; count++)
                {
                    AsImpl asImpl = asList[count];
                    if (asImpl != null)
                    {
                        sb.append(asImpl.getName()).append(",");
                    }
                }

                String value = sb.toString();

                if (!value.equals(""))
                {
                    // remove last comma
                    value = value.substring(0, (value.length() - 1));
                }

                xml.add(value, "value", String.class);
            }
        }

        @Override
        public void read(javolution.xml.XMLFormat.InputElement xml, RouteMap obj)
                throws
                XMLStreamException
        {
            while (xml.hasNext())
            {
                String key = xml.get("key", String.class);
                String value = xml.get("value", String.class);
                AsImpl[] asList = new AsImpl[m3uaManagement.getMaxAsForRoute()];

                if (value != null && !value.equals(""))
                {
                    String[] asNames = value.split(",");
                    for (int count = 0; count < m3uaManagement.getMaxAsForRoute() && count < asNames.length; count++)
                    {
                        String asName = asNames[count];
                        As as = m3uaManagement.getAs(asName);
                        if (as == null)
                        {
                            // TODO add warning
                            continue;
                        }
                        asList[count] = (AsImpl) as;
                    }
                }// if (value != null && !value.equals(""))

                obj.put(key, asList);
            }// while
        }

    };
}
