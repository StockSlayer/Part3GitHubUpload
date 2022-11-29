package com.baseball.part3githubupload;
 /***********************************************************************************
 * Title: Hitter
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: Hitter.java
 * Description: extends player and creates an instance of a hitter from the abstract player class.
 *              As well as calculates hitter stats for player
 ***********************************************************************************/
public class Hitter extends Player {

    // Attributes
    private int atBats;
    private int hits;
//----------------------------------------------------------------------
    // noargs constructor
    public Hitter(){
        this.atBats=0;
        this.hits=0;
    }

    // Minimal constructor
    public Hitter(String name, int hits, int atBats){
        super(name);
        this.hits = hits;
        this.atBats = atBats;
    }

    // Full constructor
    public Hitter(String name, String position, int hits, int atBats){
        super(name, position);
        this.hits = hits;
        this.atBats = atBats;
    }

     // Full constructor
     public Hitter(String name, String position, int number, int hits, int atBats){
         super(name, position, number);
         this.hits = hits;
         this.atBats = atBats;
     }

    // just a hitterConstructor
    public Hitter(int hits, int atBats){
        this.hits=hits;
        this.atBats=atBats;
    }
//----------------------------------------------------------------------
    // Setters
    public void setAtBats(int atBats) {
        this.atBats = atBats;
    }

    public void setHits(int hits) {
        this.hits = hits;
    }
//----------------------------------------------------------------------
    // Getters
    public int getAtBats() {
        return atBats;
    }

    public int getHits() {
        return hits;
    }
//----------------------------------------------------------------------
    // Abstract getters
    @Override
    public String getAverage(){
        double value = ((double)(this.getHits()) / (this.getAtBats()));
        return String.format("%.3f", value);
    }

    // Pitcher getter
    @Override
    public String getERA(){
        return null;
    }
//----------------------------------------------------------------------
    // numberFormatting method
    public static double roundN(double num, int places) {
        return (int)(num * Math.pow(10, places) + 0.5) / (Math.pow(10, places));
    }
//----------------------------------------------------------------------
    @Override
    public String toString(){
        String result = "";
//        result += super.getName() + "\t" + "AVG= " + getAverage();
        result += super.toString() + "\t" + " AVG= " + getAverage();
        result += "\n";
        return result;
    }

     @Override
     public int compareTo(Player o) {
         return 0;
     }
//----------------------------------------------------------------------
}// Hitter (class)
