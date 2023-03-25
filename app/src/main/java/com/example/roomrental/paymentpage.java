package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.RadioButton;

public class paymentpage extends AppCompatActivity {
    RadioButton credit,cash,upi,wallets,netbanking;
    Button confirmbutton;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_paymentpage);
        credit = findViewById(R.id.credit);
        cash = findViewById(R.id.cash);
        upi = findViewById(R.id.upi);
        wallets = findViewById(R.id.wallets);
        confirmbutton = findViewById(R.id.confirmbutton);

        confirmbutton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (credit.isChecked()) {
                    opencredit();
                }
                else if (cash.isChecked()){
                    opencash();
                }
                else if (upi.isChecked()){
                    openupi();
                }
                else if (wallets.isChecked()){
                    openwallets();
                }
            }
        });
    }
    public void opencredit(){
        Intent intent1 = new Intent(this,creditsplash.class);
        startActivity(intent1);
    }
    public void opencash(){
        Intent intent2 = new Intent(this,cashsplash.class);
        startActivity(intent2);
    }
    public void openupi(){
        Intent intent3 = new Intent(this,upisplash.class);
        startActivity(intent3);
    }
    public void openwallets(){
        Intent intent4 = new Intent(this,walletssplash.class);
        startActivity(intent4);
    }
}