/* eBridge SS7 */

package za.co.ebridge.map.api.service.mobility.handover;

import java.io.Serializable;

/**
 *
 ChosenRadioResourceInformation ::= SEQUENCE { chosenChannelInfo [0] ChosenChannelInfo OPTIONAL, chosenSpeechVersion [1]
 * ChosenSpeechVersion OPTIONAL, ...}
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface ChosenRadioResourceInformation extends Serializable {

    ChosenChannelInfo getChosenChannelInfo();

    ChosenSpeechVersion getChosenSpeechVersion();

}
