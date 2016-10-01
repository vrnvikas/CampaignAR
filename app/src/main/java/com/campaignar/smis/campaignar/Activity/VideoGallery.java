package com.campaignar.smis.campaignar.Activity;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.campaignar.smis.campaignar.Fragments.VideoFragment;
import com.campaignar.smis.campaignar.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class VideoGallery extends AppCompatActivity implements VideoFragment.OnFragmentInteractionListener {

    FragmentPagerItemAdapter adapter;
    ViewPager viewPager;
    SmartTabLayout viewPagerTab;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_video_gallery);
        setTitle("Gallery");


        adapter = new FragmentPagerItemAdapter(getSupportFragmentManager());

        viewPager = (ViewPager) findViewById(R.id.viewpager);
        viewPager.setAdapter(adapter);

        viewPagerTab = (SmartTabLayout) findViewById(R.id.viewpagertab);
        viewPagerTab.setDistributeEvenly(true);
        viewPagerTab.setViewPager(viewPager);


    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    private class FragmentPagerItemAdapter extends FragmentPagerAdapter {

        private String[] tabsTitles = {"Videos","Gallery"};

        public FragmentPagerItemAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabsTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            VideoFragment fragment = VideoFragment.newInstance("","");
            return fragment;
        }

        @Override
        public int getCount() {
            return 2;
        }
    }
}
