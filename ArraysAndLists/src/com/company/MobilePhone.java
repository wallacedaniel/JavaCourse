package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> myContacts;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.myContacts = new ArrayList<Contact>();
    }

//    public void addContact(String contactName, String contactNumber) {
//        Contact contact = new Contact(contactName, contactNumber);
//        myContacts.add(contact);
//    }

    public boolean addNewContact(Contact contact) {

        if(findContact(contact.getName()) >= 0) {
            System.out.println("Contact is already on file");
            return false;
        }
        myContacts.add(contact);
        return true;
    }

    public ArrayList<Contact> getContactList() {
        return myContacts;
    }

//    public void printContactList() {
//        for(int i = 0; i < myContacts.size(); i++) {
//            System.out.println((i+1) + ". " + myContacts.get(i).getName() + " - " +  myContacts.get(i).getPhoneNumber());
//        }
//    }

    public void printContacts() {
        System.out.println("Contact List");
        for(int i = 0; i < myContacts.size(); i++) {
            System.out.println((i+1) + "." + this.myContacts.get(i).getName() + " -> " +  this.myContacts.get(i).getPhoneNumber());
        }
    }

//    public void modifyContactList(String currentContact, String newContactName, String newContactNumber) {
//        int position = findContact((currentContact));
//        if(position >= 0){
//            Contact newContact = new Contact(newContactName, newContactNumber);
//            modifyContact(position, newContact);
//            System.out.println("Contact: " + currentContact + " has been modified");
//        }
//    }

//    private void modifyContact(int position, Contact newContact) {
//        myContacts.set(position, newContact);
//    }

    public boolean updateContact(Contact oldContact, Contact newContact) {
        int position = findContact(oldContact);
        if(position < 0){
            System.out.println(oldContact.getName() + ", was not found");
            return false;
        } else if (findContact(newContact.getName()) != -1){
            System.out.println("Contact with name " + newContact.getName() + " already exists. Update was not successful.");
            return false;
        }

        this.myContacts.set(position, newContact);
        //modifyContact(position, newContact);
        System.out.println(oldContact.getName() + ", was replaced with " + newContact.getName());
        return true;
    }



    public boolean removeContact(Contact contact) {
        int position = findContact(contact);
        if(position < 0){
            System.out.println(contact.getName() + " was not found");
            return false;
        }
        this.myContacts.remove(position);
        System.out.println(contact.getName() + " was removed");
        return true;
    }

//    private void removeContact(int position) {
//        Contact thisContact = myContacts.get(position);
//        myContacts.remove(position);
//    }

//    private int findContact(String contactName) {
//
//            for (int i = 0; i < myContacts.size(); i++) {
//                if (myContacts.get(i).getName().equals(contactName)) {
//                    return i;
//                }
//            }
//            return -1;
//    }

    private int findContact(Contact contact) {
        return this.myContacts.indexOf(contact);
    }

    private int findContact(String contactName) {

        for (int i = 0; i < this.myContacts.size(); i++) {
            Contact contact = this.myContacts.get(i);
            if (contact.getName().equals(contactName)) {
                return i;
            }
        }
        return -1;
    }

    public String queryContact(Contact contact) {
        if(findContact(contact) >= 0) {
            return contact.getName();
        }
        return null;
    }

    public Contact queryContact(String name) {
        int position = findContact(name);
        if(position >= 0) {
            return this.myContacts.get(position);
        }
        return null;
    }


//    public boolean onFile(String searchItem) {
//
//        int position = findContact(searchItem);
//        if(position >= 0) {
//            return true;
//        }
//        return false;
//    }
}
