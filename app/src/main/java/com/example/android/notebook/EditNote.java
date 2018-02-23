package com.example.android.notebook;

import android.arch.persistence.room.Room;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

/**
 * Created by peret on 22.02.2018.
 */

public class EditNote extends AppCompatActivity{
    TextView note_title;
    TextView note_text;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_note);

        final AddDatabase db = Room.databaseBuilder(getApplicationContext(), AddDatabase.class, "name")
                .allowMainThreadQueries()
                .build();

        int nr = getIntent().getExtras().getInt("note");

        note_title = findViewById(R.id.actTitle);
        note_text = findViewById(R.id.actText);

        Note note = db.noteDao().getOneNote(nr+1);

        note_title.setText(note.getTitle());
        note_text.setText(note.getText());
    }
}
