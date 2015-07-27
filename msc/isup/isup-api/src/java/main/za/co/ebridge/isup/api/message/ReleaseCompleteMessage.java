package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.CauseIndicators;

/**
 * <TABLE id="Table17" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table36" style="WIDTH: 575px; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575" border="0">
 * <TR>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Release Complete Message</TD>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; COLOR: navy" colSpan="3">
 * <p/>
 * A Release Complete Message (RLC) is sent in the opposite direction of the REL to acknowledge the release of the
 * remote end of
 * a trunk circuit and end the billing cycle as appropriate.
 * </P>
 * </TD>
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
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Cause&nbsp;Indicators</TD>
 * <p/>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>5-6</TD>
 * </TR>
 * <TR>
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">End of Optional Parameters</TD>
 * <TD style="WIDTH: 145px">O</TD>
 * <TD>1</TD>
 * <p/>
 * </TR>
 * </TABLE>
 */
public interface ReleaseCompleteMessage
        extends ISUPMessage
{
    /**
     * Release Complete Message, Q.763 reference table 34 <br>
     * {@link ReleaseCompleteMessage}
     */
    int MESSAGE_CODE = 0x10;

    CauseIndicators getCauseIndicators();

    void setCauseIndicators(CauseIndicators v);
}
