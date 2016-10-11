package com.example.codetribe.quizappremake;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.animation.Animation;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;

public class SplashActivity extends AppCompatActivity {

    int splashTime = 3000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        getSupportActionBar().hide();

        RotateAnimation rotate = new RotateAnimation(0, 360, Animation.RELATIVE_TO_SELF, 0.5f, Animation.RELATIVE_TO_SELF, 0.5f);
        rotate.setDuration(3000);
        rotate.setInterpolator(new LinearInterpolator());
        ImageView SplashImg = (ImageView) findViewById(R.id.imgSplash);
        SplashImg.startAnimation(rotate);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent MainIntent = new Intent(SplashActivity.this,MainActivity.class);
                startActivity(MainIntent);
                finish();
            }
        }, splashTime);
    }
}
