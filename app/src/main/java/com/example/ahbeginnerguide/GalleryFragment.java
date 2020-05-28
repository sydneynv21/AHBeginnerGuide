package com.example.ahbeginnerguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class GalleryFragment extends Fragment {
    private RecyclerView mRecyclerView;
    private GalleryAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_gallery, container, false);
        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.galleryRecyclerView);
        StaggeredGridLayoutManager layoutManager = new StaggeredGridLayoutManager(2,StaggeredGridLayoutManager.VERTICAL);
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Gallery> galleries = new ArrayList<>();
        galleries.add(new Gallery(R.drawable.students,"Students celebrate America Day at a Comets football game at the Pit.","Photo credits: AH Blue Crew Instagram"));
        galleries.add(new Gallery(R.drawable.soccer, "Abington Heights student playing soccer.","Photo credits: AH Blue Crew Instagram"));
        galleries.add(new Gallery(R.drawable.period1, "Period club officers representing Abington Heights at Period Rally.","Photo credits: Sarah Siddiqui"));
        galleries.add(new Gallery(R.drawable.football, "Abington Heights students playing football against Scranton Prep.","Photo credits: AH Blue Crew Instagram"));
        galleries.add(new Gallery(R.drawable.heroes,"Junior class competing in Tug-of-War contest during Gym Class Heroes on Fun Friday.","Photo credits: Matt Nzazi"));
        galleries.add(new Gallery(R.drawable.forensics, "Forensics team celebrates after a Speech and Debate competition.","Photo credits: Sarah Siddiqui"));
        galleries.add(new Gallery(R.drawable.choir,"Honors Choir performs at UNICO Choral Competition.","Photo credits: AH Music Department Instagram"));
        galleries.add(new Gallery(R.drawable.basketball, "Abington Heights student playing basketball.","Photo credits: AH Blue Crew Instagram"));
        galleries.add(new Gallery(R.drawable.heroes2, "Abington Heights junior competes in Limbo challenge on Fun Friday.", "Photo credits: Matt Nzazi"));
        galleries.add(new Gallery(R.drawable.juniors,"Abington Heights junior class cheers at a Pep Rally.","Photo credits: Matt Nzazi"));
        galleries.add(new Gallery(R.drawable.party,"Period Club celebrates after a hard day of work at packing party.","Photo credits: Sarah Siddiqui"));
        galleries.add(new Gallery(R.drawable.zumba,"Spanish teacher, Nick Lazor, instructs Zumba on Fun Friday.","Photo credits: Matt Nzazi"));
        galleries.add(new Gallery(R.drawable.tru,"TRU club visits the Middle School to teach students about tobacco resistance.","Photo credits: AH TRU Club Instagram"));
        galleries.add(new Gallery(R.drawable.period3, "Abington Heights students at Period Rally.","Photo credits: Ella Mahon"));
        galleries.add(new Gallery(R.drawable.studentco,"Student Council members prepare hot chocolate.","Photo credits: AH Student Council Instagram"));
        galleries.add(new Gallery(R.drawable.period2,"Group of Abington Heights students at Period Rally.","Photo credits: Sarah Siddiqui"));
        galleries.add(new Gallery(R.drawable.mocktrial,"Mock Trial team boys celebrate a competition win.","Photo credits: Dan Cummins"));
        mAdapter = new GalleryAdapter(galleries);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
