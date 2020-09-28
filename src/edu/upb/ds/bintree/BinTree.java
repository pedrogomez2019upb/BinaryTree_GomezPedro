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

    public Node ubicarElementoBinario(int valor ,Node actual){
        if (actual == null) {
            return new Node(valor);
        }

        if (valor < (int) actual.object) {
            actual.left = ubicarElementoBinario(valor,actual.left);
        } else if (valor > (int) actual.object) {
            actual.right = ubicarElementoBinario(valor,actual.right);
        } else {

            return actual;
        }

        return actual;
    }
/*
    public void crearElementoBinario(int valor){
        root = ubicarElementoBinario(valor,root);
    }

 */
    public boolean encontrarElemento(int value , Node current){
        if (current == null) {
            return false;
        }
        if (value == (int) current.object) {
            return true;
        }
        else if((int)current.object > value)
            return encontrarElemento(value, current.left);
        else
            return encontrarElemento(value, current.right);
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
