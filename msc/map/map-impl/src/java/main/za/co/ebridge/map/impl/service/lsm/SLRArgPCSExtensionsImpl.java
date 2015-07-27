/* eBridge SS7 */

package za.co.ebridge.map.impl.service.lsm;

import java.io.IOException;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.service.lsm.SLRArgPCSExtensions;
import za.co.ebridge.map.impl.primitives.SequenceBase;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class SLRArgPCSExtensionsImpl extends SequenceBase implements SLRArgPCSExtensions {

    private static final int _TAGna_ESRK_Request = 0;

    private boolean naEsrkRequest;

    public SLRArgPCSExtensionsImpl() {
        super("SLRArgPCSExtensions");
    }

    public SLRArgPCSExtensionsImpl(boolean naEsrkRequest) {
        super("SLRArgPCSExtensions");

        this.naEsrkRequest = naEsrkRequest;
    }

    @Override
    public boolean getNaEsrkRequest() {
        return naEsrkRequest;
    }

    @Override
    protected void _decode(AsnInputStream asnIS, int length) throws MAPParsingComponentException, IOException, AsnException {

        this.naEsrkRequest = false;

        AsnInputStream ais = asnIS.readSequenceStreamData(length);

        while (true) {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            if (ais.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC) {
                switch (tag) {
                    case _TAGna_ESRK_Request:
                        // naEsrkRequest
                        if (!ais.isTagPrimitive()) {
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": Parameter naEsrkRequest is not primitive",
                                    MAPParsingComponentExceptionReason.MistypedParameter);
                        }
                        ais.readNull();
                        this.naEsrkRequest = true;
                        break;
                    default:
                        ais.advanceElement();
                }
            } else {
                ais.advanceElement();
            }
        }
    }

    @Override
    public void encodeData(AsnOutputStream asnOs) throws MAPException {

        if (this.naEsrkRequest) {
            // naEsrkRequest
            try {
                asnOs.writeNull(Tag.CLASS_CONTEXT_SPECIFIC, _TAGna_ESRK_Request);
            } catch (IOException e) {
                throw new MAPException("Error while encoding " + _PrimitiveName
                        + " the optional parameter naEsrkRequest encoding failed ", e);
            } catch (AsnException e) {
                throw new MAPException("Error while encoding " + _PrimitiveName
                        + " the optional parameter naEsrkRequest encoding failed ", e);
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName);
        sb.append(" [");

        if (this.naEsrkRequest) {
            sb.append("naEsrkRequest");
        }

        sb.append("]");

        return sb.toString();
    }
}
