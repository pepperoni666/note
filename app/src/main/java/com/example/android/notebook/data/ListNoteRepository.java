package com.example.android.notebook.data;

/**
 * Created by peret on 27.02.2018.
 */

public class ListNoteRepository {

    private final NoteDao noteDao;

    public ListNoteRepository(NoteDao noteDao) {
        this.noteDao = noteDao;
    }
}
