package edu.upb.ds.bintree;

public class ProgramaCrearTreeBinario {
    public static void main(String[] args) {
        BinTree arbol = new BinTree();

        arbol.crearElementoBinario(7);
        arbol.crearElementoBinario(2);
        arbol.crearElementoBinario(3);
        arbol.crearElementoBinario(5);
        arbol.crearElementoBinario(4);
        arbol.crearElementoBinario(6);
        arbol.crearElementoBinario(1);

        System.out.println(arbol);
    }
}

