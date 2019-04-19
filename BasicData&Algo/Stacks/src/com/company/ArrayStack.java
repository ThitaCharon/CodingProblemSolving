package com.company;

import java.util.EmptyStackException;

public class ArrayStack {

    private Show [] arrayStack;
    private  int top;

    /** Constructor **/
    public ArrayStack (int capacity){
        arrayStack = new Show[capacity];
    }

    /** push method **/
    public void push(Show newShow){

        //check capacity and resize if need
        if (top == arrayStack.length) {
            Show [] newArray = new Show[arrayStack.length * 2];
            System.arraycopy(arrayStack,0,newArray,0,arrayStack.length);
            arrayStack = newArray;
        }

        arrayStack[top++] = newShow;
    }

    /** pop method **/
    public void pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        arrayStack[top--] = null;
    }


    /** peak method **/
    public Show peak(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return arrayStack[top-1];
    }

    /** getSize method **/
    public int size(){
        return top;
    }

    /** boolean isEmpty method **/
    public boolean isEmpty(){
        return top == 0;
    }

    /** PrintStack method **/
    public void printStack(){
        for(int i = top-1 ; i>=0; i--){
            System.out.println(arrayStack[i]);
        }
    }
}
