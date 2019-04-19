package com.company;

public class ShowDoubleLinkedList {

    private ShowNode head;
    private ShowNode tail;
    private int size;

    public void addToFront(Show newShow){
        ShowNode newNode = new ShowNode(newShow);
        //case1 when insert to the empty list
        newNode.setNext(head);
        if(head == null){
            tail = newNode;
        }else{
            head.setPrevious(newNode);
        }
        head = newNode;
        size++;
    }

    public void addToRear(Show newShow) {
        ShowNode newNode = new ShowNode(newShow);

        if (head == null) {
            head = newNode;
        }else {
            tail.setNext(newNode);
            newNode.setPrevious(tail);
        }
        tail = newNode;
        size++;
    }

    public void addAfter(Show show , Show newShow){
        ShowNode newNode = new ShowNode(newShow);
        if(isEmpty()){
            return ;
        }
        ShowNode current = head;
        while(current != null){
            if(current.getShow().getTittle().equals(show.getTittle())){
                newNode.setNext(current.getNext());
                current.setNext(newNode);
                newNode.setPrevious(current);
                size++;
                break;
            }
            current = current.getNext();
        }
        return;
    }

    public void addBefore(Show show , Show newShow){
        ShowNode newNode = new ShowNode(newShow);
        if(isEmpty()){
            return ;
        }

        if(show.getTittle().equals(head.getShow().getTittle())){
            newNode.setNext(head);
            head.setPrevious(newNode);
            head = newNode;
            System.out.println("find at head");
            size++;
        }else {
            ShowNode current = head;
            while (current != null) {

                if (current.getShow().getTittle().equals(show.getTittle())) {
                    newNode.setPrevious(current.getPrevious());
                    current.getPrevious().setNext(newNode);
                    newNode.setNext(current);
                    size++;
//                    System.out.println("Found " + current.getPrevious().getShow().getTittle() + " <-> " + current.getShow().getTittle() +
//                            " <-> " +  current.getNext().getShow().getTittle());
//                    System.out.println("Node " + newNode.getPrevious().getShow().getTittle() + " <-> " + newNode.getShow().getTittle() +
//                            " <-> " +  newNode.getNext().getShow().getTittle());
                    break;
                }
                current = current.getNext();
            }
        }
        return;
    }

    public ShowNode removeFront(){
        if(isEmpty()){
            return null;
        }
        ShowNode removeNode = head;

        if(head.getNext() == null){
            tail = head;
            tail.setNext(null);
        }else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }


    public void printlist(){
        ShowNode current = head;
        while (current != null){
            System.out.print(current.toString() + " <--> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    public int size() {
        return size;
    }

    public boolean isEmpty() {
        return head == null;
    }
}
