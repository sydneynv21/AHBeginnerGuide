package com.example.ahbeginnerguide;

import android.view.View;
import android.widget.ImageView;

import androidx.recyclerview.widget.RecyclerView;

public class GalleryViewHolder extends RecyclerView.ViewHolder{
    private ImageView mGalleryImageView;
    private Gallery mGallery;

    public GalleryViewHolder(View rootView){
        super(rootView);
        mGalleryImageView = rootView.findViewById(R.id.imageViewGalleryImage);
    }
    public void bindGallery(Gallery gallery){
        mGallery = gallery;
        mGalleryImageView.setImageResource(mGallery.getGalleryImageResourceId());
    }

}
