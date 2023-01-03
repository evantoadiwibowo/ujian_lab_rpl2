package com.ssm.evantoadiwibowo;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import androidx.appcompat.app.AppCompatActivity;

public class PilihBangunRuangActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pilih_bangun_ruang);

    }

    public void tabung(View view) {

        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungTabungActivity.class);
        startActivity(intent);

    }

    public void kerucut(View view) {

        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungKerucutActivity.class);
        startActivity(intent);

    }

    public void balok(View view) {

        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungBalokActivity.class);
        startActivity(intent);

    }

    public void bola(View view) {
        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungBolaActivity.class);
        startActivity(intent);
    }

    public void kubus(View view) {

        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungKubusActivity.class);
        startActivity(intent);

    }

    public void limasSegiEmpat(View view) {

        Intent intent = new Intent(PilihBangunRuangActivity.this, HitungLimasSegiEmpatActivity.class);
        startActivity(intent);

    }
}