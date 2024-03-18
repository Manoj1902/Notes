package com.example.notes.dao;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.OnConflictStrategy;
import androidx.room.Query;

import com.example.notes.entity.NoteEntity;

import java.util.List;

@Dao
public interface NotesDao {

    @Query("SELECT * FROM note_table ORDER BY id DESC")
    List<NoteEntity> getAllNotes();

    @Insert (onConflict = OnConflictStrategy.REPLACE)
    void insertNotes(NoteEntity note);

    @Delete
    void deleteNote(NoteEntity note);
}
