package com.example.tugas03intent;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class SunscreenActivity extends AppCompatActivity implements View.OnClickListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sunscreen);

        ImageView ivSunscreen1 = findViewById(R.id.ivsunscreen1);
        ImageView ivSunscreen2 = findViewById(R.id.ivsunscreen2);
        ImageView ivSunscreen3 = findViewById(R.id.ivsunscreen3);
        ImageView ivSunscreen4 = findViewById(R.id.ivsunscreen4);
        ImageView ivSunscreen5 = findViewById(R.id.ivsunscreen5);
        Button btnDeskripsiSunscreen1 = findViewById(R.id.btndeskripsisunscreen1);
        Button btnDeskripsiSunscreen2 = findViewById(R.id.btndeskripsisunscreen2);
        Button btnDeskripsiSunscreen3 = findViewById(R.id.btndeskripsisunscreen3);
        Button btnDeskripsiSunscreen4 = findViewById(R.id.btndeskripsisunscreen4);
        Button btnDeskripsiSunscreen5 = findViewById(R.id.btndeskripsisunscreen5);

        ivSunscreen1.setOnClickListener(this);
        ivSunscreen2.setOnClickListener(this);
        ivSunscreen3.setOnClickListener(this);
        ivSunscreen4.setOnClickListener(this);
        ivSunscreen5.setOnClickListener(this);
        btnDeskripsiSunscreen1.setOnClickListener(this);
        btnDeskripsiSunscreen2.setOnClickListener(this);
        btnDeskripsiSunscreen3.setOnClickListener(this);
        btnDeskripsiSunscreen4.setOnClickListener(this);
        btnDeskripsiSunscreen5.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if(v.getId() == R.id.btndeskripsisunscreen1 || v.getId() == R.id.ivsunscreen1) {
            Detail sunscreen1 = new Detail();
            sunscreen1.setName("LIGHT BISQUE");
            sunscreen1.setPrice("Rp. 71.500,00");
            sunscreen1.setColor("Color : 118 LIGHT BISQUE");
            sunscreen1.setMadeIn("Made In Amerika");
            sunscreen1.setGambar("sunscreen1");

            Intent intent = new Intent(SunscreenActivity.this,ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sunscreen1);
            startActivity(intent);
        }
        if(v.getId() == R.id.btndeskripsisunscreen2 || v.getId() == R.id.ivsunscreen2) {
            Detail sunscreen2 = new Detail();
            sunscreen2.setName("GOLDEN NATURAL");
            sunscreen2.setPrice("Rp. 71.500,00");
            sunscreen2.setColor("Color : 190 GOLDEN NATURAL");
            sunscreen2.setMadeIn("Made In Amerika");
            sunscreen2.setGambar("sunscreen2");

            Intent intent = new Intent(SunscreenActivity.this,ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sunscreen2);
            startActivity(intent);
        }
        if(v.getId() == R.id.btndeskripsisunscreen3 || v.getId() == R.id.ivsunscreen3) {
            Detail sunscreen3 = new Detail();
            sunscreen3.setName("CLASSIC IVORY");
            sunscreen3.setPrice("Rp. 71.500,00");
            sunscreen3.setColor("Color : 115 CLASSIC IVORY");
            sunscreen3.setMadeIn("Made In Amerika");
            sunscreen3.setGambar("sunscreen3");

            Intent intent = new Intent(SunscreenActivity.this,ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sunscreen3);
            startActivity(intent);
        }
        if(v.getId() == R.id.btndeskripsisunscreen4 || v.getId() == R.id.ivsunscreen4) {
            Detail sunscreen4 = new Detail();
            sunscreen4.setName("SOFT TAN");
            sunscreen4.setPrice("Rp. 71.500,00");
            sunscreen4.setColor("Color : 326 SOFT TAN");
            sunscreen4.setMadeIn("Made In Amerika");
            sunscreen4.setGambar("sunscreen4");

            Intent intent = new Intent(SunscreenActivity.this,ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sunscreen4);
            startActivity(intent);
        }
        if(v.getId() == R.id.btndeskripsisunscreen5 || v.getId() == R.id.ivsunscreen5) {
            Detail sunscreen5 = new Detail();
            sunscreen5.setName("NATURAL BEIGE");
            sunscreen5.setPrice("Rp. 71.500,00");
            sunscreen5.setColor("Color : 220 NATURAL BEIGE");
            sunscreen5.setMadeIn("Made In Amerika");
            sunscreen5.setGambar("sunscreen5");

            Intent intent = new Intent(SunscreenActivity.this,ActivityDetail.class);
            intent.putExtra(ActivityDetail.KEY_DATA, sunscreen5);
            startActivity(intent);
        }
    }
}