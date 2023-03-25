package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.window.SplashScreen;

import com.airbnb.lottie.LottieAnimationView;

public class startscreen1 extends AppCompatActivity {

    private static int SPLASH_SCREEN = 5000;

    ImageView nameofapp1, splashImg1;
    LottieAnimationView lottieAnimationView;
    Animation topAnim, bottomAnim;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startscreen1);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);


        splashImg1 = findViewById(R.id.img);
        lottieAnimationView = findViewById(R.id.anim1);
        nameofapp1 = findViewById(R.id.nameofapp1);


        nameofapp1.setAnimation(topAnim);
        splashImg1.setAnimation(bottomAnim);
        lottieAnimationView.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(startscreen1.this, startscreen2.class);
                startActivity(intent);
                finish();
            }
        },SPLASH_SCREEN);

    }
}