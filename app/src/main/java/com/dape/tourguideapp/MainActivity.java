package com.dape.tourguideapp;

import android.os.Bundle;
import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;

import com.dape.tourguideapp.adapter.FragmentAdapter;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();
    }
    public void init(){
        ViewPager viewPager = (ViewPager) findViewById(R.id.viewPager);
        FragmentAdapter Fragmentadapter =
                new FragmentAdapter(this, getSupportFragmentManager());
        viewPager.setAdapter(Fragmentadapter);
        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabLayout);
        tabLayout.setupWithViewPager(viewPager);
    }
}
