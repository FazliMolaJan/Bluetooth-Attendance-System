package com.example.ck.minorlayout;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    Button register,attandance;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        setTheme(R.style.MinorTheme);
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        register = (Button)findViewById(R.id.sub1);
        attandance = (Button)findViewById(R.id.attandance);
        Intent intent = getIntent();
        final String email = intent.getStringExtra("email");
        final String teacher = intent.getStringExtra("teacher");
        final String branch = intent.getStringExtra("branch");
        final String subjects = intent.getStringExtra("subjects");

        register.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, register4.class);
                myIntent.putExtra("email", email);
                myIntent.putExtra("teacher", teacher);
                myIntent.putExtra("branch", branch);
                myIntent.putExtra("subjects", subjects);
                startActivity(myIntent);

            }
        });
        attandance.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent myIntent = new Intent(MainActivity.this, attandance4.class);
                myIntent.putExtra("email", email);
                myIntent.putExtra("teacher", teacher);
                myIntent.putExtra("branch", branch);
                myIntent.putExtra("subjects", subjects);
                startActivity(myIntent);
            }
        });

        getSupportActionBar().setDisplayShowHomeEnabled(true);
        getSupportActionBar().setLogo(R.drawable.ic_launcher);
        getSupportActionBar().setDisplayUseLogoEnabled(true);

    }
    public void onBackPressed() {
        moveTaskToBack(true);

    }
}
