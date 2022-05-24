package com.androidpprog2.openevents;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import com.androidpprog2.openevents.API.APIService;

public class MainActivity extends AppCompatActivity {

    private APIService API;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();

        Button login = findViewById(R.id.button);

        TextView singUp = (TextView) findViewById(R.id.SingUp);
        singUp.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
            //SingUpActivity
                Intent i = new Intent(MainActivity.this, SingUpActivity.class);
                i.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP);
                startActivity(i);
            }

        });

        //boton cuando le damos a login
        login.setOnClickListener(view -> {

            EditText Edemail = findViewById(R.id.editTextTextEmailAddress);
            EditText Edpassword = findViewById(R.id.editTextTextPassword);

            String email = Edemail.getText().toString();
            String password = Edpassword.getText().toString();

            if(TextUtils.isEmpty(email)) {


            }

            });



        };


    }
    }
