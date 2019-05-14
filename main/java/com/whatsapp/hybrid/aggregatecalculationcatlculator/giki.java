package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class giki extends AppCompatActivity {
    EditText edtgikifsc, edtgikinet,edtgikimatric;
    Button gikicalbtn, gikiresetbtn;
    TextView giki_tv1,giki_tv2;
    Double fsc_giki,giki_Net,giki_matric,fsc_giki_Cal,net_giki_Cal,Matric_giki_Cal,Total_Result_giki;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_giki);
        edtgikifsc=(EditText) findViewById(R.id.gikifsc);
        edtgikinet=(EditText)findViewById(R.id.gikints);
        edtgikimatric=(EditText)findViewById(R.id.gikimatric);
        gikicalbtn=(Button)findViewById(R.id.gikical);
        gikiresetbtn=(Button)findViewById(R.id.gikireset);
        giki_tv1=(TextView)findViewById(R.id.gikitv1);
        giki_tv2=(TextView)findViewById(R.id.gikitv2);
        gikicalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtgikifsc.getText().toString();
                    String secondmatric = edtgikimatric.getText().toString();
                    String thirdnet = edtgikinet.getText().toString();
                    fsc_giki= Double.valueOf(firstfsc).doubleValue();
                    giki_matric = Double.valueOf(secondmatric).doubleValue();
                    giki_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_giki_Cal = (fsc_giki / 1100) * 10;
                    Matric_giki_Cal=(giki_matric / 1100)* 5;
                    net_giki_Cal = (giki_Net / 200) * 85;
                    Total_Result_giki=fsc_giki_Cal+Matric_giki_Cal+net_giki_Cal;

                    giki_tv1.setText("Your Aggregate for GIKI : ");
                    giki_tv2.setText(Total_Result_giki.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        gikiresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtgikifsc.setText(" ");
                edtgikimatric.setText(" ");
                edtgikinet.setText (" ");
                giki_tv1.setText(" ");
                giki_tv2.setText(" ");
            }
        });
    }
}
