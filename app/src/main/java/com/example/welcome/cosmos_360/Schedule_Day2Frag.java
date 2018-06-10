package com.example.welcome.cosmos_360;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class Schedule_Day2Frag extends Fragment {

    public static final String PAGE_TITLE = "Tab2";
    public Schedule_Day2Frag() {
        // Required empty public constructor
    }

    public static Schedule_Day2Frag newInstance(){
        Schedule_Day2Frag fragment = new Schedule_Day2Frag();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_schedule__day2, container, false);
    }

}
