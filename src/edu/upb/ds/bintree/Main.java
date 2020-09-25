package edu.upb.ds.bintree;

public class Main {

    public static void main(String[] args) {
        //###########################
        //CREACION DEL ARBOL BINARIO
        //###########################
        BinTree treeOrder = new BinTree();
        //###########################
        //CREACION DE LA RAIZ
        //###########################
        Node root = new Node("/");
        //###########################
        //CREACION DE LAS RAMAS CON SUS RAICES
        //###########################
        root.left = new Node("+");
        root.right = new Node("*");
        root.left.left = new Node("-");
        root.left.right = new Node("+");
        root.left.left.right=new Node("a");
        root.left.right.left=new Node("x");
        root.left.right.right=new Node("y");
        root.right.right=new Node("*");
        root.right.left=new Node("+");
        root.right.left.right=new Node("b");
        root.right.right.left= new Node ("c");
        root.right.right.right= new Node ("a");
        //###########################
        //PREORDEN
        //###########################
        treeOrder.preOrder(root);
        System.out.println();
        //###########################
        //INORDEN
        //###########################
        treeOrder.inOrder(root);
        System.out.println();
        //###########################
        //POSORDEN
        //###########################
        treeOrder.posOrder(root);
        System.out.println();
    }
}
//Developed by Pedro Gomez - ID:000396221