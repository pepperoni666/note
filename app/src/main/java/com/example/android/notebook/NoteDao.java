package com.example.android.notebook;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;

import java.util.List;

/**
 * Created by peret on 22.02.2018.
 */
@Dao
public interface NoteDao {
    @Query("SELECT * FROM Note")
    List<Note> getListOfNotes();

    @Query("SELECT * FROM Note WHERE title LIKE :s")
    Note getOneNote(String s);

    @Insert
    void addNote(Note... note);

    @Query("DELETE FROM Note")
    void dropAll();

    @Query("DELETE FROM Note WHERE title LIKE :s")
    void removeNote(String s);
}
