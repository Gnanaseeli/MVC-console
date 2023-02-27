package com.notesController;
import java.util.ArrayList;

import com.notesModel.NoteModel;
import com.notesView.NoteView;

public class NoteController {
    public NoteModel model;
    public NoteView view;

    public NoteController(NoteModel model, NoteView view) {
        this.model = model;
        this.view = view;
    }

    public void addNote() {
        String note = view.getNote();
        model.add(note);
    }

    public void displayNotes() {
        ArrayList<String> notes = model.getAll();
        view.displayNotes(notes);
    }

    public void removeNote() {
        int index = view.getNoteIndex() - 1;
        model.remove(index);
    }
}
