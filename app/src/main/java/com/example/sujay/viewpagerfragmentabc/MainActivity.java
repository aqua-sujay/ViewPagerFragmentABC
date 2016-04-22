package com.example.sujay.viewpagerfragmentabc;

import android.app.FragmentManager;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewPager vp=(ViewPager)findViewById(R.id.viewpager);
        vp.setAdapter(new fragAdapter(getSupportFragmentManager()));
    }
    class fragAdapter extends FragmentStatePagerAdapter{
        public fragAdapter(android.support.v4.app.FragmentManager fm)
        {
            super(fm);
        }
public int getCount()
{
    return 3;
}
        public Fragment getItem(int position)
        {
            Fragment fragment=null;
            switch(position)
            {
                case 0:fragment=new FragmentA();break;
                case 1:fragment=new FragmentB();break;
                case 2:fragment=new FragmentC();break;
            }
            return fragment;
        }
        public CharSequence getPageTitle(int position)
        {
            String title=null;
            switch(position)
            {
                case 0:title="fragment A";break;
                case 1:title="fragment B";break;
                case 2:title="fragment C";break;
            }
            return title;
        }
    }
}

