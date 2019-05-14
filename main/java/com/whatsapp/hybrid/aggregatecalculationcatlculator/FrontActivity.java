package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.content.DialogInterface;
import android.content.Intent;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import org.w3c.dom.Text;

import static java.lang.System.exit;

public class FrontActivity extends AppCompatActivity {
TextView tveng,tvmed;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_front);
        tveng=(TextView)findViewById(R.id.tvengg);
        tvmed=(TextView)findViewById(R.id.tvmed);

        tveng.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FrontActivity.this, MainActivity.class);
                startActivity(it);
            }
        });

        tvmed.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(FrontActivity.this, MedicalfirstActivity.class);
                startActivity(it);
            }
        });

    }


}
