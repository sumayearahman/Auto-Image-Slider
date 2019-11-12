package com.sumayea.autoimage;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import technolifestyle.com.imageslider.FlipperLayout;
import technolifestyle.com.imageslider.FlipperView;

public class MainActivity extends AppCompatActivity {

    FlipperLayout flipperLayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        flipperLayout=findViewById(R.id.flipper);


        int imagesDrawable[]= {R.drawable.c,R.drawable.d,R.drawable.e, R.drawable.f};

        String imagesDescription[]={"image 1","image 2", "image 3","image 4"};


        for(int i=0; i<imagesDrawable.length; i++){

            FlipperView flipperView = new FlipperView(getBaseContext());
            flipperView.setImageDrawable(imagesDrawable[i]);
            flipperView.setDescription(imagesDescription[i]);
            flipperLayout.addFlipperView(flipperView);
        }
    }
}
