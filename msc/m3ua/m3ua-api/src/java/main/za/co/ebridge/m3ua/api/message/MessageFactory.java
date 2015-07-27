package za.co.ebridge.m3ua.api.message;

import java.nio.ByteBuffer;

/**
 * Constructs M3UA message.
 */
public interface MessageFactory
{
    M3UAMessage createMessage(int messageClass, int messageType);

    M3UAMessage createSctpMessage(byte[] buffer);

    M3UAMessage createMessage(ByteBuffer buffer);
}
