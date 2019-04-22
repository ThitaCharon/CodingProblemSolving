package com.company;

import java.util.EmptyStackException;

public class CharArrayStack {
    private char [] aChar;
    private int top;

    public CharArrayStack(int cap){
        aChar = new char[cap];
    }

    public void push(char c){
        if (top == aChar.length){
            char [] resizeArr = new char[aChar.length * 2];
            System.arraycopy(aChar,0,resizeArr,0,aChar.length);
            aChar = resizeArr;
        }
        aChar[top++] = c;
    }

    public char pop(){
        if(isEmpty()){
            throw new EmptyStackException();
        }

       char removeChar = aChar[--top];
        aChar[top] = '\0';
        return removeChar;
    }

    public char peek(){
        if(isEmpty()){
            throw new EmptyStackException();
        }
        return aChar[top-1];
    }

    public int size(){
        return top;
    }

    public boolean isEmpty(){
        return top == 0;
    }

    public void printStack(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        for(int i=0 ; i<top; i++){
            System.out.println(aChar[i]);
        }
    }

    public boolean isPalindrome(CharArrayStack charStack, StringBuilder string) {
        for(int i = 0; i< string.length(); i++){
            if(charStack.pop() != string.charAt(i)){
                return false;
            }
        }

        return true;
    }
}
