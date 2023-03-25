package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageButton;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class startscreen4 extends AppCompatActivity {
    private static int SPLASH_SCREEN2 = 2500;

    TextView intro4;
    LottieAnimationView introimg4;
    Animation topAnim1, bottomAnim1, fadein, leftanim1, rightanim1;


        @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
            getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
            setContentView(R.layout.activity_startscreen4);
            topAnim1 = AnimationUtils.loadAnimation(this,R.anim.top_animation);
            bottomAnim1 = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
            leftanim1 = AnimationUtils.loadAnimation(this,R.anim.left_animation);
            rightanim1= AnimationUtils.loadAnimation(this,R.anim.right_animation);
            fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);


            introimg4 = findViewById(R.id.introimg4);
            intro4 = findViewById(R.id.intro4);


            introimg4.setAnimation(topAnim1);
            intro4.setAnimation(fadein);

            new Handler().postDelayed(new Runnable() {
                @Override
                public void run() {
                    Intent intent2 = new Intent(startscreen4.this, startscreen5.class);
                    startActivity(intent2);
                    finish();
                }
            },SPLASH_SCREEN2);


        }
}