package com.baseball.part3githubupload;
/***********************************************************************************
 * Title: ArrayStack
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: ArrayStack.java
 * Description: Creates a stack from an array of players with all the .
 ***********************************************************************************/
import java.util.EmptyStackException;

public class ArrayStack {

    private Player[] stack;
    private int top;

    public ArrayStack(int capacity){
        stack = new Player[capacity];
    }

    // O(n) linear time
    public void push(Player player){
        if (top == stack.length){
            // need to resize the backing array
            Player[] newArray = new Player[2 * stack.length];
            System.arraycopy(stack, 0, newArray, 0, stack.length);
            stack = newArray;
        }
        stack[top++] = player; // O(1)
    }

    //if you don't worry about resizing the array then the pop will always be done in constant time
    // O(1) = constant time
    // otherwise the time complexity will be of liner time O(n)
    public Player pop(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        Player player = stack[--top];
        stack[top] = null;
        return player;
    }

    // O(1) always
    // returns the top of the stack but does not remove
    public Player peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return stack[top - 1];
    }

    // returns the size of the stack or array
    public int size(){
        return top;
    }

    // Checks if the stack is empty
    public boolean isEmpty(){
        return top == 0;
    }

    // prints the stack
    public void printStack(){
        for(int i = top -1; i >= 0; i--){
            System.out.println(stack[i]);
        }
    }
}
