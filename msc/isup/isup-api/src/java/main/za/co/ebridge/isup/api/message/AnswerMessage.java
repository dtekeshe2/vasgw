package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.AccessDeliveryInformation;
import za.co.ebridge.isup.api.message.parameter.ApplicationTransport;
import za.co.ebridge.isup.api.message.parameter.BackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.BackwardGVNS;
import za.co.ebridge.isup.api.message.parameter.CallHistoryInformation;
import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.ConferenceTreatmentIndicators;
import za.co.ebridge.isup.api.message.parameter.ConnectedNumber;
import za.co.ebridge.isup.api.message.parameter.DisplayInformation;
import za.co.ebridge.isup.api.message.parameter.EchoControlInformation;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.GenericNumber;
import za.co.ebridge.isup.api.message.parameter.NetworkSpecificFacility;
import za.co.ebridge.isup.api.message.parameter.OptionalBackwardCallIndicators;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.RedirectStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumber;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumberRestriction;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.ServiceActivation;
import za.co.ebridge.isup.api.message.parameter.TransmissionMediumUsed;
import za.co.ebridge.isup.api.message.parameter.UserToUserIndicators;
import za.co.ebridge.isup.api.message.parameter.UserToUserInformation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

/**
 * <TABLE id="Table5" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table34" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * ANM (Answer Message)</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <p/>
 * When the called party answers, the destination switch terminates power ringing of the called line, removes audible
 * ringing
 * tone from the calling line and sends an Answer Message (ANM) to the originating switch. The originating switch
 * initiates
 * billing after verifying that the calling party's line is connected to the reserved trunk.
 * </P>
 * </TD>
 * </TR>
 * </TABLE>
 * </TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Backward Call Indicators</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>4</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Optional Backward Call Indicators</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Call Reference</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>7</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Indicators</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">User to User Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-131</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Connected Number</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-12</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Access Transport</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Generic Notification Indicator</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Call History Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Transmission Medium Used</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Generic Number</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-12</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Echo Control Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Access Delivery Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Redirection Number</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>5-12</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Parameter Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>4-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Network Specific Facility</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-?</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Remote Operations</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Service Activation</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Redirection Number Restriction</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Backward GVNS</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Display Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Conference Treatment Indicators</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Application Transport Parameter</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Pivot Routing Backward Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Redirect Status</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface AnswerMessage
        extends ISUPMessage
{

    /**
     * Answer Message, Q.763 reference table 22 <br>
     * {@link AnswerMessage}
     */
    int MESSAGE_CODE = 0x09;

    void setBackwardCallIndicators(BackwardCallIndicators indicators);

    BackwardCallIndicators getBackwardCallIndicators();

    void setOptionalBackwardCallIndicators(OptionalBackwardCallIndicators value);

    OptionalBackwardCallIndicators getOptionalBackwardCallIndicators();

    void setCallReference(CallReference value);

    CallReference getCallReference();

    void setUserToUserIndicators(UserToUserIndicators value);

    UserToUserIndicators getUserToUserIndicators();

    void setUserToUserInformation(UserToUserInformation value);

    UserToUserInformation getUserToUserInformation();

    void setConnectedNumber(ConnectedNumber value);

    ConnectedNumber getConnectedNumber();

    void setAccessTransport(AccessTransport value);

    AccessTransport getAccessTransport();

    void setGenericNotificationIndicator(GenericNotificationIndicator value);

    GenericNotificationIndicator getGenericNotificationIndicator();

    void setCallHistoryInformation(CallHistoryInformation value);

    CallHistoryInformation getCallHistoryInformation();

    void setTransmissionMediumUsed(TransmissionMediumUsed value);

    TransmissionMediumUsed getTransmissionMediumUsed();

    void setGenericNumber(GenericNumber value);

    GenericNumber getGenericNumber();

    void setEchoControlInformation(EchoControlInformation value);

    EchoControlInformation getEchoControlInformation();

    void setAccessDeliveryInformation(AccessDeliveryInformation value);

    AccessDeliveryInformation getAccessDeliveryInformation();

    void setRedirectionNumber(RedirectionNumber value);

    RedirectionNumber getRedirectionNumber();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation value);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setNetworkSpecificFacility(NetworkSpecificFacility value);

    NetworkSpecificFacility getNetworkSpecificFacility();

    void setRemoteOperations(RemoteOperations value);

    RemoteOperations getRemoteOperations();

    void setServiceActivation(ServiceActivation value);

    ServiceActivation getServiceActivation();

    RedirectionNumberRestriction getRedirectionNumberRestriction();

    void setRedirectionNumberRestriction(RedirectionNumberRestriction value);

    void setBackwardGVNS(BackwardGVNS value);

    BackwardGVNS getBackwardGVNS();

    void setDisplayInformation(DisplayInformation value);

    DisplayInformation getDisplayInformation();

    void setConferenceTreatmentIndicators(ConferenceTreatmentIndicators value);

    ConferenceTreatmentIndicators getConferenceTreatmentIndicators();

    void setApplicationTransportParameter(ApplicationTransport value);

    ApplicationTransport getApplicationTransportParameter();

    void setPivotRoutingBackwardInformation(PivotRoutingBackwardInformation value);

    PivotRoutingBackwardInformation getPivotRoutingBackwardInformation();

    void setRedirectStatus(RedirectStatus value);

    RedirectStatus getRedirectStatus();
}
