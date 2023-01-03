package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.Balok;

public class HitungBalokActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar, edtTinggi;
    TextView txtHasil;
    Double panjang, lebar, tinggi;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_balok);
        initial();

    }

    private void initial() {

        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        edtTinggi = (EditText) findViewById(R.id.edt_tinggi);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        getSupportActionBar().setTitle("Balok (Cuboid)");

    }

    public void hitung_luas(View view) {

        panjang = Double.parseDouble(edtPanjang.getText().toString());
        lebar = Double.parseDouble(edtLebar.getText().toString());
        tinggi = Double.parseDouble(edtTinggi.getText().toString());
        Balok balok = new Balok(panjang, lebar, tinggi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + balok.hitung_luas()));

    }

    public void hitung_keliling(View view) {

            panjang = Double.parseDouble(edtPanjang.getText().toString());
            lebar = Double.parseDouble(edtLebar.getText().toString());
            tinggi = Double.parseDouble(edtTinggi.getText().toString());
            Balok balok = new Balok(panjang, lebar, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + balok.hitung_keliling()));

    }

    public void hitung_volume(View view) {

        panjang = Double.parseDouble(edtPanjang.getText().toString());
        lebar = Double.parseDouble(edtLebar.getText().toString());
        tinggi = Double.parseDouble(edtTinggi.getText().toString());
        Balok balok = new Balok(panjang, lebar, tinggi);
        txtHasil.setText(String.valueOf("Hasil (Result)\nVolume:\n" + balok.hitung_volume()));

    }
}