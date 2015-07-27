/* eBridge SS7 */

package za.co.ebridge.map.api.primitives;

/**
 *
 * FTN-AddressString ::= AddressString (SIZE (1..maxFTN-AddressLength)) -- This type is used to represent forwarded-to numbers.
 * -- If NAI = international the first digits represent the country code (CC) -- and the network destination code (NDC) as for
 * E.164.
 *
 *
 * @author david@tekeshe.com
 *
 */
public interface FTNAddressString extends AddressString {

}
