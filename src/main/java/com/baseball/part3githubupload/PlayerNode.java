package com.baseball.part3githubupload;
/***********************************************************************************
 * Title: PlayerNode
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: PlayerNode.java
 * Description: Creates a playerNode for PlayerLinkedList class which is a doubly-linked list
 ***********************************************************************************/
public class PlayerNode {
    // Attributes
    private Player player;
    private PlayerNode next;
    private PlayerNode previous;

    // Constructor
    public PlayerNode(Player player){
        this.player = player;
    }
    // Getters
    public Player getPlayer() {
        return player;
    }
    // Setter
    public void setPlayer(Player player) {
        this.player = player;
    }
    // getter for getting the next node in the doubly-linked list
    public PlayerNode getNext() {
        return next;
    }
    // sets the node in the doubly-linked list
    public void setNext(PlayerNode next) {
        this.next = next;
    }
    // gets the previous node in the doubly-linked list
    public PlayerNode getPrevious() {
        return previous;
    }
    // sets the node in the doubly-linked list
    public void setPrevious(PlayerNode previous) {
        this.previous = previous;
    }
    // toString method for return the player
    public String toString(){
        return player.toString();
    }
}
