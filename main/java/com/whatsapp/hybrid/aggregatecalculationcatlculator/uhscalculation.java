package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class uhscalculation extends AppCompatActivity {

    EditText edtUHSfsc, edtUHSnet,edtUHSmatric;
    Button UHScalbtn, UHSresetbtn;
    TextView UHS_tv1,UHS_tv2;
    Double fsc_UHS,UHS_Net,UHS_matric,fsc_UHS_Cal,net_UHS_Cal,Matric_UHS_Cal,Total_Result_UHS;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_uhscalculation);
        edtUHSfsc=(EditText) findViewById(R.id.UHSfsc);
        edtUHSnet=(EditText)findViewById(R.id.UHSnts);
        edtUHSmatric=(EditText)findViewById(R.id.UHSmatric);
        UHScalbtn=(Button)findViewById(R.id.UHScal);
        UHSresetbtn=(Button)findViewById(R.id.UHSreset);
        UHS_tv1=(TextView)findViewById(R.id.UHStv1);
        UHS_tv2=(TextView)findViewById(R.id.UHStv2);
        UHScalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtUHSfsc.getText().toString();
                    String secondmatric = edtUHSmatric.getText().toString();
                    String thirdnet = edtUHSnet.getText().toString();
                    fsc_UHS= Double.valueOf(firstfsc).doubleValue();
                    UHS_matric = Double.valueOf(secondmatric).doubleValue();
                    UHS_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_UHS_Cal = (fsc_UHS / 1100) * 40;
                    Matric_UHS_Cal=(UHS_matric / 1100) * 10;
                    net_UHS_Cal = (UHS_Net / 1100) * 50;
                    Total_Result_UHS=fsc_UHS_Cal+Matric_UHS_Cal+net_UHS_Cal;

                    UHS_tv1.setText("Your Aggregate for UHS : ");
                    UHS_tv2.setText(Total_Result_UHS.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        UHSresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtUHSfsc.setText(" ");
                edtUHSmatric.setText(" ");
                edtUHSnet.setText (" ");
                UHS_tv1.setText(" ");
                UHS_tv2.setText(" ");
            }
        });
    }
}

