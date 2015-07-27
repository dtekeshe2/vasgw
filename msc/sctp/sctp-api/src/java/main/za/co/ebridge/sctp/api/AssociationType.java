package za.co.ebridge.sctp.api;

public enum AssociationType
{
	CLIENT("CLIENT"),
	SERVER("SERVER"),
	ANONYMOUS_SERVER("ANONYMOUS_SERVER");

	private final String type;

	private AssociationType(String type)
	{
		this.type = type;
	}

	public String getType()
	{
		return type;
	}

	public static AssociationType getAssociationType(String type)
	{
		if (type == null)
		{
			return null;
		}
		else if (type.equalsIgnoreCase(CLIENT.getType()))
		{
			return CLIENT;
		}
		else if (type.equalsIgnoreCase(SERVER.getType()))
		{
			return SERVER;
		}
		else if (type.equalsIgnoreCase(ANONYMOUS_SERVER.getType()))
		{
			return ANONYMOUS_SERVER;
		}
		else
		{
			return null;
		}
	}
}
