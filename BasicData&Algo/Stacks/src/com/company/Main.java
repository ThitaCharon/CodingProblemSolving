package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        ArrayStack arrStack = new ArrayStack(5);
        arrStack.push(new Show("FOX"));
        arrStack.push(new Show("abc"));
        arrStack.printStack();
        System.out.println("Size is " + arrStack.size() + " Peak " + arrStack.peak().getTittle());

        arrStack.pop();
        System.out.println("~~ pop ~~ ");
        arrStack.printStack();
        System.out.println("Size is " + arrStack.size() );
        System.out.println("~~ pop ~~ ");
        arrStack.pop();
        arrStack.printStack();
        System.out.println("Size is " + arrStack.size() );



    }
}
