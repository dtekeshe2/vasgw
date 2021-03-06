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

import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.Information;
import za.co.ebridge.isup.api.message.parameter.InformationType;

/**
 * @author baranowb
 *
 */
public abstract class AbstractInformationImpl implements Information {

    protected final InformationType type;
    protected int tag;
    public AbstractInformationImpl(InformationType type) {
        super();
        this.type = type;
    }

    public InformationType getType(){
        return type;
    }
    public int getTag(){
        return tag;
    }

    void setTag(int tag){
        this.tag = tag;
    }

    abstract byte[] encode() throws ParameterException;

    abstract void decode(byte[] b) throws ParameterException;
}
