package com.example.mediaapp;

import android.widget.ImageView;
import android.widget.TextView;

public class ThreadTest extends Thread {
    private TextView myNameText;
    public ThreadTest(TextView view){
        this.myNameText = view;
    }
    @Override
    public void run(){
        while(true){
            myNameText.animate().rotation(180).setDuration(1000);
            break;
        }
    }
}
