package com.example.ahbeginnerguide;

import android.content.Intent;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class GalleryViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private ImageView mGalleryImageView;
    private TextView mGalleryDescriptionTextView;
    private TextView mGalleryPhotoCredsTextView;
    private Gallery mGallery;

    public GalleryViewHolder(View rootView){
        super(rootView);
        rootView.setOnClickListener(this);
        mGalleryImageView = rootView.findViewById(R.id.imageViewGalleryImage);
        mGalleryDescriptionTextView = rootView.findViewById(R.id.textViewDescription);
        mGalleryPhotoCredsTextView = rootView.findViewById(R.id.textViewPhotoCreds);
    }
    public void bindGallery(Gallery gallery){
        mGallery = gallery;
        mGalleryImageView.setImageResource(mGallery.getGalleryImageResourceId());
        mGalleryDescriptionTextView.setText(mGallery.getGalleryDescription());
        mGalleryPhotoCredsTextView.setText(mGallery.getGalleryPhotoCreds());
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(v.getContext(), GalleryActivity.class);
        intent.putExtra("image_resource",mGallery.getGalleryImageResourceId());
        intent.putExtra("description",mGallery.getGalleryDescription());
        intent.putExtra("photocreds",mGallery.getGalleryPhotoCreds());
        v.getContext().startActivity(intent);

    }

}
