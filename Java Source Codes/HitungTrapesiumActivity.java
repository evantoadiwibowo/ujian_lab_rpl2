package com.ssm.evantoadiwibowo;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import com.ssm.evantoadiwibowo.BangunDatar.Trapesium.KelilingTrapesium;
import com.ssm.evantoadiwibowo.BangunDatar.Trapesium.LuasTrapesium;

public class HitungTrapesiumActivity extends AppCompatActivity {

    EditText edtText1, edtText2, edtText3, edtText4;
    TextView txtHasil, txtView1, txtView2, txtView3, txtView4;
    Button btnHitung;
    Double tinggi, sisiAB, sisiBC, sisiCD, sisiAD;

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung_trapesium);
        initial();

    }

    private void initial() {

        edtText1 = (EditText) findViewById(R.id.edt_text_view_1);
        edtText2 = (EditText) findViewById(R.id.edt_text_view_2);
        edtText3 = (EditText) findViewById(R.id.edt_text_view_3);
        edtText4 = (EditText) findViewById(R.id.edt_text_view_4);
        txtView1 = (TextView) findViewById(R.id.text_view_1);
        txtView2 = (TextView) findViewById(R.id.text_view_2);
        txtView3 = (TextView) findViewById(R.id.text_view_3);
        txtView4 = (TextView) findViewById(R.id.text_view_4);
        txtHasil = (TextView) findViewById(R.id.txt_hasil);
        btnHitung = (Button) findViewById(R.id.btn_hitung);
        edtText1.setVisibility(View.INVISIBLE);
        edtText2.setVisibility(View.INVISIBLE);
        edtText3.setVisibility(View.INVISIBLE);
        edtText4.setVisibility(View.INVISIBLE);
        btnHitung.setVisibility(View.INVISIBLE);
        txtHasil.setVisibility(View.INVISIBLE);
        getSupportActionBar().setTitle("Trapesium (Trapezium)");

    }

    public void onRadioButtonClicked(View view) {

        boolean checked = ((RadioButton) view).isChecked();
        switch (view.getId()) {

            case R.id.radio_hitung_keliling:

                if (checked) {

                    txtView1.setText(getString(R.string.sisiAB));
                    txtView2.setText(getString(R.string.sisiBC));
                    txtView3.setText(getString(R.string.sisiCD));
                    txtView4.setText(getString(R.string.sisiAD));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    edtText4.setText("");
                    btnHitung.setText(getString(R.string.hitung_keliling));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);
                    edtText4.setVisibility(View.VISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    txtView4.setVisibility(View.VISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }

            case R.id.radio_hitung_luas:

                if (checked) {

                    txtView1.setText(getString(R.string.sisiAB));
                    txtView2.setText(getString(R.string.sisiCD));
                    txtView3.setText(getString(R.string.tinggi));
                    edtText1.setText("");
                    edtText2.setText("");
                    edtText3.setText("");
                    btnHitung.setText(getString(R.string.hitung_luas));
                    edtText1.setVisibility(View.VISIBLE);
                    edtText2.setVisibility(View.VISIBLE);
                    edtText3.setVisibility(View.VISIBLE);
                    edtText4.setVisibility(View.INVISIBLE);
                    txtView1.setVisibility(View.VISIBLE);
                    txtView2.setVisibility(View.VISIBLE);
                    txtView3.setVisibility(View.VISIBLE);
                    txtView4.setVisibility(View.INVISIBLE);
                    btnHitung.setVisibility(View.VISIBLE);
                    txtHasil.setVisibility(View.VISIBLE);
                    txtHasil.setText(getString(R.string.hasil));
                    break;

                }
        }
    }

    public void hitung(View view) {

        String buttonText = btnHitung.getText().toString();

        if (buttonText == getString(R.string.hitung_keliling)) {

            sisiAB = Double.parseDouble(edtText1.getText().toString());
            sisiBC = Double.parseDouble(edtText2.getText().toString());
            sisiCD = Double.parseDouble(edtText3.getText().toString());
            sisiAD = Double.parseDouble(edtText4.getText().toString());
            KelilingTrapesium kelilingTrapesium = new KelilingTrapesium(sisiAB, sisiBC, sisiCD, sisiAD);
            txtHasil.setText(String.valueOf("Hasil (Result)\nKeliling:\n" + kelilingTrapesium.hitung_keliling()));

        }

        else {

            sisiAB = Double.parseDouble(edtText1.getText().toString());
            sisiCD = Double.parseDouble(edtText2.getText().toString());
            tinggi = Double.parseDouble(edtText3.getText().toString());
            LuasTrapesium luasTrapesium = new LuasTrapesium(sisiAB, sisiCD, tinggi);
            txtHasil.setText(String.valueOf("Hasil (Result)\nLuas:\n" + luasTrapesium.hitung_luas()));

        }
    }
}