package com.notesView;
//import java.util.ArrayList;
//import java.util.Scanner;
//
//	public class NoteView {
//	    private Scanner scanner;
//
//	    public NoteView() {
//	        scanner = new Scanner(System.in);
//	    }
//	    public String getNote() {
//	        System.out.println("Enter note:");
//	        return scanner.nextLine();
//	    }
//
//    public void printNotes(ArrayList<String> notes) {
//        if (notes.size() == 0) {
//            System.out.println("No notes found.");
//        } else {
//            System.out.println("Notes:");
//            for (int i = 0; i < notes.size(); i++) {
//                System.out.println((i + 1) + ". " + notes.get(i));
//            }
//        }
//    }
//
//    public int getNoteIndex() {
//        System.out.println("Enter index of note to delete:");
//        return  scanner.nextInt();
//    }
//
//}

import java.util.ArrayList;
import java.util.Scanner;

public class NoteView {
    private Scanner scanner;

    public NoteView() {
        scanner = new Scanner(System.in);
    }

    public String getNote() {
        System.out.println("Enter note:");
        return scanner.nextLine();
    }

    public void displayNotes(ArrayList<String> notes) {
        if (notes.isEmpty()) {
            System.out.println("No notes found.");
        } else {
            System.out.println("Notes:");
            for (int i = 0; i < notes.size(); i++) {
                System.out.println((i+1) + ". " + notes.get(i));
            }
        }
    }

    public int getNoteIndex() {
        System.out.println("Enter index of note to delete:");
        return scanner.nextInt();
    }
}
