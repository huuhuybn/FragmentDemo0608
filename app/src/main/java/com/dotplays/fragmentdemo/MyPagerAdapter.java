package com.dotplays.fragmentdemo;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class MyPagerAdapter extends FragmentStatePagerAdapter {
    // phuong thuc khoi tao
    public MyPagerAdapter(FragmentManager fm) {
        super(fm);
    }

    // phuong thuc dinh nghia 1 trang tren viewpager
    @Override
    public Fragment getItem(int position) {

        Bundle bundle = new Bundle();
        bundle.putInt("data",position);

        MyFragment myFragment = new MyFragment();

        myFragment.setArguments(bundle);

        return myFragment;
    }


    // khoi tao tieu de cho moi trang tren viewpager
    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        return "My Super Tab " + position;
    }

    // tong so trang tren viewpager
    @Override
    public int getCount() {
        return 5;
    }
}
