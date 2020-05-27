package com.example.ahbeginnerguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class GalleryAdapter extends RecyclerView.Adapter<GalleryViewHolder>{
    private ArrayList<Gallery> mPhotos;

    public GalleryAdapter(ArrayList<Gallery> photos){
        mPhotos = photos;
    }

    @Override
    public GalleryViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.gallerylistitem_layout, parent, false);
        GalleryViewHolder newViewHolder = new GalleryViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(GalleryViewHolder currentViewHolder, int position){
        Gallery currentGallery = mPhotos.get(position);
        currentViewHolder.bindGallery(currentGallery);
    }
    @Override
    public int getItemCount(){
        return mPhotos.size();
    }
}
