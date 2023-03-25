package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class startscreen3 extends AppCompatActivity {

    private static int SPLASH_SCREEN1 = 3000;

    TextView intro3;
    LottieAnimationView introimg3;
    Animation topAnim1, bottomAnim1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startscreen3);
        topAnim1 = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim1 = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        introimg3 = findViewById(R.id.introimg3);
        intro3 = findViewById(R.id.intro3);


        introimg3.setAnimation(topAnim1);
        intro3.setAnimation(bottomAnim1);


        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent2 = new Intent(startscreen3.this, startscreen4.class);
                startActivity(intent2);
                finish();
            }
        },SPLASH_SCREEN1);

    }
}