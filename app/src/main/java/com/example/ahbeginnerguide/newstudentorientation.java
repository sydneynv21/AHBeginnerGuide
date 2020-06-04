package com.example.ahbeginnerguide;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;

public class newstudentorientation extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_newstudentorientation);
        final SubsamplingScaleImageView imageView = (SubsamplingScaleImageView) findViewById(R.id.nsoView);
        imageView.setImage (ImageSource.resource(R.drawable.nsopic));
    }
}
