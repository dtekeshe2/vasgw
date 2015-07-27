/* eBridge SS7 */

package za.co.ebridge.map.impl.dialog;

import za.co.ebridge.map.api.dialog.ServingCheckData;
import za.co.ebridge.map.api.dialog.ServingCheckResult;
import za.co.ebridge.tcap.api.asn.ApplicationContextName;

public class ServingCheckDataImpl implements ServingCheckData {

    private ServingCheckResult result;
    private ApplicationContextName alternativeApplicationContext = null;

    public ServingCheckDataImpl(ServingCheckResult result) {
        this.result = result;
    }

    public ServingCheckDataImpl(ServingCheckResult result, ApplicationContextName alternativeApplicationContext) {
        this.result = result;
        this.alternativeApplicationContext = alternativeApplicationContext;
    }

    public ServingCheckResult getResult() {
        return this.result;
    }

    public ApplicationContextName getAlternativeApplicationContext() {
        return this.alternativeApplicationContext;
    }
}
