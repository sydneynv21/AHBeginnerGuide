package com.example.ahbeginnerguide;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.text.Html;
import android.text.Spanned;
import android.text.method.LinkMovementMethod;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


/**
 * A simple {@link Fragment} subclass.
 */
public class HomeFragment extends Fragment implements View.OnTouchListener{
    private TextView phoneNumberTextView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_home, container, false);

        phoneNumberTextView = (TextView) rootView.findViewById(R.id.phoneNumber);
        phoneNumberTextView.setOnTouchListener(this);

        Button nso = (Button) rootView.findViewById(R.id.NSOButton);
        nso.setOnClickListener(new View.OnClickListener(){
            public void onClick(View view){
                Intent myIntent = new Intent(view.getContext(), newstudentorientation.class);
                startActivity(myIntent);
            }
        });
        return rootView;
    }
    @Override
    public boolean onTouch(View v, MotionEvent event){
        Intent callIntent = new Intent(Intent.ACTION_DIAL);
        callIntent.setData(Uri.parse("tel:5708070038"));
        startActivity(callIntent);
        return true;
    }
}
