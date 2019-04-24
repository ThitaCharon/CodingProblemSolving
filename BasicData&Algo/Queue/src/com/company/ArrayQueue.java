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
        //if has to resize
        if(size() == moviesArr.length-1){
            int numItems = size();
            Movie [] newArray = new Movie[moviesArr.length * 2];
            System.out.println("Resize array");
            System.arraycopy(moviesArr, front, newArray, 0, moviesArr.length-front);
            System.arraycopy(moviesArr, 0 ,newArray,moviesArr.length-front,last);
            moviesArr = newArray;
            last = numItems;
        }
        moviesArr[last] = newMovie;
        //calculate last index
        if(last < moviesArr.length-1){
            last++;
        }else {
            last = 0;
        }
        return newMovie;
    }

    public Movie dequeue (){
        if(isEmpty()){
            throw new NoSuchElementException();
        }
        Movie mRemove = moviesArr[front];
        moviesArr[front] = null;
        front++;
        if(size() == 0){
            front = 0;
            last = 0;
        }else if(front == moviesArr.length){
            front = 0;
        }
        return mRemove;
    }

    public boolean isEmpty(){
        return size() == 0;
    }

    public int size(){
        if(front<= last) {
            return last - front;
        }else{
            return last-front + moviesArr.length;
        }
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
