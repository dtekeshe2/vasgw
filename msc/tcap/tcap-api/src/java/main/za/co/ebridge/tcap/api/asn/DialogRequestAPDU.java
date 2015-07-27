/* eBridge SS7 */

/**
 *
 */

package za.co.ebridge.tcap.api.asn;

/**
 * @author baranowb
 *
 */
public interface DialogRequestAPDU extends DialogAPDU {

    void setDoNotSendProtocolVersion(boolean val);

    ProtocolVersion getProtocolVersion();

    // mandatory
    ApplicationContextName getApplicationContextName();

    void setApplicationContextName(ApplicationContextName acn);

    // opt
    UserInformation getUserInformation();

    void setUserInformation(UserInformation ui);

}
