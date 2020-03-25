package com.example.offline02;

import androidx.appcompat.app.AppCompatActivity;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener  {
    Button b1,b2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        b1 = (Button) findViewById(R.id.Button1);
        b2=(Button)findViewById(R.id.Button2);
        b1.setOnClickListener(this);
        b2.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.Button1)
        { Intent i=new Intent(MainActivity.this,Frame_Layout.class);
        startActivity(i);}
        else if(v.getId()==R.id.Button2)
        { Intent ji=new Intent(MainActivity.this,Table1.class);
            startActivity(ji);}
    }
}
