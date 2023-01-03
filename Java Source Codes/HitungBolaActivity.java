package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.Bola;

public class HitungBolaActivity extends AppCompatActivity {

    EditText edtJariJari;
    TextView txtHasil;
    Double jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_bola);
        initial();

    }

    private void initial() {

        edtJariJari = (EditText) findViewById(R.id.edt_jari_bola);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_bola);
        getSupportActionBar().setTitle("Bola (Sphere)");

    }

    public void hitung_luas(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        Bola bola = new Bola(jari);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + bola.hitung_luas()));

    }

    public void hitung_volume(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        Bola bola = new Bola(jari);
        txtHasil.setText(String.valueOf("Hasil (Result)\nVolume:\n" + bola.hitung_volume()));

    }
}