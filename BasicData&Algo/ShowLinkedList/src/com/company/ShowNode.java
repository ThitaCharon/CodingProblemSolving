package com.company;

public class ShowNode {


    private ShowNode next;
    private Show show;
    private ShowNode previous; //add reference to the previous for DoubleLinkedList

    public ShowNode (Show show){
        this.show = show;
    }

    public ShowNode getNext(){
        return next;
    }
    public Show getShow(){
        return show;
    }

    public void setNext (ShowNode next){
        this.next = next;
    }

    public String toString(){
        return show.toString();
    }

    public void setShow(Show show) {
        this.show = show;
    }

    public ShowNode getPrevious() {
        return previous;
    }

    public void setPrevious(ShowNode previous) {
        this.previous = previous;
    }
}
