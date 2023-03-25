package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import com.airbnb.lottie.LottieAnimationView;

public class startscreen2 extends AppCompatActivity {
    private static int SPLASH_SCREEN = 3000;

    ImageView introimg2;
    TextView intro2;
    Animation leftAnim, rightAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startscreen2);
        leftAnim = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightAnim = AnimationUtils.loadAnimation(this,R.anim.right_animation);


        introimg2 = findViewById(R.id.introimg2);
        intro2 = findViewById(R.id.intro2);


        introimg2.setAnimation(rightAnim);
        intro2.setAnimation(leftAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1 = new Intent(startscreen2.this, startscreen3.class);
                startActivity(intent1);
                finish();
            }
        },SPLASH_SCREEN);

    }
}