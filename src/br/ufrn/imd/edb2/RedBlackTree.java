package br.ufrn.imd.edb2;

public class RedBlackTree<T extends Comparable<T>>{

    private RedBlackNode<T> root;

    public RedBlackTree(RedBlackNode<T> root) {
        this.root = root;
        this.root.setNodeColor(NodeColor.Black);
    }
    public RedBlackNode getRoot() {
        return root;
    }


}
