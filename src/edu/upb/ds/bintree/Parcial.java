package edu.upb.ds.bintree;

public class Parcial {
    public static void main(String[] args) {
        System.out.println("\n########################");
        System.out.println("\nBienveido al arbol binario (Parcial)");
        System.out.println("\n########################");
        BinTree arbol = new BinTree();
        Node raiz = new Node(200);
        arbol.ubicarElementoBinario(58,raiz);
        arbol.ubicarElementoBinario(142,raiz);
        arbol.ubicarElementoBinario(96,raiz);
        arbol.ubicarElementoBinario(88,raiz);
        arbol.ubicarElementoBinario(202,raiz);
        arbol.ubicarElementoBinario(44,raiz);
        arbol.ubicarElementoBinario(92,raiz);
        arbol.ubicarElementoBinario(74,raiz);
        arbol.ubicarElementoBinario(40,raiz);
        arbol.ubicarElementoBinario(50,raiz);
        arbol.ubicarElementoBinario(20,raiz);
        System.out.println("\n########################");
        System.out.println("\nSalida inOrden del arbol");
        arbol.inOrden(raiz);
        System.out.println("\n########################");
        System.out.println("\nEl elemento 12 se encuentra en el arbol?");
        System.out.println(arbol.encontrarElemento(12,raiz));
        System.out.println("\n########################");
        System.out.println("\nEl elemento 88 se encuentra en el arbol?");
        System.out.println(arbol.encontrarElemento(88,raiz));
        System.out.println("\n########################");
        System.out.println("\nEl elemento 202 se encuentra en el arbol?");
        System.out.println(arbol.encontrarElemento(202,raiz));
        System.out.println("\n########################");
        System.out.println("\nEliminando el elemento 50 en el arbol");
        System.out.println(arbol.eliminarElemento(raiz,50));
        System.out.println("\n########################");
        System.out.println("\nEliminando el elemento 20 en el arbol");
        System.out.println(arbol.eliminarElemento(raiz,20));
        System.out.println("\n########################");
        System.out.println("\nImprimiendo el nuevo arbol sin el numero 50 ni el 20:");
        arbol.inOrden(raiz);
    }
}
//Desarrollado por Pedro Gómez - ID:000396221