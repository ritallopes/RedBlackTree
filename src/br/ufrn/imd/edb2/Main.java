package br.ufrn.imd.edb2;

public class Main {

    public static void main(String[] args) {


        RedBlackTree<Pessoa> tree = new RedBlackTree<>();

        Pessoa p1 = new Pessoa(1);
        Pessoa p2 = new Pessoa(2);
        Pessoa p3 = new Pessoa(3);

        tree.insert(p1);
        tree.insert(p2);
       // tree.insert(p3);

    }


}
