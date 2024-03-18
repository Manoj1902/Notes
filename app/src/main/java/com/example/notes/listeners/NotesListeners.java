package com.example.notes.listeners;

import com.example.notes.entity.NoteEntity;

public interface NotesListeners {
    void onNoteClicked(NoteEntity note, int position);
}
