package com.example.gastro.bundabertanya;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class DuaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dua);

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
    }
    @Override
    public void onBackPressed(){
        super.onBackPressed();
        this.finish();
    }
    @Override
    public boolean onSupportNavigateUp(){
        onBackPressed();
        return true;
    }

}
