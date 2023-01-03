package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunDatar.Segitiga.KelilingSegitiga;
import com.ssm.evantoadiwibowo.BangunDatar.Segitiga.LuasSegitiga;

public class HitungSegitigaActivity extends AppCompatActivity {

    EditText edtText1, edtText2, edtText3;
    TextView txtHasil, txtView1, txtView2, txtView3;
    Button btnHitung;
    Double alas, tinggi, sisiA, sisiB, sisiC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_segitiga);
        initial();

    }

    private void initial() {

        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);
        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);
        getSupportActionBar().setTitle("Segitiga (Triangle)");

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.radio_hitung_keliling:

                if (checked) {

                    txtView1.setText(getString(R.string.sisiA));
                    txtView2.setText(getString(R.string.sisiB));
                    txtView3.setText(getString(R.string.sisiC));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }

            case R.id.radio_hitung_luas:

                if (checked) {

                    txtView1.setText(getString(R.string.alas));
                    txtView2.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.INVISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.INVISIBLE);
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

            alas = Double.parseDouble(edtText1.getText().toString());
            tinggi = Double.parseDouble(edtText2.getText().toString());
            LuasSegitiga luasSegitiga = new LuasSegitiga(alas, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + luasSegitiga.hitung_luas()));

        }

        else {

            sisiA = Double.parseDouble(edtText1.getText().toString());
            sisiB = Double.parseDouble(edtText2.getText().toString());
            sisiC = Double.parseDouble(edtText3.getText().toString());
            KelilingSegitiga kelilingSegitiga = new KelilingSegitiga(sisiA, sisiB, sisiC);
            txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + kelilingSegitiga.hitung_keliling()));

        }
    }
}