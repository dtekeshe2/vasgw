package com.ebridgevas.ussd.menu.model.util;

import com.ebridgevas.commons.model.TreeNode;
import com.ebridgevas.ussd.menu.model.NodeData;

import java.util.Set;

public class USSDMenuFormatter
{
    public static String format(TreeNode node)
    {
        NodeData data = (NodeData)node.data;

        StringBuilder payload = new StringBuilder();

        if (!data.getHeaderText().isEmpty())
            payload.append(data.getHeaderText()).append("\n");

        if (!data.getSubHeaderText().isEmpty())
            payload.append(data.getSubHeaderText()).append("\n");

        for (NodeData child : (Set<NodeData>)node.childSet())
        {
            payload.append(child.getNodeId()).append(". ").append(child.getDescription()).append("\n");
        }

        return payload.toString();
    }
}
