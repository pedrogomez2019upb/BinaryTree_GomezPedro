package edu.upb.ds.bintree;

public class Main {

    public static void main(String[] args) {
        //###########################
        //CREACION DEL ARBOL BINARIO
        //###########################
        System.out.println("\n########################");
        System.out.println("\nBienvenido al programa de arboles binarios");
        BinTree arbolBinario = new BinTree();
        //###########################
        //CREACION DE LA RAIZ
        //###########################
        Node raiz = new Node("/");
        //###########################
        //CREACION DE LAS RAMAS CON SUS RAICES
        //###########################
        raiz.left = new Node("+");
        raiz.right = new Node("*");
        raiz.left.left = new Node("-");
        raiz.left.right = new Node("+");
        raiz.left.left.right=new Node("a");
        raiz.left.right.left=new Node("x");
        raiz.left.right.right=new Node("y");
        raiz.right.right=new Node("*");
        raiz.right.left=new Node("+");
        raiz.right.left.right=new Node("b");
        raiz.right.right.left= new Node ("c");
        raiz.right.right.right= new Node ("a");
        //###########################
        //PREORDEN
        //###########################
        System.out.println("\n########################");
        System.out.println("\nArbol binario - PreOrden");
        System.out.println("\n########################");
        arbolBinario.preOrden(raiz);
        System.out.println();
        //###########################
        //INORDEN
        //###########################
        System.out.println("\n########################");
        System.out.println("\nArbol binario - InOrden");
        System.out.println("\n########################");
        arbolBinario.inOrden(raiz);
        System.out.println();
        //###########################
        //POSORDEN
        //###########################
        System.out.println("\n########################");
        System.out.println("\nArbol binario - PosOrden");
        System.out.println("\n########################");
        arbolBinario.posOrden(raiz);
        System.out.println();
        System.out.println("\n########################");
        System.out.println("\nGracias por utilizar el programa de arboles binarios");
        System.out.println("\n########################");
    }
}
//Developed by Pedro Gomez - ID:000396221