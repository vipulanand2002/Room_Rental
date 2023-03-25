package com.example.roomrental;

import android.content.Intent;
import android.os.Bundle;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageButton;


import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

public class HousesFragment extends Fragment {
    private ImageButton property1button, property2button, property3button, property4button,property5button,property6button ;


    @Override
    public View onCreateView(@Nullable LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_houses, container, false);
       property1button = view.findViewById(R.id.property1button);
        property2button = view.findViewById(R.id.property2button);
        property3button = view.findViewById(R.id.property3button);
        property4button = view.findViewById(R.id.property4button);
        property5button = view.findViewById(R.id.property5button);
        property6button = view.findViewById(R.id.property6button);

        property1button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property1.class);
                startActivity(intent);
            }
        });
        property2button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property2.class);
                startActivity(intent);
            }
        });
        property3button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property3.class);
                startActivity(intent);
            }
        });
        property4button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property4.class);
                startActivity(intent);
            }
        });
        property5button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property5.class);
                startActivity(intent);
            }
        });
        property6button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),property6.class);
                startActivity(intent);
            }
        });
return view;
    }
}




