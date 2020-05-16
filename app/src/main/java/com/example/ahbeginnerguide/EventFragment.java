package com.example.ahbeginnerguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class EventFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private EventAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_event, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.myRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Event> events = new ArrayList<>();
        events.add(new Event("New Student Orientation","Wednesday, August 14th","theonyl@ahsd.org"));
        events.add(new Event("Back to School Carnival", "Friday, August 23rd", "tarrj@ahsd.org"));
        events.add(new Event("First Day of School", "Wednesday, September 4th", "snydera@ahsd.org"));
        events.add(new Event("Homecoming", "Saturday, October 19th", "andrisanip@ahsd.org"));
        events.add(new Event("Prom", "Saturday, May 2nd", "snydera@ahsd.org"));
        events.add(new Event("Memorial Day", "Monday, May 25th", "mahonm@ahsd.org"));
        events.add(new Event("Graduation", "Friday, June 12th", "andrisanip@ahsd.org"));
        mAdapter = new EventAdapter(events);
        mRecyclerView.setAdapter(mAdapter);

        return rootView;
    }
}
