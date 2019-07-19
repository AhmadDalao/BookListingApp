package com.example.android.booklistingapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;

public class detail extends AppCompatActivity {


    private String titleFromMain;
    private String authorFromMain;
    private String publisherFromMain;
    private String UrlFromMain = null;
    private String dateFromMain;
    private String descriptionFromMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);

        // this code   setDisplayHomeAsUpEnabled(true); will show  the back arrow in the action bar
        // now you need to go to the manifest and new attribute android:parentActivityName=" the page we want to back to "
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);



        Bundle bundle = getIntent().getExtras();
        if (bundle != null) {

            titleFromMain = bundle.getString(myConstants.getTITLE()); // done
            authorFromMain = bundle.getString(myConstants.getAUTHOR()); // done
            publisherFromMain = bundle.getString(myConstants.getPUBLISHER()); // done
            dateFromMain = bundle.getString(myConstants.getDATE()); // done
            descriptionFromMain = bundle.getString(myConstants.getDESCRIPTION()); // done
            UrlFromMain = bundle.getString(myConstants.getURL()); // done
        }

        TextView title = (TextView) findViewById(R.id.detail_title);
        title.setText(titleFromMain);

        TextView author = (TextView) findViewById(R.id.detail_author);
        author.setText(authorFromMain);

        TextView publisher = (TextView) findViewById(R.id.detail_publisher);
        publisher.setText(publisherFromMain);

        TextView date = (TextView) findViewById(R.id.detail_date);
        date.setText(dateFromMain);

        TextView description = (TextView) findViewById(R.id.detail_description);
        description.setText(descriptionFromMain);


    }

    public void review_book(View view) {

        // Convert the String URL into a URI object (to pass into the Intent constructor)
        Uri earthquakeUri = Uri.parse(UrlFromMain);

        // Create a new intent to view the earthquake URI
        Intent websiteIntent = new Intent(Intent.ACTION_VIEW, earthquakeUri);

        // Send the intent to launch a new activity
        startActivity(websiteIntent);

    }

    // to set up the back button
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        if (item.getItemId() == android.R.id.home) {
            onBackPressed();
        }

        return super.onOptionsItemSelected(item);
    }



}
