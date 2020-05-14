package com.example.ahbeginnerguide;

public class Event {
    private String mEventTitle;
    private String mEventDate;
    private String mEventContact;

    public Event(String eventTitle, String eventDate, String eventContact){
        mEventTitle = eventTitle;
        mEventDate = eventDate;
        mEventContact = eventContact;
    }
    public String getEventTitle(){
        return mEventTitle;
    }
    public void setEventTitle(String eventTitle){
        mEventTitle = eventTitle;
    }
    public String getEventDate(){
        return mEventDate;
    }
    public void setEventDate(String eventDate){
        mEventDate = eventDate;
    }
    public String getEventContact(){
        return mEventContact;
    }
    public void setEventContact(String eventContact){
        mEventContact = eventContact;
    }
}
