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

    private int encontrarMenor(Node raiz) {
        Node actual = raiz;
        while (actual.left != null) {
            actual = actual.left;
        }
        return ((int) actual.object);
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

    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
