/* eBridge SS7 */

package com.ebridgevas.protocols.ss7.m3ua.impl.router;

import javolution.util.FastSet;

import za.co.ebridge.m3ua.impl.AsImpl;

/**
 *
 * @author david@tekeshe.com
 *
 */
public class OPCNode {

    protected int dpc;
    protected int opc;
    protected FastSet<SINode> siSet = new FastSet<SINode>();

    // Reference to wild card SINode. If no matching SINode found for passed si
    // and wildcard defined, use wildcard one.
    private SINode wildCardSINode;

    protected OPCNode(int dpc, int opc) {
        this.dpc = dpc;
        this.opc = opc;
    }

    protected void addSi(int si, AsImpl asImpl) throws Exception {

        for (SINode siNode : siSet ) {
            if (siNode.si == si) {
                throw new Exception(
                        String.format("Service indicator %d already exist for OPC %d and DPC %d", si, opc, dpc));
            }
        }

        SINode siNode = new SINode(si, asImpl);
        siSet.add(siNode);

        if (si == -1) {
            wildCardSINode = siNode;
        }
    }

    /*
    protected void addSi(int si, AsImpl asImpl) throws Exception {
        for (FastList.Node<SINode> n = siList.head(), end = siList.tail(); (n = n.getNext()) != end;) {
            SINode siNode = n.getValue();
            if (siNode.si == si) {
                throw new Exception(String.format("Service indicator %d already exist for OPC %d and DPC %d", si, opc, dpc));
            }
        }

        SINode siNode = new SINode(si, asImpl);
        siList.add(siNode);

        if (si == -1) {
            wildCardSINode = siNode;
        }
    }
    */

    protected AsImpl getAs(short si) {

        for (SINode siNode : siSet ) {

            if ( siNode.si == si ) {
                return siNode.asImpl;
            }
        }

        if (wildCardSINode != null) {
            return wildCardSINode.asImpl;
        }
        return null;
    }

    /*
    protected AsImpl getAs(short si) {
        for (FastList.Node<SINode> n = siList.head(), end = siList.tail(); (n = n.getNext()) != end;) {
            SINode siNode = n.getValue();
            if (siNode.si == si) {
                return siNode.asImpl;
            }
        }

        if (wildCardSINode != null) {
            return wildCardSINode.asImpl;
        }
        return null;
    }
    */
}
