package com.baseball.part3githubupload;
/***********************************************************************************
 * Title: ChainedHashtable
 * Author: Sean Laverty
 * Course Section: CMIS202-ONL1 (Seidel) Fall 2022
 * File: ChainedHashtable.java
 * Description: Using a linked list to create a hashtable
 ***********************************************************************************/
import java.util.LinkedList;
import java.util.ListIterator;

public class ChainedHashtable {

    private LinkedList<StoredPlayer>[] hashtable;

    public ChainedHashtable() {
        // baseball team has a 40-man roster
        hashtable = new LinkedList[40];
        for (int i = 0; i < hashtable.length; i++) {
            hashtable[i] = new LinkedList<StoredPlayer>();
        }
    }

    public void put(String key, Player player) {
        int hashedKey = hashKey(key);
        hashtable[hashedKey].add(new StoredPlayer(key, player));
    }

    public Player get(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredPlayer> iterator = hashtable[hashedKey].listIterator();
        StoredPlayer player = null;
        while (iterator.hasNext()) {
            player = iterator.next();
            if (player.key.equals(key)) {
                return player.player;
            }
        }
        return null;
    }

    public Player remove(String key) {
        int hashedKey = hashKey(key);
        ListIterator<StoredPlayer> iterator = hashtable[hashedKey].listIterator();
        StoredPlayer player = null;
        int index = -1;
        while (iterator.hasNext()) {
            player = iterator.next();
            index++;
            if (player.key.equals(key)) {
                break;
            }
        }

        if (player == null) {
            return null;
        }
        else {
            hashtable[hashedKey].remove(index);
            return player.player;
        }
    }

    private int hashKey(String key) {
        //return key.length() % hashtable.length;
        return Math.abs(key.hashCode() % hashtable.length);
    }

    public void printHashtable() {
        for (int i = 0; i < hashtable.length; i++) {
            if (hashtable[i].isEmpty()) {
                System.out.println("Position " + i + ": empty");
            }
            else {
                System.out.print("Position " + i + ": ");
                ListIterator<StoredPlayer> iterator = hashtable[i].listIterator();
                while (iterator.hasNext()) {
                    System.out.print(iterator.next().player);
                    System.out.print("->");
                }
                System.out.println("null");
            }
        }
    }

}
