import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.example.welcome.cosmos_360.Schedule_Day1Frag;
import com.example.welcome.cosmos_360.Schedule_Day2Frag;

/**
 * Created by WELCOME on 6/9/2018.
 */

public class PagerAdapter extends FragmentStatePagerAdapter {

    int mNoOfTabs;
    public PagerAdapter(FragmentManager fm, int NoOfTabs) {
        super(fm);
        this.mNoOfTabs = NoOfTabs;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0: {
                Schedule_Day1Frag schedule_day1Frag = new Schedule_Day1Frag();
                return schedule_day1Frag;
            }
            case 1: {
                Schedule_Day2Frag schedule_day2Frag = new Schedule_Day2Frag();
                return schedule_day2Frag;
            }
            default: return null;
        }

    }

    @Override
    public int getCount() {
        return mNoOfTabs;
    }
}
