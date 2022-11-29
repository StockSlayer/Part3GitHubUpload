package com.baseball.part3githubupload;
 /***********************************************************************************
 * Title: Pitcher
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Pitcher.java
 * Description: extends player and creates an instance pitcher for the abstract player class
 *              of calculates Pitcher stats for player
 ***********************************************************************************/
public class Pitcher extends Player {

    //Attrubties
     private int earnedRuns;
     private double inningsPitched;
//----------------------------------------------------------------------
     // noargs constructor
     public Pitcher(){
         this.earnedRuns=0;
         this.inningsPitched=0.0;
     }

     // minimual Constructor
     public Pitcher(String name, int earnedRuns, double inningsPitched){
         super(name);
         this.earnedRuns=earnedRuns;
         this.inningsPitched=inningsPitched;
     }

     // Full constructor
     public Pitcher(String name, String position, int earnedRuns, double inningsPitched) {
         super(name, position);
         this.earnedRuns = earnedRuns;
         this.inningsPitched = inningsPitched;
     }
//----------------------------------------------------------------------
     // Setters
     public void setEarnedRuns(int earnedRuns) {
         this.earnedRuns = earnedRuns;
     }

     public void setInningsPitched(double inningsPitched) {
         this.inningsPitched = inningsPitched;
     }
//----------------------------------------------------------------------
     //Getters
     public int getEarnedRuns() {
         return earnedRuns;
     }

     public double getInningsPitched() {
         return inningsPitched;
     }
//----------------------------------------------------------------------
     // Abstract getters
     @Override
     public String getERA(){
         double value = (9 * (double) (this.getEarnedRuns()) / (this.getInningsPitched()));
         return String.format("%.2f", value);
     }

     @Override
     public String getAverage(){
         return null;
     }
//----------------------------------------------------------------------
     @Override
     public String toString(){
         String result = "";
         result += super.toString() + "\t" + "ERA= " + getERA();
         result += "\n";
         return result;
     }

     @Override
     public int compareTo(Player o) {
         return 0;
     }
 } // Pitcher (Class)
