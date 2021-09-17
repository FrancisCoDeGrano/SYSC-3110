/*
Francisco De Grano
101147447

I made changes to lab 1 used to only have get and set name
added things relevant to an address book.
 */

import java.util.ArrayList;

public class AddressBook{

    private ArrayList<BuddyInfo> newfriend;

    public AddressBook(){
        this.newfriend = new ArrayList<BuddyInfo>();
    }

    public void addBuddy(BuddyInfo buddy){
        this.newfriend.add(buddy);
    }

    public void removeBuddy(BuddyInfo buddy){
        this.newfriend.remove(buddy);
    }

    // toString method from SYSC 2004
    public String toString(){
        String result = "";
        for(BuddyInfo buddy : this.newfriend){
            result += buddy.toString() + '\n';
        }
        return result;
    }

    public static void main(String [] args){
        System.out.println("AddressBook");

    }


}