package com.contactModel;
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.Comparator;
//import java.util.List;
//
//public class ContactModel {
//    private List<ContactModel> contacts;
//
//    public ContactModel() {
//        contacts = new ArrayList<>();
//    }
//
//    public void addContact(ContactModel contact) {
//        contacts.add(contact);
//    }
//
//    public void deleteContact(int index) {
//        contacts.remove(index);
//    }
//
//    public void updateContact(int index, ContactModel newContact) {
//        contacts.set(index, newContact);
//    }
//
//    public List<ContactModel> getAllContacts() {
//        return contacts;
//    }
//
//    public List<ContactModel> searchContacts(String name) {
//        List<ContactModel> result = new ArrayList<>();
//        for (ContactModel contact : contacts) {
//            if (contact.getName().contains(name)) {
//                result.add(contact);
//            }
//        }
//        return result;
//    }
//
//    private List<ContactModel> getName() {
//		// TODO Auto-generated method stub
//		return null;
//	}
//
//	public List<ContactModel> sortContacts(String sortBy) {
//        List<Contact> sortedContacts = new ArrayList<>(contacts);
//
//        switch (sortBy) {
//            case "name":
//                Collections.sort(sortedContacts, Comparator.comparing(Contact::getName));
//                break;
//            case "phone":
//                Collections.sort(sortedContacts, Comparator.comparing(Contact::getPhoneNumber));
//                break;
//            case "email":
//                Collections.sort(sortedContacts, Comparator.comparing(Contact::getEmail));
//                break;
//            default:
//                System.out.println("Invalid field.");
//                sortedContacts.clear();
//        }
//
//        return sortedContacts;
//    }
//}

public class Contact {
    private String name;
    private String phoneNumber;
    private String email;

    public Contact(String name, String phoneNumber, String email) {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String toString() {
        return "Name: " + name + "\nPhone Number: " + phoneNumber + "\nEmail Address: " + email + "\n";
    }
}
