package com.example.welcome.cosmos_360;


import android.app.FragmentManager;
import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;


/**
 * A simple {@link Fragment} subclass.
 */
public class ScheduleFragment extends Fragment {

    public static final String PAGE_TITLE = "Tab1";

    ViewPager viewPager;
    ViewPagerAdapter viewPagerAdapter;

    public ScheduleFragment() {
        // Required empty public constructor
    }

    public static ScheduleFragment newInstance() {
        ScheduleFragment fragment = new ScheduleFragment();
        return fragment;
    }

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_schedule, container, false);
        View view = inflater.inflate(R.layout.fragment_schedule, container, false);


            viewPager = (ViewPager) view.findViewById(R.id.viewpager);
            viewPagerAdapter = new ViewPagerAdapter(getChildFragmentManager());
            viewPager.setAdapter(viewPagerAdapter);
            return view;
    }


    public static class ViewPagerAdapter extends FragmentStatePagerAdapter {
        private static final int NUM_ITEMS = 2;

        public ViewPagerAdapter(android.support.v4.app.FragmentManager fm) {
            super(fm);
        }

        @Override
        public int getCount() {
            return NUM_ITEMS;
        }

        @Override
        public Fragment getItem(int position) {
            if(position == 0){
                return Schedule_Day1Frag.newInstance();
            }
            else {
                return Schedule_Day2Frag.newInstance();
            }
        }

        @Override
        public CharSequence getPageTitle(int position) {

            if(position == 0){
                return Schedule_Day1Frag.PAGE_TITLE;
            }
            else {
                return Schedule_Day2Frag.PAGE_TITLE;
            }
        }
    }
}
