package com.example.android.notebook;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private ListView list;
    FloatingActionButton fab;
    private String[] notes = {"one", "two", "three"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fab = findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(MainActivity.this, CreateNote.class));
            }
        });

        list();
    }

    public void list(){
        list = (ListView) findViewById(R.id.all_notes);
        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this, R.layout.notes, notes);
        list.setAdapter(adapter);
    }
}
