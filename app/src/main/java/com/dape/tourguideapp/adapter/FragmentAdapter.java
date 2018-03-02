package com.dape.tourguideapp.adapter;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.dape.tourguideapp.R;
import com.dape.tourguideapp.fragment.FoodFragment;
import com.dape.tourguideapp.fragment.FunFragment;
import com.dape.tourguideapp.fragment.ImageFragment;
import com.dape.tourguideapp.fragment.InfoFragment;
import com.dape.tourguideapp.fragment.SportFragment;

/**
 * Created by Danale on 26/02/2018.
 */

public class FragmentAdapter extends FragmentPagerAdapter {
    private Context mContext;
    public FragmentAdapter(Context context,FragmentManager fm) {
        super(fm);
        mContext = context;
    }
    @Override
    public Fragment getItem(int position) {
        if (position == 0) {
            return new InfoFragment();
        }else if (position==1){
            return new ImageFragment();
        } else if (position == 2) {
            return new FunFragment();
        } else if (position == 3) {
            return new FoodFragment();
        } else {
            return new SportFragment();
        }
    }
    @Override
    public int getCount() {
        return 5;
    }
    @Override
    public CharSequence getPageTitle(int position) {
        if (position == 0) {
            return mContext.getString(R.string.info);
        } else if (position == 1) {
            return mContext.getString(R.string.image_city);
        } else if (position == 2) {
            return mContext.getString(R.string.fun);
        } else if (position == 3) {
            return mContext.getString(R.string.food);
        } else {
            return mContext.getString(R.string.sport);
        }
    }
}
