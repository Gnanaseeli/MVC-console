package com.notesView;

import java.util.Scanner;

import com.notesController.NoteController;
import com.notesModel.NoteModel;

public class Home {
    public static void main(String[] args) {
        NoteModel model = new NoteModel();
        NoteView view = new NoteView();
        NoteController controller = new NoteController(model, view);
        

        while (true) {
            System.out.println("Select an option:");
            System.out.println("1. Add a note");
            System.out.println("2. View notes");
            System.out.println("3. Delete a note");
            System.out.println("4. Exit");

            Scanner scanner = new Scanner(System.in);
            int option = scanner.nextInt();

            switch (option) {
                case 1:
                    controller.addNote();
                    System.out.println("Note added successfully.");
                    break;
                case 2:
                    controller.displayNotes();
                    break;
                case 3:
                    controller.removeNote();
                    System.out.println("Note deleted successfully.");
                    break;
                case 4:
                    System.exit(0);
                    break;
                default:
                    System.out.println("Invalid option.");
            }
        }
    }
}
