package com.contactController;
//import java.util.List;
//import java.util.Scanner;
//
//import com.contactModel.ContactModel;
//import com.contactView.ContactView;
//
//public class ContactController {
//    private ContactModel model;
//    private ContactView view;
//    private Scanner scanner;
//
//    public ContactController(ContactModel model, ContactView view) {
//        this.model = model;
//        this.view = view;
//        scanner = new Scanner(System.in);
//    }
//
//    public void start() {
//        view.showWelcomeMessage();
//        while (true) {
//            view.showMainMenu();
//            String choice = scanner.nextLine();
//            switch (choice) {
//                case "1":
//                    createContact();
//                    break;
//                case "2":
//                    updateContact();
//                    break;
//                case "3":
//                    deleteContact();
//                    break;
//                case "4":
//                    searchContacts();
//                    break;
//                case "5":
//                    sortContacts();
//                    break;
//                case "6":
//                    view.showAllContacts(model.getAllContacts());
//                    break;
//                case "0":
//                    view.showExitMessage();
//                    return;
//                default:
//                    view.showInvalidChoiceMessage();
//                    break;
//            }
//        }
//    }
//
//    private void createContact() {
//        String name = view.promptForName();
//        String phoneNumber = view.promptForPhoneNumber();
//        String email = view.promptForEmail();
//        Contact contact = new Contact(name, phoneNumber, email);
//        model.addContact(contact);
//        view.showContactCreatedMessage();
//    }
//
//    private void updateContact() {
//        List<Contact> contacts = model.getAllContacts();
//        view.showAllContacts(contacts);
//        int index = view.promptForContactIndex(contacts.size());
//        Contact oldContact = contacts.get(index);
//        String name = view.promptForName(oldContact.getName());
//        String phoneNumber = view.promptForPhoneNumber(oldContact.getPhoneNumber());
//        String email = view.promptForEmail(oldContact.getEmail());
//        Contact newContact = new Contact(name, phoneNumber, email);
//        model.updateContact(index, newContact);
//        view.showContactUpdatedMessage();
//    }
//
//    private void deleteContact() {
//        List<Contact> contacts = model.getAllContacts();
//        view.showAllContacts(contacts);
//        int index = view.promptForContactIndex(contacts.size());
//        model.deleteContact(index);
//        view.showContactDeletedMessage();
//    }
//
//    private void searchContacts() {
//        String name = view.promptForSearchQuery();
//        List<Contact> searchResult = model.searchContacts(name);
//        view.showSearchResults(searchResult);
//    }
//
//    private void sortContacts() {
//        String sortBy = view.promptForSortField();
//        List<Contact> sortedContacts = model.sortContacts(sortBy);
//        view.showAllContacts(sortedContacts);
//    }
//}

import java.util.ArrayList;

import com.contactModel.Contact;
import com.contactView.ContactView;

public class ContactController {
    private ContactView view;
    private ArrayList<Contact> model;

    public ContactController(ContactView view, ArrayList<Contact> model) {
        this.view = view;
        this.model = model;
    }

//    public ContactController(ContactView view2, ArrayList<Contact> model2) {
//		// TODO Auto-generated constructor stub
//	}

	public void run() {
        int choice;
        do {
            choice = view.displayMenu();

            switch (choice) {
                case 1:
                    addContact();
                    break;
                case 2:
                    displayContacts();
                    break;
                case 3:
                    searchContact();
                    break;
                case 4:
                    editContact();
                    break;
                case 5:
                    deleteContact();
                    break;
                case 6:
                    view.displayMessage("\nGoodbye!\n");
                    break;
                default:
                    view.displayMessage("\nInvalid choice. Please try again.\n");
                    break;
            }
        } while (choice != 6);
    }

    private void addContact() {
        Contact contact = view.getContactInfo();
        model.add(contact);
        view.displayMessage("\nContact added successfully.\n");
    }

    private void displayContacts() {
        view.displayContacts(model);
    }

    private void searchContact() {
        String searchName = view.getSearchName();
        ArrayList<Contact> searchResults = new ArrayList<>();
        for (Contact contact : model) {
            if (contact.getName().equalsIgnoreCase(searchName)) {
                searchResults.add(contact);
            }
        }
        view.displayContacts(searchResults);
    }

    private void editContact() {
        Contact editContact = view.getEditInfo();
        for (Contact contact : model) {
            if (contact.getName().equalsIgnoreCase(editContact.getName())) {
                contact.setPhoneNumber(editContact.getPhoneNumber());
                contact.setEmail(editContact.getEmail());
                view.displayMessage("\nContact edited successfully.\n");
                return;
            }
        }
        view.displayMessage("\nContact not found. Please try again.\n");
    }

    private void deleteContact() {
        String deleteName = view.getDeleteName();
        for (Contact contact : model) {
            if (contact.getName().equalsIgnoreCase(deleteName)) {
                model.remove(contact);
                view.displayMessage("\nContact deleted successfully.\n");
                return;
            }
        }
        view.displayMessage("\nContact not found. Please try again.\n");
    }
}