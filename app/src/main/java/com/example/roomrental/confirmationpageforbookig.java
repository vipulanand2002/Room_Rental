package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class confirmationpageforbookig extends AppCompatActivity {
    private static int Splashtiming = 6000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_confirmationpageforbookig);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(confirmationpageforbookig.this,startscreen5.class);
                startActivity(intent);
                finish();
            }
        },Splashtiming);
    }
}