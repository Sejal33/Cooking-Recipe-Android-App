package com.example.ca2;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;

public class Recipe extends AppCompatActivity {
    private static final int NUM_PAGES = 3;
    //The pager widget, which handles animation and allows swiping horizontally to access previous and next wizard steps.
    public static ViewPager2 viewPager;
    // The pager adapter, which provides the pages to the view pager widget.
    private FragmentStateAdapter pagerAdapter;
    // Arrey of strings FOR TABS TITLES
    private String[] titles = new String[]{"Mexican", "Desi", "Italian"};

    // tab titles
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipe);
        viewPager = findViewById(R.id.mypager);
        pagerAdapter = new MyPagerAdapter(this);
        viewPager.setAdapter(pagerAdapter);
//inflating tab layout
        TabLayout tabLayout =( TabLayout) findViewById(R.id.tab_layout);
//displaying tabs
        new TabLayoutMediator(tabLayout, viewPager,(tab, position) -> tab.setText(titles[position])).attach();

    }

    private class MyPagerAdapter extends FragmentStateAdapter {

        public MyPagerAdapter(FragmentActivity fa) {
            super(fa);
        }


        @Override
        public Fragment createFragment(int pos) {
            switch (pos) {
                case 0: {
                    return MexicanFragment.newInstance("");
                }
                case 1: {

                    return DesiFragment.newInstance("");
                }
                case 2: {
                    return ItalianFragment.newInstance("");
                }
                default:
                    return MexicanFragment.newInstance("");
            }
        }

        @Override
        public int getItemCount() {
            return NUM_PAGES;
        }
    }


    @Override
    public void onBackPressed() {
        if (viewPager.getCurrentItem() == 0) {
// If the user is currently looking at the first step, allow the system to handle the
            // Back button. This calls finish() on this activity and pops the back stack.d
            super.onBackPressed();
        } else {
// Otherwise, select the previous step.
            viewPager.setCurrentItem(viewPager.getCurrentItem() - 1);
        }
    }
    public void Brecipe (View v){ startActivity(new Intent(this,kad_res.class)); }
    public void Qrecipe (View v){startActivity(new Intent(this,kad_res.class));}
    public void Crecipe (View v){ startActivity(new Intent(this,kad_res.class)); }
    public void Mrecipe (View v){ startActivity(new Intent(this,kad_res.class)); }
    public void KPrecipe (View v){ startActivity(new Intent(this,BurRes.class)); }
    public void GNrecipe (View v){ startActivity(new Intent(this,BurRes.class)); }
    public void DMrecipe (View v){ startActivity(new Intent(this,BurRes.class)); }
    public void PBrecipe (View v){ startActivity(new Intent(this,BurRes.class)); }
    public void VPrecipe (View v){ startActivity(new Intent(this,ital_res.class)); }
    public void BZrecipe (View v){ startActivity(new Intent(this,ital_res.class)); }
    public void VLrecipe (View v){ startActivity(new Intent(this,ital_res.class)); }
    public void QArecipe (View v){ startActivity(new Intent(this,ital_res.class)); }

}