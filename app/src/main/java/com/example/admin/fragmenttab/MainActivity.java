package com.example.admin.fragmenttab;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

public class MainActivity extends AppCompatActivity {

  private Toolbar toolbar;
    TabLayout tablayout;
    ViewPager viewPager;
    PagerAdapter pagerAdapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        toolbar = (Toolbar) findViewById(R.id.tabBar);
        setSupportActionBar(toolbar);
        tablayout=(TabLayout)findViewById(R.id.tab_layout);
        viewPager=(ViewPager)findViewById(R.id.view_pager);
        pagerAdapter=new PagerAdapter(getSupportFragmentManager());
        pagerAdapter.addFragments(new TabOne(),"TabOne");
        pagerAdapter.addFragments(new TabTwo(),"TabTwo");
        pagerAdapter.addFragments(new TabThree(),"TabThree");
        viewPager.setAdapter(pagerAdapter);
        tablayout.setupWithViewPager(viewPager);

    }




}
