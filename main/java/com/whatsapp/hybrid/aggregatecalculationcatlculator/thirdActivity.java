package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class thirdActivity extends AppCompatActivity {
EditText edtnustfsc, edtnustnet,edtnustmatric;
Button nustcalbtn, nustresetbtn;
TextView Nust_tv1,Nust_tv2;
Double fsc_Nust,Nust_Net,Nust_matric,fsc_Nust_Cal,net_Nust_Cal,Matric_Nust_Cal,Total_Result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_third4);
        edtnustfsc=(EditText) findViewById(R.id.nustfsc);
        edtnustnet=(EditText)findViewById(R.id.nustnet);
        edtnustmatric=(EditText)findViewById(R.id.nustmatric);
        nustcalbtn=(Button)findViewById(R.id.nustcal);
        nustresetbtn=(Button)findViewById(R.id.nustres);
        Nust_tv1=(TextView)findViewById(R.id.nusttv1);
        Nust_tv2=(TextView)findViewById(R.id.nusttv2);

        nustcalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtnustfsc.getText().toString();
                    String secondmatric = edtnustmatric.getText().toString();
                    String thirdnet = edtnustnet.getText().toString();
                    fsc_Nust = Double.valueOf(firstfsc).doubleValue();
                    Nust_matric = Double.valueOf(secondmatric).doubleValue();
                    Nust_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_Nust_Cal = (fsc_Nust / 1100) * 15;
                    Matric_Nust_Cal=(Nust_matric/1100)*10;
                    net_Nust_Cal = (Nust_Net / 200) * 75;
                    Total_Result=fsc_Nust_Cal+Matric_Nust_Cal+net_Nust_Cal;

                    Nust_tv1.setText("Your Aggregate for NUST : ");
                    Nust_tv2.setText(Total_Result.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        nustresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtnustfsc.setText(" ");
                edtnustmatric.setText(" ");
                edtnustnet.setText (" ");
                Nust_tv1.setText(" ");
                Nust_tv2.setText(" ");
            }
        });

    }
}
