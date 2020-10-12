package edu.upb.ds.bintree;

public class ProgramaCrearTreeExpressiones {

    public static void main(String[] args) {
        BinTree arbolExpresiones = new BinTree();
        String postfija = "(a+b)-((c-d)+e)";
        Node root = arbolExpresiones.construirAE(postfija);
        System.out.println("Expresión infija es:");
        arbolExpresiones.inOrden(root);
    }
}
