package com.example.javatutorial;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {
    ImageView im;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        im=findViewById(R.id.logo);
        Animation scale = AnimationUtils.loadAnimation(this, R.anim.scaleanimation);
        im.setAnimation(scale);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent in = new Intent(SplashActivity.this , LoginActivity.class);
                startActivity(in);
                finish();
            }
        },5000);

    }
}