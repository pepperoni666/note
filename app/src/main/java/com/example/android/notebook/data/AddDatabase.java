package com.example.android.notebook.data;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

/**
 * Created by peret on 22.02.2018.
 */
@Database(entities = {Note.class}, version = 1)
public abstract class AddDatabase extends RoomDatabase {
    public abstract NoteDao noteDao();
}
