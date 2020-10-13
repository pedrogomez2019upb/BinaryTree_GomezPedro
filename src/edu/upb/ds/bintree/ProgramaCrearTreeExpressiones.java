package edu.upb.ds.bintree;

import java.util.Scanner;

public class ProgramaCrearTreeExpressiones {


    public static void main(String[] args) {
        BinTree arbolExpresiones = new BinTree();
        Scanner sc= new Scanner(System.in);
        System.out.println("\n#####################");
        System.out.println("\nBienvenido a la conversion de");
        System.out.println("\nla formula infija '(a+b)-((c-d)+e)': ");
        System.out.println("\n#####################");
        String formula = "(a+b)-((c-d)+e)";
        System.out.println("\n#####################");
        System.out.println("\nFormula Infija Ingresada");
        System.out.println("\n#####################");
        System.out.println("\n" + formula);
        String postfija=arbolExpresiones.infijaApostfija(formula);
        Node root = arbolExpresiones.construirAE(postfija);
        System.out.println("\n#####################");
        System.out.println("Expresión infija (arbol) es:");
        arbolExpresiones.inOrden(root);
        System.out.println("\n#####################");
    }
}
