package com.example.serena.activity1;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    Button mLogin;
    Button mOspite;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mLogin = (Button) findViewById(R.id.btnLogin);
        mOspite = (Button) findViewById(R.id.btnOspite);

        mOspite.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                method(v);


            }

            public void method(View view) {
                Intent intent = new Intent(getBaseContext(), Main3Activity.class);
                startActivity(intent);
            }
        });
        mLogin.setOnClickListener(new View.OnClickListener() {

            public void onClick(View v) {
                method(v);


            }

            public void method(View view) {
                Intent intent = new Intent(getBaseContext(), LoginActivity.class);
                startActivity(intent);
            }


        });


    }}