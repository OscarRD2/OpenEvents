package com.androidpprog2.openevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView singUp;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();


        singUp = (TextView) findViewById(R.id.SingUp);
        singUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
//SingUpActivity
                Intent i = new Intent(MainActivity.this, SingUpActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }
        });
    }
    }
