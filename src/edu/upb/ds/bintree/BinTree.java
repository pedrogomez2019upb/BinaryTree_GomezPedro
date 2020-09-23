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

    public String preOrder() {
        return "";
    }

    public String inOrder() {
        return "";
    }

    public String posOrder() {
        return "";
    }

    @Override
    public String toString() {
        return "BinTree{" +
                "root=" + root +
                '}';
    }
}
