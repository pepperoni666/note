package com.example.android.notebook;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import java.util.List;

/**
 * Created by peret on 22.02.2018.
 */

public class CreateNote extends AppCompatActivity {

    private static final String TAG = "CreateNote";

    EditText note_title;
    EditText note_text;
    Button save_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.edit_note);

        note_title = findViewById(R.id.title);
        note_text = findViewById(R.id.textOfTheNote);
        save_button = findViewById(R.id.sabeButton);

        final AddDatabase db = Room.databaseBuilder(getApplicationContext(), AddDatabase.class, "name")
                .allowMainThreadQueries()
                .build();

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.noteDao().addNote(new Note(note_title.getText().toString(), note_text.getText().toString()));
                startActivity(new Intent(CreateNote.this, MainActivity.class));
            }
        });
    }
}
