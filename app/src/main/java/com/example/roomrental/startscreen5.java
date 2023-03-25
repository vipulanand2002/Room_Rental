package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;

import android.app.DatePickerDialog;
import android.content.Intent;
import android.graphics.Color;
import android.graphics.drawable.ColorDrawable;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;
import android.widget.Button;

import android.widget.DatePicker;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import android.widget.Toast;

import com.airbnb.lottie.LottieAnimationView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.Calendar;
import java.util.Date;

public class startscreen5 extends AppCompatActivity {
    String[] item1 = {"Indore","Mumbai","Delhi","Bhopal"};
    String[] item2 = {"1 Guest","2 Guests","3 Guests","4 Guests","5 Guests","6 Guests","7 Guests","8 Guests","9 Guests","10 Guests"};

    AutoCompleteTextView autotext3;
    AutoCompleteTextView autotext4;
    ArrayAdapter<String> adapterItems;

    EditText mDateFormat;
    DatePickerDialog.OnDateSetListener onDateSetListener;

    EditText mDateFormat2;
    DatePickerDialog.OnDateSetListener onDateSetListener2;

    private Button button;
    private Button button2;
    Animation topAnim1, bottomAnim1, fadein, leftanim1, rightanim1;

    LottieAnimationView searchlottie;
    TextView searchforavail;
    LinearLayout layoutforanim2;
    LinearLayout layoutforanim1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_startscreen5);

        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        topAnim1 = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomAnim1 = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);
        leftanim1 = AnimationUtils.loadAnimation(this,R.anim.left_animation);
        rightanim1= AnimationUtils.loadAnimation(this,R.anim.right_animation);
        fadein = AnimationUtils.loadAnimation(this,R.anim.fade_in);

        mDateFormat = findViewById(R.id.dateformat);
        mDateFormat2 = findViewById(R.id.dateformat2);
        searchlottie=findViewById(R.id.searchlottie);
        layoutforanim2 = findViewById(R.id.layoutforanim2);
        layoutforanim1 = findViewById(R.id.layoutforanim1);

        autotext3 = findViewById(R.id.autotext3);
        autotext4 = findViewById(R.id.autotext4);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);

        button.setAnimation(leftanim1);
        button2.setAnimation(rightanim1);
        searchlottie.setAnimation(bottomAnim1);
        layoutforanim1.setAnimation(fadein);
        layoutforanim2.setAnimation(fadein);

        adapterItems = new ArrayAdapter<String>(this, R.layout.dropdown1,item1);
        autotext3.setAdapter(adapterItems);
        autotext3.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),""+item, Toast.LENGTH_SHORT).show();
            }
        });

        adapterItems = new ArrayAdapter<String>(this, R.layout.dropdown1,item2);
        autotext4.setAdapter(adapterItems);
        autotext4.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                String item = parent.getItemAtPosition(position).toString();
                Toast.makeText(getApplicationContext(),""+item, Toast.LENGTH_SHORT).show();
            }
        });
        mDateFormat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        startscreen5.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        onDateSetListener, year , month ,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });
        onDateSetListener = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayofmonth) {
                month = month+1;
                String date = dayofmonth+"/"+month+"/"+year;
                mDateFormat.setText(date);
            }
        };
        mDateFormat2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                DatePickerDialog datePickerDialog = new DatePickerDialog(
                        startscreen5.this, android.R.style.Theme_Holo_Light_Dialog_MinWidth,
                        onDateSetListener2, year , month ,day);
                datePickerDialog.getWindow().setBackgroundDrawable(new ColorDrawable(Color.TRANSPARENT));
                datePickerDialog.show();
            }
        });
        onDateSetListener2 = new DatePickerDialog.OnDateSetListener() {
            @Override
            public void onDateSet(DatePicker datePicker, int year, int month, int dayofmonth) {
                month = month+1;
                String date = dayofmonth+"/"+month+"/"+year;
                mDateFormat2.setText(date);
            }
        };
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openlogin();
            }
        });
        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennewuser();
            }
        });
        searchlottie.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { openmainfragment(); }
        });
    }

    public void openlogin() {
        Intent intent = new Intent(this, Login.class);
        startActivity(intent);
    }

    public void opennewuser() {
        Intent intent1 = new Intent(this, Newuser.class);
        startActivity(intent1);
    }
    public void openmainfragment() {
        Intent intent2 = new Intent(this, loading1.class);
        startActivity(intent2);
    }
}