package za.co.ebridge.m3ua.api.parameter;

/**
 * The optional ASP Identifier parameter contains a unique value that is locally significant among the ASPs
 * that support an AS.
 * The SGP should save the ASP Identifier to be used, if necessary, with the Notify message
 */
public interface ASPIdentifier
        extends Parameter
{
    long getAspId();
}
