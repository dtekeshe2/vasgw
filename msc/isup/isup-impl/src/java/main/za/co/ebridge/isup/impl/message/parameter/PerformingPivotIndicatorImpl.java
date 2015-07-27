/* eBridge SS7 */

/**
 * Start time:09:09:20 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski
 *         </a>
 *
 */
package za.co.ebridge.isup.impl.message.parameter;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.InformationType;
import za.co.ebridge.isup.api.message.parameter.PerformingPivotIndicator;
import za.co.ebridge.isup.api.message.parameter.PivotReason;

/**
 * Start time:09:09:20 2009-04-06<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class PerformingPivotIndicatorImpl extends AbstractInformationImpl implements PerformingPivotIndicator {

    private List<PivotReason> reasons = new ArrayList<PivotReason>();

    public PerformingPivotIndicatorImpl() {
        super(InformationType.PerformingPivotIndicator);
        super.tag = 0x03;
    }

    @Override
    public void setReason(PivotReason... reasons) {
        this.reasons.clear();
        if(reasons == null){
            return;
        }
        for(PivotReason pr: reasons){
            if(pr!=null){
                this.reasons.add(pr);
            }
        }
    }

    @Override
    public PivotReason[] getReason() {
        return this.reasons.toArray(new PivotReason[this.reasons.size()]);
    }

    @Override
    byte[] encode() throws ParameterException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for(PivotReason pr:this.reasons){
            PivotReasonImpl ai = (PivotReasonImpl) pr;
            try {
                baos.write(ai.encode());
            } catch (IOException e) {
                throw new ParameterException(e);
            }
        }
        return baos.toByteArray();
    }

    @Override
    void decode(byte[] data) throws ParameterException {
        for(int index = 0;index<data.length;index++){
            byte b = data[index];
            PivotReasonImpl pr = new PivotReasonImpl();
            pr.setPivotReason((byte) (b & 0x7F));
            if( (b & 0x80) == 0){
                if (index +1 == data.length){
                    throw new ParameterException("Extension bit incicates more bytes, but we ran out of them!");
                }
                b = data[++index];
                pr.setPivotPossibleAtPerformingExchange((byte) (b & 0x07));
            }
            this.reasons.add(pr);
        }
    }

}
