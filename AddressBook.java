/*
Francisco De Grano
101147447

I made changes to lab 1 used to only have get and set name
added things relevant to an address book.

This is me inserting changes following step 17.

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
        BuddyInfo francisco = new BuddyInfo("Francisco");
        BuddyInfo doro = new BuddyInfo("Doro");
        BuddyInfo eebro = new BuddyInfo("Eebro");

        AddressBook newf = new AddressBook(); //newfriend in address book

        newf.addBuddy(francisco);
        newf.addBuddy(doro);
        newf.addBuddy(eebro);

        System.out.println(newf);

    }


}
