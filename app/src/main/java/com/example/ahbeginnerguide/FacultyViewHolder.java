package com.example.ahbeginnerguide;


import android.content.Intent;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FacultyViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private TextView mFacultyNameTextView;
    private TextView mFacultyContactTextView;
    private Faculty mFaculty;

    public FacultyViewHolder(View rootView){
        super(rootView);
        rootView.setOnClickListener(this);
        mFacultyNameTextView = rootView.findViewById(R.id.textViewFacultyName);
        mFacultyContactTextView = rootView.findViewById(R.id.textViewFacultyContact);
    }
    public void bindFaculty(Faculty faculty){
        mFaculty = faculty;
        mFacultyNameTextView.setText(mFaculty.getFacultyName());
        mFacultyContactTextView.setText(mFaculty.getFacultyContact());
    }
    @Override
    public void onClick(View v){
        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:"+mFaculty.getFacultyContact()));

        intent.putExtra(Intent.EXTRA_EMAIL, mFaculty.getFacultyContact());
        if(intent.resolveActivity(v.getContext().getPackageManager()) != null){
            v.getContext().startActivity(intent);
        }
    }
}
