package br.ufrn.imd.edb2;

public class RedBlackNode<T extends Comparable<T>> {
    private RedBlackNode<T> left    = null;
    private  RedBlackNode<T> right  = null;
    private  RedBlackNode<T> parent = null;
    private NodeColor color;
    private T value;

    public RedBlackNode(T value){
        this.value = value;
        this.color = NodeColor.Red;
    }

    public RedBlackNode<T> getLeft() {return left; }

    public void setLeft(RedBlackNode<T> left) {this.left = left;}

    public RedBlackNode<T> getRight() {return right;}

    public void setRight(RedBlackNode<T> right) {this.right = right;}

    public RedBlackNode<T> getParent() {return parent;}

    public void setParent(RedBlackNode<T> parent) {this.parent = parent;}

    public NodeColor getNodeColor() {return color;}

    public void setNodeColor(NodeColor nodeColor) {this.color = nodeColor;}

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }





}
