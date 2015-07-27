/* eBridge SS7 */

package za.co.ebridge.map.api.errors;

import za.co.ebridge.map.api.primitives.MAPExtensionContainer;

/**
 *
 * absentSubscriberSM ERROR ::= { PARAMETER AbsentSubscriberSM-Param -- optional CODE local:6 }
 *
 *
 * AbsentSubscriberSM-Param ::= SEQUENCE { absentSubscriberDiagnosticSM AbsentSubscriberDiagnosticSM OPTIONAL, --
 * AbsentSubscriberDiagnosticSM can be either for non-GPRS -- or for GPRS extensionContainer ExtensionContainer OPTIONAL, ...,
 * additionalAbsentSubscriberDiagnosticSM [0] AbsentSubscriberDiagnosticSM OPTIONAL } -- if received,
 * additionalAbsentSubscriberDiagnosticSM -- is for GPRS and absentSubscriberDiagnosticSM is -- for non-GPRS
 *
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface MAPErrorMessageAbsentSubscriberSM extends MAPErrorMessage {

    MAPExtensionContainer getExtensionContainer();

    AbsentSubscriberDiagnosticSM getAbsentSubscriberDiagnosticSM();

    AbsentSubscriberDiagnosticSM getAdditionalAbsentSubscriberDiagnosticSM();

    void setAbsentSubscriberDiagnosticSM(AbsentSubscriberDiagnosticSM absentSubscriberDiagnosticSM);

    void setExtensionContainer(MAPExtensionContainer extensionContainer);

    void setAdditionalAbsentSubscriberDiagnosticSM(AbsentSubscriberDiagnosticSM additionalAbsentSubscriberDiagnosticSM);

}
