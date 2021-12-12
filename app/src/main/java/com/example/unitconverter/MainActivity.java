package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {
    EditText edittext;
    Button btn1,btn2,btn3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        edittext=findViewById(R.id.edittext);
        btn1=findViewById(R.id.btn1);
        btn2=findViewById(R.id.btn2);
        btn3=findViewById(R.id.btn3);



        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meter = edittext.getText().toString();
                double feet = Double.parseDouble(meter);
                feet = feet * 0.3048;

                meter = new Double(feet).toString();
                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("value",meter);
                startActivity(intent);
            }
        });


        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String centimeter = edittext.getText().toString();
                double meter = Double.parseDouble(centimeter);
                meter = meter * 100.00;

                centimeter = new Double(meter).toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("value",centimeter);
                startActivity(intent);

            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String meter = edittext.getText().toString();
                double kmeter = Double.parseDouble(meter);
                kmeter = kmeter * 1000.00;

                meter = new Double(kmeter).toString();

                Intent intent = new Intent(MainActivity.this,MainActivity2.class);
                intent.putExtra("value",meter);
                startActivity(intent);

            }
        });
    }


    @Override
    public void onClick(View v) {

    }
}