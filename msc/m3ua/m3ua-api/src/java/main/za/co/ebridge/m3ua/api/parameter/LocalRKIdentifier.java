package za.co.ebridge.m3ua.api.parameter;

/**
 * The mandatory Local-RK-Identifier field is used to uniquely identify the registration request.
 * The Identifier value is assigned by the ASP
 * and used to correlate the response in an REG RSP message with the original registration request.
 * The Identifier value must remain unique until the REG RSP message is received.
 */
public interface LocalRKIdentifier
        extends Parameter
{
    long getId();
}
