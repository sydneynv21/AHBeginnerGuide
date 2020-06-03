package com.example.ahbeginnerguide;


import android.os.Bundle;


import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.SearchView;


import java.util.ArrayList;


/**
 * A simple {@link Fragment} subclass.
 */
public class FaqFragment extends Fragment{

    private RecyclerView mRecyclerView;
    private FaqAdapter mAdapter;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View rootView = inflater.inflate(R.layout.fragment_faq, container, false);

        mRecyclerView = (RecyclerView) rootView.findViewById(R.id.faqRecyclerView);
        LinearLayoutManager layoutManager = new LinearLayoutManager(this.getActivity());
        mRecyclerView.setLayoutManager(layoutManager);

        ArrayList<Faq> faqs = new ArrayList<>();
        faqs.add(new Faq("Is there a dress code?","Yes, there is a dress code. Every student must be covered from the collar bone to three inches above the knee. "));
        faqs.add(new Faq("What are the requirements to make the honor role?","The student must have at least a 90% or above average to make the honor role."));
        faqs.add(new Faq("Are honors classes weighted?","Yes, honors and AP level classes are weighted by 5%."));
        faqs.add(new Faq("Does every new student get a mentor?", "Yes, every student is assigned a mentor on the Transition Team from the Sophomore or Junior class."));
        faqs.add(new Faq("How far apart are classes in the High School?","Depending on which part of the building you are in, it can take from 5 seconds to 5 minutes to get to your next class."));
        faqs.add(new Faq("How long are class periods?","Class periods are 43 minutes long each, not including 9th mod. Period 9 is 38 minutes."));
        faqs.add(new Faq("How do I get involved in extracurricular activities?","Listen to the announcements everyday! Most clubs and activities hold general membership meetings at the beginning of the year, which are announced over the announcements."));
        faqs.add(new Faq("How long do I have between classes?","You have 5 minutes in between classes to stop at your locker, use the restroom, or do anything else you need to do to prepare you for your next class."));
        faqs.add(new Faq("When do I get my schedule?","You will get your schedule at New Student Orientation."));
        faqs.add(new Faq("Are lunches with every grade?","Yes, you will have lunch with all grade levels. It is a great way to meet new people!"));
        faqs.add(new Faq("Do I need to wear my ID badge all the time?","Yes, you need to have your ID badge around your neck, visible at all times throughout the school day for security purposes."));
        mAdapter = new FaqAdapter(faqs);
        mRecyclerView.setAdapter(mAdapter);

        setHasOptionsMenu(true);
        return rootView;
    }

    @Override
    public void onCreateOptionsMenu(Menu menu, MenuInflater inflater){
        inflater.inflate(R.menu.faq_menu, menu);

        MenuItem searchItem = menu.findItem(R.id.action_search);
        SearchView searchView = (SearchView) searchItem.getActionView();

        super.onCreateOptionsMenu(menu, inflater);

        searchView.setOnQueryTextListener(new SearchView.OnQueryTextListener() {
            @Override
            public boolean onQueryTextSubmit(String query) {
                return false;
            }

            @Override
            public boolean onQueryTextChange(String newText) {
                mAdapter.getFilter().filter(newText);
                return false;
            }
        });

    }


}
