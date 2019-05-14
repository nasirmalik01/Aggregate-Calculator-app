package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class fourth extends AppCompatActivity {
    EditText edtcomsatfsc, edtcomsatnet,edtcomsatmatric;
    Button comsatcalbtn, comsatresetbtn;
    TextView comsat_tv1,comsat_tv2;
    Double fsc_comsat,comsat_Net,comsat_matric,fsc_comsat_Cal,net_comsat_Cal,Matric_comsat_Cal,Total_Result_comsat;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourth);
        edtcomsatfsc=(EditText) findViewById(R.id.comsatsfsc);
        edtcomsatnet=(EditText)findViewById(R.id.comsatsnts);
        edtcomsatmatric=(EditText)findViewById(R.id.comsatsmatric);
        comsatcalbtn=(Button)findViewById(R.id.comsatscal);
        comsatresetbtn=(Button)findViewById(R.id.comsatsreset);
        comsat_tv1=(TextView)findViewById(R.id.comsatstv1);
        comsat_tv2=(TextView)findViewById(R.id.comsatstv2);
        comsatcalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtcomsatfsc.getText().toString();
                    String secondmatric = edtcomsatmatric.getText().toString();
                    String thirdnet = edtcomsatnet.getText().toString();
                    fsc_comsat = Double.valueOf(firstfsc).doubleValue();
                    comsat_matric = Double.valueOf(secondmatric).doubleValue();
                    comsat_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_comsat_Cal = (fsc_comsat / 1100) * 40;
                    Matric_comsat_Cal=(comsat_matric / 1100)*10;
                    net_comsat_Cal = (comsat_Net / 100) * 50;
                    Total_Result_comsat=fsc_comsat_Cal+Matric_comsat_Cal+net_comsat_Cal;

                    comsat_tv1.setText("Your Aggregate for COMSATS : ");
                    comsat_tv2.setText(Total_Result_comsat.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        comsatresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtcomsatfsc.setText(" ");
                edtcomsatmatric.setText(" ");
                edtcomsatnet.setText (" ");
                comsat_tv1.setText(" ");
                comsat_tv2.setText(" ");
            }
        });

    }
}

