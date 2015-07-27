/* eBridge SS7 */

package za.co.ebridge.mtp.impl;

import java.util.ArrayList;

/**
 *
 * @author kulikov
 */
public class TxQueue {
    private ArrayList<byte[]> queue = new ArrayList();

    public boolean isEmpty() {
        return queue.isEmpty();
    }

    public void offer(byte[] frame) {
        queue.add(frame);
    }

    public byte[] peak() {
        return queue.isEmpty() ? null : queue.remove(0);
    }

}
