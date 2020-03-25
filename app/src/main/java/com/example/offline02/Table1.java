package com.example.offline02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Table1 extends AppCompatActivity implements View.OnClickListener {
Button ord;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table1);
        ord=(Button)findViewById(R.id.orderButton);
        ord.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Intent in=new Intent(this,Abs.class);
        startActivity(in);
    }
}
