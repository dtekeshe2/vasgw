package za.co.ebridge.sctp.api;

import java.util.List;

/**
 * A wrapper over actual server side Socket
 * 
 * @author david@tekeshe.com
 * 
 */
public interface Server
{

	/**
	 * Get the Server channel type - TCP or SCTP
	 */
	public IpChannelType getIpChannelType();

	/**
	 * Return if this Server accepts Anonymous connections
	 */
	public boolean isAcceptAnonymousConnections();

	/**
	 * Return the count of concurrent connections that can accept a Server.
	 * Zero means an unlimited count.
	 */
	public int getMaxConcurrentConnectionsCount();

	/**
	 * Set the count of concurrent connections that can accept a Server.
	 * Zero means an unlimited count.
	 */
	public void setMaxConcurrentConnectionsCount( int val );

	/**
	 * Get name of this Server.
	 * Should be unique in a management instance
	 */
	public String getName();

	/**
	 * The host address that this server socket is bound to
	 */
	public String getHostAddress();

	/**
	 * The host port that this server socket is bound to
	 */
	public int getHostPort();
	
	/**
	 * SCTP multi-homing configuration extra IP addresses
	 */
	public String[] getExtraHostAddresses();

	/**
	 * Is this server started
	 */
	public boolean isStarted();

	/**
	 * Association configured for this Server
	 * Anonymous associations are not present in this list
	 */
	public List<String> getAssociations();

	/**
	 * Returns an unmodifiable list of anonymous associations that are connected at the moment
	 */
	public List<Association> getAnonymousAssociations();
}
