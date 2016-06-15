package com.inrelt.harizal.berbagi;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;


public class MainActivity extends ActionBarActivity {

    private EditText edtBelanja;
    private EditText edtBerbagi;
    private Button btnBerbagi;
    @Override
    protected void  onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initUI();
        initEvent();
    }
    private void initUI() {
        edtBelanja = (EditText) findViewById(R.id.editText);
        edtBerbagi = (EditText) findViewById(R.id.editText2);
        btnBerbagi = (Button) findViewById(R.id.button);
    }
    private void initEvent() {
        btnBerbagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hitungBerbagi();
            }

//            @Override
//            private boolean onContextClick(View v) {
//                hitungBerbagi();
//            }

        });
    }
    private void hitungBerbagi() {
        String Berbagix=edtBelanja.getText().toString();
        Berbagix=Berbagix.replaceAll("[\\s.]", "");
        int Belanja = Integer.parseInt(Berbagix);
        double Berbagi = 0.025 * Belanja;
        //edtBerbagi.setText("Rp " + Double.toString(Berbagi));
        edtBerbagi.setText("Rp "+String.format("%1$,.2f",Berbagi));
    }

}


