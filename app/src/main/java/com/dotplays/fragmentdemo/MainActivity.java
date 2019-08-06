package com.dotplays.fragmentdemo;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentManager;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.google.android.material.tabs.TabLayout;

public class MainActivity extends AppCompatActivity {


    private ViewPager pager;
    private TabLayout tabLayout;

    private MyPagerAdapter myPagerAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        pager = findViewById(R.id.pager);
        tabLayout = findViewById(R.id.tabs);

        // khoi tao adapter cho viewpager
        myPagerAdapter = new MyPagerAdapter(getSupportFragmentManager());

        // set adapter vao viewpager
        pager.setAdapter(myPagerAdapter);

        // tich hop tab vs viewpager
        tabLayout.setupWithViewPager(pager);



    }
}
