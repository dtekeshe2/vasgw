package za.co.ebridge.m3ua.impl.message;

import java.nio.ByteBuffer;

import za.co.ebridge.m3ua.api.message.MessageClass;
import za.co.ebridge.m3ua.api.message.MessageFactory;
import za.co.ebridge.m3ua.api.message.MessageType;
import za.co.ebridge.m3ua.impl.message.aspsm.*;
import za.co.ebridge.m3ua.impl.message.asptm.ASPActiveAckImpl;
import za.co.ebridge.m3ua.impl.message.asptm.ASPActiveImpl;
import za.co.ebridge.m3ua.impl.message.asptm.ASPInactiveAckImpl;
import za.co.ebridge.m3ua.impl.message.asptm.ASPInactiveImpl;
import za.co.ebridge.m3ua.impl.message.mgmt.ErrorImpl;
import za.co.ebridge.m3ua.impl.message.mgmt.NotifyImpl;
import za.co.ebridge.m3ua.impl.message.rkm.DeregistrationRequestImpl;
import za.co.ebridge.m3ua.impl.message.rkm.DeregistrationResponseImpl;
import za.co.ebridge.m3ua.impl.message.rkm.RegistrationRequestImpl;
import za.co.ebridge.m3ua.impl.message.rkm.RegistrationResponseImpl;
import za.co.ebridge.m3ua.impl.message.ssnm.*;
import za.co.ebridge.m3ua.impl.message.transfer.PayloadDataImpl;

public class MessageFactoryImpl
        implements MessageFactory
{
    // header binary view
    private byte[] header = new byte[8];

    // variable length parameters
    private byte[] params;

    // current position either in header or in params
    private int pos = 0;

    // flag indicating that header is completely read
    private boolean isHeaderReady = false;

    // the length of message's parameters
    private int length;
    // message instance
    private M3UAMessageImpl message;

    public M3UAMessageImpl createMessage(int messageClass, int messageType)
    {
        switch (messageClass)
        {
            case MessageClass.TRANSFER_MESSAGES:
                switch (messageType)
                {
                    case MessageType.PAYLOAD:
                        return new PayloadDataImpl();
                }
                break;
            case MessageClass.SIGNALING_NETWORK_MANAGEMENT:
                switch (messageType)
                {
                    case MessageType.DESTINATION_UNAVAILABLE:
                        return new DestinationUnavailableImpl();
                    case MessageType.DESTINATION_AVAILABLE:
                        return new DestinationAvailableImpl();
                    case MessageType.DESTINATION_STATE_AUDIT:
                        return new DestinationStateAuditImpl();
                    case MessageType.SIGNALING_CONGESTION:
                        return new SignallingCongestionImpl();
                    case MessageType.DESTINATION_USER_PART_UNAVAILABLE:
                        return new DestinationUPUnavailableImpl();
                    case MessageType.DESTINATION_RESTRICTED:
                        return new DestinationRestrictedImpl();
                }
                break;
            case MessageClass.ASP_STATE_MAINTENANCE:
                switch (messageType)
                {
                    case MessageType.ASP_UP:
                        return new ASPUpImpl();
                    case MessageType.ASP_UP_ACK:
                        return new ASPUpAckImpl();
                    case MessageType.ASP_DOWN:
                        return new ASPDownImpl();
                    case MessageType.ASP_DOWN_ACK:
                        return new ASPDownAckImpl();
                    case MessageType.HEARTBEAT:
                        return new HeartbeatImpl();
                    case MessageType.HEARTBEAT_ACK:
                        return new HeartbeatAckImpl();
                }
                break;
            case MessageClass.ASP_TRAFFIC_MAINTENANCE:
                switch (messageType)
                {
                    case MessageType.ASP_ACTIVE:
                        return new ASPActiveImpl();
                    case MessageType.ASP_ACTIVE_ACK:
                        return new ASPActiveAckImpl();
                    case MessageType.ASP_INACTIVE:
                        return new ASPInactiveImpl();
                    case MessageType.ASP_INACTIVE_ACK:
                        return new ASPInactiveAckImpl();

                }
                break;
            case MessageClass.ROUTING_KEY_MANAGEMENT:
                switch (messageType)
                {
                    case MessageType.REG_REQUEST:
                        return new RegistrationRequestImpl();
                    case MessageType.REG_RESPONSE:
                        return new RegistrationResponseImpl();
                    case MessageType.DEREG_REQUEST:
                        return new DeregistrationRequestImpl();
                    case MessageType.DEREG_RESPONSE:
                        return new DeregistrationResponseImpl();
                }

            case MessageClass.MANAGEMENT:
                switch (messageType)
                {
                    case MessageType.ERROR:
                        return new ErrorImpl();
                    case MessageType.NOTIFY:
                        return new NotifyImpl();
                }

        }
        return null;
    }

    public M3UAMessageImpl createMessage(ByteBuffer buffer)
    {
        // fill header buffer completely before start parsing header
        if (!isHeaderReady)
        {
            // the amount of data possible to read is determined as
            // minimal remainder either of header buffer or of the input buffer
            int len = Math.min(header.length - this.pos, buffer.remaining());

            System.out.println(String.format("len=%d, pos=%d, buffer.remaining=%d", len, this.pos, buffer.remaining()));
            buffer.get(header, this.pos, len);

            // update cursor postion in the header's buffer
            this.pos += len;

            // header completed?
            isHeaderReady = this.pos == header.length;

            if (!isHeaderReady)
            {
                // no more data available
                return null;
            }

            // obtain message class and type from header
            int messageClass = header[2] & 0xff;
            int messageType = header[3] & 0xff;

            // construct new message instance
            message = this.createMessage(messageClass, messageType);

            // obtain remaining length of the message and prepare buffer
            length = (( (header[4] & 0xff) << 24) | ((header[5] & 0xff) << 16) | ((header[6] & 0xff) << 8) | (header[7] & 0xff)) - 8;

            if (length == 0)
            {
                // This is only header message,no body
                this.pos = 0;
                this.isHeaderReady = false;
                return message;
            }
            params = new byte[length];

            // finally switch cursor position
            this.pos = 0;
        }

        // at this point we must recheck remainder of the input buffer
        // because possible case when input buffer fits exactly to the header
        if (!buffer.hasRemaining())
        {
            return null;
        }

        // again, reading all parameters before parsing

        // compute available or required data
        int len = Math.min(params.length - this.pos, buffer.remaining());
        buffer.get(params, this.pos, len);

        // update cursor position
        this.pos += len;

        // end of message not reached
        if (this.pos < params.length)
        {
            return null;
        }

        // end of message reached and most probably some data remains in buffer
        // do not touch remainder of the input buffer, next call to this method
        // will proceed remainder

        // parsing params of this message
        message.decode(params);

        // switch factory for receiving new message
        this.isHeaderReady = false;
        this.pos = 0;

        // return
        return message;
    }

    public M3UAMessageImpl createSctpMessage(byte[] buffer)
    {
        int dataLen;
        // fill header buffer completely before start parsing header
        if (buffer.length < 8)
        {
            return null;
        }

        // obtain message class and type from header
        int messageClass = buffer[2] & 0xff;
        int messageType = buffer[3] & 0xff;

        // construct new message instance
        M3UAMessageImpl messageTemp = this.createMessage(messageClass, messageType);

        // obtain remaining length of the message and prepare buffer
        dataLen = (((buffer[4] & 0xff) << 24) | ((buffer[5] & 0xff) << 16) | ((buffer[6] & 0xff) << 8) | (buffer[7] & 0xff)) - 8;

        if (buffer.length >= (dataLen - 8))
        {
            // parsing params of this message
            messageTemp.decode(buffer, 8);
        }

        return messageTemp;
    }
}
