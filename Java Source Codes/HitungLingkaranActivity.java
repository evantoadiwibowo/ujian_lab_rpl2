package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunDatar.Lingkaran;

public class HitungLingkaranActivity extends AppCompatActivity {

    EditText edtJariJari;
    TextView txtHasil;
    Double jari;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_lingkaran);
        initial();

    }

    private void initial() {

        edtJariJari = (EditText) findViewById(R.id.edt_jari_lingkaran);
        txtHasil = (TextView) findViewById(R.id.txt_hasil_lingkaran);
        getSupportActionBar().setTitle("Lingkaran (Circle)");

    }

    public void hitung_luas(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        Lingkaran lingkaran = new Lingkaran(jari);
        txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + lingkaran.hitung_luas()));

    }

    public void hitung_keliling(View view) {

        jari = Double.parseDouble(edtJariJari.getText().toString());
        Lingkaran lingkaran = new Lingkaran(jari);
        txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + lingkaran.hitung_keliling()));

    }
}