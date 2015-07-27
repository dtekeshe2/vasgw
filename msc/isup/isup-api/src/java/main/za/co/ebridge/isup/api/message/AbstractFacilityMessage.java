package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.ConnectionRequest;
import za.co.ebridge.isup.api.message.parameter.FacilityIndicator;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;

/**
 * Super interface for FAA/FAR
 */
public interface AbstractFacilityMessage
        extends ISUPMessage
{
    //bad name for interface, but...
    void setFacilityIndicator(FacilityIndicator fi);

    FacilityIndicator getFacilityIndicator();

    void setUserToUserIndicators(UserToUserIndicators u2ui);

    UserToUserIndicators getUserToUserIndicators();

    void setCallReference(CallReference cf);

    CallReference getCallReference();

    void setConnectionRequest(ConnectionRequest cr);

    ConnectionRequest getConnectionRequest();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci);

    ParameterCompatibilityInformation getCompatibilityInformation();
}
