package com.example.tugas03intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ImageView ivLipstik = findViewById(R.id.ivbacklipstik);
        ImageView ivBedak = findViewById(R.id.ivbackbedak);
        ImageView ivSunscreen = findViewById(R.id.ivbacksunscreen);
        Button btnMoveLipstik = findViewById(R.id.btnbacklipstik);
        Button btnMoveBedak = findViewById(R.id.btnbackbedak);
        Button btnMoveSunscreen = findViewById(R.id.btnbacksunscreen);

        ivLipstik.setOnClickListener(this);
        ivBedak.setOnClickListener(this);
        ivSunscreen.setOnClickListener(this);
        btnMoveLipstik.setOnClickListener(this);
        btnMoveBedak.setOnClickListener(this);
        btnMoveSunscreen.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btnbacklipstik || v.getId() == R.id.ivbacklipstik) {
            Intent intentLipstik = new Intent(this, LipstikActivity.class);
            startActivity(intentLipstik);
        }
        if(v.getId() == R.id.btnbackbedak || v.getId() == R.id.ivbackbedak) {
            Intent intentBedak = new Intent(this, BedakActivity.class);
            startActivity(intentBedak);
        }
        if(v.getId() == R.id.btnbacksunscreen || v.getId() == R.id.ivbacksunscreen) {
            Intent intentSunscreen = new Intent(this, SunscreenActivity.class);
            startActivity(intentSunscreen);
        }
    }
}