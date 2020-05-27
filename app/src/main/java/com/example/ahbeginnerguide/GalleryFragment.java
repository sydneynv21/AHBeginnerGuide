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
        galleries.add(new Gallery(R.drawable.students));
        galleries.add(new Gallery(R.drawable.soccer));
        galleries.add(new Gallery(R.drawable.period1));
        galleries.add(new Gallery(R.drawable.football));
        galleries.add(new Gallery(R.drawable.heroes));
        galleries.add(new Gallery(R.drawable.forensics));
        galleries.add(new Gallery(R.drawable.choir));
        galleries.add(new Gallery(R.drawable.basketball));
        galleries.add(new Gallery(R.drawable.heroes2));
        galleries.add(new Gallery(R.drawable.juniors));
        galleries.add(new Gallery(R.drawable.party));
        galleries.add(new Gallery(R.drawable.zumba));
        galleries.add(new Gallery(R.drawable.tru));
        galleries.add(new Gallery(R.drawable.period3));
        galleries.add(new Gallery(R.drawable.studentco));
        galleries.add(new Gallery(R.drawable.period2));
        mAdapter = new GalleryAdapter(galleries);
        mRecyclerView.setAdapter(mAdapter);
        return rootView;
    }
}
