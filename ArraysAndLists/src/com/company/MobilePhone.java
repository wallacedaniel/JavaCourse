package com.company;

import java.util.ArrayList;

public class MobilePhone {

    private String myNumber;
    private ArrayList<Contact> contactList;

    public MobilePhone(String myNumber) {
        this.myNumber = myNumber;
        this.contactList = new ArrayList<Contact>();
    }

    public void addContact(String contactName, String contactNumber) {
        Contact contact = new Contact(contactName, contactNumber);
        contactList.add(contact);
    }

    public ArrayList<Contact> getContactList() {
        return contactList;
    }

    public void printContactList() {
        for(int i = 0; i < contactList.size(); i++) {
            System.out.println((i+1) + ". " + contactList.get(i).getName() + " - " +  contactList.get(i).getPhoneNumber());
        }
    }

    public void modifyContactList(String currentContact, String newContactName, String newContactNumber) {
        int position = findContact((currentContact));
        if(position >= 0){
            Contact newContact = new Contact(newContactName, newContactNumber);
            modifyContact(position, newContact);
            System.out.println("Contact: " + currentContact + " has been modified");
        }
    }

    private void modifyContact(int position, Contact newContact) {
        contactList.set(position, newContact);
    }

    public void removeContact(String contactName) {
        int position = findContact(contactName);
        if(position >= 0){
            removeContact(position);
            System.out.println(contactName + " has been removed from the contact list.");
        }
    }

    private void removeContact(int position) {
        Contact thisContact = contactList.get(position);
        contactList.remove(position);
    }

    private int findContact(String contactName) {

            for (int i = 0; i < contactList.size(); i++) {
                if (contactList.get(i).getName().equals(contactName)) {
                    return i;
                }
            }
            return -1;
    }

    public boolean onFile(String searchItem) {

        int position = findContact(searchItem);
        if(position >= 0) {
            return true;
        }
        return false;
    }
}
