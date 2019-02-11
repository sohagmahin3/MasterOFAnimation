package com.example.mediaapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    //Text
    private TextView helloWorldTextView;
    private TextView hiWorldTextView;
    public TextView mynameTextView;
    //Button
    private Button btnAnimate;

    //Image
    private ImageView imageViewLion;
    private ImageView imageViewCat;
    private ImageView imageViewCat2;

    //Bool variable
    private Boolean flag= true;

    //Image
    private Boolean isLionShow= true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ThreadTest mythread  = new ThreadTest(mynameTextView);
        mythread.start();

        //Text View
        helloWorldTextView = findViewById(R.id.txtView);
        hiWorldTextView = findViewById(R.id.txtViewHiWorld);
        mynameTextView = findViewById(R.id.myName);


        //Image view
        imageViewLion = findViewById(R.id.imageLion);
        imageViewCat = findViewById(R.id.imageCat);
        imageViewCat2 = findViewById(R.id.imageCatView);

        //Button view
        btnAnimate= findViewById(R.id.clickButton);

        helloWorldTextView.setY(-2000);
        hiWorldTextView.setY(2000);
       // helloWorldTextView.setY(-2000);
        /*helloWorldTextView.setOnClickListener(new View.OnClickListener() {
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
        */

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
                imageViewCat2.animate().scaleX(0.3f).scaleY(0.3f).rotationX(90).alpha(0).setDuration(3000);
            }
        });

        btnAnimate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                helloWorldTextView.animate().translationYBy(2000).alpha(0.75f).setDuration(3000);
                hiWorldTextView.animate().translationYBy(-2000).setDuration(3000);
            }
        });
    }

}
