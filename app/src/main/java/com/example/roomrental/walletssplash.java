package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class walletssplash extends AppCompatActivity {
    ImageButton paytmwallet, phonepewallet,mobikwikwallet;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_walletssplash);

        paytmwallet = findViewById(R.id.paytmwallet);
        phonepewallet = findViewById(R.id.phonepewallet);
        mobikwikwallet = findViewById(R.id.mobikwikwallet);

        paytmwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://paytm.com/"));
                startActivity(intent);
            }
        });
        phonepewallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://www.phonepe.com/"));
                startActivity(intent);
            }
        });
        mobikwikwallet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://www.mobikwik.com/"));
                startActivity(intent);
            }
        });
    }
}