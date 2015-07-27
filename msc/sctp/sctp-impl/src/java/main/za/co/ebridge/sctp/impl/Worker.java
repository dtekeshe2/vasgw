package za.co.ebridge.sctp.impl;

import za.co.ebridge.sctp.api.AssociationListener;
import za.co.ebridge.sctp.api.PayloadData;

public class Worker
        implements Runnable
{

    private AssociationImpl association;
    private AssociationListener associationListener = null;
    private PayloadData payloadData = null;

    protected Worker(
            AssociationImpl association,
            AssociationListener associationListener,
            PayloadData payloadData)
    {
        super();
        this.association = association;
        this.associationListener = associationListener;
        this.payloadData = payloadData;
    }

    @Override
    public void run()
    {
        try
        {
            this.associationListener.onPayload(this.association, this.payloadData);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
