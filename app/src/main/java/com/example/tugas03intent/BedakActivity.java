package com.example.tugas03intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class BedakActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bedak);

        ImageView ivBedak1 = findViewById(R.id.ivbedak1);
        ImageView ivBedak2 = findViewById(R.id.ivbedak2);
        ImageView ivBedak3 = findViewById(R.id.ivbedak3);
        ImageView ivBedak4 = findViewById(R.id.ivbedak4);
        ImageView ivBedak5 = findViewById(R.id.ivbedak5);
        Button btnDeskripsiBedak1 = findViewById(R.id.btndeskripsibedak1);
        Button btnDeskripsiBedak2 = findViewById(R.id.btndeskripsibedak2);
        Button btnDeskripsiBedak3 = findViewById(R.id.btndeskripsibedak3);
        Button btnDeskripsiBedak4 = findViewById(R.id.btndeskripsibedak4);
        Button btnDeskripsiBedak5 = findViewById(R.id.btndeskripsibedak5);

        ivBedak1.setOnClickListener(this);
        ivBedak2.setOnClickListener(this);
        ivBedak3.setOnClickListener(this);
        ivBedak4.setOnClickListener(this);
        ivBedak5.setOnClickListener(this);
        btnDeskripsiBedak1.setOnClickListener(this);
        btnDeskripsiBedak2.setOnClickListener(this);
        btnDeskripsiBedak3.setOnClickListener(this);
        btnDeskripsiBedak4.setOnClickListener(this);
        btnDeskripsiBedak5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btndeskripsibedak1 || v.getId() == R.id.ivbedak1) {
            Detail bedak1 = new Detail();
            bedak1.setName("Goldn Beige_Dewy");
            bedak1.setPrice("Rp. 74.800,00");
            bedak1.setColor("Color : 240 Beige");
            bedak1.setMadeIn("Made In Amerika");
            bedak1.setGambar("bedak1");

            Intent intent = new Intent(BedakActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, bedak1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibedak2 || v.getId() == R.id.ivbedak2) {
            Detail bedak2 = new Detail();
            bedak2.setName("Pure Beige_Matte");
            bedak2.setPrice("Rp. 79.700,00");
            bedak2.setColor("Color : 235 Pure Beige_Matte");
            bedak2.setMadeIn("Made In Amerika");
            bedak2.setGambar("bedak2");

            Intent intent = new Intent(BedakActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, bedak2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibedak3 || v.getId() == R.id.ivbedak3) {
            Detail bedak3 = new Detail();
            bedak3.setName("Sun Beige_Matte");
            bedak3.setPrice("Rp. 89.500,00");
            bedak3.setColor("Color : 310 Sun Beige_Matte");
            bedak3.setMadeIn("Made In Amerika");
            bedak3.setGambar("bedak3");

            Intent intent = new Intent(BedakActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, bedak3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibedak4 || v.getId() == R.id.ivbedak4) {
            Detail bedak4 = new Detail();
            bedak4.setName("Buff Beige_Matte");
            bedak4.setPrice("Rp. 89.500,00");
            bedak4.setColor("Color : 130 Buff Beige_Matte");
            bedak4.setMadeIn("Made In Amerika");
            bedak4.setGambar("bedak4");

            Intent intent = new Intent(BedakActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, bedak4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsibedak5 || v.getId() == R.id.ivbedak5) {
            Detail bedak5 = new Detail();
            bedak5.setName("Medium Buff_Dewy");
            bedak5.setPrice("Rp. 74.800,00");
            bedak5.setColor("Color : 225 Medium Buff_Dewy");
            bedak5.setMadeIn("Made In Amerika");
            bedak5.setGambar("bedak5");

            Intent intent = new Intent(BedakActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, bedak5);
            startActivity(intent);
        }
    }
}