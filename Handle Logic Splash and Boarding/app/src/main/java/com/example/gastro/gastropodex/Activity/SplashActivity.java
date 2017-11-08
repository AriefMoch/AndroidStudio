package com.example.gastro.gastropodex.Activity;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.gastro.gastropodex.PrefManager.SharedPref;
import com.example.gastro.gastropodex.R;

import java.util.Timer;
import java.util.TimerTask;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        final SharedPref sharedPref = new SharedPref(this);

        new Timer().schedule(new TimerTask() {
            @Override
            public void run() {
                if (sharedPref.isFirstOpen())
                {startActivity(new Intent(SplashActivity.this, BoardingActivity.class));
                    finish();}
                else if (!sharedPref.isDataSaved())
                {startActivity(new Intent(SplashActivity.this, LoginActivity.class));
                    finish();}
                else
                {startActivity(new Intent(SplashActivity.this, RegisterActivity.class));
                    finish();}
            }
        }, 1500);
    }
}
