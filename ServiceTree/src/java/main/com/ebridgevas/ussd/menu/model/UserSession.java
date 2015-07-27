package com.ebridgevas.ussd.menu.model;

import com.ebridgevas.commons.dto.Authorisation;
import com.ebridgevas.commons.model.TreeNode;

public class UserSession
{
    private final Long uuid;
    private final Authorisation authorisation;
    private TreeNode<NodeData> treeNode;

    public UserSession(Long uuid, Authorisation authorisation, TreeNode<NodeData> treeNode)
    {
        this.uuid = uuid;
        this.authorisation = authorisation;
        this.treeNode = treeNode;
    }

    public Long getUuid()
    {
        return uuid;
    }

    public Authorisation getAuthorisation()
    {
        return authorisation;
    }

    public TreeNode<NodeData> getTreeNode()
    {
        return treeNode;
    }

    public void setTreeNode(TreeNode<NodeData> treeNode)
    {
        this.treeNode = treeNode;
    }
}
