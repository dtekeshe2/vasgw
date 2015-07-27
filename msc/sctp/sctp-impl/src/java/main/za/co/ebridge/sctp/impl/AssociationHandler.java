package za.co.ebridge.sctp.impl;

import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

import com.sun.nio.sctp.AbstractNotificationHandler;
import com.sun.nio.sctp.AssociationChangeNotification;
import com.sun.nio.sctp.HandlerResult;
import com.sun.nio.sctp.PeerAddressChangeNotification;
import com.sun.nio.sctp.SendFailedNotification;
import com.sun.nio.sctp.ShutdownNotification;

 // TODO Override all methods? // TODO Add Association name for logging
class AssociationHandler
		 extends AbstractNotificationHandler<AssociationImpl>
 {

	private static final Logger logger = Logger.getLogger(AssociationHandler.class);
	
	// Default value is 1 for TCP
	private volatile int maxInboundStreams = 1;
	private volatile int maxOutboundStreams = 1;

	public AssociationHandler()
	{
	}

	public int getMaxInboundStreams()
	{
		return maxInboundStreams;
	}

	public int getMaxOutboundStreams()
	{
		return maxOutboundStreams;
	}

	@Override
	public HandlerResult handleNotification(AssociationChangeNotification notification, AssociationImpl association)
	{
		switch ( notification.event() )
		{
			case COMM_UP:
				if (notification.association() != null)
				{
					this.maxOutboundStreams = notification.association().maxOutboundStreams();
					this.maxInboundStreams = notification.association().maxInboundStreams();
				}

				if (logger.isInfoEnabled())
				{
					logger.info(
							String.format(
									"New association setup for Association=%s with %d outbound streams, and %d inbound" +
											" streams.\n",
									association.getName(), this.maxOutboundStreams, this.maxInboundStreams));
				}

				association.createworkerThreadTable(Math.max(this.maxInboundStreams, this.maxOutboundStreams));

				// TODO assign Thread's ?
				try
				{
					association.markAssociationUp();
					association
							.getAssociationListener()
							.onCommunicationUp(association, this.maxInboundStreams, this.maxOutboundStreams);
				}
				catch (Exception e)
				{
					logger.error(String.format(
							"Exception while calling onCommunicationUp on AssociationListener for Association=%s",
							association.getName()), e);
				}
				return HandlerResult.CONTINUE;

			case CANT_START:
				logger.error(String.format("Can't start for Association=%s", association.getName()));
				return HandlerResult.CONTINUE;

			case COMM_LOST:
				logger.warn(String.format("Communication lost for Association=%s", association.getName()));

				// Close the Socket
				association.close();

				association.scheduleConnect();
				try
				{
					association.markAssociationDown();
					association.getAssociationListener().onCommunicationLost(association);
				}
				catch (Exception e)
				{
					logger.error(
							String.format(
								"Exception while calling onCommunicationLost on AssociationListener for Association=%s",
									association.getName()), e);
				}
				return HandlerResult.RETURN;

			case RESTART:
				logger.warn(String.format("Restart for Association=%s", association.getName()));
				try
				{
					association.getAssociationListener().onCommunicationRestart(association);
				}
				catch (Exception e)
				{
					logger.error(
							String.format(
								"Exception while calling onCommunicationRestart on AssociationListener " +
										"for Association=%s", association.getName()), e);
				}
				return HandlerResult.CONTINUE;

			case SHUTDOWN:
				if (logger.isInfoEnabled())
				{
					logger.info(String.format("Shutdown for Association=%s", association.getName()));
				}
				try
				{
					association.markAssociationDown();
					association.getAssociationListener().onCommunicationShutdown(association);
				}
				catch (Exception e)
				{
					logger.error(
							String.format(
									"Exception while calling onCommunicationShutdown on AssociationListener" +
											" for Association=%s", association.getName()), e);
				}
				return HandlerResult.RETURN;

			default:
				logger.warn(
						String.format(
								"Received unknown Event=%s for Association=%s",
								notification.event(), association.getName()));
				break;
		}

		return HandlerResult.CONTINUE;
	}

	@Override
	public HandlerResult handleNotification(ShutdownNotification not, AssociationImpl association)
	{
		if (logger.isInfoEnabled())
		{
			logger.info(String.format("Association=%s SHUTDOWN", association.getName()));
		}

		// TODO assign Thread's ?

		try
		{
			association.markAssociationDown();
			association.getAssociationListener().onCommunicationShutdown(association);
		}
		catch (Exception e)
		{
			logger.error(
					String.format(
							"Exception while calling onCommunicationShutdown on AssociationListener for Association=%s",
							association.getName()), e);
		}

		return HandlerResult.RETURN;
	}

	@Override
	public HandlerResult handleNotification(SendFailedNotification notification, AssociationImpl association)
	{
//        logger.error(String.format("Association=%s SendFailedNotification", associtaion.getName()));
        logger.error(
				String.format("Association=" + association.getName() + " SendFailedNotification, errorCode=" +
						notification.errorCode()));
		return HandlerResult.RETURN;
	}

	@Override
	public  HandlerResult handleNotification(PeerAddressChangeNotification notification, AssociationImpl association)
	{
		//associtaion.peerSocketAddress = notification.address();
		if(logger.isEnabledFor(Priority.WARN))
		{
			logger.warn(
					String.format("Peer Address changed to=%s for Association=%s",
							notification.address(), association.getName()));
		}
		return HandlerResult.CONTINUE;
	}
}
