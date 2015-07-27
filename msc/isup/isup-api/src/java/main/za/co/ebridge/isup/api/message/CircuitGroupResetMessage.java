package za.co.ebridge.isup.api.message;

import za.co.ebridge.isup.api.message.parameter.RangeAndStatus;

/**
 * <TABLE id="Table24" style="FONT-SIZE: 9pt; WIDTH: 584px; HEIGHT: 72px; TEXT-ALIGN: center" cellSpacing="1"
 * cellPadding="1" width="584" align="center" border="1">
 * <TR>
 * <TD style="FONT-WEIGHT: bold; WIDTH: 328px; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" align="center"
 * colSpan="3">
 * <TABLE id="Table53" style="WIDTH: 575px; COLOR: navy; HEIGHT: 49px" cellSpacing="1" cellPadding="1" width="575"
 * border="0">
 * <TR>
 * <p/>
 * <TD style="FONT-WEIGHT: bold; FONT-SIZE: 10pt; COLOR: teal; HEIGHT: 28px; TEXT-ALIGN: center" colSpan="3">
 * Circuit Group Reset (GRS) Message</TD>
 * </TR>
 * <TR>
 * <TD style="FONT-SIZE: 9pt; BORDER-BOTTOM: silver thin solid" colSpan="3">
 * <FONT face="Times New Roman" size="3">Circuit Group Reset (GRS) message sent to release an identified group of
 * circuits/CICs
 * when, due to memory mutilation or other causes, it is unknown whether for example, a release or release complete
 * message is
 * appropriate for each of the circuits/CICs in the group. If at the receiving end a circuit/CIC is remotely blocked,
 * reception
 * of this message should cause that condition to be removed.</FONT></TD>
 * </TR>
 * <p/>
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
 * <TD style="WIDTH: 283px; TEXT-ALIGN: left">Range and Status</TD>
 * <TD style="WIDTH: 145px">V</TD>
 * <TD>2</TD>
 * </TR>
 * </TABLE>
 */
public interface CircuitGroupResetMessage
        extends ISUPMessage
{
    /**
     * Circuit Group Reset Message, Q.763 reference table 41 <br>
     * {@link CircuitGroupResetMessage}
     */
    int MESSAGE_CODE = 0x17;

    void setRangeAndStatus(RangeAndStatus ras);

    RangeAndStatus getRangeAndStatus();
}
