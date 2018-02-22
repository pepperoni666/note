package com.example.android.notebook;

import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by peret on 22.02.2018.
 */
@Entity
public class Note {
    @PrimaryKey(autoGenerate = true)
    private int nr;

    private String title;

    private String text;

    public Note(String title, String text) {
        this.title = title;
        this.text = text;
    }

    public int getNr() {
        return nr;
    }

    public String getTitle() {
        return title;
    }

    public String getText() {
        return text;
    }

    public void setNr(int nr) {
        this.nr = nr;
    }
}
