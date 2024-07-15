package com.jpafrota.cursojava.meisamChallenge;

import java.util.Scanner;

public class Main {

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        System.out.println("Greetings! Choose an option to begin: ");
        int option = 0;

        while (option != 3) {
            showInitialMenu();
            option = scanner.nextInt();

            switch (option) {
                case 1:  // Phone management
                    handleContacts();
                    break;

                case 2:  // SMS
                    handleMessages();
                    break;
            }

        }

    }

    private static void handleMessages() {
        int smsOp;
        System.out.println("""
                1 - See list of all messages
                2 - Send a new message
                3 - Go back to the previous menu
                """);
    }

    private static void handleContacts() {
        int phoneOp;
        do {
            phoneOp = scanner.nextInt();
            System.out.println("""
                    1 - Show all contacts
                    2 - Add a new contact
                    3 - Search for a new contact
                    4 - Delete a contact
                    5 - Go back to previous menu
                    """);

            switch (phoneOp) {
                case 1:
                    PhoneBook.showAllContacts();
                    break;
                case 2:
                    System.out.println("------ add new contact ------");
                    System.out.println("Name: ");
                    String name = scanner.nextLine();
                    System.out.println("Number: ");
                    String number = scanner.nextLine();
                    System.out.println("Email: ");
                    String email = scanner.nextLine();
                    Contact contact = new Contact(name, number, email);
                    PhoneBook.addContact(contact);
                case 3:
                    System.out.println("Enter search string (name, phone or email): ");
                    String searchString = scanner.nextLine();
                    PhoneBook.searchContact(searchString);

            }
        } while (phoneOp != 5);
    }

    private static void showInitialMenu() {
        System.out.println("""
                1 - Manage contacts
                2 - Messages
                3 - Quit
                """);
    }
}
