package com.aces.codevad;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.leo.simplearcloader.ArcConfiguration;
import com.leo.simplearcloader.SimpleArcDialog;
import com.leo.simplearcloader.SimpleArcLoader;

public class SplashActivity extends AppCompatActivity {

    int color[] = {R.color.colorTheme, R.color.colorTheme};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        ArcConfiguration configuration = new ArcConfiguration(this);
        configuration.setLoaderStyle(SimpleArcLoader.STYLE.SIMPLE_ARC);
        configuration.setText("Loading..");
        configuration.setColors(color);

        SimpleArcDialog mDialog = new SimpleArcDialog(this);
        mDialog.setConfiguration(configuration);
        mDialog.show();
        // Using this configuration with Dialog
        mDialog.setConfiguration(configuration);

/*        SimpleArcLoader mSimpleArcLoader = (SimpleArcLoader) findViewById(R.id.loader);

        // Using this configuration with ArcLoader
        mSimpleArcLoader.refreshArcLoaderDrawable(configuration);*/

    }
}
