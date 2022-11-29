package com.baseball.part3githubupload;
/***********************************************************************************
 * Title: PlayerLinkedList
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: PlayerLinkedList.java
 * Description: Creates a player doubly-linked list of my own design that allows the user to
 *              add players to the front, to the back and between front of another player
 *              check the size of the doubly-linked list, check if empty, remove player
 *              from the front and back
 * Time Complexity for this is O(1)
 ***********************************************************************************/
public class PlayerLinkedList {
    // Attributes
    private PlayerNode head;
    private PlayerNode tail;
    private int size;

    // adds a player to the front of the doubly-linked list
    public void addToFront(Player player){
        PlayerNode node = new PlayerNode(player);
//        node.setNext(head);
        if (head == null)
            tail = node;
        else {
            head.setPrevious(node);
            node.setNext(head);
        }
        head = node;
        size++;
    }

    // adds a player to the end of the doubly-linked list
    public void addToEnd(Player player){
        PlayerNode node = new PlayerNode(player);

        if (tail == null)
            head = node;
        else{
            tail.setNext(node);
            node.setPrevious(tail);
        }
        tail = node;
        size++;
    }

    // gets the size
    public int getSize(){
        return size;
    }

    // Checks if the doubly-linked list is empty
    public boolean isEmpty(){
        return head == null;
    }

    // Adds a player within the doubly-linked list specifically before another player
    public boolean addBefore(Player newPlayer, Player existingPlayer){
        if (head == null){
            return false;
        }
        PlayerNode current = head;
        while (current != null && !current.getPlayer().equals(existingPlayer)){
            current = current.getNext();
        }
        if (current == null){
            return false;
        }
        PlayerNode newNode = new PlayerNode(newPlayer);
        newNode.setPrevious(current.getPrevious());
        newNode.setNext(current);
        current.setPrevious(newNode);

        if (head == current){
            head = newNode;
        }
        else{
            newNode.getPrevious().setNext(newNode);
        }
        size++;
        return true;
    }

    // removes the player from the front of the doubly-linked list
    public PlayerNode removeFromFront(){
        if (isEmpty()){
            return null;
        }
        PlayerNode removeNode = head;

        if (head.getNext() == null){
            tail = null;
        }
        else{
            head.getNext().setPrevious(null);
        }
        head = head.getNext();
        size--;
        removeNode.setNext(null);
        return removeNode;
    }

    // removes the player from the end of the doubly-linked list
    public PlayerNode removeFromEnd(){
        if (isEmpty())
            return null;

        PlayerNode removeNode = tail;

        if (tail.getPrevious() == null){
            head = null;
        }
        else{
            tail.getPrevious().setNext(null);
        }
        tail = tail.getPrevious();
        size--;
        removeNode.setPrevious(null);
        return removeNode;
    }

    // Prints the doubly-linked list
    public void printList(){
        PlayerNode current = head;
        System.out.print("HEAD -> \n\t ");
        while (current != null){
            System.out.print(current);
            System.out.print(" <=> ");
            current = current.getNext();
        }
        System.out.println("null");
    }

    // DOES NOT WORK
    // Meant to append the doubly-linked list to a text area but does not work
    public void append( PlayerNode list) {
        PlayerNode current = head;
        while (list.getNext() != null) {
            current = current.getNext();
        }
        current = list.getNext();
    }

    // DOES NOT WORK
    // Again meant to help with printing the doubly-linked list to the text area
    @Override
    public String toString() {
        PlayerNode current = head;
        while (current == head){
            current = current.getNext();
        }
        return current + "";
    }

//    public Player[] toArray() {
//        return null;
//    }
}
