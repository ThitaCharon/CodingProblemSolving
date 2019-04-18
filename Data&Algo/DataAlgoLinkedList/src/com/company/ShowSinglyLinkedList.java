package com.company;

public class ShowSinglyLinkedList {

    private ShowNode head;
    private int size;

    public void addToFront(Show newShow) {
        ShowNode newNode = new ShowNode(newShow);
        newNode.setNext(head);
        head = newNode;
        size++;
    }

    public void removeFront(){
        if(isEmpty()){
            return ;
        }

        ShowNode revomeNode = head;
        head = head.getNext();
        size--;
        System.out.println(revomeNode.toString() + " has been removed.");
        revomeNode.setNext(null);
    }

    public int getSize(){
        return size;
    }

    public boolean isEmpty(){
        return head==null;
    }



    public void printList() {
        ShowNode current = head;
        while(current != null){
            System.out.print(current + " -> ");
            current = current.getNext();
        }
        System.out.println("null");
    }
}
