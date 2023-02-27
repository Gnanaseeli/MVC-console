package com.notesModel;
//import java.util.ArrayList;
//
//public class NoteModel {
//    private ArrayList<String> notes;
//
//    public NoteModel() {
//        notes = new ArrayList<>();
//    }
//
//    public void add1(String note) {
//        notes.add(note);
//    }
//
//    public ArrayList<String> getAllNotes() {
//        return notes;
//    }
//
//    public void remove(int index) {
//        notes.remove(index);
//    }
//
//	public void add(String note) {
//		// TODO Auto-generated method stub
//		
//	}
//}

import java.util.ArrayList;

public class NoteModel {
     ArrayList<String> notes;

     public NoteModel() {
        notes = new ArrayList<String>();
    }

    public void add(String note) {
        notes.add(note);
    }

    public void remove(int index) {
        if (!notes.isEmpty() && index >= 0 && index < notes.size()) {
            notes.remove(index);
        } else {
            System.out.println("Invalid note index.");
        }
    }

     public ArrayList<String> getAll() {
        return notes;
    }
}
