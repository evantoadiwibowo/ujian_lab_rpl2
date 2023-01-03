package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.Kubus;

public class HitungKubusActivity extends AppCompatActivity {

    EditText edtRusuk;
    TextView txtHasil;
    Double rusuk;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kubus);
        initial();

    }

    private void initial() {

        edtRusuk = (EditText) findViewById(R.id.edt_rusuk);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        getSupportActionBar().setTitle("Kubus (Cube)");

    }

    public void hitung_luas(View view) {

        rusuk = Double.parseDouble(edtRusuk.getText().toString());
        Kubus kubus = new Kubus(rusuk);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + kubus.hitung_luas()));

    }

    public void hitung_keliling(View view) {

        rusuk = Double.parseDouble(edtRusuk.getText().toString());
        Kubus kubus = new Kubus(rusuk);
        txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + kubus.hitung_keliling()));

    }

    public void hitung_volume(View view) {

        rusuk = Double.parseDouble(edtRusuk.getText().toString());
        Kubus kubus = new Kubus(rusuk);
        txtHasil.setText(String.valueOf("Hasil (Result)\nVolume:\n" + kubus.hitung_volume()));

    }
}