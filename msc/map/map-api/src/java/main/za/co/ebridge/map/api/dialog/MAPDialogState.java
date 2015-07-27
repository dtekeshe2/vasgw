/* eBridge SS7 */

package za.co.ebridge.map.api.dialog;

/**
 * @author david@tekeshe.com
 *
 */
public enum MAPDialogState {

    IDLE("IDLE"),

    INITIAL_RECEIVED("INITIAL_RECEIVED"), INITIAL_SENT("INITIAL_SENT"),

    ACTIVE("ACTIVE"),
    // additional state to mark removal
    EXPUNGED("EXPUNGED");

    private final String state;

    private MAPDialogState(String state) {
        this.state = state;
    }

    public String getState() {
        return this.state;
    }

    public MAPDialogState getInstance(String state) {
        if (state.equals("IDLE")) {
            return IDLE;
        } else if (state.equals("INITIAL_RECEIVED")) {
            return INITIAL_RECEIVED;
        } else if (state.equals("INITIAL_SENT")) {
            return INITIAL_SENT;
        } else if (state.equals("ACTIVE")) {
            return ACTIVE;
        } else if (state.equals("EXPUNGED")) {
            return EXPUNGED;
        }

        return null;
    }
}
