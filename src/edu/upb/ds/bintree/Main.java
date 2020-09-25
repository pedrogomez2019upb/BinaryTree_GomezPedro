package edu.upb.ds.bintree;

public class Main {

    public static void main(String[] args) {
        //###########################
        //CREACION DEL ARBOL BINARIO
        //###########################
        BinTree arbolBinario = new BinTree();
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
        arbolBinario.preOrden(root);
        System.out.println();
        //###########################
        //INORDEN
        //###########################
        arbolBinario.inOrden(root);
        System.out.println();
        //###########################
        //POSORDEN
        //###########################
        arbolBinario.posOrden(root);
        System.out.println();
    }
}
//Developed by Pedro Gomez - ID:000396221