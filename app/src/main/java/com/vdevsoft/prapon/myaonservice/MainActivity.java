package com.vdevsoft.prapon.myaonservice;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.vdevsoft.prapon.myaonservice.fragment.MainFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//  add fragment to activity
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.contentFragmentMain,new MainFragment()).commit();

        }
    } // Main method

} // main class
