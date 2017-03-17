package com.example.admin.fragmenttab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by admin on 12/27/2016.
 */
public class PagerAdapter extends FragmentStatePagerAdapter {
    ArrayList<Fragment>fragments=new ArrayList<>();
    ArrayList<String> tabTitels=new ArrayList<>();

    public void addFragments(Fragment fragment,String titels){
        this.fragments.add(fragment);
        this.tabTitels.add(titels);

    }
    public PagerAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return tabTitels.get(position);
    }
}
