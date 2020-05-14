package com.example.ahbeginnerguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class EventAdapter extends RecyclerView.Adapter<EventViewHolder>{
    private ArrayList<Event> mEvents;

    public EventAdapter(ArrayList<Event> events){
        mEvents = events;
    }
    @Override
    public EventViewHolder onCreateViewHolder(ViewGroup parent,int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.listitem_layout, parent, false);
        EventViewHolder newViewHolder = new EventViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(EventViewHolder currentViewHolder, int position){
        Event currentEvent = mEvents.get(position);
        currentViewHolder.bindEvent(currentEvent);
    }
    @Override
    public int getItemCount(){
        return mEvents.size();
    }
}
