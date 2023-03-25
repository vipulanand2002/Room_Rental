package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.ViewSwitcher;

public class property6 extends AppCompatActivity {
    ImageButton beforeButton, afterButton;
    ImageSwitcher imageSwitcher;
    Button bookdeal;
    WebView webview1;
    int index= 0;int gorseller[] = {R.drawable.house60,R.drawable.house61, R.drawable.house62, R.drawable.house63, R.drawable.house64};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_property6);
        beforeButton=findViewById(R.id.before);
        afterButton=findViewById(R.id.after);
        imageSwitcher=findViewById(R.id.imageswitcher);
        bookdeal = findViewById(R.id.bookdeal);
        bookdeal.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openloading1(); }
        });

        beforeButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                --index;
                if (index<0){
                    index=gorseller.length-1;
                }
                imageSwitcher.setImageResource(gorseller[index]);
            }
        });

        afterButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                index++;
                if(index==gorseller.length){
                    index=0;
                }
                imageSwitcher.setImageResource(gorseller[index]);
            }
        });
        imageSwitcher.setFactory(new ViewSwitcher.ViewFactory() {
            @Override
            public View makeView() {
                ImageView imageView = new ImageView(getApplicationContext());
                imageView.setScaleType(ImageView.ScaleType.FIT_CENTER);
                imageView.setMaxHeight(500);
                imageView.setMaxWidth(500);
                return imageView;
            }
        });
        imageSwitcher.setImageResource(gorseller[index]);
    }
    public void openloading1(){
        Intent intent5 = new Intent(this, finalbooking.class);
        startActivity(intent5);
    }
}