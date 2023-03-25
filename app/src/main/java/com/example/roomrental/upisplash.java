package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class upisplash extends AppCompatActivity {
    ImageView sbi,kotak,hdfc,axis,icici,pnb;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upisplash);
        sbi = findViewById(R.id.sbi);
        kotak = findViewById(R.id.kotak);
        hdfc = findViewById(R.id.hdfc);
        axis = findViewById(R.id.axis);
        icici = findViewById(R.id.icici);
        pnb = findViewById(R.id.pnb);

        sbi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://retail.onlinesbi.com/retail/login.htm"));
                startActivity(intent);
            }
        });
        kotak.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://netbanking.kotak.com/knb2/"));
                startActivity(intent);
            }
        });
        hdfc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://v1.hdfcbank.com/assets/popuppages/netbanking.htm"));
                startActivity(intent);
            }
        });
        icici.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://www.icicibank.com/Personal-Banking/insta-banking/internet-banking/index.page"));
                startActivity(intent);
            }
        });
        pnb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://netpnb.com/"));
                startActivity(intent);
            }
        });
        axis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setData(Uri.parse("https://retail.axisbank.co.in/wps/portal/rBanking/axisebanking/AxisRetailLogin/!ut/p/a1/04_Sj9CPykssy0xPLMnMz0vMAfGjzOKNAzxMjIwNjLwsQp0MDBw9PUOd3HwdDQwMjIEKIoEKDHAARwNC-sP1o_ArMYIqwGNFQW6EQaajoiIAVNL82A!!/dl5/d5/L2dBISEvZ0FBIS9nQSEh/"));
                startActivity(intent);
            }
        });

    }
}