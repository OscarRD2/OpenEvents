package com.androidpprog2.openevents;


import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import android.os.Bundle;


import com.androidpprog2.openevents.fragments.FragmentAmigos;
import com.google.android.material.bottomnavigation.BottomNavigationView;


public class Menu extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);

        BottomNavigationView navView = findViewById(R.id.bottomNavigationView);

        openFragment(FragmentAmigos.newInstance("",""));

        navView.setOnNavigationItemSelectedListener(item -> {
            switch (item.getItemId()) {
                case R.id.nav_favoritos:
                    //openFragment(FragmentFavorites.fragment());
                    return true;
                case R.id.nav_calendario:
                    //openFragment(FragmentCalendar.fragment());
                    return true;
                case R.id.nav_music:
                    //openFragment(FragmentMusic.fragment());
                    return true;
                case R.id.nav_amigos:
                    openFragment(FragmentAmigos.newInstance("", ""));
                    return true;
            }
            return false;
        });

    }


    public void openFragment(Fragment fragment) {
        FragmentTransaction transaction = getSupportFragmentManager().beginTransaction();
        transaction.replace(R.id.flContainerView, fragment);
        transaction.addToBackStack(null);
        transaction.commit();
    }



}
