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
    }
}
//Developed by Pedro Gomez - ID:000396221
