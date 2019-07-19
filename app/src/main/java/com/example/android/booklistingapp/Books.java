package com.example.android.booklistingapp;

public class Books {

    private String mTitle;
    private String mAuthor;
    private String mPublisher;
    private String mDescription;
    private String mUrl;
    private String mDate;


    public String getmDate() {
        return mDate;
    }

    public Books(String mTitle, String mAuthor, String mPublisher, String mDate, String mDescription, String mUrl) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublisher = mPublisher;
        this.mDate = mDate;
        this.mDescription = mDescription;
        this.mUrl = mUrl;
    }

    public String getmTitle() {
        return mTitle;
    }

    public String getmAuthor() {
        return mAuthor;
    }

    public String getmPublisher() {
        return mPublisher;
    }

    public String getmDescription() {
        return mDescription;
    }

    public String getmUrl() {
        return mUrl;
    }

}
