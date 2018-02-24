package com.example.android.notebook;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by peret on 22.02.2018.
 */
@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int id;

    private String title;

    private String text;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }
}
