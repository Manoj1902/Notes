package com.example.notes.database;


import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.example.notes.dao.NotesDao;
import com.example.notes.entity.NoteEntity;

@Database(entities = NoteEntity.class, version = 1, exportSchema = false)
public abstract class NotesDatabase extends RoomDatabase {

    public static NotesDatabase notesDatabase;

    public static synchronized NotesDatabase getNotesDatabase(Context context){
        if (notesDatabase == null){
            notesDatabase = Room.databaseBuilder(
                    context,
                    NotesDatabase.class,
                    "notes_database"
            ).build();
        }
        return notesDatabase;
    }
    public abstract NotesDao notesDao();


}
