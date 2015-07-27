package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CallTransferNumber;
import za.co.ebridge.isup.api.message.parameter.GenericNotificationIndicator;
import za.co.ebridge.isup.api.message.parameter.MessageCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.ParameterCompatibilityInformation;
import za.co.ebridge.isup.api.message.parameter.PivotCounter;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingBackwardInformation;
import za.co.ebridge.isup.api.message.parameter.PivotRoutingIndicators;
import za.co.ebridge.isup.api.message.parameter.PivotStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectStatus;
import za.co.ebridge.isup.api.message.parameter.RedirectionNumber;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.ServiceActivation;
import za.co.ebridge.isup.api.message.parameter.accessTransport.AccessTransport;

/**
 * <TABLE id="Table28" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table57" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Facility&nbsp;(FAC) Message</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <FONT face="Times New Roman" size="3">
 * <P class="MsoNormal" style="MARGIN-LEFT: 0cm; TEXT-INDENT: 0cm; TEXT-ALIGN: justify; mso-list: l20 level1 lfo13" * >
 * <SPAN lang="EN-GB">Facility (FAC)&nbsp;message sent in either direction at any phase of the call to request an
 * action at
 * another node. The message is also used to carry the results, error or rejection of a previously requested action.
 * </SPAN>
 * </P>
 * </FONT></TD>
 * </TR>
 * </TABLE>
 * <p/>
 * </TD>
 * </TR>
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 283px; HEIGHT: 30px; TEXT-ALIGN: center">
 * Parameter</TD>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 145px; HEIGHT: 30px">Type</TD>
 * <TD style="FONT-WEIGHT: bold; HEIGHT: 30px">Length (octet)</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message type</TD>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Service Activation</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>3-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Remote Operations</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>?</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Message&nbsp;Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4</TD>
 * </TR>
 * <TR>
 * <p/>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Parameter Compatibility Information</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>4-?</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <p/>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface FacilityMessage
        extends ISUPMessage
{
    /**
     * Facility Message, Q.763 reference table 45 <br>
     * {@link FacilityMessage}
     */
    int MESSAGE_CODE = 0x33;

    void setMessageCompatibilityInformation(MessageCompatibilityInformation mci);

    MessageCompatibilityInformation getMessageCompatibilityInformation();

    void setParameterCompatibilityInformation(ParameterCompatibilityInformation pci);

    ParameterCompatibilityInformation getParameterCompatibilityInformation();

    void setRemoteOperations(RemoteOperations ro);

    RemoteOperations getRemoteOperations();

    void setServiceActivation(ServiceActivation sa);

    ServiceActivation getServiceActivation();

    void setCallTransferNumber(CallTransferNumber ctn);

    CallTransferNumber getCallTransferNumber();

    void setAccessTransport(AccessTransport at);

    AccessTransport getAccessTransport();

    void setGenericNotificationIndicator(GenericNotificationIndicator gni);

    GenericNotificationIndicator getGenericNotificationIndicator();

    void setRedirectionNumber(RedirectionNumber rn);

    RedirectionNumber getRedirectionNumber();

    void setPivotRoutingIndicators(PivotRoutingIndicators pri);

    PivotRoutingIndicators getPivotRoutingIndicators();

    void setPivotStatus(PivotStatus ps);

    PivotStatus getPivotStatus();

    void setPivotCounter(PivotCounter pc);

    PivotCounter getPivotCounter();

    void setPivotRoutingBackwardInformation(PivotRoutingBackwardInformation prbi);

    PivotRoutingBackwardInformation getPivotRoutingBackwardInformation();

    void setRedirectStatus(RedirectStatus rs);

    RedirectStatus getRedirectStatus();
}
