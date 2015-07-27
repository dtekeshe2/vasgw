package za.co.ebridge.m3ua.api.parameter;

/**
 * Protocol data parameter.
 */
public interface ProtocolData
        extends Parameter
{
    /**
     * @return origination point code value in decimal format.
     */
    int getOpc();

    /**
     * @return destination point code value in decimal format
     */
    int getDpc();

    /**
     * @return service indicator value.
     */
    int getSI();

    /**
     * @return the network indicator value.
     */
    int getNI();

    /**
     * @return message priority value.
     */
    int getMP();

    /**
     * @return the signaling link selection value
     */
    int getSLS();

    /**
     * @return payload of binary message.
     */
    byte[] getData();
}
