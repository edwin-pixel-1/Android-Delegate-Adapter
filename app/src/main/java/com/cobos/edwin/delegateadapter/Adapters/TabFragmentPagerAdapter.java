package com.cobos.edwin.delegateadapter.Adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.cobos.edwin.delegateadapter.PageFragment;

/**
 * Created by Edwin-Cobos on 5/14/2017.
 */

public class TabFragmentPagerAdapter extends FragmentPagerAdapter {

    private String tabTitles[] = new String[] { "Tab1", "Tab2", "Tab3" };

    public TabFragmentPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        return PageFragment.newInstance(position + 1);
    }

    @Override
    public int getCount() {
        return tabTitles.length;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitles[position];
    }
}
