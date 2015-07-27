package za.co.ebridge.sctp.api;

public enum IpChannelType
{
	SCTP(0, "SCTP"), TCP(1, "TCP");

	int code;
	String type;

	private IpChannelType(int code, String type)
	{
		this.code = code;
		this.type = type;
	}

	public int getCode()
	{
		return this.code;
	}

	public String getType()
	{
		return type;
	}

	public static IpChannelType getInstance( int code )
	{
		switch (code)
		{
		case 0:
			return IpChannelType.SCTP;
		case 1:
			return IpChannelType.TCP;
		}

		return null;
	}

	public static IpChannelType getInstance(String type)
	{
		if (type.equalsIgnoreCase("SCTP"))
		{
			return SCTP;
		}
		else if (type.equalsIgnoreCase("TCP"))
		{
			return TCP;
		}
		
		return null;
	}
}
