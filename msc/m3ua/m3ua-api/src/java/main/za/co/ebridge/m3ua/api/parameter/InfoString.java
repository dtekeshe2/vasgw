package za.co.ebridge.m3ua.api.parameter;

/**
 * The optional INFO String parameter can carry any meaningful UTF-8 [10] character string along with the message.
 * Length of the INFO String parameter is from 0 to 255 octets.
 */
public interface InfoString
        extends Parameter
{
    String getString();
}
