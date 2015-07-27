package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CallReference;
import za.co.ebridge.isup.api.message.parameter.SuspendResumeIndicators;

/**
 * Start time:09:54:07 2009-07-23<br>
 * Project: mobicents-isup-stack<br>
 * <TABLE id="Table21" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table50" style="WIDTH: 575px; COLOR: navy; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575"
 * border="0">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * (SUS)&nbsp;Message</TD>
 * </TR>
 * <p/>
 * <TR>
 * <TD style="FONT-SIZE: 9pt" colSpan="3">
 * <FONT face="Times New Roman" size="3">SUS is&nbsp;sent in either direction indicating that the calling or called
 * party has
 * been temporarily disconnected. </FONT></TD>
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
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Suspend, Resume Indicators</TD>
 * <p/>
 * <TD style="WIDTH: 145px">F</TD>
 * <TD>1</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Call Reference</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>7</TD>
 * <p/>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * </TR>
 * </TABLE>
 */
public interface SuspendMessage
        extends ISUPMessage
{
    /**
     * Suspend Message, Q.763 reference table 38 <br>
     * {@link SuspendMessage}
     */
    int MESSAGE_CODE = 0x0D;

    void setSuspendResumeIndicators(SuspendResumeIndicators ri);

    SuspendResumeIndicators getSuspendResumeIndicators();

    void setCallReference(CallReference cr);

    CallReference getCallReference();
}
