package com.example.ahbeginnerguide;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.davemorrissey.labs.subscaleview.ImageSource;
import com.davemorrissey.labs.subscaleview.SubsamplingScaleImageView;


/**
 * A simple {@link Fragment} subclass.
 */
public class MapFragment extends Fragment {




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_map, container, false);
       final SubsamplingScaleImageView imageView = (SubsamplingScaleImageView)rootView.findViewById(R.id.imageView);
        imageView.setImage(ImageSource.resource(R.drawable.main));

        Button second = rootView.findViewById(R.id.secondButton);
        Button main = rootView.findViewById(R.id.mainButton);
        Button basement = rootView.findViewById(R.id.basementButton);
        final TextView title = rootView.findViewById(R.id.mapTitle);

        View.OnClickListener myListener = new View.OnClickListener(){
            @Override
            public void onClick(View v){
                if(v.getId()==R.id.secondButton){
                    imageView.setImage(ImageSource.resource(R.drawable.second));
                    title.setText("Second Floor: ");
                }
                else if(v.getId()==R.id.mainButton){
                    imageView.setImage(ImageSource.resource(R.drawable.main));
                    title.setText("Main Floor: ");
                }
                else if(v.getId()==R.id.basementButton){
                    imageView.setImage(ImageSource.resource(R.drawable.basement));
                    title.setText("Basement: ");
                }
            }
        };
        second.setOnClickListener(myListener);
        main.setOnClickListener(myListener);
        basement.setOnClickListener(myListener);
        return rootView;
    }
}
