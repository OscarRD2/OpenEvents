package com.androidpprog2.openevents;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;


import com.androidpprog2.openevents.fragments.FragmentCalendar;
import com.androidpprog2.openevents.fragments.FragmentFavorites;
import com.androidpprog2.openevents.fragments.FragmentFriends;
import com.androidpprog2.openevents.fragments.FragmentMusic;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;


public class Menu extends AppCompatActivity {
    private ArrayList<Fragment> fragments = new ArrayList<Fragment>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        createFragmentsList();

        FragmentManager manager = getSupportFragmentManager();
        manager.beginTransaction().add(R.id.flContainerView , new FragmentFriends()).commit();


        navView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_favoritos:
                    manager.beginTransaction().replace(R.id.flContainerView,fragments.get(0)).commit();
                    return true;
                case R.id.nav_calendario:
                    manager.beginTransaction().replace(R.id.flContainerView,fragments.get(1)).commit();
                    return true;
                case R.id.nav_music:
                    manager.beginTransaction().replace(R.id.flContainerView,fragments.get(2)).commit();
                    return true;
                case R.id.nav_amigos:
                    manager.beginTransaction().replace(R.id.flContainerView,fragments.get(3)).commit();

                    return true;
            }
            return false;
        });

    }

    private void createFragmentsList() {
        fragments.add(new FragmentFriends());
        fragments.add(new FragmentCalendar());
        fragments.add(new FragmentMusic());
        fragments.add(new FragmentFavorites());


    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainerView, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }



}
