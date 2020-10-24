package com.example.batteryanimation;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.drawable.AnimationDrawable;
import android.os.Build;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    AnimationDrawable batteryAnimation;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

         ImageView imageView = findViewById(R.id.image);
         imageView.setBackgroundResource(R.drawable.animation);
         batteryAnimation = (AnimationDrawable) imageView.getBackground();

    }

    @Override
    public void onWindowFocusChanged(boolean hasFocus) {
        super.onWindowFocusChanged(hasFocus);
        batteryAnimation.start();
    }
}