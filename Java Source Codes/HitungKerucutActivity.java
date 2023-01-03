package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunRuang.Kerucut.LuasKerucut;
import com.ssm.evantoadiwibowo.BangunRuang.Kerucut.VolumeKerucut;

public class HitungKerucutActivity extends AppCompatActivity {

    EditText edtText1, edtText2;
    TextView txtHasil, txtView1, txtView2;
    Button btnHitung;
    Double jariJari, tinggi, garisLukis;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_kerucut);
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
        getSupportActionBar().setTitle("Kerucut (Cone)");

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.radio_hitung_luas:

                if (checked) {

                    txtView1.setText(getString(R.string.jari_jari));
                    txtView2.setText(getString(R.string.garis_lukis) + " (s)");
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));
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
                    txtView1.setText(getString(R.string.jari_jari));
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

        if (buttonText == getString(R.string.hitung_luas)) {

            jariJari = Double.parseDouble(edtText1.getText().toString());
            garisLukis = Double.parseDouble(edtText2.getText().toString());
            LuasKerucut luasKerucut = new LuasKerucut(jariJari, garisLukis);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + luasKerucut.hitung_luas()));

        }

        else {

            jariJari = Double.parseDouble(edtText1.getText().toString());
            tinggi = Double.parseDouble(edtText2.getText().toString());
            VolumeKerucut volumeKerucut = new VolumeKerucut(jariJari, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nVolume:\n" + volumeKerucut.hitung_volume()));

        }
    }
}