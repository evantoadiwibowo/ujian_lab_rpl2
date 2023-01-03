package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.Tabung;

public class HitungTabungActivity extends AppCompatActivity {

    EditText edtJariJari, edtTinggi;
    TextView txtHasil;
    Double jari, tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_tabung);
        initial();

    }

    private void initial() {

        edtJariJari = (EditText) findViewById(R.id.edt_jari_tabung);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi_tabung);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_tabung);
        getSupportActionBar().setTitle("Tabung (Cylinder)");

    }

    public void hitung_luas(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        tinggi = Double.parseDouble(edtTinggi.getText().toString());
        Tabung tabung = new Tabung(jari, tinggi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + tabung.hitung_luas()));

    }

    public void hitung_volume(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        tinggi = Double.parseDouble(edtTinggi.getText().toString());
        Tabung tabung = new Tabung(jari, tinggi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nVolume:\n" + tabung.hitung_volume()));

    }
}