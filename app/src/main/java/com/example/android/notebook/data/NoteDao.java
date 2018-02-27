package com.example.android.notebook.data;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.OnConflictStrategy;
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

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    void addNote(Note... note);

    @Query("DELETE FROM Note")
    void dropAll();

    @Delete
    void removeNote(Note note);
}
