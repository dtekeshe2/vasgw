/* eBridge SS7 */

package com.ebridgevas.protocols.ss7.m3ua.impl.router;

import za.co.ebridge.m3ua.impl.AsImpl;

import javolution.util.FastSet;

/**
 * <p>
 * dpc is mandatory in deciding the correct AS to route the MTP3 traffic.
 * </p>
 *
 * @author david@tekeshe.com
 *
 */
public class DPCNode {

    int dpc = -1;

    // private FastList<OPCNode> opcList = new FastList<OPCNode>();
    private FastSet<OPCNode> opcSet = new FastSet<OPCNode>();

    private OPCNode wildCardOpcNode = null;

    public DPCNode(int dpc) {
        this.dpc = dpc;
    }

    /*
     * DT-2014-03-30 Migration from javolution 5.26 to 6.01
     *
    protected void addSi(int opc, int si, AsImpl asImpl) throws Exception {
        for (FastList.Node<OPCNode> n = opcList.head(), end = opcList.tail(); (n = n.getNext()) != end;) {
            OPCNode opcNode = n.getValue();
            if (opcNode.opc == opc) {
                opcNode.addSi(si, asImpl);
                return;
            }
        }

        OPCNode opcNode = new OPCNode(this.dpc, opc);
        opcNode.addSi(si, asImpl);
        opcList.add(opcNode);

        if (opcNode.opc == -1) {
            // we have wild card OPCNode. Use this if no matching OPCNode
            // found while finding AS
            wildCardOpcNode = opcNode;
        }

    }
    */

    protected void addSi(int opc, int si, AsImpl asImpl) throws Exception {

        for ( OPCNode opcNode : opcSet ) {
            if ( opcNode.opc == opc ) {
                opcNode.addSi(si, asImpl);
                return;
            }
        }

        OPCNode opcNode = new OPCNode(this.dpc, opc);
        opcNode.addSi(si, asImpl);
        opcSet.add(opcNode);

        if (opcNode.opc == -1) {
            // we have wild card OPCNode. Use this if no matching OPCNode
            // found while finding AS
            wildCardOpcNode = opcNode;
        }

    }

    /*
     * DT-2014-03-30 Migration from javolution 5.26 to 6.01
     *
    protected AsImpl getAs(int opc, short si) {
        for (FastList.Node<OPCNode> n = opcList.head(), end = opcList.tail(); (n = n.getNext()) != end;) {
            OPCNode opcNode = n.getValue();
            if (opcNode.opc == opc) {
                return opcNode.getAs(si);
            }
        }

        if (wildCardOpcNode != null) {
            return wildCardOpcNode.getAs(si);
        }
        return null;
    }
    */

    protected AsImpl getAs(int opc, short si) {

        for ( OPCNode opcNode : opcSet ) {
            if ( opcNode.opc == opc) {
                return opcNode.getAs(si);
            }
        }

        if (wildCardOpcNode != null) {
            return wildCardOpcNode.getAs(si);
        }
        return null;
    }
}
