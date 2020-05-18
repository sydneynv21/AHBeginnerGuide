package com.example.ahbeginnerguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FacultyAdapter extends RecyclerView.Adapter<FacultyViewHolder> {
    private ArrayList<Faculty> mFaculties;
    public FacultyAdapter(ArrayList<Faculty> faculties){
        mFaculties = faculties;
    }
    @Override
    public FacultyViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitemfaculty_layout, parent, false);
        FacultyViewHolder newViewHolder = new FacultyViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(FacultyViewHolder currentViewHolder, int position){
        Faculty currentFaculty = mFaculties.get(position);
        currentViewHolder.bindFaculty(currentFaculty);
    }
    @Override
    public int getItemCount(){
        return mFaculties.size();
    }
}
