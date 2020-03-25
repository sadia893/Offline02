package com.example.offline02;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class Frame_Layout extends AppCompatActivity implements View.OnClickListener{
    ImageView i1,i2,i3,i4,i5,i6;
    TextView t1,t2,t3,t4,t5,t6;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        i1=(ImageView)findViewById(R.id.chocolatemintcake);
        i2=(ImageView)findViewById(R.id.coconutCake);
        i3=(ImageView)findViewById(R.id.nutella);
        i4=(ImageView)findViewById(R.id.redVel);
        i5=(ImageView)findViewById(R.id.layercake);
        i6=(ImageView)findViewById(R.id.galaxy);

        t1=(TextView)findViewById(R.id.text1);
        t2=(TextView)findViewById(R.id.text2);
        t3=(TextView)findViewById(R.id.text3);
        t4=(TextView)findViewById(R.id.text4);
        t5=(TextView)findViewById(R.id.text5);
        t6=(TextView)findViewById(R.id.text6);

    }

    @Override
    public void onClick(View v) {
        if(v.getId()==R.id.chocolatemintcake)
        {
            i1.setVisibility(View.GONE);
            t1.setVisibility(View.GONE);
            i2.setVisibility(View.VISIBLE);
            t2.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.coconutCake)
        {
            i2.setVisibility(View.GONE);
            t2.setVisibility(View.GONE);
            i3.setVisibility(View.VISIBLE);
            t3.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.nutella)
        {
            i3.setVisibility(View.GONE);
            t3.setVisibility(View.GONE);
            i4.setVisibility(View.VISIBLE);
            t4.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.redVel)
        {
            i4.setVisibility(View.GONE);
            t4.setVisibility(View.GONE);
            i5.setVisibility(View.VISIBLE);
            t5.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.layercake)
        {
            i5.setVisibility(View.GONE);
            t5.setVisibility(View.GONE);
            i6.setVisibility(View.VISIBLE);
            t6.setVisibility(View.VISIBLE);
        }
        else if(v.getId()==R.id.galaxy)
        {
            i6.setVisibility(View.GONE);
            t6.setVisibility(View.GONE);
            i1.setVisibility(View.VISIBLE);
            t1.setVisibility(View.VISIBLE);
        }
    }
}
