package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack arrStack = new ArrayStack(5);
        LinkedListStack linkedStack = new LinkedListStack();

        System.out.println("~~ LinkedList push ~~ ");
        linkedStack.push(new Show ("GOT"));
        linkedStack.push(new Show ("TWD"));
        linkedStack.push(new Show ("TheVoice"));
        linkedStack.printStack();
        System.out.println("~~ LinkedList peek ~~ ");
        System.out.println(linkedStack.peek().getTittle());
        System.out.println("~~ LinkedList pop ~~ ");
        linkedStack.printStack();

        System.out.println();
        System.out.println("~~ ArrayStack push ~~ ");
        arrStack.push(new Show("FOX"));
        arrStack.push(new Show("abc"));
        arrStack.printStack();
        System.out.println("~~ ArrayStack peek ~~ ");
        System.out.println(arrStack.peak().getTittle());
        System.out.println("Size is " + arrStack.size() + " Peak " + arrStack.peak().getTittle());

        arrStack.pop();
        System.out.println("~~ ArrayStack pop ~~ ");
        arrStack.printStack();
        System.out.println("Size is " + arrStack.size() );
        System.out.println("~~ pop ~~ ");
        arrStack.pop();
        arrStack.printStack();
        System.out.println("Size is " + arrStack.size() );




    }
}
