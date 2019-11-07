package br.ufrn.imd.edb2;

public class RedBlackTree<T extends Comparable<T>>{

    private RedBlackNode<T> root;

    public RedBlackTree(RedBlackNode<T> root) {
        this.root = root;
        this.root.setNodeColor(NodeColor.Black);
    }

    public RedBlackTree() {
        this.root = null;
    }

    public RedBlackNode getRoot() {
        return root;
    }

    public void insert(T value){
        RedBlackNode<T> node = new RedBlackNode<>(value);
        node.setParent(root);
        this.root = insert(node);
    }

    private RedBlackNode<T> insert(RedBlackNode<T> node){

        ///Se a árvore está vazia, pinte o nó de preto
        if (node.getParent() == null) {
            node.setNodeColor(NodeColor.Black);
            node.setParent(this.root);
            return node;
        }



        if (node.getValue().compareTo(node.getParent().getValue()) == 0){
            node.getParent().setValue(node.getValue());
        }

        if (node.getValue().compareTo(node.getParent().getValue()) < 0){
            node.setParent(node.getParent().getLeft());
            node.getParent().setLeft(insert(node));
        }

        if (node.getValue().compareTo(node.getParent().getValue()) > 0){
            node.setParent(node.getParent().getRight());
            insert(node).setRight(node.getParent());

        }

        return node;
    }

    private RedBlackNode<T> balance(RedBlackNode<T> node) {
        ///Se o pai é preto, nada precisa ser feito, pois a inserção do
        //nó não viola nenhuma propriedade

        RedBlackNode<T> parent = node.getParent();


        if (parent.getNodeColor() == NodeColor.Black){
            return node;//é para retorna o pai?
        }

//        ///Se o tio for vermelho, modificamos a cor do pai do tio e do
//        //avô
//        //• Repetimos o reparo no avô (ele pode ser a raiz)

        if ((parent.getRight().getNodeColor() == NodeColor.Red) && (parent.getRight() != node)){
            
        }
//
////        if (node.getValue().compareTo(parent.getValue()) < 0){
////            parent.setLeft(insert(node, parent.getLeft()));
////            return parent;
////        }
////
////        if (node.getValue().compareTo(parent.getValue()) == 0){
////            parent.setValue(node.getValue());
////            return parent;
////        }
////
////        if (node.getValue().compareTo(parent.getValue()) > 0){
////            parent.setRight(insert(node, parent.getRight()));
////        }
//
//        return (null);



    }

    public void printTree(){
        if (this.root != null) {
            this.root.printNode();
        }
    }

}
