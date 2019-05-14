package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class NUMS extends AppCompatActivity {
    EditText edtNUMSfsc, edtNUMSnet,edtNUMSmatric;
    Button NUMScalbtn, NUMSresetbtn;
    TextView NUMS_tv1,NUMS_tv2;
    Double fsc_NUMS,NUMS_Net,NUMS_matric,fsc_NUMS_Cal,net_NUMS_Cal,Matric_NUMS_Cal,Total_Result_NUMS;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nums);
        edtNUMSfsc=(EditText) findViewById(R.id.NUMSfsc);
        edtNUMSnet=(EditText)findViewById(R.id.NUMSnts);
        edtNUMSmatric=(EditText)findViewById(R.id.NUMSmatric);
        NUMScalbtn=(Button)findViewById(R.id.NUMScal);
        NUMSresetbtn=(Button)findViewById(R.id.NUMSreset);
        NUMS_tv1=(TextView)findViewById(R.id.NUMStv1);
        NUMS_tv2=(TextView)findViewById(R.id.NUMStv2);
        NUMScalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtNUMSfsc.getText().toString();
                    String secondmatric = edtNUMSmatric.getText().toString();
                    String thirdnet = edtNUMSnet.getText().toString();
                    fsc_NUMS= Double.valueOf(firstfsc).doubleValue();
                    NUMS_matric = Double.valueOf(secondmatric).doubleValue();
                    NUMS_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_NUMS_Cal = (fsc_NUMS / 1100) * 40;
                    Matric_NUMS_Cal=(NUMS_matric / 1100) * 10;
                    net_NUMS_Cal = (NUMS_Net / 180) * 50;
                    Total_Result_NUMS=fsc_NUMS_Cal+Matric_NUMS_Cal+net_NUMS_Cal;

                    NUMS_tv1.setText("Your Aggregate for NUMS : ");
                    NUMS_tv2.setText(Total_Result_NUMS.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        NUMSresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtNUMSfsc.setText(" ");
                edtNUMSmatric.setText(" ");
                edtNUMSnet.setText (" ");
                NUMS_tv1.setText(" ");
                NUMS_tv2.setText(" ");
            }
        });
    }
}


