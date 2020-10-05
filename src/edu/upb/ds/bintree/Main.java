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
        //CREACION DE LAS RAMAS CON SUS RAICES
        //###########################
        //Ejemplo Clase
        /*
        //###########################
        //CREACION DE LA RAIZ
        //###########################
        Node raiz = new Node("/");
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

         */
        //Arbol clase aplicativo
        Node raiz = new Node(120);
        raiz.left=new Node(87);
        raiz.left.left=new Node(43);
        raiz.left.left.left=new Node(22);
        raiz.left.left.right=new Node(65);
        raiz.left.left.right.left=new Node(56);
        raiz.left.right=new Node (99);
        raiz.left.right.left=new Node (93);
        raiz.right=new Node(140);
        raiz.right.left=new Node(130);
        raiz.right.left.right=new Node(135);
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
//Developed by Estefany Rueda & Pedro Gomez - ID:000402237 & ID:000396221