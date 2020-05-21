package com.example.ahbeginnerguide;

import android.view.View;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

public class FaqViewHolder extends RecyclerView.ViewHolder {
    private TextView mFaqQuestionTextView;
    private TextView mFaqAnswerTextView;
    private Faq mFaq;

    public FaqViewHolder(View rootView){
        super(rootView);
        mFaqQuestionTextView = rootView.findViewById(R.id.textViewFaqQuestion);
        mFaqAnswerTextView = rootView.findViewById(R.id.textViewFaqAnswer);
    }
    public void bindFaq(Faq faq){
        mFaq = faq;
        mFaqQuestionTextView.setText(mFaq.getFaqQuestion());
        mFaqAnswerTextView.setText(mFaq.getFaqAnswer());
    }
}
