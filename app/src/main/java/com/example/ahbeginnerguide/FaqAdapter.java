package com.example.ahbeginnerguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Filter;
import android.widget.Filterable;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FaqAdapter extends RecyclerView.Adapter<FaqViewHolder> implements Filterable {
    private ArrayList<Faq> mFaqs;
    private ArrayList<Faq> mFaqsFull;

    public FaqAdapter(ArrayList<Faq> faqs){
        mFaqs = faqs;
        mFaqsFull = new ArrayList<>(mFaqs);
    }
    @Override
    public FaqViewHolder onCreateViewHolder(ViewGroup parent, int viewType){
        LayoutInflater layoutInflater = LayoutInflater.from(parent.getContext());
        View rootView = layoutInflater.inflate(R.layout.faqlistitem_layout, parent, false);
        FaqViewHolder newViewHolder = new FaqViewHolder(rootView);
        return newViewHolder;
    }
    @Override
    public void onBindViewHolder(FaqViewHolder currentViewHolder, int position){
        Faq currentFaq = mFaqs.get(position);
        currentViewHolder.bindFaq(currentFaq);
    }
    @Override
    public int getItemCount(){
        return mFaqs.size();
    }


    @Override
    public Filter getFilter(){
        return exampleFiler;
    }
    private Filter exampleFiler = new Filter(){
        @Override
        protected FilterResults performFiltering(CharSequence constraint){
            ArrayList<Faq> filteredList = new ArrayList<>();

            if(constraint == null || constraint.length() == 0){
                filteredList.addAll(mFaqsFull);
            }
            else{
                String filterPatter = constraint.toString().toLowerCase().trim();

                for(Faq item : mFaqsFull){
                    if(item.getFaqQuestion().toLowerCase().contains(filterPatter)){
                        filteredList.add(item);
                    }
                }
            }
            FilterResults results = new FilterResults();
            results.values = filteredList;

            return results;
        }
        @Override
        protected void publishResults(CharSequence constraint, FilterResults results){
            mFaqs.clear();
            mFaqs.addAll((ArrayList)results.values);
            notifyDataSetChanged();

        }
    };
}
