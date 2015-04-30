package com.alessandroborelli.infiniteviewpagermultiplepages;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {


    private ViewPager mViewPager;
    private MPagerAdapter adapter;


    public void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // create the adapter that will return a fragment
        adapter = new MPagerAdapter(getSupportFragmentManager());

        // set up the ViewPager, attaching the adapter
        mViewPager = (ViewPager) findViewById(R.id.pager);
        mViewPager.setAdapter(adapter);

        // set start fragment
        mViewPager.setCurrentItem(MPagerAdapter.LOOPS_COUNT / 2, false);

        // set the number of pages that should be retained to either side of the current page
        mViewPager.setOffscreenPageLimit(6);

    }//onCreate


}//class
