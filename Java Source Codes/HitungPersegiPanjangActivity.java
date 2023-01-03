package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunDatar.PersegiPanjang;

public class HitungPersegiPanjangActivity extends AppCompatActivity {

    EditText edtPanjang, edtLebar;
    TextView txtLuas;
    Double panjang, lebar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_persegi_panjang);
        initial();

    }

    private void initial() {

        edtPanjang = (EditText) findViewById(R.id.edt_panjang);
        edtLebar = (EditText) findViewById(R.id.edt_lebar);
        txtLuas = (TextView) findViewById(R.id.txt_luas);
        getSupportActionBar().setTitle("Persegi Panjang (Rectangle)");

    }

    public void hitung_luas(View view) {

        panjang = Double.parseDouble(edtPanjang.getText().toString());
        lebar = Double.parseDouble(edtLebar.getText().toString());
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        txtLuas.setText(String.valueOf("Hasil (Result)\nLuas:\n" + persegiPanjang.hitung_luas()));

    }

    public void hitung_keliling(View view) {

        panjang = Double.parseDouble(edtPanjang.getText().toString());
        lebar = Double.parseDouble(edtLebar.getText().toString());
        PersegiPanjang persegiPanjang = new PersegiPanjang(panjang, lebar);
        txtLuas.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + persegiPanjang.hitung_keliling()));

    }
}