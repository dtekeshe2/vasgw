package za.co.ebridge.m3ua.api.parameter;

/**
 * When included, the optional Diagnostic Information can be any information germane to the error condition,
 * to assist in identification of the error condition.
 * The Diagnostic Information SHOULD contain the offending message.
 * A Diagnostic Information parameter with a zero length parameter is not considered an error
 * (this means that the Length field in the TLVwill be set to 4).
 */
public interface DiagnosticInfo
        extends Parameter
{
    String getInfo();
}
