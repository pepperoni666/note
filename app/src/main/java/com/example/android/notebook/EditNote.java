package com.example.android.notebook;

import android.arch.persistence.room.Room;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by peret on 22.02.2018.
 */

public class EditNote extends AppCompatActivity{
    TextView note_title;
    TextView note_text;
    Button del;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.act_note);

        final AddDatabase db = Room.databaseBuilder(getApplicationContext(), AddDatabase.class, "name")
                .allowMainThreadQueries()
                .build();

        final String id = getIntent().getStringExtra("note");

        note_title = findViewById(R.id.actTitle);
        note_text = findViewById(R.id.actText);
        del = findViewById(R.id.delete);

        Note note = db.noteDao().getOneNote(id);

        note_title.setText(note.getTitle());
        note_text.setText(note.getText());

        del.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                db.noteDao().removeNote(id);
                startActivity(new Intent(EditNote.this, MainActivity.class));
            }
        });

    }
}
