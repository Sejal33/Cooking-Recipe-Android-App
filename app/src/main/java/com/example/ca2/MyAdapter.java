package com.example.ca2;
import android.content.Context;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

class MyAdapter extends FragmentPagerAdapter {
    Context context;
    int totalTabs;
    public MyAdapter(Context c, FragmentManager fm) {
        super(fm);
        context = c;
    }
    @Override
    public Fragment getItem(int position) {
        switch (position) {
            case 0:
                footBall footballFragment = new footBall();
                return footballFragment;
            case 1:
                cricket cricketFragment = new cricket();
                return cricketFragment;
            case 2:
                nba nbaFragment = new nba();
                return nbaFragment;
            default:
                return null;
        }
    }
    @Override
    public int getCount() {
        return totalTabs;
    }
}