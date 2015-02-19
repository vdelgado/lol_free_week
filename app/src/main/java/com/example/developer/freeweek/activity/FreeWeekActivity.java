package com.example.developer.freeweek.activity;

import android.support.v7.app.ActionBarActivity;
import android.support.v7.app.ActionBar;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.os.Build;

import com.example.developer.freeweek.R;
import com.example.developer.freeweek.fragment.FreeWeekFragment;


public class FreeWeekActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_free_week);
        if (savedInstanceState == null) {
            FreeWeekFragment fragment = new FreeWeekFragment();
            getSupportFragmentManager().beginTransaction().add(R.id.container,fragment).commit();
        }
    }
}
