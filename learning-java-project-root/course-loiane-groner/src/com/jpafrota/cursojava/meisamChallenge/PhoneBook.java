package com.jpafrota.cursojava.meisamChallenge;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.Objects;

public class PhoneBook {

    private static ArrayList<Contact> contactsList;

    public static void showAllContacts() {
        System.out.println("Here's the list of all contacts: ");
        for (Contact contact : contactsList) {
            printContactInfo(contact);
        }
    }

    public static void addContact(Contact contact) {
        if (contactsList.contains(contact)) {
            System.out.println("Contact already exists on the list.");
            return;
        }

        contactsList.add(contact);
        System.out.println("Successfully added contact.");
    }

    public static void searchContact(String name) {
        for (Contact contact : contactsList) {
            if (contact.getName().equals(name)) {
                System.out.println("Found contact: ");
                printContactInfo(contact);
            }
        }

        System.out.println("Contact not found.");
    }

    public static void deleteContact(Contact contact) {
        if (contactsList.remove(contact)) {
            System.out.println("Successfully removed contact.");
            return;
        }
        System.out.println("Couldn't delete contact because it doesn't exist.");
    }

    public static void printContactInfo(Contact contact) {
        System.out.printf(contact.toString());
    }

}
