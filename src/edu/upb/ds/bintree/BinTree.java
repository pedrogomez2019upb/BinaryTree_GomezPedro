package edu.upb.ds.bintree;

public class BinTree {

    public Node root;

    public BinTree() {
        this.root = null;
    }

    public BinTree(Object object) {
        this.root = subBinTree(null, object, null);
    }

    public Node subBinTree(Node left, Object object, Node right) {
        return new Node(left, object, right);
    }

    public boolean isEmpty() {
        return root == null;
    }

    public boolean root(Object object) {
        try {
            root = subBinTree(null, object, null);
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertleft(Object object) {
        try {
            if(!isEmpty()) {
                root.left = subBinTree(null, object, null);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public boolean insertRight(Object object) {
        try {
            if(!isEmpty()) {
                root.right = subBinTree(null, object, null);
                return true;
            } else {
                return false;
            }
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }

    public void preOrden(Node root) {
        if(root == null) {
            return;
        }
        System.out.print(root.object + " ");
        preOrden(root.left);
        preOrden(root.right);
    }

    public void inOrden(Node root) {
        if(root == null) {
            return;
        }
        inOrden(root.left);
        System.out.print(root.object + " ");
        inOrden(root.right);
    }

    public void posOrden(Node root) {
        if(root == null) {
            return;
        }
        posOrden(root.left);
        posOrden(root.right);
        System.out.print(root.object + " ");
    }

    public Node ubicarElementoBinario(int valor ,Node raiz){
        if (raiz == null) {
            return new Node(valor);
        }

        if (valor < (int) raiz.object) {
            raiz.left = ubicarElementoBinario(valor,raiz.left);
        } else if (valor > (int) raiz.object) {
            raiz.right = ubicarElementoBinario(valor,raiz.right);
        } else {

            return raiz;
        }

        return raiz;
    }

    public boolean encontrarElemento(int valor , Node raiz){
        if (raiz == null) {
            return false;
        }
        if (valor == (int) raiz.object) {
            return true;
        }
        else if((int)raiz.object > valor)
            return encontrarElemento(valor, raiz.left);
        else
            return encontrarElemento(valor, raiz.right);
    }



    public Node eliminarElemento(Node raiz, int valor) {
        if (raiz == null) {
            return null;
        }
        if (valor == (int) raiz.object) {
            if (raiz.left == null && raiz.right == null) {
                return null;
            }
            if (raiz.right == null) {
                return raiz.left;
            }

            if (raiz.left == null) {
                return raiz.right;
            }
            int menorValor = encontrarMenor(raiz.right);
            raiz.object = menorValor;
            raiz.right = eliminarElemento(raiz.right, menorValor);
            return raiz;
        }
        if (valor < (int) raiz.object) {
            raiz.left = eliminarElemento(raiz.left, valor);
            return raiz;
        }

        raiz.right = eliminarElemento(raiz.right, valor);
        return raiz;
    }

    // ##### Operaciones Básicas 5/10/2020 #####
    public int encontrarMenor(Node raiz) {
        Node actual = raiz;
        while (actual.left != null) {
            actual = actual.left;
        }
        return ((int) actual.object);
    }

    public int encontrarMayor(Node raiz) {
        Node actual = raiz;
        while (actual.right != null) {
            actual = actual.right;
        }
        return ((int) actual.object);
    }

    public int cantidadNodos(Node raiz){
        int contador = 1;
        if(raiz.left != null){
            contador += cantidadNodos(raiz.left);
        }
        if(raiz.right != null){
            contador += cantidadNodos(raiz.right);
        }
        return contador;
    }

    public void imprimirHojas(Node raiz){
        if(raiz==null){
            return;
        }
        if(raiz.left==null && raiz.right ==null){
            System.out.println(raiz.object);
        }
        imprimirHojas(raiz.left);
        imprimirHojas(raiz.right);
    }

    public void imprimirNivel(Node root, int nivel)
    {
        if (root == null)
            return;
        if (nivel == 1)
            System.out.println(root.object);
        else if (nivel > 1)
        {
            imprimirNivel(root.left, nivel-1);
            imprimirNivel(root.right, nivel-1);
        }
    }
    //######
    public boolean isOperator(char c) {
        if (c == '+' || c == '-'
                || c == '*' || c == '/'
                || c == '^') {
            return true;
        }
        return false;
    }
    public Node construirAE(String cadena) {
        ListStack pila = new ListStack();
        Node t= new Node();
        Node t1= new Node();
        Node t2= new Node();
        char[] postfija = cadena.toCharArray();
        for (int i = 0; i < postfija.length; i++) {
            // Si es Operando , se ingresa al Stack
            if (!isOperator(postfija[i])) {
                t = new Node(postfija[i]);
                pila.push(t);
            } else
            {
                t = new Node(postfija[i]);
                t1 = (Node) pila.pop();
                t2 = (Node) pila.pop();
                t.right = t1;
                t.left = t2;
                pila.push(t);
            }
        }
        t = (Node) pila.peek();
        pila.pop();

        return t;
    }
    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
//Developed by Estefany Rueda & Pedro Gomez - ID:000402237 & ID:000396221