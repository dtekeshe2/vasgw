/* eBridge SS7 */

package za.co.ebridge.mtp.impl;

public interface Mtp2Listener {

    void linkFailed();

    void linkInService();

    void linkUp();

}
