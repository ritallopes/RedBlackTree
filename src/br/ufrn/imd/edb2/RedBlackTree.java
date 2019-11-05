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
        this.root = insert(new RedBlackNode<T>(value));
    }

    private RedBlackNode<T> insert(RedBlackNode<T> node){
        ///Se a árvore está vazia, pinte o nó de preto
        if (this.root == null){
            this.root = node;
            this.root.setNodeColor(NodeColor.Black);
            return this.root;
        }

        

        ///Se o pai é preto, nada precisa ser feito, pois a inserção do
        //nó não viola nenhuma propriedade
        RedBlackNode<T> parent = node.getParent();

        if (parent.getNodeColor().equals(NodeColor.Black)){
            if (node.getValue().compareTo(node.getParent().getValue()) < 0){
                node.getParent().setLeft(insert(node.getLeft()));
            }

            if (node.getValue().compareTo(node.getParent().getValue()) == 0){
                node.getParent().setValue(node.getValue());
            }

            if (node.getValue().compareTo(node.getParent().getValue()) > 0){
                node.getParent().setRight(insert(node.getRight()));
            }
            return node.getParent();//é para retorna o pai?
        }


        ///Se o tio for vermelho, modificamos a cor do pai do tio e do
        //avô
        //• Repetimos o reparo no avô (ele pode ser a raiz)
        if (node.getParent().getParent().getRight().equals(node.getParent())){
            if(node.getParent().getParent().getLeft().getNodeColor().equals(NodeColor.Red) ){
                node.getParent().getParent().setNodeColor(node.getParent().getParent().getNodeColor().equals(NodeColor.Red)?NodeColor.Red:NodeColor.Black);
                return node.getParent();
            }
        }else{
            if(node.getParent().getParent().getRight().getNodeColor().equals(NodeColor.Red) ){
                node.getParent().getParent().setNodeColor(node.getParent().getParent().getNodeColor().equals(NodeColor.Red)?NodeColor.Red:NodeColor.Black);
                return node.getParent();

            }
        }

//        if (node.getValue().compareTo(parent.getValue()) < 0){
//            parent.setLeft(insert(node, parent.getLeft()));
//            return parent;
//        }
//
//        if (node.getValue().compareTo(parent.getValue()) == 0){
//            parent.setValue(node.getValue());
//            return parent;
//        }
//
//        if (node.getValue().compareTo(parent.getValue()) > 0){
//            parent.setRight(insert(node, parent.getRight()));
//        }

        return (null);

    }

    public void printTree(){
        if (this.root != null) {
            this.root.printNode();
        }
    }

}
