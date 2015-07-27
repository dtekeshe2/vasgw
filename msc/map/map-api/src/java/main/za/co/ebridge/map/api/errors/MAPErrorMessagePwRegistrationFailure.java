/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

/**
 *
 pw-RegistrationFailure ERROR ::= { PARAMETER PW-RegistrationFailureCause CODE local:37 }
 *
 * PW-RegistrationFailureCause ::= ENUMERATED { undetermined (0), invalidFormat (1), newPasswordsMismatch (2)}
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessagePwRegistrationFailure extends MAPErrorMessage {

    PWRegistrationFailureCause getPWRegistrationFailureCause();

    void setPWRegistrationFailureCause(PWRegistrationFailureCause val);

}
