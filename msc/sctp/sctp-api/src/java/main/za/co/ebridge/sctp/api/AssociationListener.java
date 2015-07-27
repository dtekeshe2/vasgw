package za.co.ebridge.sctp.api;

/**
 * The listener interface for receiving the underlying socket status and received payload from peer.
 * The class that is interested in receiving data must implement this interface,
 * and the object created with that class is registered with {@link Association}
 */
public interface AssociationListener
{

	/**
	 * Invoked when underlying socket is open and connection is established with peer.
	 * This is expected behavior when management starts the {@link Association}
	 * 
	 * @param association
	 * @param maxInboundStreams
	 *            Returns the maximum number of inbound streams that this association supports.
	 *            Data received on this association will be on stream number s, where 0 <= s < maxInboundStreams().
	 *            For TCP socket this value is always 1
	 * @param maxOutboundStreams
	 *            Returns the maximum number of outbound streams that this association supports.
	 *            Data sent on this association must be on stream number s, where 0 <= s < maxOutboundStreams().
	 *            For TCP socket this value is always 1
	 */
	public void onCommunicationUp( Association association, int maxInboundStreams, int maxOutboundStreams );

	/**
	 * Invoked when underlying socket is shutdown and connection is ended with peer.
	 * This is expected behavior when management stops the {@link Association}
	 */
	public void onCommunicationShutdown(Association association);

	/**
	 * Invoked when underlying socket loses the connection with peer due to any reason like network between peer's died
	 * etc.
	 * This is unexpected behavior and the underlying {@link Association} should try to re-establish the connection
	 */
	public void onCommunicationLost(Association association);

	/**
	 * Invoked when the connection with the peer is restarted. This is specific to SCTP protocol
	 */
	public void onCommunicationRestart(Association association);

	/**
	 * Invoked when a {@link PayloadData} is received from peer
	 */
	public void onPayload( Association association, PayloadData payloadData );

	/**
	 * The stream id set in outgoing {@link PayloadData} is invalid.
	 * This packet will be dropped after calling the listener.
	 * This callback is on same Thread as {@link SelectorThread}.
	 * Do not delay the process here as it will hold all other IO.
	 */
	public void inValidStreamId(PayloadData payloadData);

}
