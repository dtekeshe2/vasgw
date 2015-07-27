package com.ebridgevas.commons.model;

import java.util.LinkedList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class TreeNode<T>
{

    public T data;
    public TreeNode<T> parent;
    public List<TreeNode<T>> children;

    public boolean isRoot()
    {
        return parent == null;
    }

    @Deprecated
    public boolean isLeaf()
    {
        return children.size() == 0;
    }

    public boolean hasChildren()
    {
        return children.size() > 0;
    }

    private List<TreeNode<T>> elementsIndex;

    public TreeNode(T data)
    {
        this.data = data;
        this.children = new LinkedList<>();
        this.elementsIndex = new LinkedList<>();
        this.elementsIndex.add(this);
    }

    public TreeNode<T> addChild(T child)
    {
        TreeNode<T> childNode = new TreeNode<T>(child);
        childNode.parent = this;
        this.children.add(childNode);
        this.registerChildForSearch(childNode);
        return childNode;
    }


    public int getLevel()
    {
        if (this.isRoot())
            return 0;
        else
            return parent.getLevel() + 1;
    }

    private void registerChildForSearch(TreeNode<T> node)
    {
        elementsIndex.add(node);
        if (parent != null)
            parent.registerChildForSearch(node);
    }

    public TreeNode<T> findTreeNode(Comparable<T> cmp)
    {
        for (TreeNode<T> element : this.elementsIndex)
        {
            T elData = element.data;
            if (cmp.compareTo(elData) == 0)
                return element;
        }

        return null;
    }

    public TreeNode<T> findChildById(Comparable<T> cmp)
    {

        for (TreeNode<T> child : children)
        {
            if (cmp.compareTo(child.data) == 0)
                return child;
        }

        return null;
    }

    public Set<T> childSet()
    {

        Set<T> set = new TreeSet<>();
        for (TreeNode<T> child : children)
        {
            set.add(child.data);
        }

        return set;
    }

    public Set<T> nodeSet()
    {

        Set<T> set = new TreeSet<>();
        set.add(data);
        return set;
    }
}

