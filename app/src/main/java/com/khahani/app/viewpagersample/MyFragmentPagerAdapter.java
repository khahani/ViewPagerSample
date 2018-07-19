package com.khahani.app.viewpagersample;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by dev on 7/19/2018.
 */

public class MyFragmentPagerAdapter extends FragmentPagerAdapter {

    private Context mContext;

    public MyFragmentPagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        mContext = context;
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new FirstFragment();
            case 1:
                return new SecondFragment();
        }
        return null;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return mContext.getResources().getString(R.string.first);
            case 1:
                return mContext.getResources().getString(R.string.second);
        }
        return null;
    }

    @Override
    public int getCount() {
        return 2;
    }
}
