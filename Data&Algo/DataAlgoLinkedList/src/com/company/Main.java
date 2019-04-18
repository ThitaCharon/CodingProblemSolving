package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Show GOT = new Show("GOT");
        Show TWD = new Show("The Walking Dead");
        Show RM = new Show("Running man");
        Show ST = new Show("Stranger Things");
        Show NoShow = new Show("No Show");


    ShowSinglyLinkedList list = new ShowSinglyLinkedList();
    list.addToFront(ST);
    list.addToFront(RM);
    list.addToFront(TWD);
    list.addToFront(GOT);
    System.out.println("\n~~SinglyLinkedList~~");
    list.printList();
        while (!list.isEmpty()) {
            list.removeFront();
            list.printList();
        }


    ShowDoubleLinkedList dList = new ShowDoubleLinkedList();
    dList.addToFront(ST);
    dList.addToFront(RM);
    dList.addToFront(TWD);
    dList.addToFront(GOT);
    System.out.println("\n~~DoubleLinkedList~~");
    dList.printlist();

    dList.addToRear(GOT);
    System.out.println("\n~~AddToRear~~");
    dList.printlist();
    System.out.println(dList.size());
//        while (!dList.isEmpty()) {
//            ShowNode removeNode  = dList.removeFront();
//            System.out.println("Remove " + removeNode.toString());
//            dList.printlist();
//        }
//        dList.addAfter(NoShow, new Show ("Star gate"));
//        dList.printlist();
//        System.out.println(dList.size());
//        dList.addAfter(GOT, new Show ("Star gate"));
//        dList.printlist();
//        System.out.println(dList.size());
        dList.addBefore(RM, new Show ("Star gate"));
        dList.printlist();
        System.out.println(dList.size());
    }
}
