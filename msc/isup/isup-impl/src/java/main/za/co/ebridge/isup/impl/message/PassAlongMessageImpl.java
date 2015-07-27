/* eBridge SS7 */

/**
 * Start time:00:10:25 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
package za.co.ebridge.isup.impl.message;

import java.io.ByteArrayOutputStream;

import za.co.ebridge.isup.api.ISUPMessageFactory;
import za.co.ebridge.isup.api.ISUPParameterFactory;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.impl.message.parameter.MessageTypeImpl;
import za.co.ebridge.isup.api.message.ISUPMessage;
import za.co.ebridge.isup.api.message.PassAlongMessage;
import za.co.ebridge.isup.api.message.parameter.MessageType;

/**
 * Start time:00:10:25 2009-09-07<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com">Bartosz Baranowski </a>
 */
public class PassAlongMessageImpl extends ISUPMessageImpl implements PassAlongMessage {
    public static final MessageTypeImpl _MESSAGE_TYPE = new MessageTypeImpl(MESSAGE_CODE);

    static final int _INDEX_F_MessageType = 0;
    private ISUPMessage embedded;
    /**
     *
     * @param source
     * @throws ParameterException
     */
    public PassAlongMessageImpl() {
        super.f_Parameters.put(_INDEX_F_MessageType, this.getMessageType());
    }


    public MessageType getMessageType() {
        return _MESSAGE_TYPE;
    }

    @Override
    public void setEmbeddedMessage(ISUPMessage msg) {
        this.embedded = msg;
    }

    @Override
    public ISUPMessage getEmbeddedMessage() {
        return embedded;
    }

    public boolean hasAllMandatoryParameters() {
        return this.embedded == null ? false: this.embedded.hasAllMandatoryParameters();
    }

    @Override
    public int encode(ByteArrayOutputStream bos) throws ParameterException {
        if(this.embedded!=null){
            throw new ParameterException("No embedded message");
        }

        //encode CIC and message type
        this.encodeMandatoryParameters(f_Parameters, bos);
        final byte[] embeddedBody = ((AbstractISUPMessage)this.embedded).encode();
        // 2 - for CIC
        bos.write(embeddedBody, 2, embeddedBody.length - 2);
        return bos.size();
    }

    @Override
    public int decode(byte[] b, ISUPMessageFactory messageFactory,ISUPParameterFactory parameterFactory) throws ParameterException {
        int index = 0;
        //decode CIC and PAM message type.
        index += this.decodeMandatoryParameters(parameterFactory, b, index);
        byte targetMessageType = b[index];
        this.embedded = messageFactory.createCommand(targetMessageType, this.getCircuitIdentificationCode().getCIC());
        //create fake msg body
        byte[] fakeBody = new byte[b.length-1];
        System.arraycopy(b, 1, fakeBody, 0, fakeBody.length);
        index+=((AbstractISUPMessage)this.embedded).decode(fakeBody, messageFactory, parameterFactory)-2;
        return index;
    }


    // Not used, PAM contains body of another message. Since it overrides decode, those methods are not called.
    protected void decodeMandatoryVariableBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, int parameterIndex)
            throws ParameterException {
        // TODO Auto-generated method stub

    }

    protected void decodeOptionalBody(ISUPParameterFactory parameterFactory, byte[] parameterBody, byte parameterCode)
            throws ParameterException {
        // TODO Auto-generated method stub

    }

    protected int getNumberOfMandatoryVariableLengthParameters() {
        // TODO Auto-generated method stub
        return 0;
    }

    protected boolean optionalPartIsPossible() {

        throw new UnsupportedOperationException();
    }

}
