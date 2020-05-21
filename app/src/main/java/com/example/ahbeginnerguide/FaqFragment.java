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
        faqs.add(new Faq("What are the requirements to make the honor role?","The student must have at least a 90% or above average to make the honor role"));
        faqs.add(new Faq("Are honors classes weighted?","Yes, honors and AP level classes are weighted by 5%."));
        faqs.add(new Faq("Does every new student get a mentor?", "Yes, every student is assigned a mentor on the Transition Team from the Sophomore or Junior class."));
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
