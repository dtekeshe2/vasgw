/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

import org.apache.log4j.Logger;
import za.co.ebridge.m3ua.api.message.rkm.DeregistrationRequest;
import za.co.ebridge.m3ua.api.message.rkm.DeregistrationResponse;
import za.co.ebridge.m3ua.api.message.rkm.RegistrationRequest;
import za.co.ebridge.m3ua.api.message.rkm.RegistrationResponse;

/**
 *
 * @author amit bhayani
 *
 */
public class RoutingKeyManagementHandler extends MessageHandler {
    private static final Logger logger = Logger.getLogger(RoutingKeyManagementHandler.class);

    public RoutingKeyManagementHandler(AspFactoryImpl aspFactoryImpl) {
        super(aspFactoryImpl);
    }

    public void handleRegistrationRequest(RegistrationRequest registrationRequest) {
        logger.error(String.format("Received REGREQ=%s. Handling of RKM message is not supported", registrationRequest));

    }

    public void handleRegistrationResponse(RegistrationResponse registrationResponse) {
        logger.error(String.format("Received REGRES=%s. Handling of RKM message is not supported", registrationResponse));
    }

    public void handleDeregistrationRequest(DeregistrationRequest deregistrationRequest) {
        logger.error(String.format("Received DEREGREQ=%s. Handling of RKM message is not supported", deregistrationRequest));
    }

    public void handleDeregistrationResponse(DeregistrationResponse deregistrationResponse) {
        logger.error(String.format("Received DEREGRES=%s. Handling of RKM message is not supported", deregistrationResponse));
    }

}
