package com.example.gastro.learningviewpager;

import android.app.Application;

import uk.co.chrisjenx.calligraphy.CalligraphyConfig;

/**
 * Created by gastro on 11/6/17.
 */

public class FontChrisjenk extends Application {


    @Override
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new CalligraphyConfig.Builder()
                .setDefaultFontPath("fonts/lobster_one.ttf")
                .setFontAttrId(R.attr.fontPath)
                .build()
        );
    }
}
