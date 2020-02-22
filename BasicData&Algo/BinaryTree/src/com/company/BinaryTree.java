package com.company;

public class BinaryTree {
    Node root;

    public void traverseInOrder(Node node) {
        if (node != null) {
            traverseInOrder(node.left);
            System.out.print(" " + node.value);
            traverseInOrder(node.right);
        }
    }

    public void add(int value) {
        root = addRecursive(root, value);
    }

    public boolean contains(int value){
        return containsRecursive(root, value);
    }

    public void del(int value) {
        root = delRecursive(root, value);
    }

    private Node delRecursive(Node current , int val){
        if (current == null){return null;}

        if(current.value == val) {
            // has 3 different cases as no child, one child, or two children
            //left node
            if (current.left == null && current.right == null) {
                return null;
            } else if (current.left == null) {
                return current.right;
            } else if (current.right == null) {
                return current.left;
            }else{
                int smallestValue = findSmallestValue(current.right);
                current.value = smallestValue;
                current.right = delRecursive(current.right, smallestValue);
                return current;
            }
        }

        if(val < current.value){
            current.left = delRecursive(current.left,val);
            return current;
        }else {
            current.right = delRecursive(current.right,val);
            return current;
        }

    }
    private int findSmallestValue(Node root) {
        return root.left == null ? root.value : findSmallestValue(root.left);
    }

    private Node addRecursive(Node current, int val){
        if(current == null){
            return new Node(val);
        }
        if (val < current.value){
            current.left = addRecursive(current.left, val);
        }else {
            current.right = addRecursive(current.right, val);
        }
        return current;
    }

    private boolean containsRecursive(Node current, int val){
        //based case
        if(current == null) return false;
        if(current.value == val) return true;

        if (val < current.value){
            return containsRecursive(current.left,val);
        }
        else
            return containsRecursive(current.right,val);
        /**  if(val < current.value){
            current = current.left;

        }else {
            current = current.left;
            contains(current, val);
        }
        contains(current, val);
        return false; **/
    }


    private void visit(int value) {
        System.out.print(" " + value);
    }

    public boolean isEmpty() {
        return root == null;
    }
}
