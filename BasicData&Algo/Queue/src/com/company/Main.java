package com.company;

import java.lang.reflect.Modifier;

public class Main {

    public static void main(String[] args) {
	// write your code here
    Movie movie19 = new Movie("End Game", "2019");
    Movie movie18 = new Movie("Rouge One", "2018");
    Movie movie17 = new Movie("Dunkirk", "2017");
    Movie movie16 = new Movie("Woe", "2016");


    ArrayQueue myQueue = new ArrayQueue(2);
    System.out.println(myQueue.isEmpty() + " , " + myQueue.size());
    myQueue.addQueue(movie17);
    myQueue.dequeue();
    myQueue.addQueue(movie18);
    System.out.println(myQueue.isEmpty() + " , " + myQueue.size());
    myQueue.dequeue();
    myQueue.addQueue(movie19);
    System.out.println(myQueue.isEmpty() + " , " + myQueue.size() );


        }
}
