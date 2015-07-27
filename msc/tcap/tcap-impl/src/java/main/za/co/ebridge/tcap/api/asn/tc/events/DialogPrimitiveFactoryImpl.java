package za.co.ebridge.tcap.api.asn.tc.events;

import za.co.ebridge.tcap.api.api.ComponentPrimitiveFactory;
import za.co.ebridge.tcap.api.api.DialogPrimitiveFactory;
import za.co.ebridge.tcap.api.api.tc.dialog.Dialog;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCBeginIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCBeginRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCContinueIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCContinueRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCEndIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCEndRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCPAbortIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUniIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUniRequest;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUserAbortIndication;
import za.co.ebridge.tcap.api.api.tc.dialog.events.TCUserAbortRequest;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;
import za.co.ebridge.tcap.api.asn.TcapFactory;
import za.co.ebridge.tcap.api.asn.UserInformation;
import za.co.ebridge.tcap.api.asn.tc.component.ComponentPrimitiveFactoryImpl;

public class DialogPrimitiveFactoryImpl
        implements DialogPrimitiveFactory
{

    private ComponentPrimitiveFactoryImpl componentPrimitiveFactory;

    public DialogPrimitiveFactoryImpl(ComponentPrimitiveFactory componentPrimitiveFactory)
    {
        this.componentPrimitiveFactory = (ComponentPrimitiveFactoryImpl) componentPrimitiveFactory;
    }

    public TCBeginRequest createBegin(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCBeginRequestImpl tcbr = new TCBeginRequestImpl();
        tcbr.setDialog(d);
        tcbr.setDestinationAddress(d.getRemoteAddress());
        tcbr.setOriginatingAddress(d.getLocalAddress());
        return tcbr;
    }

    public TCContinueRequest createContinue(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCContinueRequestImpl tccr = new TCContinueRequestImpl();
        tccr.setDialog(d);
        tccr.setOriginatingAddress(d.getLocalAddress());

        return tccr;
    }

    public TCEndRequest createEnd(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCEndRequestImpl tcer = new TCEndRequestImpl();
        tcer.setDialog(d);
        // FIXME: add dialog portion fill
        return tcer;
    }

    public TCUserAbortRequest createUAbort(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCUserAbortRequestImpl tcer = new TCUserAbortRequestImpl();
        tcer.setDialog(d);
        // FIXME: add dialog portion fill
        return tcer;
    }

    public TCUniRequest createUni(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCUniRequestImpl tcur = new TCUniRequestImpl();
        tcur.setDialog(d);
        tcur.setDestinationAddress(d.getRemoteAddress());
        tcur.setOriginatingAddress(d.getLocalAddress());
        return tcur;
    }

    public TCBeginIndication createBeginIndication(Dialog d)
    {

        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCBeginIndicationImpl tcbi = new TCBeginIndicationImpl();
        tcbi.setDialog(d);
        return tcbi;
    }

    public TCContinueIndication createContinueIndication(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCContinueIndicationImpl tcbi = new TCContinueIndicationImpl();
        tcbi.setDialog(d);

        return tcbi;
    }

    public TCEndIndication createEndIndication(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCEndIndicationImpl tcbi = new TCEndIndicationImpl();
        tcbi.setDialog(d);
        return tcbi;
    }

    public TCUserAbortIndication createUAbortIndication(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCUserAbortIndicationImpl tcbi = new TCUserAbortIndicationImpl();
        tcbi.setDialog(d);
        return tcbi;
    }

    public TCPAbortIndication createPAbortIndication(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCPAbortIndicationImpl tcbi = new TCPAbortIndicationImpl();
        tcbi.setDialog(d);
        return tcbi;
    }

    public TCUniIndication createUniIndication(Dialog d)
    {
        if (d == null)
        {
            throw new NullPointerException("Dialog is null");
        }
        TCUniIndicationImpl tcbi = new TCUniIndicationImpl();
        tcbi.setDialog(d);
        return tcbi;
    }

    // Aditionals for APDU

    public ApplicationContextName createApplicationContextName(long[] oid)
    {
        return TcapFactory.createApplicationContextName(oid);
    }

    public UserInformation createUserInformation()
    {
        return TcapFactory.createUserInformation();
    }

}
