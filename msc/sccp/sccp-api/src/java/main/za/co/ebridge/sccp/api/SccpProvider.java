package za.co.ebridge.sccp.api;

import java.io.IOException;
import java.io.Serializable;

import za.co.ebridge.sccp.api.message.MessageFactory;
import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.parameter.ParameterFactory;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public interface SccpProvider
        extends Serializable
{

    /**
     * Gets the access to message factory.
     *
     * @return message factory.
     */
    MessageFactory getMessageFactory();

    /**
     * Gets the access to parameter factory.
     *
     * @return parameter factory
     */
    ParameterFactory getParameterFactory();

    /**
     * Register listener for some adddress.
     *
     * @param listener
     */
    void registerSccpListener(int ssn, SccpListener listener);

    /**
     * Removes listener
     */
    void deregisterSccpListener(int ssn);

    void registerManagementEventListener(SccpManagementEventListener listener);

    void deregisterManagementEventListener(SccpManagementEventListener listener);

    /**
     * Sends message.
     *
     * @param message Message to be sent
     * @throws IOException
     */
    void send(SccpDataMessage message)
            throws
            IOException;

    /**
     * Return the maximum length (in bytes) of the sccp message data
     *
     * @param calledPartyAddress
     * @param callingPartyAddress
     * @return
     */
    int getMaxUserDataLength(SccpAddress calledPartyAddress, SccpAddress callingPartyAddress);

}
