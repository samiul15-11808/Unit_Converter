package com.example.unitconverter;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity implements View.OnClickListener {
    TextView tv_value;
    Button btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv_value=findViewById(R.id.tv_value);
        btn = findViewById(R.id.btn);
        btn.setOnClickListener(MainActivity2.this);
        Intent intent=getIntent();
        String value=intent.getStringExtra("value");
        tv_value.setText(value);
    }

    @Override
    public void onClick(View v) {
        Intent intent = new Intent(MainActivity2.this,MainActivity.class);

        startActivity(intent);
    }
}