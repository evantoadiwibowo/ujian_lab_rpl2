package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.LimasSegiEmpat.LuasAlasLimasSegiEmpat;
import com.ssm.evantoadiwibowo.BangunRuang.LimasSegiEmpat.LuasLimasSegiEmpat;
import com.ssm.evantoadiwibowo.BangunRuang.LimasSegiEmpat.LuasSisiTegakLimasSegiEmpat;
import com.ssm.evantoadiwibowo.BangunRuang.LimasSegiEmpat.VolumeLimasSegiEmpat;

public class HitungLimasSegiEmpatActivity extends AppCompatActivity {

    EditText edtText1, edtText2;
    TextView txtHasil, txtView1, txtView2;
    Button btnHitung;
    Double panjang, lebar, alas, tinggi, luas_alas, luas_sisi_tegak;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_limas_segi_empat);
        initial();

    }

    private void initial() {

        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);
        getSupportActionBar().setTitle("Limas Segi Empat (Pyramid)");

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.radio_hitung_luas_alas:

                if (checked) {

                    txtView1.setText(getString(R.string.panjang) + " (p)");
                    txtView2.setText(getString(R.string.lebar) + " (l)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_alas));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }

            case R.id.radio_hitung_luas_sisi_tegak:

                if (checked) {

                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_sisi_tegak));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }

            case R.id.radio_hitung_luas_limas:

                if (checked) {

                    txtView1.setText(getString(R.string.luas_alas));
                    txtView2.setText(getString(R.string.luas_sisi_tegak));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas_limas));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }

            case R.id.radio_hitung_volume:

                if (checked) {
                    txtView1.setText(getString(R.string.luas_alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_volume));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }
        }
    }

    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();

        if (buttonText == getString(R.string.hitung_luas_alas)) {

            panjang = Double.parseDouble(edtText1.getText().toString());
            lebar = Double.parseDouble(edtText2.getText().toString());
            LuasAlasLimasSegiEmpat luasAlasLimasSegiEmpat = new LuasAlasLimasSegiEmpat(panjang, lebar);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas Alas:\n" + luasAlasLimasSegiEmpat.hitung_luas()));

        } else if (buttonText == getString(R.string.hitung_luas_sisi_tegak)) {

            alas = Double.parseDouble(edtText1.getText().toString());
            tinggi = Double.parseDouble(edtText2.getText().toString());
            LuasSisiTegakLimasSegiEmpat luasSisiTegakLimasSegiEmpat = new LuasSisiTegakLimasSegiEmpat(alas, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas Sisi Tegak:\n" + luasSisiTegakLimasSegiEmpat.hitung_luas_sisi_tegak()));

        } else if (buttonText == getString(R.string.hitung_luas_limas)) {

            luas_alas = Double.parseDouble(edtText1.getText().toString());
            luas_sisi_tegak = Double.parseDouble(edtText2.getText().toString());
            LuasLimasSegiEmpat luasLimasSegiEmpat = new LuasLimasSegiEmpat(luas_alas, luas_sisi_tegak);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas Limas:\n" + luasLimasSegiEmpat.hitung_luas()));

        } else {

            luas_alas = Double.parseDouble(edtText1.getText().toString());
            tinggi = Double.parseDouble(edtText2.getText().toString());
            VolumeLimasSegiEmpat volumeLimasSegiEmpat = new VolumeLimasSegiEmpat(luas_alas, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nVolume Limas:\n" + volumeLimasSegiEmpat.hitung_volume()));

        }
    }
}