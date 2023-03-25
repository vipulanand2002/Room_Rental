package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.widget.Button;

public class cashsplash extends AppCompatActivity {
    Button proceedcash;
    Animation topAnim, bottomAnim;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cashsplash);
        proceedcash = findViewById(R.id.proceedcash);
        proceedcash.setAnimation(bottomAnim);
        proceedcash.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(cashsplash.this,confirmationpageforbookig.class);
                startActivity(intent);
            }
        });
    }
}