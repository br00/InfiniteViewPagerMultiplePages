package com.alessandroborelli.infiniteviewpagermultiplepages;

import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;

import java.util.Random;

/**
 * Created by alessandroborelli on 30/04/15.
 */
public class ParagraphFragment extends Fragment {


    public static final String ARG_SECTION_NUMBER = "section_number";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_paragraph, container, false);
        Bundle args = getArguments();

        // generate random color and set current position as fragment title
        Random rnd = new Random();
        int color = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
        ((LinearLayout) rootView.findViewById(R.id.backgroundLL)).setBackgroundColor(color);
        ((TextView) rootView.findViewById(R.id.textTV)).setText("Fragment number " + args.getInt(ARG_SECTION_NUMBER));
        return rootView;

    }//onCreateView
    

}//class
