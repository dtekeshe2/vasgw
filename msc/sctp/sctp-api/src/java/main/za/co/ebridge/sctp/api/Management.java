package za.co.ebridge.sctp.api;

import java.util.List;
import java.util.Map;

/**
 * Manages the underlying Association and Server
 * Management should persist the state of Server and Association
 * Management when started looks for file XXX_sctp.xml containing serialized state of underlying Association and Server
 * Set the directory path by calling setPersistDir to direct Management to look at specified directory for underlying
 * serialized file.
 * If directory path is not set, Management searches for system property sctp.persist.dir to get the path for directory
 * Even if sctp.persist.dir system property is not set, Management will look at System set property user.dir
 * 
 * @author david@tekeshe.com
 */
public interface Management
{

	/**
	 * Returns the name of this Management instance
	 */
	public String getName();

	/**
	 * Directory where the XXX.xml will be searched
	 */
	public String getPersistDir();

	/**
	 * Directory where the XXX.xml will be searched
	 */
	public void setPersistDir( String persistDir );

	/**
	* The AssociationListener set for this Association
	*/
	public ServerListener getServerListener();

	/**
	 * The AssociationListener to be registered for this Association
	 */
	public void setServerListener( ServerListener serverListener );

	/**
	 * Register for notifications for adding/removing servers and associations
	 */
	public void addManagementEventListener( ManagementEventListener listener );

	/**
	 * Stop listening to notifications for adding/removing servers and associations
	 */
	public void removeManagementEventListener( ManagementEventListener listener );

	/**
	 * Starts the management
	 * If Server and Association were defined previously, Management should recreate them
	 */
	public void start() throws Exception;

	/**
	 * Stop the management
	 * It should persist the state of Server and Association
	 */
	public void stop() throws Exception;
	
	/**
	 * returns true if Management is started
	 * @return
	 */
	public boolean isStarted();

	/**
	 * This method stops and removes all registered Servers and Associations
	 * Management should be started first
	 * Use this method only for test purposes or after total crashes
	 */
	// Move to test cases utilities
	@Deprecated
	public void removeAllResources() throws Exception;
	
	/**
	 * Add new Server
	 * @param hostAddress IP address that this server will bind to
	 * @param port that this server will bind to
	 * @param ipChannelType IP channel type: SCTP or TCP
	 * @param acceptAnonymousConnections
	 * @param maxConcurrentConnectionsCount
	 *            A count of concurrent connections that can accept a Server. 0 means an unlimited count.
	 * @param extraHostAddresses
	 *            When SCTP multi-homing configuration extra IP addresses can be put here
	 *            If multi-homing absence this parameter can be null 
	 * @return new Server instance
	 * @throws Exception
	 *             Exception if management not started or server name already
	 *             taken or some other server already has same ip:port
	 */
	public Server addServer( String serverName,
							 String hostAddress,
							 int port,
							 IpChannelType ipChannelType,
						     boolean acceptAnonymousConnections,
							 int maxConcurrentConnectionsCount,
							 String[] extraHostAddresses )
			throws Exception;

	@Deprecated
	public Server addServer( String serverName,
                             String hostAddress,
                             int port,
                             IpChannelType ipChannelType,
                             String[] extraHostAddresses)
			throws Exception;

	// IP channel type is SCTP. Server can not accept anonymous connections.
	@Deprecated
	public Server addServer(String serverName, String hostAddress, int port) throws Exception;
	
	/**
	 * Remove existing Server
	 *
	 * @throws Exception
	 *             Exception if no Server with the passed name exist or Server
	 *             is started. Before removing server, it should be stopped
	 */
	public void removeServer( String serverName ) throws Exception;

	/**
	 * Start the existing Server
	 * @throws Exception
	 *             Exception if no Server found for given name or Server already started
	 */
	public void startServer( String serverName ) throws Exception;

	/**
	 * Stop the Server
	 * @throws Exception
	 *             Exception if no Server found for given name or any of the
	 *             Association within Server still started. All the
	 *             Association's must be stopped before stopping Server
	 */
	public void stopServer(String serverName) throws Exception;

	/**
	 * Get the list of Servers configured
	 */
	public List<Server> getServers();

	/**
	 * Add server Association.
	 * 
	 * @param peerAddress the peer IP address that this association will accept connection from
	 * @param peerPort the peer port that this association will accept connection from
	 * @param serverName the Server that this association belongs to
	 * @param assocName unique name of Association
	 */
	public Association addServerAssociation( String peerAddress,
											 int peerPort,
										     String serverName,
										     String assocName )
			throws Exception;

	// IP channel type is SCTP.
	@Deprecated
	public Association addServerAssociation( String peerAddress,
                                             int peerPort,
                                             String serverName,
                                             String assocName,
                                             IpChannelType ipChannelType)
			throws Exception;

	/**
	 * Add Association
	 *
	 * @param hostPort zero this mean the local port will be any vacant port
	 * @param ipChannelType IP channel type: SCTP or TCP
	 * @param extraHostAddresses
	 *            When SCTP multi-homing configuration extra IP addresses can be put here
	 *            If multi-homing absence this parameter can be null 
	 * @return
	 * @throws Exception
	 */
	public Association addAssociation( String hostAddress,
									   int hostPort,
									   String peerAddress,
									   int peerPort,
									   String assocName,
									   IpChannelType ipChannelType,
								       String[] extraHostAddresses)
			throws Exception;

	@Deprecated
	public Association addAssociation( String hostAddress,
										int hostPort,
										String peerAddress,
										int peerPort,
										String assocName )
			throws Exception;

	/**
	 * Association should be stopped before removing
	 */
	public void removeAssociation( String assocName ) throws Exception;

	/**
	 * Get existing Association for passed name
	 */
	public Association getAssociation( String assocName ) throws Exception;

	/**
	 * Get configured Association map with name as key and Association instance as value
	 */
	public Map<String, Association> getAssociations();

	/**
	 * Start the existing Association
	 */
	public void startAssociation( String assocName ) throws Exception;

	/**
	 * Stop the existing Association
	 */
	public void stopAssociation( String assocName ) throws Exception;

	/**
	 * Get connection delay. If the client side Association dies due to network failure or any other reason,
	 * it should attempt to reconnect after connectDelay interval
	 */
	public int getConnectDelay();

	/**
	 * Set the connection delay for client side Association
	 */
	public void setConnectDelay( int connectDelay);

	/**
	 * Number of threads configured to callback AssociationListener methods
	 */
	public int getWorkerThreads();

	/**
	 * Number of threads configured for callback AssociationListener
	 */
	public void setWorkerThreads( int workerThreads );

	/**
	 * If set as single thread, number of workers thread set has no effect and
	 * entire protocol stack runs on single thread
	 */
	public boolean isSingleThread();

	/**
	 * Set protocol stack as single thread
	 */
	public void setSingleThread(boolean singleThread);
}
