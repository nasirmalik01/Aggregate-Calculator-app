package com.whatsapp.hybrid.aggregatecalculationcatlculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class secondActivity extends AppCompatActivity {
    EditText edt1,edt2;
    Button btn,btn2;
    TextView tv,tv2;
    Double fsc,ecat,calfsc,calecat,result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        edt1=(EditText)findViewById(R.id.fsc);
        edt2=(EditText)findViewById(R.id.ecat);
        btn2=(Button)findViewById(R.id.btnreset);
        btn=(Button)findViewById(R.id.btncalculate);
        tv=(TextView)findViewById(R.id.tvv);
        tv2=(TextView)findViewById(R.id.tvvv);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    String fscc = edt1.getText().toString();
                    String ecatt = edt2.getText().toString();
                    fsc = Double.valueOf(fscc).doubleValue();
                    ecat = Double.valueOf(ecatt).doubleValue();
                    calfsc = (fsc / 1100) * 70;
                    calecat = (ecat / 400) * 30;
                    result = calfsc + calecat;

                    tv.setText("Your Aggregate for UET : ");
                    tv2.setText(result.toString().substring(0, 7)+"%");
                }catch(Exception ex)
                {ex.printStackTrace();}



            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                edt1.setText(" ");
                edt2.setText(" ");
                tv.setText (" ");
                tv2.setText(" ");
            }
        });
    }
}
