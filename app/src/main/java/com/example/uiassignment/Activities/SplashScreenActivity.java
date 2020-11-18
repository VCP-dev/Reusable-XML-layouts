package com.example.uiassignment.Activities;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

import com.example.uiassignment.R;

public class SplashScreenActivity extends AppCompatActivity {


    private static int SPLASH_TIME_OUT = 1723;

    Animation animZoomin;
    ImageView splashimg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        splashimg = findViewById(R.id.splashimg);

        animZoomin = AnimationUtils.loadAnimation(getApplicationContext(),R.anim.zoom_in);
        splashimg.startAnimation(animZoomin);

        new Handler().postDelayed(new Runnable() {
            @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
            @Override
            public void run() {
                //Intent Main = new Intent(SplashScreenActivity.this, MainActivity.class);
                Intent newMain = new Intent(SplashScreenActivity.this, MainActivity.class);

                // ActivityOptions options = ActivityOptions.makeSceneTransitionAnimation(SplashScreenActivity.this,new Pair<View, String>(icon,"icontransition"));

                startActivity(newMain);//,options.toBundle());
            }
        },SPLASH_TIME_OUT);
    }
}