package com.example.mediaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //Text View
    private TextView helloWorldTextView;
    private TextView hiWorldTextView;

    //ImageView
    private ImageView imageViewLion;
    private ImageView imageViewCat;
    private ImageView imageViewCat2;

    //Text View
    private Boolean flag= true;

    //Image View
    private Boolean isLionShow= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //Text View
        helloWorldTextView = findViewById(R.id.txtView);
        hiWorldTextView = findViewById(R.id.txtViewHiWorld);

        //Image view
        imageViewLion = findViewById(R.id.imageLion);
        imageViewCat = findViewById(R.id.imageCat);
        imageViewCat2 = findViewById(R.id.imageCatView);

        helloWorldTextView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if(flag) {
                    helloWorldTextView.animate().alpha(0).setDuration(3000);
                    hiWorldTextView.animate().alpha(1).setDuration(3000);
                    flag = false;
                }
                else{
                    hiWorldTextView.animate().alpha(0).setDuration(3000);
                    helloWorldTextView.animate().alpha(1).setDuration(3000);
                    flag = true;
                }
            }
        });

        //Image View
        imageViewLion.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if(isLionShow){
                        imageViewLion.animate().alpha(0).setDuration(3000);
                        imageViewCat.animate().alpha(1).setDuration(3000);
                        isLionShow = false;
                    }
                    else{
                        imageViewLion.animate().alpha(1).setDuration(3000);
                        imageViewCat.animate().alpha(0).setDuration(3000);
                        isLionShow = true;
                    }
            }
        });

        imageViewCat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //imageViewCat2.animate().translationX(-3000).setDuration(3000);
                //imageViewCat2.animate().translationY(-3000).setDuration(3000);
                //imageViewCat2.animate().rotationXBy(300).setDuration(2000);
                //imageViewCat2.animate().rotationYBy(400).setDuration(3000);
                //imageViewCat2.animate().translationXBy(300).setDuration(3000);
                imageViewCat2.animate().translationYBy(300).setDuration(3000);
            }
        });
    }
}
