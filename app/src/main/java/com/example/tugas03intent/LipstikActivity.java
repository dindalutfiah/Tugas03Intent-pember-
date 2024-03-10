package com.example.tugas03intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class LipstikActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lipstik);

        ImageView ivLipstik1 = findViewById(R.id.ivlipstik1);
        ImageView ivLipstik2 = findViewById(R.id.ivlipstik2);
        ImageView ivLipstik3 = findViewById(R.id.ivlipstik3);
        ImageView ivLipstik4 = findViewById(R.id.ivlipstik4);
        ImageView ivLipstik5 = findViewById(R.id.ivlipstik5);
        Button btnDeskripsiLipstik1 = findViewById(R.id.btndeskripsilipstik1);
        Button btnDeskripsiLipstik2 = findViewById(R.id.btndeskripsilipstik2);
        Button btnDeskripsiLipstik3 = findViewById(R.id.btndeskripsilipstik3);
        Button btnDeskripsiLipstik4 = findViewById(R.id.btndeskripsilipstik4);
        Button btnDeskripsiLipstik5 = findViewById(R.id.btndeskripsilipstik5);

        ivLipstik1.setOnClickListener(this);
        ivLipstik2.setOnClickListener(this);
        ivLipstik3.setOnClickListener(this);
        ivLipstik4.setOnClickListener(this);
        ivLipstik5.setOnClickListener(this);
        btnDeskripsiLipstik1.setOnClickListener(this);
        btnDeskripsiLipstik2.setOnClickListener(this);
        btnDeskripsiLipstik3.setOnClickListener(this);
        btnDeskripsiLipstik4.setOnClickListener(this);
        btnDeskripsiLipstik5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btndeskripsilipstik1 || v.getId() == R.id.ivlipstik1) {
            Detail lipstik1 = new Detail();
            lipstik1.setName("SAUCY");
            lipstik1.setPrice("Rp. 96.416,00");
            lipstik1.setColor("Color : 65 SAUCY");
            lipstik1.setMadeIn("Made In Amerika");
            lipstik1.setGambar("lipstik1");

            Intent intent = new Intent(LipstikActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, lipstik1);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsilipstik2 || v.getId() == R.id.ivlipstik2) {
            Detail lipstik2 = new Detail();
            lipstik2.setName("WITTY");
            lipstik2.setPrice("Rp. 96.416,00");
            lipstik2.setColor("Color : 40 WITTY");
            lipstik2.setMadeIn("Made In Amerika");
            lipstik2.setGambar("lipstik2");

            Intent intent = new Intent(LipstikActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, lipstik2);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsilipstik3 || v.getId() == R.id.ivlipstik3) {
            Detail lipstik3 = new Detail();
            lipstik3.setName("PEACHY");
            lipstik3.setPrice("Rp. Rp. 96.416,00");
            lipstik3.setColor("Color : 40 PEACHY");
            lipstik3.setMadeIn("Made In Amerika");
            lipstik3.setGambar("lipstik3");

            Intent intent = new Intent(LipstikActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, lipstik3);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsilipstik4 || v.getId() == R.id.ivlipstik4) {
            Detail lipstik4 = new Detail();
            lipstik4.setName("UNRIVALED");
            lipstik4.setPrice("Rp. Rp. 96.416,00");
            lipstik4.setColor("Color : 30 UNRIVALED");
            lipstik4.setMadeIn("Made In Amerika");
            lipstik4.setGambar("lipstik4");

            Intent intent = new Intent(LipstikActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, lipstik4);
            startActivity(intent);
        }
        if (v.getId() == R.id.btndeskripsilipstik5 || v.getId() == R.id.ivlipstik5) {
            Detail lipstik5 = new Detail();
            lipstik5.setName("MISCHIEVOUS");
            lipstik5.setPrice("Rp. Rp. 96.416,00");
            lipstik5.setColor("Color : 60 MISCHIEVOUS");
            lipstik5.setMadeIn("Made In Amerika");
            lipstik5.setGambar("lipstik5");

            Intent intent = new Intent(LipstikActivity.this, ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, lipstik5);
            startActivity(intent);
        }
    }
}