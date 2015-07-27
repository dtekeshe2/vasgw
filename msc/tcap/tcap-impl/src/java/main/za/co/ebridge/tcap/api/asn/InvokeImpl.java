package za.co.ebridge.tcap.api.asn;

import java.io.IOException;
import java.util.concurrent.Future;

import za.co.ebridge.asn.impl.AsnException;
import za.co.ebridge.asn.impl.AsnInputStream;
import za.co.ebridge.asn.impl.AsnOutputStream;
import za.co.ebridge.asn.impl.Tag;
import za.co.ebridge.tcap.api.api.tc.component.InvokeClass;
import za.co.ebridge.tcap.api.api.tc.component.OperationState;
import za.co.ebridge.tcap.api.asn.comp.ComponentType;
import za.co.ebridge.tcap.api.asn.comp.GeneralProblemType;
import za.co.ebridge.tcap.api.asn.comp.Invoke;
import za.co.ebridge.tcap.api.asn.comp.OperationCode;
import za.co.ebridge.tcap.api.asn.comp.Parameter;
import org.apache.log4j.Logger;

public class InvokeImpl
        implements Invoke
{

    private static final Logger logger = Logger.getLogger(InvokeImpl.class);

    // local to stack
    private InvokeClass invokeClass = InvokeClass.Class1;
    private long invokeTimeout = TCAPStackImpl._EMPTY_INVOKE_TIMEOUT;
    private OperationState state = OperationState.Idle;
    private Future timerFuture;
    private OperationTimerTask operationTimerTask = new OperationTimerTask(this);
    private TCAPProviderImpl provider;
    private DialogImpl dialog;

    public InvokeImpl()
    {
        // Set Default Class
        this.invokeClass = InvokeClass.Class1;
    }

    public InvokeImpl(InvokeClass invokeClass)
    {
        if (invokeClass == null)
        {
            this.invokeClass = InvokeClass.Class1;
        } else
        {
            this.invokeClass = invokeClass;
        }
    }

    // mandatory
    private Long invokeId;

    // optional
    private Long linkedId;
    private Invoke linkedInvoke;

    // mandatory
    private OperationCode operationCode;

    // optional
    private Parameter parameter;

    public Long getInvokeId()
    {

        return this.invokeId;
    }

    public Long getLinkedId()
    {

        return this.linkedId;
    }

    public Invoke getLinkedInvoke()
    {
        return linkedInvoke;
    }

    public OperationCode getOperationCode()
    {

        return this.operationCode;
    }

    public Parameter getParameter()
    {

        return this.parameter;
    }

    public void setInvokeId(Long i)
    {
        if ((i == null) || (i < -128 || i > 127))
        {
            throw new IllegalArgumentException("Invoke ID our of range: <-128,127>: " + i);
        }
        this.invokeId = i;

    }

    public void setLinkedId(Long i)
    {
        if ((i == null) || (i < -128 || i > 127))
        {
            throw new IllegalArgumentException("Invoke ID our of range: <-128,127>: " + i);
        }
        this.linkedId = i;
    }

    public void setLinkedInvoke(Invoke val)
    {
        this.linkedInvoke = val;
    }

    public void setOperationCode(OperationCode i)
    {
        this.operationCode = i;

    }

    public void setParameter(Parameter p)
    {
        this.parameter = p;

    }

    public ComponentType getType()
    {

        return ComponentType.Invoke;
    }

    @Override
    public String toString()
    {
        return "Invoke[invokeId=" + invokeId + ", linkedId=" + linkedId + ", operationCode=" + operationCode + ", " +
                "parameter="
                + parameter + ", invokeClass=" + invokeClass + ", state=" + state + ", provider : " + provider + "]";
    }

    public void decode(AsnInputStream ais)
            throws
            ParseException
    {

        try
        {
            AsnInputStream localAis = ais.readSequenceStream();

            // invokeId
            int tag = localAis.readTag();
            if (tag != _TAG_IID || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding Invoke: bad tag or tag class for InvokeID: tag=" + tag + ", tagClass = "
                                + localAis.getTagClass());
            }
            this.invokeId = localAis.readInteger();

            tag = localAis.readTag();
            if (tag == _TAG_LID && localAis.getTagClass() == Tag.CLASS_CONTEXT_SPECIFIC)
            {
                // linkedId - optional
                this.linkedId = localAis.readInteger();
                tag = localAis.readTag();
            }

            // operationCode
            if (tag != OperationCode._TAG_GLOBAL && tag != OperationCode._TAG_LOCAL
                    || localAis.getTagClass() != Tag.CLASS_UNIVERSAL)
            {
                throw new ParseException(null, GeneralProblemType.MistypedComponent,
                        "Error while decoding Invoke: bad tag or tag class for operationCode: tag=" + tag + ", " +
                                "tagClass = "
                                + localAis.getTagClass());
            }
            this.operationCode = TcapFactory.createOperationCode(tag, localAis);

            // It could be PARAMETER
            if (localAis.available() == 0)
                return;
            tag = localAis.readTag();
            this.parameter = TcapFactory.createParameter(tag, localAis, true);

            logger.debug("InvokerImpl : " + this);
        }
        catch (IOException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent, "IOException while decoding " +
                    "Invoke: "
                    + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new ParseException(null, GeneralProblemType.BadlyStructuredComponent, "AsnException while decoding " +
                    "Invoke: "
                    + e.getMessage(), e);
        }
        catch (ParseException e)
        {
            e.setInvokeId(this.invokeId);
            throw e;
        }
    }

    public void encode(AsnOutputStream aos)
            throws
            EncodeException
    {
        if (this.invokeId == null)
            throw new EncodeException("Invoke ID not set!");
        if (this.operationCode == null)
            throw new EncodeException("Operation Code not set!");

        try
        {
            aos.writeTag(Tag.CLASS_CONTEXT_SPECIFIC, false, _TAG);
            int pos = aos.StartContentDefiniteLength();

            aos.writeInteger(this.invokeId);
            if (this.linkedId != null)
                aos.writeInteger(Tag.CLASS_CONTEXT_SPECIFIC, _TAG_LID, this.linkedId);
            this.operationCode.encode(aos);

            if (this.parameter != null)
                this.parameter.encode(aos);

            aos.FinalizeContent(pos);

        }
        catch (IOException e)
        {
            throw new EncodeException("IOException while encoding Invoke: " + e.getMessage(), e);
        }
        catch (AsnException e)
        {
            throw new EncodeException("AsnException while encoding Invoke: " + e.getMessage(), e);
        }
    }

    /**
     * @return the invokeClass
     */
    public InvokeClass getInvokeClass()
    {
        return this.invokeClass;
    }

    /**
     * @return the invokeTimeout
     */
    public long getTimeout()
    {
        return invokeTimeout;
    }

    /**
     * @param invokeTimeout the invokeTimeout to set
     */
    public void setTimeout(long invokeTimeout)
    {
        this.invokeTimeout = invokeTimeout;
    }

    // ////////////////////
    // set methods for //
    // relevant data //
    // ///////////////////

    /**
     * @return the provider
     */
    public TCAPProviderImpl getProvider()
    {
        return provider;
    }

    /**
     * @param provider the provider to set
     */
    public void setProvider(TCAPProviderImpl provider)
    {
        logger.debug("setProvider(provider : " + provider + ")");
        this.provider = provider;
    }

    /**
     * @return the dialog
     */
    public DialogImpl getDialog()
    {
        return dialog;
    }

    /**
     * @param dialog the dialog to set
     */
    public void setDialog(DialogImpl dialog)
    {
        this.dialog = dialog;
    }

    /**
     * @return the state
     */
    public OperationState getState()
    {
        return state;
    }

    /**
     * @param state the state to set
     */
    public void setState(OperationState state)
    {
        if (this.dialog == null)
        {
            // bad call on server side.
            return;
        }
        OperationState old = this.state;
        this.state = state;
        if (old != state)
        {

            switch (state)
            {
                case Sent:
                    // start timer
                    this.startTimer();
                    break;
                case Idle:
                case Reject_W:
                    this.stopTimer();
                    dialog.operationEnded(this);
            }
            if (state == OperationState.Sent)
            {

            } else if (state == OperationState.Idle || state == OperationState.Reject_W)
            {

            }

        }
    }

    public void onReturnResultLast()
    {
        this.setState(OperationState.Idle);

    }

    public void onError()
    {
        this.setState(OperationState.Idle);

    }

    public void onReject()
    {
        this.setState(OperationState.Idle);
    }

    public synchronized void startTimer()
    {
        if (this.dialog == null || this.dialog.getPreviewMode())
            return;

        this.stopTimer();
        if (this.invokeTimeout > 0)
        {
            logger.info("this.provider : " + this.provider);
            this.timerFuture = this.provider.createOperationTimer(this.operationTimerTask, this.invokeTimeout);
        }
    }

    public synchronized void stopTimer()
    {

        logger.info("stopTimer()");

        if (this.timerFuture != null)
        {
            try
            {
                logger.info("this.timerFuture.cancel()");
                this.timerFuture.cancel(false);
            }
            catch (Exception e)
            {
                e.printStackTrace();
            }
            this.timerFuture = null;
        }

    }

    public boolean isErrorReported()
    {
        if (this.invokeClass == InvokeClass.Class1 || this.invokeClass == InvokeClass.Class2)
        {
            return true;
        } else
        {
            return false;
        }
    }

    public boolean isSuccessReported()
    {
        if (this.invokeClass == InvokeClass.Class1 || this.invokeClass == InvokeClass.Class3)
        {
            return true;
        } else
        {
            return false;
        }
    }

    private class OperationTimerTask
            implements Runnable
    {
        InvokeImpl invoke;

        OperationTimerTask(InvokeImpl invoke)
        {
            this.invoke = invoke;
        }

        public void run()
        {

            try
            {
                dialog.getDialogLock().lock();

                // op failed, we must delete it from dialog and notify!
                timerFuture = null;
                setState(OperationState.Idle);
                // TC-L-CANCEL
                ((DialogImpl) invoke.dialog).operationTimedOut(invoke);
            }
            finally
            {
                dialog.getDialogLock().unlock();
            }
        }

    }

}
