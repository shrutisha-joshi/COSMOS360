package com.robovitics.cosmos360.cosmos_360;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Schedule_Day1Frag extends Fragment {


    public Schedule_Day1Frag() {
        // Required empty public constructor
    }

    public static final String PAGE_TITLE = "Day 1";

    public static Schedule_Day1Frag newInstance() {
        Schedule_Day1Frag fragment = new Schedule_Day1Frag();
        return fragment;

    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule__day1, container, false);
    }

}
