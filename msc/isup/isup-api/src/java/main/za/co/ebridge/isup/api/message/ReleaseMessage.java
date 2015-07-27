package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.AccessDeliveryInformation;
import za.co.ebridge.isup.api.message.parameter.AutomaticCongestionLevel;
import za.co.ebridge.isup.api.message.parameter.CauseIndicators;
import za.co.ebridge.isup.api.message.parameter.DisplayInformation;
import za.co.ebridge.isup.api.message.parameter.HTRInformation;
import za.co.ebridge.isup.api.message.parameter.NetworkSpecificFacility;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectCounter;
import za.co.ebridge.isup.api.message.parameter.RedirectionInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumber;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.SignalingPointCode;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;
import za.co.ebridge.isup.api.message.parameter.UserToUserInformation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

/**
 * <TABLE id="Table16" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table35" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * REL (Release Message)</TD>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <p/>
 * A Release Message (REL) is sent in either direction indicating that the circuit is being released due to the <B>cause
 * indicator</B> specified. An REL is sent when either the calling or called party "hangs up" the call (cause = 16).
 * An REL is
 * also sent in the backward direction if the called party line is busy (cause = 17).
 * </P>
 * </TD>
 * <p/>
 * </TR>
 * </TABLE>
 * </TD>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Cause Indicators</TD>
 * <TD style="WIDTH: 145px">V</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Redirection Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>3-4</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; HEIGHT: 20px; TEXT-ALIGN: left">Redirection Number</TD>
 * <TD style="WIDTH: 145px; HEIGHT: 20px">O</TD>
 * <TD style="HEIGHT: 20px">5-12</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Indicators</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Information</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-131</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Access Transport</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Access Delivery Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Parameter Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Network Specific Facility</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>4-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">signalingPoint Code</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Automatic Congestion Level</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Redirection Number Restriction</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * <p/>
 * </TR>
 * </TABLE>
 */
public interface ReleaseMessage
        extends ISUPMessage
{

    /**
     * Release Message, Q.763 reference table 33 <br>
     * {@link ReleaseMessage}
     */
    int MESSAGE_CODE = 0x0C;

    CauseIndicators getCauseIndicators();

    void setCauseIndicators(CauseIndicators v);

    RedirectionInformation getRedirectionInformation();

    void setRedirectionInformation(RedirectionInformation v);

    RedirectionNumber getRedirectionNumber();

    void setRedirectionNumber(RedirectionNumber v);

    AccessTransport getAccessTransport();

    void setAccessTransport(AccessTransport v);

    SignalingPointCode getSignalingPointCode();

    void setSignalingPointCode(SignalingPointCode v);

    UserToUserInformation getU2UInformation();

    void setU2UInformation(UserToUserInformation v);

    AutomaticCongestionLevel getAutomaticCongestionLevel();

    void setAutomaticCongestionLevel(AutomaticCongestionLevel v);

    NetworkSpecificFacility getNetworkSpecificFacility();

    void setNetworkSpecificFacility(NetworkSpecificFacility v);

    AccessDeliveryInformation getAccessDeliveryInformation();

    void setAccessDeliveryInformation(AccessDeliveryInformation v);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation v);

    UserToUserIndicators getU2UIndicators();

    void setU2UIndicators(UserToUserIndicators v);

    DisplayInformation getDisplayInformation();

    void setDisplayInformation(DisplayInformation v);

    RemoteOperations getRemoteOperations();

    void setRemoteOperations(RemoteOperations v);

    HTRInformation getHTRInformation();

    void setHTRInformation(HTRInformation v);

    RedirectCounter getRedirectCounter();

    void setRedirectCounter(RedirectCounter v);

    RedirectBackwardInformation getRedirectBackwardInformation();

    void setRedirectBackwardInformation(RedirectBackwardInformation v);
}
