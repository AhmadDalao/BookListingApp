package com.example.android.booklistingapp;

public class Books {

    private String mTitle;
    private String mAuthor;
    private String mPublisher;
    private String mDescription;
    private String mImageUrl;
    private String mDate;
    private long mTimeInMilliseconds;


    /* to be used later on */

    public Books(String mTitle, String mAuthor, String mPublisher, String mDescription, String mImageUrl, long mTimeInMilliseconds) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublisher = mPublisher;
        this.mDescription = mDescription;
        this.mImageUrl = mImageUrl;
        this.mTimeInMilliseconds = mTimeInMilliseconds;
    }


    public String getmDate() {
        return mDate;
    }

    public Books(String mTitle, String mAuthor, String mPublisher, String mDate) {
        this.mTitle = mTitle;
        this.mAuthor = mAuthor;
        this.mPublisher = mPublisher;
        this.mDate = mDate;
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

    public String getmImageUrl() {
        return mImageUrl;
    }

    public long getmTimeInMilliseconds() {
        return mTimeInMilliseconds;
    }
}
