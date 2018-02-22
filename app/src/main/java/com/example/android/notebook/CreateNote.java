package com.example.android.notebook;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

/**
 * Created by peret on 22.02.2018.
 */

public class CreateNote extends AppCompatActivity {
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

        save_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //TODO: save to satabase |
            }
        });
    }
}
