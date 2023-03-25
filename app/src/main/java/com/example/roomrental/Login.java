package com.example.roomrental;;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Login extends AppCompatActivity {
    private TextView createAccount;
    private Button movenext;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        createAccount = findViewById(R.id.createAccount);
        createAccount.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openuser();
            }
        });
    }
    public void openuser(){
        Intent intent = new Intent(this,Newuser.class);
        startActivity(intent);
    }
    public void openmove(){
        Intent intent4 = new Intent(this, BottomNavigation.class);
        startActivity(intent4);
    }
}