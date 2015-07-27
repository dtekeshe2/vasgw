package za.co.ebridge.map.impl;

import za.co.ebridge.tcap.api.asn.TCAPStackImpl;
import org.apache.log4j.Logger;
import za.co.ebridge.congestion.CongestionListener;
import za.co.ebridge.map.api.MAPProvider;
import za.co.ebridge.map.api.MAPStack;
import za.co.ebridge.sccp.api.SccpProvider;
import za.co.ebridge.tcap.api.api.TCAPProvider;
import za.co.ebridge.tcap.api.api.TCAPStack;

public class MAPStackImpl
        implements MAPStack, CongestionListener
{

    protected TCAPStack tcapStack = null;

    protected MAPProviderImpl mapProvider = null;

    private State state = State.IDLE;

    private final String name;

    private static Logger log = Logger.getLogger("MAPStackImpl.class");

    public MAPStackImpl(String name, SccpProvider sccpProvider, Integer ... ssn)
    {
        log.debug("MAPStackImpl for ssn : " + ssn);
        this.name = name;
        this.tcapStack = new TCAPStackImpl(name, sccpProvider, ssn);
        TCAPProvider tcapProvider = tcapStack.getProvider();
        log.debug("tcapProvider : " + tcapProvider);
        mapProvider = new MAPProviderImpl(name, tcapProvider);

        this.state = State.CONFIGURED;
    }

    public MAPStackImpl(String name, TCAPProvider tcapProvider)
    {
        this.name = name;
        mapProvider = new MAPProviderImpl(name, tcapProvider);
        this.state = State.CONFIGURED;
    }

    @Override
    public String getName()
    {
        return name;
    }

    public MAPProvider getMAPProvider()
    {
        return this.mapProvider;
    }

    public void start()
            throws
            Exception
    {
        if (state != State.CONFIGURED)
        {
            throw new IllegalStateException("Stack has not been configured or is already running!");
        }
        if (tcapStack != null)
        {
            // this is null in junits!
            this.tcapStack.start();
        }
        this.mapProvider.start();

        this.state = State.RUNNING;

    }

    public void stop()
    {
        if (state != State.RUNNING)
        {
            throw new IllegalStateException("Stack is not running!");
        }
        this.mapProvider.stop();
        if (tcapStack != null)
        {
            this.tcapStack.stop();
        }

        this.state = State.CONFIGURED;
    }

    // // ///////////////
    // // CONF METHOD //
    // // ///////////////
    // /**
    // * @throws ConfigurationException
    // *
    // */
    // public void configure(Properties props) throws ConfigurationException {
    // if (state != State.IDLE) {
    // throw new
    // IllegalStateException("Stack already been configured or is already running!");
    // }
    // tcapStack.configure(props);
    // TCAPProvider tcapProvider = tcapStack.getProvider();
    // mapProvider = new MAPProviderImpl(tcapProvider);
    // this.state = State.CONFIGURED;
    // }

    private enum State
    {
        IDLE, CONFIGURED, RUNNING;
    }

    public TCAPStack getTCAPStack()
    {
        return this.tcapStack;
    }

    public void onCongestionStart(String congName)
    {
        this.mapProvider.onCongestionStart(congName);
    }

    public void onCongestionFinish(String congName)
    {
        this.mapProvider.onCongestionFinish(congName);
    }
}
