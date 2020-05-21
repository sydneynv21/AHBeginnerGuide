package com.example.ahbeginnerguide;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class FaqAdapter extends RecyclerView.Adapter<FaqViewHolder> {
    private ArrayList<Faq> mFaqs;

    public FaqAdapter(ArrayList<Faq> faqs){
        mFaqs = faqs;
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
}
