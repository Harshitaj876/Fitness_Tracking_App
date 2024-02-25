package com.example.fitnessapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class ExploreActivity extends AppCompatActivity {

    LinearLayout BMRCalculator,Squats, Lunges, LegPress, SumoSquats, LegExtensions, LegCurls, CalfRaises;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_explore);

        BottomNavigationView navigationView;
        navigationView = findViewById(R.id.Bottom_navigation);
        navigationView.setSelectedItemId(R.id.nav_explore);
        navigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch(item.getItemId()){
                    case R.id.nav_home:
                        startActivity(new Intent(getApplicationContext(),HomeActivity.class));
                        break;

                    case R.id.nav_explore:
                        startActivity(new Intent(getApplicationContext(),ExploreActivity.class));
                        break;

                    case R.id.nav_analytics:
                        startActivity(new Intent(getApplicationContext(),Food_Activity.class));
                        break;

                    case R.id.nav_profile:
                        startActivity(new Intent(getApplicationContext(),ProfileActivity.class));
                        break;
                }
                return true;
            }
        });

        BMRCalculator = findViewById(R.id.bmrCalculator);
        BMRCalculator.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, BMR_Activity.class);
                startActivity(intent);
            }
        });

        Squats = findViewById(R.id.Squats);
        Lunges = findViewById(R.id.Lunges);
        LegPress = findViewById(R.id.LegPress);
        SumoSquats = findViewById(R.id.SumoSquats);
        LegExtensions = findViewById(R.id.LegExtensions);
        LegCurls = findViewById(R.id.LegCurls);
        CalfRaises = findViewById(R.id.CalfRaises);

        Squats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, Squats.class);
                startActivity(intent);
            }
        });

        Lunges.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, Lunges.class);
                startActivity(intent);
            }
        });

        LegPress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, LegPress.class);
                startActivity(intent);
            }
        });

        SumoSquats.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, SumoSquats.class);
                startActivity(intent);
            }
        });

        LegExtensions.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, LegExtensions.class);
                startActivity(intent);
            }
        });

        LegCurls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, LegCurls.class);
                startActivity(intent);
            }
        });

        CalfRaises.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ExploreActivity.this, CalfRaises.class);
                startActivity(intent);
            }
        });

    }
}