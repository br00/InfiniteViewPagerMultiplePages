package com.alessandroborelli.infiniteviewpagermultiplepages;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by alessandroborelli on 30/04/15.
 */
public class MPagerAdapter extends FragmentPagerAdapter {


    public static int ITEM_MAX_NUM = 10;
    public static int LOOPS_COUNT = 1000;


    public MPagerAdapter(FragmentManager fm) {

        super(fm);

    }//MPagerAdapter


    @Override
    public Fragment getItem(int i) {

        // set fragment position using circular sum
        int position = i % ITEM_MAX_NUM;

        // return new ParagraphFragment with current position setted as title
        Fragment fragment = new ParagraphFragment();
        Bundle args = new Bundle();
        args.putInt(ParagraphFragment.ARG_SECTION_NUMBER, position);
        fragment.setArguments(args);
        return fragment;

    }//getItem


    @Override
    public float getPageWidth(int position) {

        return super.getPageWidth(position);

    }//getPageWidth


    @Override
    public int getCount(){

        return ITEM_MAX_NUM*LOOPS_COUNT;

    }//getCount


}//class
