package com.example.roomrental;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;

public class TrendingFragment extends Fragment {
    ImageView newyork1,paris1,varanasi1,delhi1,agra1,jaipur1;
    Animation topAnim1, bottomAnim1, fadein, leftanim1, rightanim1;

    @Override
    public View onCreateView(@Nullable LayoutInflater inflater,@Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_trending, container, false);
        topAnim1 = AnimationUtils.loadAnimation(getActivity(),R.anim.top_animation);
        bottomAnim1 = AnimationUtils.loadAnimation(getActivity(),R.anim.bottom_animation);
        leftanim1 = AnimationUtils.loadAnimation(getActivity(),R.anim.left_animation);
        rightanim1= AnimationUtils.loadAnimation(getActivity(),R.anim.right_animation);
        fadein = AnimationUtils.loadAnimation(getActivity(),R.anim.fade_in);


        newyork1 = view.findViewById(R.id.newyork1);
        paris1 = view.findViewById(R.id.paris1);
        delhi1 = view.findViewById(R.id.delhi1);
        jaipur1 = view.findViewById(R.id.jaipur1);
        agra1 = view.findViewById(R.id.agra1);
        varanasi1 = view.findViewById(R.id.varnasi1);

        newyork1.setAnimation(rightanim1);
        paris1.setAnimation(leftanim1);
        jaipur1.setAnimation(rightanim1);
        delhi1.setAnimation(leftanim1);
        agra1.setAnimation(rightanim1);
        varanasi1.setAnimation(leftanim1);

        newyork1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),newyork.class);
                startActivity(intent);
            }
        });
        paris1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),paris.class);
                startActivity(intent);
            }
        });
        delhi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),delhi.class);
                startActivity(intent);
            }
        });
        agra1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),agra.class);
                startActivity(intent);
            }
        });
        jaipur1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),jaipur.class);
                startActivity(intent);
            }
        });
        varanasi1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(getActivity(),varnasi.class);
                startActivity(intent);
            }
        });
        return view;
    }
}