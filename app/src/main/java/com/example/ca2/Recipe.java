package com.example.ca2;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.google.android.material.tabs.TabLayout;
public class Recipe extends AppCompatActivity {
    TabLayout tabLayout;
    ViewPager viewPager;
    @Override

        protected void onCreate (Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        MyAdapter adapter = new MyAdapter(this, getSupportFragmentManager());
        setContentView(R.layout.activity_main);
        tabLayout = findViewById(R.id.sliding_tabs);
        viewPager = findViewById(R.id.viewPager);
        tabLayout.addTab(tabLayout.newTab().setText("Football"));
        tabLayout.addTab(tabLayout.newTab().setText("Cricket"));
        tabLayout.addTab(tabLayout.newTab().setText("NBA"));
        tabLayout.setTabGravity(TabLayout.GRAVITY_FILL);

        viewPager.setAdapter(adapter);
        viewPager.addOnPageChangeListener(new
                TabLayout.TabLayoutOnPageChangeListener(tabLayout));
        tabLayout.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() {
            @Override
            public void onTabSelected(TabLayout.Tab tab) {
                viewPager.setCurrentItem(tab.getPosition());
            }
            @Override
            public void onTabUnselected(TabLayout.Tab tab) {
            }
            @Override
            public void onTabReselected(TabLayout.Tab tab) {
            }
        });
    }

}