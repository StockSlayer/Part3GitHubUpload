package com.baseball.part3githubupload;
 /***********************************************************************************
 * Title: Player
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Player.java
 * Description: Abstract class for player creates a template for a player instance
 ***********************************************************************************/
public abstract class Player implements Comparable<Player> {

    // Attributes
     private String name;
     private String position;
     private int number;
//----------------------------------------------------------------------
     // noargs constructor
     public Player(){
         this.name="";
         this.position="";
         this.number=0;
     }

     // minimal constructor
     public Player(String name){
         this.name=name;
     }

     // preFull constructor
     public Player(String name, String position){
         this.name=name;
         this.position=position;
     }


     // Full constructor
     public Player(String name , String position, int number){
         this.name=name;
         this.position=position;
         this.number = number;
     }
//----------------------------------------------------------------------
     // Setters
     public void setName(String name) {
         this.name = name;
     }

     public void setPosition(String position) {
         this.position = position;
     }

     public void setNumber(int number){
         this.number=number;
     }
//----------------------------------------------------------------------
     //Getters
     public String getName() {
         return name;
     }

     public String getPosition() {
         return position;
     }

     public int getNumber(){
         return number;
     }
//----------------------------------------------------------------------
     // toString
     @Override
     public String toString(){
         String result = "";
//         result += "Name= " + getName() + "\t" + "Position= " + getPosition() + "\t Age= " + getNumber();
         result += "Name= " + getName() + "\t" + " Position= " + getPosition();
         return result;
     }
//----------------------------------------------------------------------
     // Abstract methods
     public abstract String getAverage();
     public abstract String getERA();
//----------------------------------------------------------------------
    // Equals method for testing my array list contains method
//     @Override
//     public boolean equals(Object o) {
//         if (this == o) return true;
//         if (o == null || getClass() != o.getClass()) return false;
//
//         Player player = (Player) o;
//
//         if (!name.equals(player.name)) return false;
//         return position.equals(player.position);
//     }
//
//     @Override
//     public int hashCode() {
//         int result = name.hashCode();
//         result = 31 * result + position.hashCode();
//         return result;
//     }
 } // Player (class)
