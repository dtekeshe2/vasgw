/* eBridge SS7 */

package za.co.ebridge.m3ua.api.message.aspsm;

import za.co.ebridge.m3ua.api.message.M3UAMessage;
import za.co.ebridge.m3ua.api.parameter.HeartbeatData;

/**
 * The BEAT Ack message is sent in response to a received BEAT message. It includes all the parameters of the received BEAT
 * message, without any change.
 *
 * @author amit bhayani
 *
 */
public interface HeartbeatAck extends M3UAMessage {
    HeartbeatData getHeartbeatData();

    void setHeartbeatData(HeartbeatData hrBtData);
}
