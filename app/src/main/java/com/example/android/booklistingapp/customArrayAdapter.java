package com.example.android.booklistingapp;

import android.content.Context;
import android.support.annotation.NonNull;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class customArrayAdapter extends ArrayAdapter<Books> {

    public customArrayAdapter(Context context, ArrayList<Books> books) {
        super(context, 0, books);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        View listItem = convertView;
        if (listItem == null) {
            listItem = LayoutInflater.from(this.getContext()).inflate(R.layout.custom_list, parent, false);
        }

        Books books = getItem(position);


//        ImageView imageView = (ImageView) listItem.findViewById(R.id.book_cover);
//        Picasso.get().load(books.getmImageUrl()).into(imageView);


//        Picasso.get()
//                .load(url)
//                .resize(50, 50)
//                .centerCrop()
//                .into(imageView)


        TextView book_title = (TextView) listItem.findViewById(R.id.book_title);
        book_title.setText(books.getmTitle());


        TextView book_author = (TextView) listItem.findViewById(R.id.book_author);
        book_author.setText(books.getmAuthor());

        TextView book_publisher = (TextView) listItem.findViewById(R.id.book_publisher);
        book_publisher.setText(books.getmPublisher());


        TextView book_Release_date = (TextView) listItem.findViewById(R.id.book_Release_date);

        Date dateObject = new Date(books.getmTimeInMilliseconds());

        // Format the date string (i.e. "Mar 3, 1984")
        String formattedDate = formatDate(dateObject);

        book_Release_date.setText(formattedDate);

        return listItem;

    }


    /**
     * Return the formatted date string (i.e. "Mar 3, 1984") from a Date object.
     */
    private String formatDate(Date dateObject) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("LLL dd, yyyy");
        return dateFormat.format(dateObject);
    }


}
