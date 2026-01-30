package com.dsa.avlvisualizer;

public class AvlNode {
    public int value;
    public int height;
    public AvlNode left;
    public AvlNode right;

    public AvlNode(int value) {
        this.value = value;
        this.height = 1;
    }
}
