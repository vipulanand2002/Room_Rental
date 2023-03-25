package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import com.airbnb.lottie.LottieAnimationView;

public class paymentsplash extends AppCompatActivity {
   private static int SPLASH_SCREENp = 4000;

    LottieAnimationView paymentanim;
    Animation bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentsplash);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        bottomAnim = AnimationUtils.loadAnimation(this,R.anim.fade_in);
        paymentanim = findViewById(R.id.paymentanim);
        paymentanim.setAnimation(bottomAnim);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent1 = new Intent(paymentsplash.this, paymentpage.class);
                startActivity(intent1);
                finish();
            }
        },SPLASH_SCREENp);
    }
}