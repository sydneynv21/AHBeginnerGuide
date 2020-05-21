package com.example.ahbeginnerguide;

public class Faq {
    private String mFaqQuestion;
    private String mFaqAnswer;

    public Faq (String faqQuestion, String faqAnswer){
        mFaqQuestion = faqQuestion;
        mFaqAnswer = faqAnswer;
    }
    public String getFaqQuestion(){
        return mFaqQuestion;
    }
    public void setFaqQuestion(String faqQuestion){
        mFaqQuestion = faqQuestion;
    }
    public String getFaqAnswer(){
        return mFaqAnswer;
    }
    public void setFaqAnswer(String faqAnswer){
        mFaqAnswer = faqAnswer;
    }

}
