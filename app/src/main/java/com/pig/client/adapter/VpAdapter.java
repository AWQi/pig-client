package com.pig.client.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

public class VpAdapter extends FragmentPagerAdapter {
    private List<Fragment> fragmentList;
    public VpAdapter(FragmentManager fm) {
        super(fm);

    }

    public VpAdapter(FragmentManager fm, List<Fragment> fragmentList) {
        super(fm);
        this.fragmentList = fragmentList;
    }

    @Override
    public Fragment getItem(int i) {
        Fragment fragment = fragmentList.get(i);
        return fragment;
    }

    @Override
    public int getCount() {
        return fragmentList.size();
    }
}
