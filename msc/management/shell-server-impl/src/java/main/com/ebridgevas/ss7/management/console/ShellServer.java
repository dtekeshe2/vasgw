//package com.ebridgevas.ss7.management.console;
//
//import java.io.IOException;
//import java.net.InetSocketAddress;
//import java.nio.channels.SelectionKey;
//import java.util.ArrayList;
//import java.util.List;
//
//import com.ebridge.ss7.management.console.ShellExecutor;
//
//import javolution.util.FastSet;
//
//import org.apache.log4j.Logger;
//import com.ebridgevas.protocols.ss7.scheduler.Scheduler;
//import com.ebridgevas.protocols.ss7.scheduler.Task;
//import com.ebridgevas.ss7.management.transceiver.ChannelProvider;
//import com.ebridgevas.ss7.management.transceiver.ChannelSelectionKey;
//import com.ebridgevas.ss7.management.transceiver.ChannelSelector;
//import com.ebridgevas.ss7.management.transceiver.Message;
//import com.ebridgevas.ss7.management.transceiver.MessageFactory;
//import com.ebridgevas.ss7.management.transceiver.ShellChannel;
//import com.ebridgevas.ss7.management.transceiver.ShellServerChannel;
//
//
//public class ShellServer extends Task {
//    Logger logger = Logger.getLogger(ShellServer.class);
//
//    public static final String CONNECTED_MESSAGE = "Connected to %s %s %s";
//
//    Version version = Version.instance;
//
//    private ChannelProvider provider;
//    private ShellServerChannel serverChannel;
//    private ShellChannel channel;
//    private ChannelSelector selector;
//    private ChannelSelectionKey skey;
//
//    private MessageFactory messageFactory = null;
//
//    private String rxMessage = "";
//    private String txMessage = "";
//
//    private volatile boolean started = false;
//
//    private String address;
//
//    private int port;
//
//    private final List<ShellExecutor> shellExecutors = new ArrayList<ShellExecutor>();
//
//    public ShellServer(Scheduler scheduler, List<ShellExecutor> shellExecutors) throws IOException {
//        super(scheduler);
//        this.shellExecutors.addAll(shellExecutors);
//    }
//
//    public String getAddress() {
//        return address;
//    }
//
//    public void setAddress(String address) {
//        this.address = address;
//    }
//
//    public int getPort() {
//        return port;
//    }
//
//    public void setPort(int port) {
//        this.port = port;
//    }
//
//    public void start() throws IOException {
//        logger.info("Starting SS7 management shell environment");
//        provider = ChannelProvider.provider();
//        serverChannel = provider.openServerChannel();
//        InetSocketAddress inetSocketAddress = new InetSocketAddress(address, port);
//        serverChannel.bind(inetSocketAddress);
//
//        selector = provider.openSelector();
//        skey = serverChannel.register(selector, SelectionKey.OP_ACCEPT);
//
//        messageFactory = ChannelProvider.provider().getMessageFactory();
//
//        this.logger.info(String.format("ShellExecutor listening at %s", inetSocketAddress));
//
//        this.started = true;
//        this.activate(false);
//        scheduler.submit(this, scheduler.MANAGEMENT_QUEUE);
//    }
//
//    public void stop() {
//        this.started = false;
//
//        try {
//            skey.cancel();
//            if (channel != null) {
//                channel.close();
//            }
//            serverChannel.close();
//            selector.close();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
//        this.logger.info("Stopped ShellExecutor service");
//    }
//
//    public int getQueueNumber() {
//        return scheduler.MANAGEMENT_QUEUE;
//    }
//
//    public long perform() {
//        if (!this.started)
//            return 0;
//
//        try {
//            FastSet<ChannelSelectionKey> keys = selector.selectNow();
//
//            for (ChannelSelectionKey key : keys) {
//
//                if (key.isAcceptable()) {
//                    accept();
//                } else if (key.isReadable()) {
//                    ShellChannel chan = (ShellChannel) key.channel();
//                    Message msg = (Message) chan.receive();
//
//                    if (msg != null) {
//                        rxMessage = msg.toString();
//                        logger.info("received command : " + rxMessage);
//                        if (rxMessage.compareTo("disconnect") == 0) {
//                            this.txMessage = "Bye";
//                            chan.send(messageFactory.createMessage(txMessage));
//
//                        } else {
//                            String[] options = rxMessage.split(" ");
//                            ShellExecutor shellExecutor = null;
//                            for (ShellExecutor value : this.shellExecutors ) {
//
//                                if (value.handles(options[0])) {
//                                    shellExecutor = value;
//                                    break;
//                                }
//                            }
//
//                            if (shellExecutor == null) {
//                                logger.warn(String.format(
//                                        "Received command=\"%s\" for which no ShellExecutor is configured ", rxMessage));
//                                chan.send(messageFactory.createMessage("Invalid command"));
//                            } else {
//                                this.txMessage = shellExecutor.execute(options);
//                                chan.send(messageFactory.createMessage(this.txMessage));
//                            }
//
//                        } // if (rxMessage.compareTo("disconnect")
//                    } // if (msg != null)
//
//                    // TODO Handle message
//
//                    rxMessage = "";
//
//                } else if (key.isWritable() && txMessage.length() > 0) {
//
//                    if (this.txMessage.compareTo("Bye") == 0) {
//                        this.closeChannel();
//                    }
//                    this.txMessage = "";
//                }
//            }
//        } catch (IOException e) {
//            logger.error(
//                    "IO Exception while operating on ChannelSelectionKey. Client CLI connection will be closed now", e);
//            try {
//                this.closeChannel();
//            } catch (IOException e1) {
//                logger.error("IO Exception while closing Channel", e);
//            }
//        } catch (Exception e) {
//            logger.error("Exception while operating on ChannelSelectionKey. Client CLI connection will be closed now",
//                    e);
//            try {
//                this.closeChannel();
//            } catch (IOException e1) {
//                logger.error("IO Exception while closing Channel", e);
//            }
//        }
//
//        if (this.started)
//            scheduler.submit(this, scheduler.MANAGEMENT_QUEUE);
//
//        return 0;
//    }
//
//    private void accept() throws IOException {
//        channel = serverChannel.accept();
//        skey.cancel();
//        skey = channel.register(selector, SelectionKey.OP_READ | SelectionKey.OP_WRITE);
//
//        channel.send(messageFactory.createMessage(String.format(CONNECTED_MESSAGE, this.version.getProperty("name"),
//                this.version.getProperty("version"), this.version.getProperty("vendor"))));
//    }
//
//    private void closeChannel() throws IOException {
//        if (channel != null) {
//            try {
//                this.channel.close();
//            } catch (IOException e) {
//                logger.error("Error closing channel", e);
//            }
//        }
//        skey.cancel();
//        skey = serverChannel.register(selector, SelectionKey.OP_ACCEPT);
//    }
//}
