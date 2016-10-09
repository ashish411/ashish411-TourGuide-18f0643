package com.example.ashis.tourguideapp;

/**
 * Created by ashis on 10/7/2016.
 */
public class infoClass {
    private  int mImageResource;
    private String mheading;
    private String mAddress;
    private String mDate;

    public infoClass(int mImageResource, String mheading, String mAddress) {
        this.mImageResource = mImageResource;
        this.mheading = mheading;
        this.mAddress = mAddress;
    }

    public infoClass(int mImageResource, String mheading, String mAddress, String mDate) {
        this.mImageResource = mImageResource;
        this.mheading = mheading;
        this.mAddress = mAddress;
        this.mDate = mDate;
    }

    public String getmDate() {
        return mDate;
    }

    public int getmImageResource() {
        return mImageResource;
    }

    public void setmImageResource(int mImageResource) {
        this.mImageResource = mImageResource;
    }

    public String getMheading() {
        return mheading;
    }

    public void setMheading(String mheading) {
        this.mheading = mheading;
    }

    public String getmAddress() {
        return mAddress;
    }

    public void setmAddress(String mAddress) {
        this.mAddress = mAddress;
    }
}
