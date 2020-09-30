package edu.upb.ds.bintree;

public class ProgramaCrearTreeBinario {
    public static void main(String[] args) {
        System.out.println("\n########################");
        System.out.println("\nPrograma insercion Elemento");
        System.out.println("\n########################");
        BinTree arbol = new BinTree();
        Node raiz = new Node(7);
        arbol.ubicarElementoBinario(2,raiz);
        arbol.ubicarElementoBinario(10,raiz);
        arbol.ubicarElementoBinario(5,raiz);
        arbol.ubicarElementoBinario(8,raiz);
        arbol.ubicarElementoBinario(6,raiz);
        arbol.ubicarElementoBinario(1,raiz);

        System.out.println("\n########################");
        System.out.println("\nSalida inOrden del arbol");
        arbol.inOrden(raiz);
        System.out.println("\n########################");
        System.out.println("\nBuscando el elemento 12 en el arbol");
        System.out.println(arbol.encontrarElemento(12,raiz));
        System.out.println("\n########################");
        System.out.println("\nBuscando el elemento 8 en el arbol");
        System.out.println(arbol.encontrarElemento(8,raiz));
        System.out.println("\n########################");
        System.out.println("\nEliminando el elemento 8 en el arbol");
        System.out.println(arbol.eliminarElemento(raiz,8));
        System.out.println("\n########################");
        System.out.println("\nEliminando el elemento 1 en el arbol");
        System.out.println(arbol.eliminarElemento(raiz,1));
        System.out.println("\n########################");
        System.out.println("\nImprimiendo el nuevo arbol sin el numero 8 ni el 1");
        arbol.inOrden(raiz);
    }
}
//Developed by Pedro Gomez - ID:000396221
