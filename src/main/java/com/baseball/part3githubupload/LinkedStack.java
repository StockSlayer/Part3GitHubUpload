package com.baseball.part3githubupload;
/***********************************************************************************
 * Title: LinkedStack
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: LinkedStack.java
 * Description: creates a LinkedList from the API and regulates its functions to being a stack.
 ***********************************************************************************/
import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedStack {
    // Creates a linkedList from the player class
    // Attribute
    private LinkedList<Player> stack;

    // Constructor
    public LinkedStack(){
        stack = new LinkedList<Player>();
    }

    // Push method for adding a player to the stack
    public void push(Player player){
        stack.push(player);
    }

    // pop method for returning the top player on the stack
    public Player pop(){
        return stack.pop();
    }

    // a peek method for returning the top of the stack but not removing it
    public Player peek(){
        return stack.peek();
    }

    // Checking if the linkedList is empty
    public boolean isEmpty(){
        return stack.isEmpty();
    }

    // Meant to append the entire stack to a text area does not work yet
    public String appendStack(){
        StringBuilder i  = new StringBuilder();
        ListIterator<Player> iterator = stack.listIterator();
        while (iterator.hasNext()){
           i.append(iterator.next());
        }
        return i.toString();
    }

    // prints the stack using list iterator O(1)
    public void printStack(){
        ListIterator<Player> iterator = stack.listIterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }

}
