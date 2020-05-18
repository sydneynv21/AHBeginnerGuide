package com.example.ahbeginnerguide;

public class Faculty {
    private String mFacultyName;
    private String mFacultyContact;

    public Faculty(String facultyName, String facultyContact){
        mFacultyName = facultyName;
        mFacultyContact = facultyContact;
    }
    public String getFacultyName(){
        return mFacultyName;
    }
    public void setFacultyName(String facultyName){
        mFacultyName = facultyName;
    }
    public String getFacultyContact(){
        return mFacultyContact;
    }
    public void setFacultyContact(String facultyContact){
        mFacultyContact = facultyContact;
    }
}
