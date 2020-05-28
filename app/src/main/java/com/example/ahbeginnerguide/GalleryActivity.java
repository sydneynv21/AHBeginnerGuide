package com.example.ahbeginnerguide;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import org.w3c.dom.Text;


public class GalleryActivity extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gallery);
        getIncomingIntent();
    }
    private void getIncomingIntent(){
        if(getIntent().hasExtra("image_resource")&& getIntent().hasExtra("description")&& getIntent().hasExtra("photocreds")){
            int imageUrl = getIntent().getIntExtra("image_resource",0);
            String imageDescription = getIntent().getStringExtra("description");
            String imageCreds = getIntent().getStringExtra("photocreds");
            setImage(imageUrl,imageDescription,imageCreds);
        }
    }
    private void setImage(int imageUrl, String imageDescription, String imageCreds){
        ImageView image = findViewById(R.id.image);
        image.setImageResource(imageUrl);

        TextView description = findViewById(R.id.imagedescription);
        description.setText(imageDescription);

        TextView creds = findViewById(R.id.photocreds);
        creds.setText(imageCreds);

    }
}
