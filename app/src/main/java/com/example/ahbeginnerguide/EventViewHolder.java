package com.example.ahbeginnerguide;

import android.view.View;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
public class EventViewHolder extends RecyclerView.ViewHolder{
    private TextView mEventTitleTextView;
    private TextView mEventDateTextView;
    private TextView mEventContactTextView;
    private Event mEvent;

    public EventViewHolder(View rootView){
        super(rootView);
        mEventTitleTextView = rootView.findViewById(R.id.textViewEventTitle);
        mEventDateTextView = rootView.findViewById(R.id.textViewEventDate);
        mEventContactTextView = rootView.findViewById(R.id.textViewEventContact);
    }
    public void bindEvent(Event event){
        mEvent = event;
        mEventTitleTextView.setText(mEvent.getEventTitle());
        mEventDateTextView.setText(mEvent.getEventDate());
        mEventContactTextView.setText(mEvent.getEventContact());
    }
}
