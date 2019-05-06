package com.example.medicines;


import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;
import java.util.List;

public class PageAdapter extends FragmentStatePagerAdapter {
    private final List<Fragment> isFragment =new ArrayList<>();
    private final List<String> isTitle=new ArrayList<>();
    int tabs;
    public PageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int i) {
        return isFragment.get(i);
    }

    @Override
    public int getCount() {

        return isTitle.size();
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return isTitle.get(position);
    }
    public void addFragment(Fragment fm,String title)
    {
        isFragment.add(fm);
        isTitle.add(title);
    }
}


