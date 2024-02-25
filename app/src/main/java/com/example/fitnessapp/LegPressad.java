package com.example.fitnessapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.SystemClock;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.Chronometer;
import android.widget.ImageView;
import android.widget.TextView;

public class LegPressad extends AppCompatActivity {

    ImageView back;
    private Chronometer chronometer;
    private TextView tvCalorieBurned;
    private Button btnStart, btnStop;
    private float calorieBurned;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN, WindowManager.LayoutParams.FLAG_FULLSCREEN);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_leg_pressad);

        back = findViewById(R.id.backbtn2);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(LegPressad.this, SquatsAd.class);
                startActivity(intent);
            }
        });
        chronometer = findViewById(R.id.chronometer);
        tvCalorieBurned = findViewById(R.id.tv_calorie_burned);
        btnStart = findViewById(R.id.btn_start);
        btnStop = findViewById(R.id.btn_stop);

        btnStart.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.setBase(SystemClock.elapsedRealtime());
                chronometer.start();
                btnStart.setEnabled(false);
                btnStop.setEnabled(true);
                calorieBurned = 0;
            }
        });

        btnStop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                chronometer.stop();
                btnStart.setEnabled(true);
                btnStop.setEnabled(false);
                int time = (int) ((SystemClock.elapsedRealtime() - chronometer.getBase()) / 1000); // in seconds
                float caloriePerSecond = 0.16f; // assume burning 10 calories per minute
                calorieBurned = time * caloriePerSecond;
                tvCalorieBurned.setText("Calorie Burned: " + calorieBurned);
            }
        });
    }
}