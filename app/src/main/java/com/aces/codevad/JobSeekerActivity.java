package com.aces.codevad;

import android.support.design.widget.TabLayout;
import android.support.v4.view.ViewPager;
import android.support.v7.app.ActionBar;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.aces.codevad.Adapters.ImagePagerAdapter;
import com.aces.codevad.Adapters.ViewPagerAdapter;
import com.aces.codevad.Fragments.BioFragment;
import com.aces.codevad.Fragments.ExperienceFragment;
import com.aces.codevad.Fragments.ExpertiseFragment;

import me.relex.circleindicator.CircleIndicator;

public class JobSeekerActivity extends AppCompatActivity {

    TabLayout tabLayout_jobSeeker;
    ViewPager viewPager_jobSeeker, imagePager;
    ViewPagerAdapter viewPagerAdapter;
    Toolbar toolbar;

    int[] imageResources = {
            R.drawable.pics_art,
            R.drawable.pics_art,
            R.drawable.pics_art,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_job_seeker);

        toolbar = (Toolbar) findViewById(R.id.jobSeeker_toolbar);
        setSupportActionBar(toolbar);
        ActionBar actionBar = getSupportActionBar();
        actionBar.setDisplayHomeAsUpEnabled(true);
        actionBar.setDisplayShowTitleEnabled(true);
        actionBar.setDisplayUseLogoEnabled(false);
        actionBar.setDisplayShowCustomEnabled(false);
        actionBar.setDisplayShowHomeEnabled(false);
        actionBar.setTitle(getString(R.string.appUserName));

        ImagePagerAdapter imagePagerAdapter = new ImagePagerAdapter(this, imageResources);

        tabLayout_jobSeeker = (TabLayout) findViewById(R.id.jobSeeker_tabLayout);
        viewPager_jobSeeker = (ViewPager) findViewById(R.id.jobSeeker_viewPager);
        imagePager = (ViewPager) findViewById(R.id.imagePager_job_seeker);

        imagePager.setAdapter(imagePagerAdapter);

        CircleIndicator indicator = (CircleIndicator) findViewById(R.id.indicators);
        indicator.setViewPager(imagePager);


        viewPagerAdapter = new ViewPagerAdapter(getSupportFragmentManager());

        viewPagerAdapter.addFragments(new BioFragment(), getString(R.string.bio_fragment));
        viewPagerAdapter.addFragments(new BioFragment(), getString(R.string.expertise_fragment));
        viewPagerAdapter.addFragments(new BioFragment(), getString(R.string.experience_fragment));

        viewPager_jobSeeker.setAdapter(viewPagerAdapter);
        tabLayout_jobSeeker.setupWithViewPager(viewPager_jobSeeker);

    }
}
