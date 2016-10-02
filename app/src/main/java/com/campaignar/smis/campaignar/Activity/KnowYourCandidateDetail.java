package com.campaignar.smis.campaignar.Activity;

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.campaignar.smis.campaignar.Fragments.FragmentKnowYourCandidateDetail;
import com.campaignar.smis.campaignar.Fragments.FragmentYourInterestsDetail;
import com.campaignar.smis.campaignar.R;
import com.ogaclejapan.smarttablayout.SmartTabLayout;

public class KnowYourCandidateDetail extends AppCompatActivity
        implements FragmentYourInterestsDetail.OnFragmentInteractionListener{


    FragmentPagerItemAdapter adapter;
    ViewPager viewPager;
    SmartTabLayout viewPagerTab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_know_your_candidate_detail);

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

        private String[] tabsTitles = {"ABOUT","AGENDAS","OPINIONS"};

        public FragmentPagerItemAdapter(FragmentManager fm) {
            super(fm);

        }

        @Override
        public CharSequence getPageTitle(int position) {
            return tabsTitles[position];
        }

        @Override
        public Fragment getItem(int position) {
            FragmentYourInterestsDetail fragment = FragmentYourInterestsDetail.newInstance("","");
            return fragment;
        }

        @Override
        public int getCount() {
            return 3;
        }
    }


}
