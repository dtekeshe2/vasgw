package za.co.ebridge.map.impl.service.mobility.subscriberManagement;

import java.io.IOException;
import java.util.ArrayList;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.map.api.MAPException;
import za.co.ebridge.map.api.MAPParsingComponentException;
import za.co.ebridge.map.api.MAPParsingComponentExceptionReason;
import za.co.ebridge.map.api.primitives.MAPExtensionContainer;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGFeature;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGInfo;
import za.co.ebridge.map.api.service.mobility.subscriberManagement.CUGSubscription;
import za.co.ebridge.map.impl.primitives.MAPExtensionContainerImpl;
import za.co.ebridge.map.impl.primitives.SequenceBase;

public class CUGInfoImpl
        extends SequenceBase
        implements CUGInfo
{

    private static final int _TAG_extensionContainer = 0;

    private ArrayList<CUGSubscription> cugSubscriptionList = null;
    private ArrayList<CUGFeature> cugFeatureList = null;
    private MAPExtensionContainer extensionContainer = null;

    public CUGInfoImpl()
    {
        super("CUGInfo");
    }

    /**
     *
     */
    public CUGInfoImpl(
            ArrayList<CUGSubscription> cugSubscriptionList, ArrayList<CUGFeature> cugFeatureList,
            MAPExtensionContainer extensionContainer)
    {
        super("CUGInfo");

        this.cugSubscriptionList = cugSubscriptionList;
        this.cugFeatureList = cugFeatureList;
        this.extensionContainer = extensionContainer;
    }

    public ArrayList<CUGSubscription> getCUGSubscriptionList()
    {
        return this.cugSubscriptionList;
    }

    public ArrayList<CUGFeature> getCUGFeatureList()
    {
        return this.cugFeatureList;
    }

    public MAPExtensionContainer getExtensionContainer()
    {
        return this.extensionContainer;
    }

    protected void _decode(AsnInputStream ansIS, int length)
            throws
            MAPParsingComponentException,
            IOException,
            AsnException
    {
        CUGSubscription subscriptionItem = null;
        CUGFeature featureItem = null;
        this.cugSubscriptionList = null;
        this.cugFeatureList = null;
        this.extensionContainer = null;

        AsnInputStream ais = ansIS.readSequenceStreamData(length);

        int num = 0;
        while (true)
        {
            if (ais.available() == 0)
                break;

            int tag = ais.readTag();

            switch (num)
            {
                case 0: // cugSubscriptionList
                    if (ais.getTagClass() != Tag.CLASS_UNIVERSAL || tag != Tag.SEQUENCE || ais.isTagPrimitive())
                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                + ".cugSubscriptionList: Bad tag class, tag or parameter is primitive",
                                MAPParsingComponentExceptionReason.MistypedParameter);

                    this.cugSubscriptionList = new ArrayList<CUGSubscription>();
                    AsnInputStream ais2a = ais.readSequenceStream();
                    while (true)
                    {
                        if (ais2a.available() == 0)
                            break;

                        int tag2a = ais2a.readTag();
                        if (tag2a != Tag.SEQUENCE || ais2a.getTagClass() != Tag.CLASS_UNIVERSAL || ais2a
                                .isTagPrimitive())
                            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                    + ": bad cugSubscriptionList tag or tagClass or is primitive ",
                                    MAPParsingComponentExceptionReason.MistypedParameter);

                        subscriptionItem = new CUGSubscriptionImpl();
                        ((CUGSubscriptionImpl) subscriptionItem).decodeAll(ais2a);
                        this.cugSubscriptionList.add(subscriptionItem);
                    }
                    break;

                default:
                    switch (ais.getTagClass())
                    {
                        case Tag.CLASS_CONTEXT_SPECIFIC:
                            switch (tag)
                            {
                                case _TAG_extensionContainer:
                                    if (ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".extensionContainer: is primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);
                                    this.extensionContainer = new MAPExtensionContainerImpl();
                                    ((MAPExtensionContainerImpl) this.extensionContainer).decodeAll(ais);
                                    break;

                                default:
                                    ais.advanceElement();
                                    break;
                            }
                            break;

                        case Tag.CLASS_UNIVERSAL:
                            switch (tag)
                            {
                                case Tag.SEQUENCE: // cugFeatureList
                                    if (ais.isTagPrimitive())
                                        throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                                                + ".cugFeatureList: Parameter is primitive",
                                                MAPParsingComponentExceptionReason.MistypedParameter);

                                    this.cugFeatureList = new ArrayList<CUGFeature>();
                                    AsnInputStream ais2 = ais.readSequenceStream();
                                    while (true)
                                    {
                                        if (ais2.available() == 0)
                                            break;

                                        int tag2 = ais2.readTag();
                                        if (tag2 != Tag.SEQUENCE || ais2.getTagClass() != Tag.CLASS_UNIVERSAL
                                                || ais2.isTagPrimitive())
                                            throw new MAPParsingComponentException("Error while decoding " +
                                                    _PrimitiveName
                                                    + ": bad cugFeatureList tag or tagClass or is primitive ",
                                                    MAPParsingComponentExceptionReason.MistypedParameter);

                                        featureItem = new CUGFeatureImpl();
                                        ((CUGFeatureImpl) featureItem).decodeAll(ais2);
                                        this.cugFeatureList.add(featureItem);
                                    }
                                    break;

                                default:
                                    ais.advanceElement();
                                    break;
                            }
                            break;

                        default:
                            ais.advanceElement();
                            break;
                    }
            }
            num++;
        }

        if (this.cugSubscriptionList == null)
            throw new MAPParsingComponentException(
                    "Error while decoding " + _PrimitiveName + ": cugSubscriptionList required.",
                    MAPParsingComponentExceptionReason.MistypedParameter);

        // if (this.cugFeatureList == null)
        // throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName + ": cugFeatureList
        // required.",
        // MAPParsingComponentExceptionReason.MistypedParameter);

        if (this.cugSubscriptionList.size() > 10)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parameter cugSubscriptionList size must be from 0 to 10, found: " + this.cugSubscriptionList
                    .size(),
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }

        if (this.cugFeatureList.size() < 1 || this.cugFeatureList.size() > 32)
        {
            throw new MAPParsingComponentException("Error while decoding " + _PrimitiveName
                    + ": Parameter cugFeatureList size must be from 1 to 32, found: " + this.cugFeatureList.size(),
                    MAPParsingComponentExceptionReason.MistypedParameter);
        }
    }

    /*
     * (non-Javadoc)
     *
     * @see org.mobicents.protocols.protocols.ss7.cap.api.map.primitives.MAPAsnPrimitive#encodeData (com.ebridge
     * .protocols.asn.AsnOutputStream)
     */
    public void encodeData(AsnOutputStream asnOs)
            throws
            MAPException
    {

        if (this.cugSubscriptionList == null)
            throw new MAPException("Error while encoding " + _PrimitiveName + ": cugSubscriptionList required.");
        if (this.cugSubscriptionList.size() > 10)
        {
            throw new MAPException("Error while encoding " + _PrimitiveName
                    + ": Parameter cugSubscriptionList size must be from 0 to 10, found: " + this.cugSubscriptionList
                    .size());
        }

        if (this.cugFeatureList != null)
        {
            if (this.cugFeatureList.size() < 1 || this.cugFeatureList.size() > 32)
            {
                throw new MAPException("Error while encoding " + _PrimitiveName
                        + ": Parameter cugFeatureList size must be from 1 to 32, found: " + this.cugFeatureList.size());
            }
        }

        try
        {

            asnOs.writeTag(Tag.CLASS_UNIVERSAL, false, Tag.SEQUENCE);
            int posa = asnOs.StartContentDefiniteLength();
            for (CUGSubscription subscriptionItem : this.cugSubscriptionList)
            {
                ((CUGSubscriptionImpl) subscriptionItem).encodeAll(asnOs);
            }
            asnOs.FinalizeContent(posa);

            if (this.cugFeatureList != null)
            {
                asnOs.writeTag(Tag.CLASS_UNIVERSAL, false, Tag.SEQUENCE);
                int posb = asnOs.StartContentDefiniteLength();
                for (CUGFeature featureItem : this.cugFeatureList)
                {
                    ((CUGFeatureImpl) featureItem).encodeAll(asnOs);
                }
                asnOs.FinalizeContent(posb);
            }

            if (this.extensionContainer != null)
                ((MAPExtensionContainerImpl) this.extensionContainer).encodeAll(asnOs, Tag.CLASS_CONTEXT_SPECIFIC,
                        _TAG_extensionContainer);
        }
        catch (AsnException e)
        {
            throw new MAPException("AsnException when encoding " + _PrimitiveName + ": " + e.getMessage(), e);
        }
    }

    @Override
    public String toString()
    {
        StringBuilder sb = new StringBuilder();
        sb.append(_PrimitiveName + " [");

        if (this.cugSubscriptionList != null)
        {
            sb.append("cugSubscriptionList=[");
            boolean firstItem = true;
            for (CUGSubscription be : this.cugSubscriptionList)
            {
                if (firstItem)
                    firstItem = false;
                else
                    sb.append(", ");
                sb.append(be.toString());
            }
            sb.append("], ");
        }

        if (this.cugFeatureList != null)
        {
            sb.append("cugFeatureList=[");
            boolean firstItem = true;
            for (CUGFeature be : this.cugFeatureList)
            {
                if (firstItem)
                    firstItem = false;
                else
                    sb.append(", ");
                sb.append(be.toString());
            }
            sb.append("], ");
        }

        if (this.extensionContainer != null)
        {
            sb.append("extensionContainer=");
            sb.append(this.extensionContainer.toString());
            sb.append(", ");
        }

        sb.append("]");

        return sb.toString();
    }

}
