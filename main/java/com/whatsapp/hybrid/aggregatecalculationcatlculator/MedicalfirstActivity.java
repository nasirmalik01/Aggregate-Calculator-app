package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MedicalfirstActivity extends AppCompatActivity {
TextView tvUHS,tvNUMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_medicalfirst);
        tvUHS=(TextView) findViewById(R.id.edtuhss);
        tvNUMS=(TextView)findViewById(R.id.edtnums);

        tvUHS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MedicalfirstActivity.this, uhscalculation.class);
                startActivity(it);
            }
        });

        tvNUMS.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(MedicalfirstActivity.this, NUMS.class);
                startActivity(it);
            }
        });




    }
}
