/* eBridge SS7 */

package za.co.ebridge.m3ua.api.parameter;

/**
 * The Correlation Id parameter uniquely identifies the MSU carried in the Protocol Data within an AS. This Correlation Id
 * parameter is assigned by the sending M3UA.
 *
 * @author amit bhayani
 *
 */
public interface CorrelationId extends Parameter {
    long getCorrelationId();
}
