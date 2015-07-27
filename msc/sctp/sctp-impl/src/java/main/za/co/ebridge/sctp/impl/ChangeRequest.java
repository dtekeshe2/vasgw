package za.co.ebridge.sctp.impl;

import java.nio.channels.spi.AbstractSelectableChannel;

public final class ChangeRequest
{
	public static final int REGISTER = 1;
	public static final int CHANGEOPS = 2;
	public static final int CONNECT = 3;
	public static final int CLOSE = 4;

	private int type;
	private int ops;
	private AbstractSelectableChannel socketChannel;
	private AssociationImpl association;

	private long executionTime;

	protected ChangeRequest(AbstractSelectableChannel socketChannel, AssociationImpl association, int type, int ops)
	{
		this.type = type;
		this.ops = ops;
		this.socketChannel = socketChannel;
		this.association = association;
	}

	protected ChangeRequest(AssociationImpl association, int type, long executionTime)
	{
		this(null, association, type, -1);
		this.executionTime = executionTime;
	}

	protected int getType()
	{
		return type;
	}

	protected int getOps()
	{
		return ops;
	}

	protected AbstractSelectableChannel getSocketChannel()
	{
		return socketChannel;
	}

	protected AssociationImpl getAssociation()
	{
		return association;
	}

	protected long getExecutionTime()
	{
		return executionTime;
	}
}
