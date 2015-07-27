package za.co.ebridge.sctp.impl;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.Selector;
import java.nio.channels.spi.SelectorProvider;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;
import javolution.text.TextBuilder;
import javolution.util.FastMap;
import javolution.xml.XMLObjectReader;
import javolution.xml.XMLObjectWriter;
import javolution.xml.stream.XMLStreamException;
import org.apache.log4j.Logger;

import za.co.ebridge.sctp.api.*;

public class ManagementImpl
		implements Management
{

	private static final Logger logger = Logger.getLogger(ManagementImpl.class);

	private static final String SCTP_PERSIST_DIR_KEY = "sctp.persist.dir";
	private static final String USER_DIR_KEY = "user.dir";
	private static final String PERSIST_FILE_NAME = "sctp.xml";

	private static final String SERVERS = "servers";
	private static final String ASSOCIATIONS = "associations";

	private final TextBuilder persistFile = new TextBuilder();

	protected static final SctpXMLBinding binding = new SctpXMLBinding();
	protected static final String TAB_INDENT = "\t";
	private static final String CLASS_ATTRIBUTE = "type";

	private final String name;

	protected String persistDir = null;

	protected List<Server> servers = new ArrayList<>();
	protected AssociationMap<String, Association> associations = new AssociationMap<>();

	private List<ChangeRequest> pendingChanges = new ArrayList<>();

	// Create a new selector
	private Selector socketSelector = null;

	private SelectorThread selectorThread = null;

	static final int DEFAULT_IO_THREADS = Runtime.getRuntime().availableProcessors() * 2;

	private int workerThreads = DEFAULT_IO_THREADS;

	private boolean singleThread = false;

	private int workerThreadCount = 0;

	// Maximum IO Errors tolerated by Socket.
	// After this the Socket will be closed and attempt will be made to open again
	// TODO parameterize
	private int maxIOErrors = 3;

	private int connectDelay = 30000;

	private ExecutorService[] executorServices = null;

	private List<ManagementEventListener> managementEventListeners = new ArrayList<>();

	private ServerListener serverListener = null;

	private volatile boolean started = false;

	public ManagementImpl( String name )
			throws IOException
	{
		this.name = name;
		binding.setClassAttribute( CLASS_ATTRIBUTE );
		binding.setAlias(ServerImpl.class, "server");
		binding.setAlias(AssociationImpl.class, "association");
		binding.setAlias(String.class, "string");
		this.socketSelector = SelectorProvider.provider().openSelector();
	}

	@Override
	public String getName()
	{
		return name;
	}

	@Override
	public String getPersistDir()
	{
		return persistDir;
	}

	@Override
	public void setPersistDir(String persistDir)
	{
		this.persistDir = persistDir;
	}

	@Override
	public int getConnectDelay()
	{
		return connectDelay;
	}

	@Override
	public void setConnectDelay(int connectDelay)
	{
		this.connectDelay = connectDelay;
	}

	@Override
	public int getWorkerThreads()
	{
		return workerThreads;
	}

	@Override
	public void setWorkerThreads(int workerThreads)
	{
		if ( workerThreads < 1 ) {
			workerThreads = DEFAULT_IO_THREADS;
		}
		this.workerThreads = workerThreads;
	}

	public int getMaxIOErrors()
	{
		return maxIOErrors;
	}

	public void setMaxIOErrors(int maxIOErrors)
	{
		if (maxIOErrors < 1)
		{
			maxIOErrors = 1;
		}
		this.maxIOErrors = maxIOErrors;
	}

	@Override
	public boolean isSingleThread()
	{
		return singleThread;
	}

	@Override
	public void setSingleThread(boolean singleThread)
	{
		this.singleThread = singleThread;
	}

	@Override
	public ServerListener getServerListener()
	{
		return serverListener;
	}

	protected List<ManagementEventListener> getManagementEventListeners()
	{
		return managementEventListeners;
	}

	@Override
	public void setServerListener(ServerListener serverListener)
	{
		this.serverListener = serverListener;
	}

	@Override
	public void addManagementEventListener(ManagementEventListener listener)
	{
		synchronized (this)
		{
			if (this.managementEventListeners.contains(listener))
				return;

			List<ManagementEventListener> newManagementEventListeners = new ArrayList<>();
			newManagementEventListeners.addAll(this.managementEventListeners);
			newManagementEventListeners.add(listener);
			this.managementEventListeners = newManagementEventListeners;
		}
	}

	@Override
	public void removeManagementEventListener(ManagementEventListener listener)
	{
		synchronized (this)
		{
			if (!this.managementEventListeners.contains(listener))
				return;

			List<ManagementEventListener> newManagementEventListeners = new ArrayList<>();
			newManagementEventListeners.addAll(this.managementEventListeners);
			newManagementEventListeners.remove(listener);
			this.managementEventListeners = newManagementEventListeners;
		}
	}

	@Override
	public void start()
			throws Exception
	{

		if (this.started)
		{
			logger.warn(String.format("management=%s is already started", this.name));
			return;
		}

		synchronized (this)
		{
			this.persistFile.clear();

			if (persistDir != null)
			{
				this.persistFile
						.append(persistDir)
						.append(File.separator)
						.append(this.name)
						.append("_")
						.append(PERSIST_FILE_NAME);
			}
			else
			{
				persistFile
						.append(System.getProperty(SCTP_PERSIST_DIR_KEY, System.getProperty(USER_DIR_KEY)))
						.append(File.separator)
						.append(this.name)
						.append("_")
						.append(PERSIST_FILE_NAME);
			}

			logger.info(String.format("SCTP configuration file path %s", persistFile.toString()));

			try
			{
				this.load();
			}
			catch (FileNotFoundException e)
			{
				logger.warn(String.format("Failed to load the SCTP configuration file. \n%s", e.getMessage()));
			}

			if ( ! this.singleThread )
			{
				// If not single thread model we create worker threads
				this.executorServices = new ExecutorService[this.workerThreads];
				for ( int i = 0; i < this.workerThreads; i++ )
				{
					this.executorServices[i] = Executors.newSingleThreadExecutor();
				}
			}
			this.selectorThread = new SelectorThread(this.socketSelector, this);
			this.selectorThread.setStarted(true);

			(new Thread(this.selectorThread)).start();

			this.started = true;

			if (logger.isInfoEnabled())
			{
				logger.info(
						String.format(
								"Started SCTP Management=%s WorkerThreads=%d SingleThread=%s",
								this.name, (this.singleThread ? 0 : this.workerThreads), this.singleThread));
			}

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onServiceStarted();
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onServiceStarted", ee);
				}
			}
		}
	}

	@Override
	public void stop()
			throws Exception
	{
		
		if ( ! this.started )
		{
			logger.warn(String.format("management=%s is already stopped", this.name));
			return;
		}

		for ( ManagementEventListener listener : managementEventListeners )
		{
			try
			{
				listener.onServiceStopped();
			}
			catch (Throwable ee)
			{
				logger.error("Exception while invoking onServiceStopped", ee);
			}
		}

		// We store the original state first
		this.store();

		// Stop all associations
		FastMap<String, Association> associationsTemp = this.associations;

        for ( Association associationTemp : associationsTemp.values() )
		{

			if (associationTemp.isStarted())
			{
				((AssociationImpl) associationTemp).stop();
			}
		}

        for ( Server serverTemp : servers )
		{

			if (serverTemp.isStarted())
			{
				try
				{
					((ServerImpl) serverTemp).stop();
				}
				catch (Exception e)
				{
					logger.error(String.format("Exception while stopping the Server=%s", serverTemp.getName()), e);
				}
			}
		}

		if ( this.executorServices != null )
		{
			for (int i = 0; i < this.executorServices.length; i++)
			{
				this.executorServices[i].shutdown();
			}
		}

		this.selectorThread.setStarted(false);
		this.socketSelector.wakeup(); // Wakeup selector so SelectorThread dies

		// waiting till stopping associations
		for (int i1 = 0; i1 < 20; i1++)
		{
			boolean associationStillConnected = false;

            for ( Association associationTemp : this.associations.values() )
			{

				if (associationTemp.isConnected())
				{
					associationStillConnected = true;
					break;
				}
			}
			if ( ! associationStillConnected )
				break;
			Thread.sleep(100);
		}

		// Graceful shutdown for each of Executors
		if (this.executorServices != null)
		{
			for (int i = 0; i < this.executorServices.length; i++)
			{
				if ( ! this.executorServices[i].isTerminated() )
				{
					if ( logger.isInfoEnabled() )
					{
						logger.info("Waiting for worker thread to die gracefully ....");
					}

					try {
						this.executorServices[i].awaitTermination(5000, TimeUnit.MILLISECONDS);
					} catch (InterruptedException e) {
						// Do we care?
					}
				}
			}
		}

		this.started = false;
	}

	@Override
	public boolean isStarted()
	{
		return this.started;
	}

	@SuppressWarnings("unchecked")
	public void load()
			throws FileNotFoundException
	{
		XMLObjectReader reader = null;
		try
		{
			reader = XMLObjectReader.newInstance(new FileInputStream(persistFile.toString()));
			reader.setBinding(binding);
			this.servers = reader.read(SERVERS, List.class);

            for ( Server serverTemp : this.servers )
			{

				((ServerImpl) serverTemp).setManagement(this);
				if (serverTemp.isStarted())
				{
					try
					{
						((ServerImpl) serverTemp).start();
					}
					catch (Exception e)
					{
						logger.error(String.format("Error while initiating Server=%s", serverTemp.getName()), e);
					}
				}
			}

			this.associations = reader.read(ASSOCIATIONS, AssociationMap.class);

            for ( Association associationTemp : this.associations.values() )
			{
				AssociationImpl associationTempImp = (AssociationImpl) associationTemp;
                associationTempImp.setManagement(this);
			}

		}
		catch (XMLStreamException ex)
		{
			logger.info( "Error while re-creating LinkSets from persisted file", ex);
		}
	}

	public void store()
	{
		try
		{
			XMLObjectWriter writer = XMLObjectWriter.newInstance(new FileOutputStream(persistFile.toString()));
			writer.setBinding(binding);
			// Enables cross-references.
			// writer.setReferenceResolver(new XMLReferenceResolver());
			writer.setIndentation(TAB_INDENT);
			writer.write(this.servers, SERVERS, List.class);
			writer.write(this.associations, ASSOCIATIONS, AssociationMap.class);

			writer.close();
		}
		catch (Exception e)
		{
			logger.error("Error while persisting the Rule state in file", e);
		}
	}

	@Override
	public void removeAllResources()
			throws Exception
	{

		synchronized (this)
		{
			if ( ! this.started )
			{
				throw new Exception(String.format("Management=%s not started", this.name));
			}

			if (this.associations.size() == 0 && this.servers.size() == 0)
				// no resources allocated - nothing to do
				return;

			if (logger.isInfoEnabled())
			{
				logger.info(
						String.format(
								"Removing allocated resources: Servers=%d, Associations=%d",
								this.servers.size(), this.associations.size()));
			}

			synchronized (this)
			{
				// Remove all associations
				ArrayList<String> list = new ArrayList<>();

                for (String key : this.associations.keySet())
				{
					list.add(key);
				}

				for ( String n : list )
				{
					this.stopAssociation(n);
					this.removeAssociation(n);
				}

				// Remove all servers
				list.clear();
                for (Server server : this.servers)
				{
					list.add(server.getName());
				}

				for (String n : list)
				{
					this.stopServer(n);
					this.removeServer(n);
				}

				// We store the cleared state
				this.store();
			}

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onRemoveAllResources();
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onRemoveAllResources", ee);
				}
			}
		}
	}

	@Override
	public ServerImpl addServer(String serverName,
								String hostAddress,
								int port )
			throws Exception
	{
		return addServer( serverName, hostAddress, port, IpChannelType.SCTP, false, 0, null );
	}

	public Server addServer(String serverName,
							String hostAddress,
							int port,
							IpChannelType ipChannelType,
							String[] extraHostAddresses)
			throws Exception
	{
		return addServer(serverName, hostAddress, port, ipChannelType, false, 0, extraHostAddresses);
	}

	public ServerImpl addServer(String serverName,
								String hostAddress,
								int port,
								IpChannelType ipChannelType,
								boolean acceptAnonymousConnections,
								int maxConcurrentConnectionsCount,
								String[] extraHostAddresses)
			throws Exception
	{

        logger.debug("Is SCTP Server named " + this.name + " started? : " + this.started );

        if (!this.started)
		{
            logger.error("Quiting. Can not add server to a SCTP server that is not running.");
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (serverName == null)
		{
            logger.error("Server name cannot be null");
			throw new Exception("Server name cannot be null");
		}

		if (hostAddress == null)
		{
            logger.error("Server host address cannot be null");
			throw new Exception("Server host address cannot be null");
		}

		if (port < 1)
		{
            logger.error("Server host port cannot be less than 1");
			throw new Exception("Server host port cannot be less than 1");
		}

        logger.info("Servers connected count : " + this.servers.size());

		synchronized (this)
		{
            for ( Server serverTemp : this.servers)
			{

				if (serverName.equals(serverTemp.getName()))
				{
                    logger.error(String.format("Server name=%s already exist", serverName));
					throw new Exception(String.format("Server name=%s already exist", serverName));
				}

				if (hostAddress.equals(serverTemp.getHostAddress()) && port == serverTemp.getHostPort())
				{
                    logger.error((
							String.format(
									"Server name=%s is already bound to %s:%d",
									serverTemp.getName(), serverTemp.getHostAddress(), serverTemp.getHostPort())));
					throw new Exception(
							String.format("Server name=%s is already bound to %s:%d",
									serverTemp.getName(), serverTemp.getHostAddress(), serverTemp.getHostPort()));
				}
			}

            logger.info("New server with IP Address : " + hostAddress + ", port : " + port );

			ServerImpl server
					= new ServerImpl( serverName,
									  hostAddress,
									  port,
									  ipChannelType,
									  acceptAnonymousConnections,
									  maxConcurrentConnectionsCount,
									  extraHostAddresses );
			server.setManagement(this);

			List<Server> newServers = new ArrayList<>();
			newServers.addAll(this.servers);
			newServers.add(server);
			this.servers = newServers;
			// this.servers.add(server);

			this.store();

			for ( ManagementEventListener listener : managementEventListeners )
			{
				try
				{
					listener.onServerAdded( server );
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onServerAdded", ee);
				}
			}

			if (logger.isInfoEnabled())
			{
				logger.info(String.format("Created Server=%s", server.getName()));
			}

			return server;
		}
	}

	public void removeServer( String serverName )
			throws Exception
	{

		if (!this.started) {
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (serverName == null)
		{
			throw new Exception("Server name cannot be null");
		}

		synchronized (this)
		{
			Server removeServer = null;
            for (Server server : this.servers)
			{

				ServerImpl serverTemp = (ServerImpl)server;

				if (serverName.equals(serverTemp.getName()))
				{
					if (serverTemp.isStarted())
					{
						throw new Exception(
								String.format("Server=%s is started. Stop the server before removing", serverName));
					}
					
					if ( serverTemp.anonymousAssociations.size() != 0 || serverTemp.associations.size() != 0 )
					{
						throw new Exception(
								String.format("Server=%s has Associations. Remove all those Associations before" +
												" removing Server", serverName));
					}
					removeServer = serverTemp;
					break;
				}
			}

			if (removeServer == null)
			{
				throw new Exception(String.format("No Server found with name=%s", serverName));
			}

			List<Server> newServers = new ArrayList<>();
			newServers.addAll(this.servers);
			newServers.remove(removeServer);
			this.servers = newServers;
			// this.servers.remove(removeServer);

			this.store();

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onServerRemoved(removeServer);
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onServerRemoved", ee);
				}
			}
		}
	}

	public void startServer(String serverName)
			throws Exception
	{

		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (name == null)
		{
			throw new Exception("Server name cannot be null");
		}

		List<Server> tempServers = servers;

        for (Server serverTemp : tempServers)
		{

			if (serverName.equals(serverTemp.getName()))
			{
				if (serverTemp.isStarted())
				{
					throw new Exception(String.format("Server=%s is already started", serverName));
				}
				((ServerImpl) serverTemp).start();
				this.store();
				return;
			}
		}

		throw new Exception(String.format("No Server found with name=%s", serverName));
	}

	public void stopServer(String serverName)
			throws Exception
	{

		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (serverName == null)
		{
			throw new Exception("Server name cannot be null");
		}

        for (Server serverTemp : servers )
		{
			if (serverName.equals(serverTemp.getName()))
			{
				((ServerImpl) serverTemp).stop();
				this.store();
				return;
			}
		}

		throw new Exception(String.format("No Server found with name=%s", serverName));
	}

	public AssociationImpl addServerAssociation(String peerAddress,
												int peerPort,
												String serverName,
												String assocName)
			throws Exception
	{
		return addServerAssociation(peerAddress, peerPort, serverName, assocName, IpChannelType.SCTP);
	}

	public AssociationImpl addServerAssociation(String peerAddress,
												int peerPort,
												String serverName,
												String assocName,
												IpChannelType ipChannelType)
			throws Exception
	{
		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (peerAddress == null)
		{
			throw new Exception("Peer address cannot be null");
		}

		if (peerPort < 1)
		{
			throw new Exception("Peer port cannot be less than 1");
		}

		if (serverName == null)
		{
			throw new Exception("Server name cannot be null");
		}

		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}

		synchronized (this)
		{
			if (this.associations.get(assocName) != null)
			{
				throw new Exception(String.format("Already has association=%s", assocName));
			}

			Server server = null;

            for (Server serverTemp : this.servers )
			{

				if (serverTemp.getName().equals(serverName))
				{
					server = serverTemp;
				}
			}

			if (server == null)
			{
				throw new Exception(String.format("No Server found for name=%s", serverName));
			}

            for ( Association associationTemp : this.associations.values() )
			{

				if (peerAddress.equals(associationTemp.getPeerAddress()) && associationTemp.getPeerPort() == peerPort)
				{
					throw new Exception(String.format("Already has association=%s with same peer address=%s and port=%d", associationTemp.getName(),
							peerAddress, peerPort));
				}
			}

			if (server.getIpChannelType() != ipChannelType)
				throw new Exception(String.format("Server and Accociation has different IP channel type"));

			AssociationImpl association = new AssociationImpl(peerAddress, peerPort, serverName, assocName, ipChannelType);
			association.setManagement(this);

			AssociationMap<String, Association> newAssociations = new AssociationMap<String, Association>();
			newAssociations.putAll(this.associations);
			newAssociations.put(assocName, association);
			this.associations = newAssociations;
			// this.associations.put(assocName, association);

			List<String> newAssociations2 = new ArrayList<String>();
			newAssociations2.addAll(((ServerImpl) server).associations);
			newAssociations2.add(assocName);
			((ServerImpl) server).associations = newAssociations2;
			// ((ServerImpl) server).associations.add(assocName);

			this.store();

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onAssociationAdded(association);
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onAssociationAdded", ee);
				}
			}

			if (logger.isInfoEnabled())
			{
				logger.info(String.format("Added Association=%s of type=%s",
						association.getName(), association.getAssociationType()));
			}

			return association;
		}
	}

	public AssociationImpl addAssociation(	String hostAddress,
											int hostPort,
											String peerAddress,
											int peerPort,
											String assocName)
			throws Exception
	{
		return addAssociation(hostAddress, hostPort, peerAddress, peerPort, assocName, IpChannelType.SCTP, null);
	}

	public AssociationImpl addAssociation( 	String hostAddress,
											int hostPort,
											String peerAddress,
											int peerPort,
											String assocName,
											IpChannelType ipChannelType,
											String[] extraHostAddresses)
			throws Exception
	{

		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (hostAddress == null)
		{
			throw new Exception("Host address cannot be null");
		}

		if (hostPort < 0)
		{
			throw new Exception("Host port cannot be less than 0");
		}

		if (peerAddress == null)
		{
			throw new Exception("Peer address cannot be null");
		}

		if (peerPort < 1)
		{
			throw new Exception("Peer port cannot be less than 1");
		}

		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}

		synchronized (this)
		{

            for (Association associationTemp : this.associations.values() )
			{

				if (assocName.equals(associationTemp.getName()))
				{
					throw new Exception(String.format("Already has association=%s", associationTemp.getName()));
				}

				if (peerAddress.equals(associationTemp.getPeerAddress()) && associationTemp.getPeerPort() == peerPort)
				{
					throw new Exception(String.format("Already has association=%s with same peer address=%s and port=%d", associationTemp.getName(),
							peerAddress, peerPort));
				}

				if (hostAddress.equals(associationTemp.getHostAddress()) && associationTemp.getHostPort() == hostPort)
				{
					throw new Exception(String.format("Already has association=%s with same host address=%s and port=%d", associationTemp.getName(),
							hostAddress, hostPort));
				}

			}

			AssociationImpl association
					= new AssociationImpl( 	hostAddress,
											hostPort,
											peerAddress,
											peerPort,
											assocName,
											ipChannelType,
											extraHostAddresses);
			association.setManagement(this);

			AssociationMap<String, Association> newAssociations = new AssociationMap<String, Association>();
			newAssociations.putAll(this.associations);
			newAssociations.put(assocName, association);
			this.associations = newAssociations;
			// associations.put(assocName, association);

			this.store();

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onAssociationAdded(association);
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onAssociationAdded", ee);
				}
			}

			if (logger.isInfoEnabled())
			{
				logger.info(String.format("Added Associoation=%s of type=%s",
						association.getName(), association.getAssociationType()));
			}

			return association;
		}
	}

	public Association getAssociation(String assocName)
			throws Exception
	{
		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}
		Association associationTemp = this.associations.get(assocName);

		if (associationTemp == null)
		{
			throw new Exception(String.format("No Association found for name=%s", assocName));
		}

		return associationTemp;
	}

	public Map<String, Association> getAssociations()
	{
		Map<String, Association> routeTmp = new HashMap<>();
		routeTmp.putAll(this.associations);

		return routeTmp;
	}

	public void startAssociation(String assocName)
			throws Exception
	{
		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}

		Association associationTemp = this.associations.get(assocName);

		if (associationTemp == null)
		{
			throw new Exception(String.format("No Association found for name=%s", assocName));
		}

		if (associationTemp.isStarted())
		{
			throw new Exception(String.format("Association=%s is already started", assocName));
		}

		((AssociationImpl) associationTemp).start();
		this.store();
	}

	public void stopAssociation(String assocName)
			throws Exception
	{
		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}

		Association association = this.associations.get(assocName);

		if (association == null)
		{
			throw new Exception(String.format("No Association found for name=%s", assocName));
		}

		((AssociationImpl) association).stop();
		this.store();
	}

	public void removeAssociation(String assocName)
			throws Exception
	{
		if (!this.started)
		{
			throw new Exception(String.format("Management=%s not started", this.name));
		}

		if (assocName == null)
		{
			throw new Exception("Association name cannot be null");
		}

		synchronized (this)
		{
			Association association = this.associations.get(assocName);

			if (association == null)
			{
				throw new Exception(String.format("No Association found for name=%s", assocName));
			}

			if (association.isStarted())
			{
				throw new Exception(String.format("Association name=%s is started. Stop before removing", assocName));
			}

			AssociationMap<String, Association> newAssociations = new AssociationMap<String, Association>();
			newAssociations.putAll(this.associations);
			newAssociations.remove(assocName);
			this.associations = newAssociations;
			// this.associations.remove(assocName);

			if (((AssociationImpl) association).getAssociationType() == AssociationType.SERVER)
			{

                for (Server serverTemp : this.servers )
				{

					if (serverTemp.getName().equals(association.getServerName()))
					{
						List<String> newAssociations2 = new ArrayList<>();
						newAssociations2.addAll(((ServerImpl) serverTemp).associations);
						newAssociations2.remove(assocName);
						((ServerImpl) serverTemp).associations = newAssociations2;
						// ((ServerImpl)
						// serverTemp).associations.remove(assocName);

						break;
					}
				}
			}

			this.store();

			for (ManagementEventListener listener : managementEventListeners)
			{
				try
				{
					listener.onAssociationRemoved(association);
				}
				catch (Throwable ee)
				{
					logger.error("Exception while invoking onAssociationRemoved", ee);
				}
			}
		}
	}

	public List<Server> getServers()
	{
		return servers;
	}

	protected List<ChangeRequest> getPendingChanges()
	{
		return pendingChanges;
	}

	protected Selector getSocketSelector()
	{
		return socketSelector;
	}

	protected void populateWorkerThread(int workerThreadTable[])
	{
		for (int count = 0; count < workerThreadTable.length; count++)
		{
			if (this.workerThreadCount == this.workerThreads)
			{
				this.workerThreadCount = 0;
			}

			workerThreadTable[count] = this.workerThreadCount;
			this.workerThreadCount++;
		}
	}

	protected ExecutorService getExecutorService(int index)
	{
		return this.executorServices[index];
	}
}
