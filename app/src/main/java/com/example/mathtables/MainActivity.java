package com.example.mathtables;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

     int[] nLIST= {
            R.id.N1,
            R.id.N2,
            R.id.N3,
            R.id.N4,
            R.id.N5,
            R.id.N6,
            R.id.N7,
            R.id.N8,
            R.id.N9,
            R.id.N10,
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText edtInput = findViewById(R.id.edtInput);
        Button btnAns= findViewById(R.id.btnAns);
        TextView txtErr = findViewById(R.id.txtErr);




        btnAns.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String InpStr = edtInput.getText().toString();
                int input = Integer.parseInt(InpStr);

                if(input<0 || input>1000) {
                    txtErr.setText("Input number between 1 to 1000 only");
                }
                else {
                    for(int i=1; i<11;i++)
                    {
                        int ans = input*i;

                        TextView Nop = findViewById(nLIST[i-1]);
                        Nop.setText(input+"      X      "+i+"       =      "+ans);
                        Nop.setTextColor(Color.parseColor("#FF07B833"));
                    }
                }

            }
        });

    }
}