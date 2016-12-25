package com.aces.codevad;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TabHost;

public class TabActivity extends android.app.TabActivity {

    TabHost tabHost;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tab);

        // Get TabHost Refference
        tabHost = (TabHost) findViewById(android.R.id.tabhost);

        tabHost.getTabWidget().setStripEnabled(false);

        final TabHost.TabSpec tabSpec0 = tabHost.newTabSpec("Tab 0").setIndicator("", getResources().getDrawable(android.R.drawable.ic_media_previous)).setContent(new Intent(this, JobSeekerActivity.class));
        final TabHost.TabSpec tabSpec1 = tabHost.newTabSpec("Tab 1").setIndicator("", getResources().getDrawable(android.R.drawable.ic_media_play)).setContent(new Intent(this, SplashActivity.class));
        final TabHost.TabSpec tabSpec2 = tabHost.newTabSpec("Tab 2").setIndicator("", getResources().getDrawable(android.R.drawable.ic_media_pause)).setContent(new Intent(this, JobSeekerActivity.class));
        final TabHost.TabSpec tabSpec3 = tabHost.newTabSpec("Tab 3").setIndicator("", getResources().getDrawable(android.R.drawable.ic_media_next)).setContent(new Intent(this, SplashActivity.class));

        //Tab 1
        tabHost.addTab(tabSpec0);
        //Tab 2
        tabHost.addTab(tabSpec1);
        //Tab 3
        tabHost.addTab(tabSpec2);
        //Tab 3
        tabHost.addTab(tabSpec3);

        tabHost.setCurrentTab(0);

/*        for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
            tabHost.getTabWidget().getChildAt(i).setBackgroundResource(android.R.drawable.star_big_off); //unselected
        }
        tabHost.getCurrentTabView().setBackgroundResource(android.R.drawable.star_big_on);

        tabHost.setOnTabChangedListener(new TabHost.OnTabChangeListener() {
            @Override
            public void onTabChanged(String tabId) {

                for (int i = 0; i < tabHost.getTabWidget().getChildCount(); i++) {
                    tabHost.getTabWidget().getChildAt(i).setBackgroundResource(android.R.drawable.star_big_off); //unselected
                }

                tabHost.getCurrentTabView().setBackgroundResource(android.R.drawable.star_big_on);

            }
        });*/

    }
}
