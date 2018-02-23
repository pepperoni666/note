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

    @Query("SELECT * FROM Note WHERE nr LIKE :i")
    Note getOneNote(int i);

    @Insert
    void addNote(Note... note);
}
