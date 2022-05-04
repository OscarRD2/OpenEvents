package com.androidpprog2.openevents.fragments;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import com.androidpprog2.openevents.R;


public class FragmentCalendar extends AppCompatActivity {


    public static Fragment fragment() {
        return fragment();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_calendar);
        getSupportActionBar().hide();

    }



}