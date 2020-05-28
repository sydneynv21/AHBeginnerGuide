package com.example.ahbeginnerguide;

public class Gallery {
    private int mGalleryImageResourceId;
    private String mGalleryDescription;
    private String mGalleryPhotoCreds;

    public Gallery(int galleryImageResourceId, String galleryDescription, String galleryPhotoCreds){
        mGalleryImageResourceId = galleryImageResourceId;
        mGalleryDescription = galleryDescription;
        mGalleryPhotoCreds = galleryPhotoCreds;
    }
    public int getGalleryImageResourceId(){
        return mGalleryImageResourceId;
    }
    public void setGalleryImageResourceId(int galleryImageResourceId){
        mGalleryImageResourceId = galleryImageResourceId;
    }
    public String getGalleryDescription(){
        return mGalleryDescription;
    }
    public void setGalleryDescription(String galleryDescription){
        mGalleryDescription = galleryDescription;
    }
    public String getGalleryPhotoCreds(){
        return mGalleryPhotoCreds;
    }
    public void setGalleryPhotoCreds(String galleryPhotoCreds){
        mGalleryPhotoCreds = galleryPhotoCreds;
    }
}
