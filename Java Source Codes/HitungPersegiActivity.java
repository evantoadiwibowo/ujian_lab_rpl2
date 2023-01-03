package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunDatar.Persegi;

public class HitungPersegiActivity extends AppCompatActivity {

    EditText edtSisi;
    TextView txtHasil;
    Double sisi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi);
        initial();

    }

    private void initial() {

        edtSisi = (EditText) findViewById(R.id.edt_sisi_persegi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_persegi);
        getSupportActionBar().setTitle("Persegi (Square)");

    }

    public void hitung_luas(View view) {

        sisi = Double.parseDouble(edtSisi.getText().toString());
        Persegi persegi = new Persegi(sisi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + persegi.hitung_luas()));

    }

    public void hitung_keliling(View view) {

        sisi = Double.parseDouble(edtSisi.getText().toString());
        Persegi persegi = new Persegi(sisi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + persegi.hitung_keliling()));

    }
}