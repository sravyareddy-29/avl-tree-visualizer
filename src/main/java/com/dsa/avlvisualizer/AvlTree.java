package com.dsa.avlvisualizer;

public class AvlTree {

    private AvlNode root;

    private int height(AvlNode node) {
        return node == null ? 0 : node.height;
    }

    private int getBalance(AvlNode node) {
        return node == null ? 0 : height(node.left) - height(node.right);
    }

    private AvlNode rightRotate(AvlNode y) {
        AvlNode x = y.left;
        AvlNode t2 = x.right;

        x.right = y;
        y.left = t2;

        y.height = Math.max(height(y.left), height(y.right)) + 1;
        x.height = Math.max(height(x.left), height(x.right)) + 1;

        return x;
    }

    private AvlNode leftRotate(AvlNode x) {
        AvlNode y = x.right;
        AvlNode t2 = y.left;

        y.left = x;
        x.right = t2;

        x.height = Math.max(height(x.left), height(x.right)) + 1;
        y.height = Math.max(height(y.left), height(y.right)) + 1;

        return y;
    }

    private AvlNode insert(AvlNode node, int value) {
        if (node == null)
            return new AvlNode(value);

        if (value < node.value)
            node.left = insert(node.left, value);
        else if (value > node.value)
            node.right = insert(node.right, value);
        else
            return node;

        node.height = 1 + Math.max(height(node.left), height(node.right));

        int balance = getBalance(node);

        // LL
        if (balance > 1 && value < node.left.value)
            return rightRotate(node);

        // RR
        if (balance < -1 && value > node.right.value)
            return leftRotate(node);

        // LR
        if (balance > 1 && value > node.left.value) {
            node.left = leftRotate(node.left);
            return rightRotate(node);
        }

        // RL
        if (balance < -1 && value < node.right.value) {
            node.right = rightRotate(node.right);
            return leftRotate(node);
        }

        return node;
    }

    public void insert(int value) {
        root = insert(root, value);
    }

    public AvlNode getRoot() {
        return root;
    }
}
