/* eBridge SS7 */

/**
 * Start time:17:24:08 2009-04-02<br>
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

import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.isup.api.ParameterException;
import za.co.ebridge.isup.api.message.parameter.Invoke;
import za.co.ebridge.isup.api.message.parameter.Reject;
import za.co.ebridge.isup.api.message.parameter.RemoteOperation;
import za.co.ebridge.isup.api.message.parameter.RemoteOperations;
import za.co.ebridge.isup.api.message.parameter.ReturnError;
import za.co.ebridge.isup.api.message.parameter.ReturnResult;

/**
 * Start time:17:24:08 2009-04-02<br>
 * Project: mobicents-isup-stack<br>
 *
 * @author <a href="mailto:baranowb@gmail.com"> Bartosz Baranowski </a>
 */
public class RemoteOperationsImpl extends AbstractISUPParameter implements RemoteOperations {

    private List<RemoteOperation> remoteOperations = new ArrayList<RemoteOperation>();
    private byte protocol = RemoteOperations.PROTOCOL_REMOTE_OPERATIONS;

    // FIXME: XXX
    // Q.763 3.48, requires a lot of hacks
    public RemoteOperationsImpl(byte[] b) throws ParameterException {
        super();
        decode(b);
    }

    public RemoteOperationsImpl() {
        super();

    }

    public int decode(byte[] b) throws ParameterException {
        if (b.length < 1) {
            throw new ParameterException();
        }
        this.protocol = (byte) (b[0] & 0x1F);
        if ((b[0] & 0x80) > 0) {
            if (b.length > 1) {
                throw new ParameterException();
            }
            return 1;
        }

        try {
            AsnInputStream asnInputeStream = new AsnInputStream(b);
            // skip first since its protocol + ext. bit
            asnInputeStream.skip(1);
            while (asnInputeStream.available() > 0) {
                final int tag = asnInputeStream.readTag();
                AbstractRemoteOperation aro = null;
                switch (tag) {
                    case Invoke._TAG:
                        aro = new InvokeImpl();
                        break;
                    case ReturnResult._TAG:
                        aro = new ReturnResultImpl();
                        break;
                    case ReturnError._TAG:
                        aro = new ReturnErrorImpl();
                        break;
                    case Reject._TAG:
                        aro = new RejectImpl();
                        break;
                    default:
                        throw new ParameterException("Unknown tag: " + tag);
                }
                aro.decode(asnInputeStream);
                this.remoteOperations.add(aro);
                aro = null;
            }
        } catch (IOException e) {
            throw new ParameterException(e);
        }
        return b.length;
    }

    public byte[] encode() throws ParameterException {
        if (remoteOperations.size() == 0) {
            return new byte[]{(byte) (0x80 | this.protocol)};
        } else {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            //ext. bit set to zero since more will come
            baos.write(protocol);
            AsnOutputStream aos = new AsnOutputStream();
            for(RemoteOperation ro:this.remoteOperations){
                //TODO: should this do more?
                AbstractRemoteOperation aro = (AbstractRemoteOperation) ro;
                aro.encode(aos);
            }
            try {
                baos.write(aos.toByteArray());
            } catch (IOException e) {
                throw new ParameterException(e);
            }
            return baos.toByteArray();
        }
    }

    public int getCode() {

        return _PARAMETER_CODE;
    }

    @Override
    public void setProtocol(byte protocol) {
        this.protocol = this.protocol;
    }

    @Override
    public byte getProtocol() {
        return this.protocol;
    }

    @Override
    public void setOperations(RemoteOperation... operations) {
        this.remoteOperations.clear();
        for (RemoteOperation ro : operations) {
            if (ro != null) {
                this.remoteOperations.add(ro);
            }
        }
    }

    @Override
    public RemoteOperation[] getOperations() {
        return this.remoteOperations.toArray(new RemoteOperation[this.remoteOperations.size()]);
    }

}
