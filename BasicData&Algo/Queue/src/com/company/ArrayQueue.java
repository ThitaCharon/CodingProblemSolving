package com.company;

import java.util.EmptyStackException;
import java.util.NoSuchElementException;

public class ArrayQueue {

    private Movie [] moviesArr ;
    private int front;
    private int last;

    public ArrayQueue(int capacity){
        moviesArr = new Movie[capacity];
    }

    public Movie addQueue(Movie newMovie){
        if(last == moviesArr.length){
            Movie [] resize = new Movie[moviesArr.length * 2];
            System.arraycopy(moviesArr, 0 ,resize,0,moviesArr.length);
            moviesArr = resize;
        }
        moviesArr[last++] = newMovie;
        return newMovie;
    }

    public Movie dequeue (){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Movie mRemove = moviesArr[front];
        moviesArr[front++] = null;
        if(size() == 0){
            front = 0;
            last = front;
        }
        return mRemove;
    }

    public boolean isEmpty(){
        return last == 0;
    }

    public int size(){
        return last-front;
    }

    public void printQueue(){
        if (isEmpty()){
            throw new  NoSuchElementException();
        }
        for(int i = front; i<last; i++){
            moviesArr[i].printMovie();
        }

    }
}
