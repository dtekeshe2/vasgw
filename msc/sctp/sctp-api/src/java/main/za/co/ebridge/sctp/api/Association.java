package za.co.ebridge.sctp.api;

/**
 * A protocol relationship between endpoints
 * A wrapper over socket that knows how to communicate with peer.
 * The user of Association shouldn't care if the underlying socket is client or server side
 */
public interface Association
{

	/**
	 * Return the Association channel type TCP (packet-oriented) or SCTP (stream-oriented)
	 */
	public IpChannelType getIpChannelType();

	/**
	 * Return the type of Association CLIENT or SERVER
	 */
	public AssociationType getAssociationType();

	/**
	 * Unique name for this Association
	 */
	public String getName();

	/**
	 * Is this association is started
	 */
	public boolean isStarted();

	/**
	 * Is this Association up (Connection is started and established)
	 */
	public boolean isConnected();

	/**
	 * Is this Association up (Connection is established)
	 */
	public boolean isUp();

	/**
	 * The AssociationListener registered for this Association
	 */
	public AssociationListener getAssociationListener();

	/**
	 * The {@link AssociationListener} to be registered for this Association
	 */
	public void setAssociationListener( AssociationListener associationListener );

	/**
	 * The underlying socket is bound to
	 */
	public String getHostAddress();

	/**
	 * The underlying socket is bound to
	 */
	public int getHostPort();

	/**
	 * The underlying socket connects to
	 */
	public String getPeerAddress();

	/**
	 * The underlying socket is connected to
	 */
	public int getPeerPort();

	/**
	 * If the association is for a {@link Server}
	 */
	public String getServerName();
	
	/**
	 * When SCTP multi-homing configuration extra IP addresses
	 */
	public String[] getExtraHostAddresses();

	/**
	 * Send the {@link PayloadData} to the peer
	 */
	public void send( PayloadData payloadData ) throws Exception;

	/**
	 * Use this method only for accepting anonymous connections
	 * from the ServerListener.onNewRemoteConnection() invoking
	 */
	public void acceptAnonymousAssociation(AssociationListener associationListener) throws Exception;

	/**
	 * Use this method only for rejecting anonymous connections
	 * from the ServerListener.onNewRemoteConnection() invoking
	 */
	public void rejectAnonymousAssociation();

	/**
	 * Stop the anonymous association. The connection will be closed and we will not reuse this association
	 * This can be applied only for anonymous association, other associations must be stopped by 
	 * Management.stopAssociation(String assocName)
	 */
	public void stopAnonymousAssociation() throws Exception;
}
