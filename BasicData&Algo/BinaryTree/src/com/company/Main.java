package com.company;

import org.junit.Test;

import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertFalse;

public class Main {

    /** B1
     *                             6
     *                          /      \
     *                         4        8
     *                        / \      /  \
     *                      3   5     7   9
     **/
    /**
     *  B2
     *                             12
     *                          /      \
     *                         5       20
     *                                 /  \
     *                                15   21
     **/

    public static void main(String[] args) {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        System.out.print(bt.root.value + ", ");
        System.out.print(bt.root.left.value + ", ");
        System.out.print(bt.root.right.value + ", ");
        System.out.println(bt.contains(7));
        bt.traverseInOrder(bt.root);

        BinaryTree B2 = new BinaryTree();
        B2.add(12);
        B2.add(5);
        B2.add(20);
        B2.add(15);
        B2.add(21);
        int minDept = minDept(B2.root);
        System.out.println("\nmindept is " + minDept);

        traverseInorder(B2.root);
    }

    private static int minDept(Node node) {
        if(node == null) return 0;
        int left = minDept(node.left);
        int right = minDept(node.right);
        if(left == 0) right++;
        if(right == 0) left++;
        return Math.min(left,right)+1;
    }

    public static void traverseInorder(Node node){
       if(node != null){
           traverseInorder(node.left);
           System.out.print(node.value + " | ");
           traverseInorder(node.right);
       }
    }



    @Test
    public void givenABinaryTree_WhenAddingElements_ThenTreeContainsThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        assertTrue(bt.contains(6));
        assertTrue(bt.contains(4));
        assertFalse(bt.contains(1));
    }

    @Test
    public void givenABinaryTree_WhenDeletingElements_ThenTreeDoesNotContainThoseElements() {
        BinaryTree bt = new BinaryTree();
        bt.add(6);
        bt.add(4);
        bt.add(8);
        bt.add(3);
        bt.add(5);
        bt.add(7);
        bt.add(9);
        assertTrue(bt.contains(5));
        bt.del(5);
        assertFalse(bt.contains(5));
    }
}
