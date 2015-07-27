/*
 * TeleStax, Open Source Cloud Communications
 * Copyright 2011-2013, Telestax Inc and individual contributors
 * by the @authors tag.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */

package za.co.ebridge.isup.impl.message.parameter;

import java.io.ByteArrayOutputStream;
import java.util.ArrayList;
import java.util.List;

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.InformationType;
import za.co.ebridge.isup.api.message.parameter.InvokingRedirectReason;
import za.co.ebridge.isup.api.message.parameter.RedirectReason;

/**
 * @author baranowb
 *
 */
public class InvokingRedirectReasonImpl extends AbstractInformationImpl implements InvokingRedirectReason {

    private List<RedirectReason> reasons = new ArrayList<RedirectReason>();


    public InvokingRedirectReasonImpl() {
        super(InformationType.InvokingRedirectReason);
    }
    @Override
    public void setReason(RedirectReason... reasons) {
        this.reasons.clear();
        if(reasons == null){
            return;
        }
        for(RedirectReason pr: reasons){
            if(pr!=null){
                this.reasons.add(pr);
            }
        }
    }

    @Override
    public RedirectReason[] getReason() {
        return this.reasons.toArray(new RedirectReason[this.reasons.size()]);
    }
    @Override
    byte[] encode() throws ParameterException {
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        for (int index = 0; index < this.reasons.size(); index++) {
            RedirectReasonImpl ai = (RedirectReasonImpl) this.reasons.get(index);
            ai.trim();

            byte b = (byte) (ai.encode()[0] & 0x7F);
            if (index + 1 == this.reasons.size()) {
                b |= 0x80;
            }
            baos.write(b);

        }
        return baos.toByteArray();
    }

    @Override
    void decode(byte[] data) throws ParameterException {
        for(int index = 0;index<data.length;index++){
            byte b = data[index];
            RedirectReasonImpl pr = new RedirectReasonImpl();
            pr.setRedirectReason((byte) (b & 0x7F));
            if( (b & 0x80) == 0 && index +1 == data.length){
                throw new ParameterException("Extension bit incicates more bytes, but we ran out of them!");
            }
            this.reasons.add(pr);
        }
    }

}
