package com.example.android.booklistingapp;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        ArrayList<Books> myBooks = new ArrayList<>();
        myBooks.add(new Books("test title ", "test author", " test Publisher", 1255555555));
        myBooks.add(new Books("test title 2 ", "test author", " test Publisher", 1255555555));
        myBooks.add(new Books("test title 3", "test author", " test Publisher", 1255555555));
        myBooks.add(new Books("test title 4 ", "test author", " test Publisher", 1255555555));
        myBooks.add(new Books("test title 5", "test author", " test Publisher", 1255555555));


        customArrayAdapter adapter = new customArrayAdapter(getApplicationContext(), myBooks);

        ListView listView = (ListView) findViewById(R.id.myList);
        listView.setAdapter(adapter);

    }


}
