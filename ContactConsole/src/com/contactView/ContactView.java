package com.contactView;
//import java.util.List;
//import java.util.Scanner;
//
//import com.contactModel.ContactModel;
//
//public class ContactView {
//    private ContactModel model;
//    private Scanner scanner;
//
//    public ContactView(ContactModel model) {
//        this.model = model;
//        scanner = new Scanner(System.in);
//    }
//
//    public void showMenu() {
//        System.out.println("Contact Management System Menu:");
//        System.out.println("1. Add Contact");
//        System.out.println("2. Search Contacts");
//        System.out.println("3. Delete Contact");
//        System.out.println("4. Update Contact");
//        System.out.println("5. View All Contacts");
//        System.out.println("6. Sort Contacts");
//        System.out.println("0. Exit");
//    }
//
//    public void addContact() {
//        System.out.print("Enter name: ");
//        String name = scanner.nextLine();
//        System.out.print("Enter phone number: ");
//        String phone = scanner.nextLine();
//        System.out.print("Enter email: ");
//        String email = scanner.nextLine();
//
//        Contact contact = new Contact(name, phone, email);
//        model.addContact(contact);
//        System.out.println("Contact added successfully!");
//    }
//
//    public void searchContacts() {
//        System.out.print("Enter name to search: ");
//        String name = scanner.nextLine();
//        List<Contact> contacts = model.searchContacts(name);
//        if (contacts.isEmpty()) {
//            System.out.println("No contacts found.");
//        } else {
//            System.out.println("Search results:");
//            for (Contact contact : contacts) {
//                System.out.println(contact);
//            }
//        }
//    }
//
//    public void deleteContact() {
//        System.out.print("Enter index of contact to delete: ");
//        int index = Integer.parseInt(scanner.nextLine());
//        model.deleteContact(index);
//        System.out.println("Contact deleted successfully!");
//    }
//
//    public void updateContact() {
//        System.out.print("Enter index of contact to update: ");
//        int index = Integer.parseInt(scanner.nextLine());
//
//        Contact oldContact = model.getAllContacts().get(index);
//        System.out.print("Enter new name (leave blank to keep existing name): ");
//        String name = scanner.nextLine();
//        if (name.equals("")) {
//            name = oldContact.getName();
//        }
//        System.out.print("Enter new phone number (leave blank to keep existing number): ");
//        String phone = scanner.nextLine();
//        if (phone.equals("")) {
//            phone = oldContact.getPhoneNumber();
//        }
//        System.out.print("Enter new email (leave blank to keep existing email): ");
//        String email = scanner.nextLine();
//        if (email.equals("")) {
//            email = oldContact.getEmail();
//        }
//
//        Contact newContact = new Contact(name, phone, email);
//        model.updateContact(index, newContact);
//        System.out.println("Contact updated successfully!");
//    }
//
//    public void viewAllContacts() {
//        List<Contact> contacts = model.getAllContacts();
//        if (contacts.isEmpty()) {
//            System.out.println("No contacts to display.");
//        } else {
//            System.out.println("All contacts:");
//            for (int i = 0; i < contacts.size(); i++) {
//                System.out.println(i + ". " + contacts.get(i));
//            }
//        }
//    }
//
//    public void sortContacts() {
//        System.out.print("Enter field to sort by (name, phone, email): ");
//        String sortBy = scanner.nextLine();
//        List<Contact> contacts = model.sortContacts(sortBy);
//        if (contacts.isEmpty()) {
//            System.out.println("No contacts to display.");
//        } else {
//            System.out.println("Sorted contacts:");
//            for (int i = 0; i < contacts.size(); i++) {
//                System.out.println(i + ". " + contacts.get(i));
//            }
//        }
//    }
//
//    public void showExitMessage() {
//        System.out.println("Thank you for using Contact Management System!");
//    }
//
//	public void showWelcomeMessage() {
//		// TODO Auto-generated method stub
//		
//	}
//}

import java.util.ArrayList;
import java.util.Scanner;

import com.contactModel.Contact;

public class ContactView {
    private Scanner scanner = new Scanner(System.in);

    public int displayMenu() {
        System.out.println("Contact Management Console Application\n");
        System.out.println("1. Add a contact");
        System.out.println("2. Display all contacts");
        System.out.println("3. Search for a contact");
        System.out.println("4. Edit a contact");
        System.out.println("5. Delete a contact");
        System.out.println("6. Exit");

        System.out.print("\nEnter your choice (1-6): ");
        return scanner.nextInt();
    }

    public Contact getContactInfo() {
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter the contact name: ");
        String name = scanner.nextLine();

        System.out.print("Enter the contact phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter the contact email address: ");
        String email = scanner.nextLine();

        return new Contact(name, phoneNumber, email);
    }

    public void displayContacts(ArrayList<Contact> contacts) {
        if (contacts.isEmpty()) {
            System.out.println("\nNo contacts found.\n");
        } else {
            System.out.println("\nList of contacts:\n");
            for (Contact contact : contacts) {
                System.out.println(contact);
            }
            System.out.println();
        }
    }

    public String getSearchName() {
        scanner.nextLine(); // Consume newline character
        System.out.print("\nEnter the contact name to search: ");
        return scanner.nextLine();
    }

    public String getDeleteName() {
        scanner.nextLine(); // Consume newline character
        System.out.print("\nEnter the contact name to delete: ");
        return scanner.nextLine();
    }

    public Contact getEditInfo() {
        scanner.nextLine(); // Consume newline character
        System.out.print("\nEnter the contact name to edit: ");
        String name = scanner.nextLine();

        System.out.print("Enter the new phone number: ");
        String phoneNumber = scanner.nextLine();

        System.out.print("Enter the new email address: ");
        String email = scanner.nextLine();

        return new Contact(name, phoneNumber, email);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

	public int displayMenu1() {
		// TODO Auto-generated method stub
		return 0;
	}
}
