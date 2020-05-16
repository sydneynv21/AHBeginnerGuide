package com.example.ahbeginnerguide;

import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

import androidx.recyclerview.widget.RecyclerView;
public class EventViewHolder extends RecyclerView.ViewHolder implements View.OnClickListener{
    private TextView mEventTitleTextView;
    private TextView mEventDateTextView;
    private TextView mEventContactTextView;
    private Event mEvent;

    public EventViewHolder(View rootView){
        super(rootView);
        rootView.setOnClickListener(this);
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
    @Override
    public void onClick(View v){
       Intent intent = new Intent(Intent.ACTION_SENDTO);
       intent.setData(Uri.parse("mailto:"+mEvent.getEventContact()));

       intent.putExtra(Intent.EXTRA_EMAIL, mEvent.getEventContact());
       if(intent.resolveActivity(v.getContext().getPackageManager()) != null){
           v.getContext().startActivity(intent);
       }


    }
}
