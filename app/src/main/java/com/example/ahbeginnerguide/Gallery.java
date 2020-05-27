package com.example.ahbeginnerguide;

public class Gallery {
    private int mGalleryImageResourceId;

    public Gallery(int galleryImageResourceId){
        mGalleryImageResourceId = galleryImageResourceId;
    }
    public int getGalleryImageResourceId(){
        return mGalleryImageResourceId;
    }
    public void setGalleryImageResourceId(int galleryImageResourceId){
        mGalleryImageResourceId = galleryImageResourceId;
    }
}
