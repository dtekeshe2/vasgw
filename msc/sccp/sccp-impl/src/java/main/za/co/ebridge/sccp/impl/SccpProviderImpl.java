package za.co.ebridge.sccp.impl;

import java.io.IOException;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javolution.util.FastMap;

import org.apache.log4j.Level;
import org.apache.log4j.Logger;
import za.co.ebridge.sccp.api.SccpListener;
import za.co.ebridge.sccp.api.SccpManagementEventListener;
import za.co.ebridge.sccp.api.SccpProvider;
import za.co.ebridge.sccp.impl.message.MessageFactoryImpl;
import za.co.ebridge.sccp.impl.message.SccpDataMessageImpl;
import za.co.ebridge.sccp.impl.parameter.ParameterFactoryImpl;
import za.co.ebridge.sccp.api.message.MessageFactory;
import za.co.ebridge.sccp.api.message.SccpDataMessage;
import za.co.ebridge.sccp.api.parameter.ParameterFactory;
import za.co.ebridge.sccp.api.parameter.SccpAddress;

public class SccpProviderImpl
        implements SccpProvider, Serializable
{
    private static final Logger logger = Logger.getLogger(SccpProviderImpl.class);

    private transient SccpStackImpl stack;
    protected FastMap<Integer, SccpListener> ssnToListener = new FastMap<>();
    protected List<SccpManagementEventListener> managementEventListeners = new ArrayList<>();

    private MessageFactoryImpl messageFactory;
    private ParameterFactoryImpl parameterFactory;

    SccpProviderImpl(SccpStackImpl stack)
    {
        this.stack = stack;
        this.messageFactory = stack.messageFactory;
        this.parameterFactory = new ParameterFactoryImpl();
    }

    public MessageFactory getMessageFactory()
    {
        return messageFactory;
    }

    public ParameterFactory getParameterFactory()
    {
        return parameterFactory;
    }

    public void registerSccpListener(int ssn, SccpListener listener)
    {
        synchronized (this)
        {
            SccpListener existingListener = ssnToListener.get(ssn);
            if (existingListener != null)
            {
                if (logger.isEnabledFor(Level.WARN))
                {
                    logger.warn(String.format("Registering SccpListener=%s for already existing SccpListnere=%s for " +
                                    "SSN=%d",
                            listener, existingListener, ssn));
                }
            }
            FastMap<Integer, SccpListener> newListener = new FastMap<>();
            newListener.putAll(ssnToListener);
            newListener.put(ssn, listener);
            ssnToListener = newListener;

            this.stack.broadcastChangedSsnState(ssn, true);
        }
    }

    public void deregisterSccpListener(int ssn)
    {
        synchronized (this)
        {
            FastMap<Integer, SccpListener> newListener = new FastMap<Integer, SccpListener>();
            newListener.putAll(ssnToListener);
            SccpListener existingListener = newListener.remove(ssn);
            if (existingListener == null)
            {
                if (logger.isEnabledFor(Level.WARN))
                {
                    logger.warn(String.format("No existing SccpListnere=%s for SSN=%d", existingListener, ssn));
                }
            }
            ssnToListener = newListener;

            this.stack.broadcastChangedSsnState(ssn, false);
        }
    }

    public void registerManagementEventListener(SccpManagementEventListener listener)
    {
        synchronized (this)
        {
            if (this.managementEventListeners.contains(listener))
                return;

            List<SccpManagementEventListener> newManagementEventListeners = new
                    ArrayList<SccpManagementEventListener>();
            newManagementEventListeners.addAll(this.managementEventListeners);
            newManagementEventListeners.add(listener);
            this.managementEventListeners = newManagementEventListeners;
        }
    }

    public void deregisterManagementEventListener(SccpManagementEventListener listener)
    {
        synchronized (this)
        {
            if (!this.managementEventListeners.contains(listener))
                return;

            List<SccpManagementEventListener> newManagementEventListeners = new
                    ArrayList<SccpManagementEventListener>();
            newManagementEventListeners.addAll(this.managementEventListeners);
            newManagementEventListeners.remove(listener);
            this.managementEventListeners = newManagementEventListeners;
        }
    }

    protected SccpListener getSccpListener(int ssn)
    {
        return ssnToListener.get(ssn);
    }

    protected FastMap<Integer, SccpListener> getAllSccpListeners()
    {
        return ssnToListener;
    }

    public void send(SccpDataMessage message)
            throws
            IOException
    {
        logger.debug("send()");
        SccpDataMessageImpl msg = ((SccpDataMessageImpl) message);
        stack.send(msg);
    }

    public int getMaxUserDataLength(SccpAddress calledPartyAddress, SccpAddress callingPartyAddress)
    {
        return this.stack.getMaxUserDataLength(calledPartyAddress, callingPartyAddress);
    }
}
