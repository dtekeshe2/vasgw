package za.co.ebridge.sctp.impl;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.nio.channels.SelectionKey;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.spi.AbstractSelectableChannel;
import java.util.ArrayList;
import java.util.List;

import com.sun.nio.sctp.SctpServerChannel;
import javolution.xml.XMLFormat;
import javolution.xml.stream.XMLStreamException;
import org.apache.log4j.Logger;

import za.co.ebridge.sctp.api.Association;
import za.co.ebridge.sctp.api.IpChannelType;
import za.co.ebridge.sctp.api.Server;

public class ServerImpl
        implements Server
{

    private static final Logger logger = Logger.getLogger(ServerImpl.class.getName());

    private static final String COMMA = ", ";
    private static final String NAME = "name";
    private static final String HOST_ADDRESS = "hostAddress";
    private static final String HOST_PORT = "hostPort";
    private static final String IPCHANNEL_TYPE = "ipChannelType";

    private static final String ASSOCIATIONS = "associations";
    private static final String EXTRA_HOST_ADDRESS = "extraHostAddress";
    private static final String ACCEPT_ANONYMOUS_CONNECTIONS = "acceptAnonymousConnections";
    private static final String MAX_CONCURRENT_CONNECTIONS_COUNT = "maxConcurrentConnectionsCount";

    private static final String STARTED = "started";

    private static final String EXTRA_HOST_ADDRESS_SIZE = "extraHostAddresseSize";

    private String name;
    private String hostAddress;
    private int hostPort;
    private volatile boolean started = false;
    private IpChannelType ipChannelType;
    private boolean acceptAnonymousConnections;
    private int maxConcurrentConnectionsCount;
    private String[] extraHostAddresses;

    private ManagementImpl management = null;

    protected List<String> associations = new ArrayList<>();
    protected List<Association> anonymousAssociations = new ArrayList<>();

    // The channel on which we'll accept connections
    private SctpServerChannel serverChannelSctp;
    private ServerSocketChannel serverChannelTcp;

    public ServerImpl()
    {
        super();
    }

    public ServerImpl(
            String name,
            String hostAddress,
            int hostPort,
            IpChannelType ipChannelType,
            boolean acceptAnonymousConnections,
            int maxConcurrentConnectionsCount,
            String[] extraHostAddresses)
            throws
            IOException
    {
        super();
        this.name = name;
        this.hostAddress = hostAddress;
        this.hostPort = hostPort;
        this.ipChannelType = ipChannelType;
        this.acceptAnonymousConnections = acceptAnonymousConnections;
        this.maxConcurrentConnectionsCount = maxConcurrentConnectionsCount;
        this.extraHostAddresses = extraHostAddresses;
    }

    protected void start()
            throws
            Exception
    {
        this.initSocket();
        this.started = true;

        if (logger.isInfoEnabled())
        {
            logger.info(String.format("Started Server=%s", this.name));
        }
    }

    protected void stop()
            throws
            Exception
    {
        List<String> tempAssociations = associations;
        for (String assocName : tempAssociations)
        {

            Association associationTemp = this.management.getAssociation(assocName);
            if (associationTemp.isStarted())
            {
                throw new Exception(String.format("Stop all the associations first. Association=%s is still started",
                        associationTemp.getName()));
            }
        }

        synchronized (this.anonymousAssociations)
        {
            // stopping all anonymous associations
            for (Association ass : this.anonymousAssociations)
            {
                ass.stopAnonymousAssociation();
            }
            this.anonymousAssociations.clear();
        }

        if (this.getIpChannel() != null)
        {
            try
            {
                this.getIpChannel().close();
            }
            catch (Exception e)
            {
                logger.warn(String.format("Error while stopping the Server=%s", this.name), e);
            }
        }

        this.started = false;

        if (logger.isInfoEnabled())
        {
            logger.info(String.format("Stopped Server=%s", this.name));
        }
    }

    private void initSocket()
            throws
            IOException
    {

        if (this.ipChannelType == IpChannelType.SCTP)
            doInitSocketSctp();
        else
            doInitSocketTcp();

        // Register the server socket channel, indicating an interest in
        // accepting new connections
        // this.serverChannel.register(socketSelector, SelectionKey.OP_ACCEPT);

        List<ChangeRequest> pendingChanges = this.management.getPendingChanges();
        synchronized (pendingChanges)
        {
            // Indicate we want the interest ops set changed
            pendingChanges.add(
                    new ChangeRequest(this.getIpChannel(),
                            null,
                            ChangeRequest.REGISTER,
                            SelectionKey.OP_ACCEPT));
        }

        this.management.getSocketSelector().wakeup();
    }

    private void doInitSocketSctp()
            throws
            IOException
    {
        // Create a new non-blocking server socket channel
        this.serverChannelSctp = SctpServerChannel.open();
        this.serverChannelSctp.configureBlocking(false);

        // Bind the server socket to the specified address and port
        InetSocketAddress isa = new InetSocketAddress(this.hostAddress, this.hostPort);
        this.serverChannelSctp.bind(isa);
        if (this.extraHostAddresses != null)
        {
            for (String s : extraHostAddresses)
            {
                this.serverChannelSctp.bindAddress(InetAddress.getByName(s));
            }
        }

        if (logger.isInfoEnabled())
        {
            logger.info(String.format("SctpServerChannel bound to=%s ", serverChannelSctp.getAllLocalAddresses()));
        }
    }

    private void doInitSocketTcp()
            throws
            IOException
    {
        // Create a new non-blocking server socket channel
        this.serverChannelTcp = ServerSocketChannel.open();
        this.serverChannelTcp.configureBlocking(false);

        // Bind the server socket to the specified address and port
        InetSocketAddress isa = new InetSocketAddress(this.hostAddress, this.hostPort);
        this.serverChannelTcp.bind(isa);

        if (logger.isInfoEnabled())
        {
            logger.info(String.format("ServerSocketChannel bound to=%s ", serverChannelTcp.getLocalAddress()));
        }
    }

    public IpChannelType getIpChannelType()
    {
        return this.ipChannelType;
    }

    public boolean isAcceptAnonymousConnections()
    {
        return acceptAnonymousConnections;
    }

    public int getMaxConcurrentConnectionsCount()
    {
        return maxConcurrentConnectionsCount;
    }

    public void setMaxConcurrentConnectionsCount(int val)
    {
        maxConcurrentConnectionsCount = val;
    }

    public List<Association> getAnonymousAssociations()
    {
        return this.anonymousAssociations;
    }

    protected AbstractSelectableChannel getIpChannel()
    {
        if (this.ipChannelType == IpChannelType.SCTP)
            return this.serverChannelSctp;
        else
            return this.serverChannelTcp;
    }

    public String getName()
    {
        return name;
    }

    public String getHostAddress()
    {
        return hostAddress;
    }

    public int getHostPort()
    {
        return hostPort;
    }

    @Override
    public String[] getExtraHostAddresses()
    {
        return extraHostAddresses;
    }

    public boolean isStarted()
    {
        return started;
    }

    public void setManagement(ManagementImpl management)
    {
        this.management = management;
    }

    public List<String> getAssociations()
    {
        return associations;
    }

    @Override
    public String toString()
    {

        StringBuilder sb = new StringBuilder();

        sb.append(
                "Server [name=").append(this.name)
                .append(", started=").append(this.started)
                .append(", hostAddress=").append(this.hostAddress)
                .append(", hostPort=").append(hostPort)
                .append(", ipChannelType=").append(ipChannelType)
                .append(", acceptAnonymousConnections=").append(this.acceptAnonymousConnections)
                .append(", maxConcurrentConnectionsCount=").append(this.maxConcurrentConnectionsCount)
                .append(", associations(anonymous does not included)=[");

        for (String item : this.associations)
        {
            sb.append(item);
            sb.append(", ");
        }

        sb.append("], extraHostAddress=[");

        if (this.extraHostAddresses != null)
        {
            for (int i = 0; i < this.extraHostAddresses.length; i++)
            {
                String extraHostAddress = this.extraHostAddresses[i];
                sb.append(extraHostAddress);
                sb.append(", ");
            }
        }

        sb.append("]]");

        return sb.toString();
    }

    /**
     * XML Serialization/DeSerialization
     */
    protected static final XMLFormat<ServerImpl> SERVER_XML
            = new XMLFormat<ServerImpl>()
    {
        @SuppressWarnings("unchecked")
        @Override
        public void read(XMLFormat.InputElement xml, ServerImpl server)
                throws
                XMLStreamException
        {
            server.name = xml.getAttribute(NAME, "");
            server.started = xml.getAttribute(STARTED, false);
            server.hostAddress = xml.getAttribute(HOST_ADDRESS, "");
            server.hostPort = xml.getAttribute(HOST_PORT, 0);
            server.ipChannelType = IpChannelType.getInstance(xml.getAttribute(IPCHANNEL_TYPE,
                    IpChannelType.SCTP.getCode()));
            if (server.ipChannelType == null)
                throw new XMLStreamException("Bad value for server.ipChannelType");

            server.acceptAnonymousConnections = xml.getAttribute(ACCEPT_ANONYMOUS_CONNECTIONS, false);
            server.maxConcurrentConnectionsCount = xml.getAttribute(MAX_CONCURRENT_CONNECTIONS_COUNT, 0);

            int extraHostAddressesSize = xml.getAttribute(EXTRA_HOST_ADDRESS_SIZE, 0);
            server.extraHostAddresses = new String[extraHostAddressesSize];

            for (int i = 0; i < extraHostAddressesSize; i++)
            {
                server.extraHostAddresses[i] = xml.get(EXTRA_HOST_ADDRESS, String.class);
            }

            server.associations = xml.get(ASSOCIATIONS, List.class);
        }

        @Override
        public void write(ServerImpl server, javolution.xml.XMLFormat.OutputElement xml)
                throws
                XMLStreamException
        {
            xml.setAttribute(NAME, server.name);
            xml.setAttribute(STARTED, server.started);
            xml.setAttribute(HOST_ADDRESS, server.hostAddress);
            xml.setAttribute(HOST_PORT, server.hostPort);
            xml.setAttribute(IPCHANNEL_TYPE, server.ipChannelType.getCode());
            xml.setAttribute(ACCEPT_ANONYMOUS_CONNECTIONS, server.acceptAnonymousConnections);
            xml.setAttribute(MAX_CONCURRENT_CONNECTIONS_COUNT, server.maxConcurrentConnectionsCount);

            xml.setAttribute(EXTRA_HOST_ADDRESS_SIZE,
                    server.extraHostAddresses != null ? server.extraHostAddresses.length : 0);
            if (server.extraHostAddresses != null)
            {
                for (String s : server.extraHostAddresses)
                {
                    xml.add(s, EXTRA_HOST_ADDRESS, String.class);
                }
            }
            xml.add(server.associations, ASSOCIATIONS, List.class);
        }
    };
}
