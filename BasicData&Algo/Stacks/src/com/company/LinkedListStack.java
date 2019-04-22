package com.company;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListStack {

    private LinkedList<Show> stack ;

    public LinkedListStack (){
        stack = new LinkedList<Show>();
    }

    public void push (Show show){
        stack.push(show);
    }

    public Show pop (){
        return stack.pop();
    }

    public Show peek(){
        return stack.peek();
    }

    public void printStack(){
        Iterator<Show> iterator = stack.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }

    }
}
