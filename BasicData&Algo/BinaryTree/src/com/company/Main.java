package com.company;

public class Main {

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        System.out.print(bt.root.value + ", ");
        System.out.print(bt.root.left.value + ", ");
        System.out.print(bt.root.right.value + ", ");
        System.out.println(bt.contains(5));
    }
}
