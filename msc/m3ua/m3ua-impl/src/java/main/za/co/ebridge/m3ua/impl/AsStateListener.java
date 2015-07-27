/* eBridge SS7 */
package za.co.ebridge.m3ua.impl;

/**
 * <p>
 * The listener interface for receiving events when {@link AsImpl} state changes to Active or not-active
 * </p>
 *
 * @author david@tekeshe.com
 *
 */
public interface AsStateListener {

    /**
     * Invoked when {@link AsImpl} becomes active
     *
     * @param asImpl
     */
    void onAsActive(AsImpl asImpl);

    /**
     * Invoked when {@link AsImpl} becomes inactive
     *
     * @param asImpl
     */
    void onAsInActive(AsImpl asImpl);
}
