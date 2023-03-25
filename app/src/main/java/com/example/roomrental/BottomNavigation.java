package com.example.roomrental;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.etebarian.meowbottomnavigation.MeowBottomNavigation;

public class BottomNavigation extends AppCompatActivity {
    MeowBottomNavigation bottomNavigation;
    private final int Home = 1;
    private final int Trending = 2;
    private final int Houses = 3;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        bottomNavigation = findViewById(R.id.bottom_navigation);

        bottomNavigation.add(new MeowBottomNavigation.Model(Home, R.drawable.searcharea));
        bottomNavigation.add(new MeowBottomNavigation.Model(Trending, R.drawable.trending));
        bottomNavigation.add(new MeowBottomNavigation.Model(Houses, R.drawable.houses));

        bottomNavigation.setOnShowListener(new MeowBottomNavigation.ShowListener() {
            @Override
            public void onShowItem(MeowBottomNavigation.Model item) {
                Fragment fragment = null;

                switch (item.getId()) {
                    case Home:
                        fragment = new SearchareaFragment();
                        break;

                    case Trending:
                        fragment = new TrendingFragment();
                        break;

                    case Houses:
                        fragment = new HousesFragment();
                        break;
                }
                loadFragment(fragment);
            }
        });

        bottomNavigation.setCount(Home, "10");

        bottomNavigation.show(Houses, true);
        bottomNavigation.setOnClickMenuListener(new MeowBottomNavigation.ClickListener() {
            @Override
            public void onClickItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"Tab"+ item.getId(),Toast.LENGTH_SHORT).show();
            }
        });

        bottomNavigation.setOnReselectListener(new MeowBottomNavigation.ReselectListener() {
            @Override
            public void onReselectItem(MeowBottomNavigation.Model item) {
                Toast.makeText(getApplicationContext(),"Tab"+ item.getId(),Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void loadFragment(Fragment fragment) {
        getSupportFragmentManager().beginTransaction().replace(R.id.frame_layout,fragment).commit();
    }
}