package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import org.w3c.dom.Text;

public class pieasActivity extends AppCompatActivity {
    EditText edtpieasfsc, edtpieasnet,edtpieasmatric;
    Button pieascalbtn, pieasresetbtn;
    TextView pieas_tv1,pieas_tv2;
    Double fsc_pieas,pieas_Net,pieas_matric,fsc_pieas_Cal,net_pieas_Cal,Matric_pieas_Cal,Total_Result_pieas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pieas);
        edtpieasfsc=(EditText) findViewById(R.id.pieasfsc);
        edtpieasnet=(EditText)findViewById(R.id.pieasnts);
        edtpieasmatric=(EditText)findViewById(R.id.pieasmatric);
        pieascalbtn=(Button)findViewById(R.id.pieascal);
        pieasresetbtn=(Button)findViewById(R.id.pieasreset);
        pieas_tv1=(TextView)findViewById(R.id.pieastv1);
        pieas_tv2=(TextView)findViewById(R.id.pieastv2);
        pieascalbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String firstfsc = edtpieasfsc.getText().toString();
                    String secondmatric = edtpieasmatric.getText().toString();
                    String thirdnet = edtpieasnet.getText().toString();
                    fsc_pieas = Double.valueOf(firstfsc).doubleValue();
                    pieas_matric = Double.valueOf(secondmatric).doubleValue();
                    pieas_Net = Double.valueOf(thirdnet).doubleValue();
                    fsc_pieas_Cal = (fsc_pieas / 1100) * 25;
                    Matric_pieas_Cal=(pieas_matric / 1100)*15;
                    net_pieas_Cal = (pieas_Net / 300) * 60;
                    Total_Result_pieas=fsc_pieas_Cal+Matric_pieas_Cal+net_pieas_Cal;

                    pieas_tv1.setText("Your Aggregate for PIEAS : ");
                    pieas_tv2.setText(Total_Result_pieas.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        pieasresetbtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edtpieasfsc.setText(" ");
                edtpieasmatric.setText(" ");
                edtpieasnet.setText (" ");
                pieas_tv1.setText(" ");
                pieas_tv2.setText(" ");
            }
        });
    }
}
