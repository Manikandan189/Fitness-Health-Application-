package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class foodhome extends AppCompatActivity {
    Button pb1,fb1,fab1,carb1,watb1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodhome);
        uihide();
        pb1=findViewById(R.id.pb1);
        fb1=findViewById(R.id.fb1);
        fab1=findViewById(R.id.fab1);
        carb1=findViewById(R.id.carb1);
        watb1=findViewById(R.id.watb1);
        watb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                towat();
            }
        });
        carb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocarb();
            }
        });
        fab1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tofat();
            }
        });
        fb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tofib();
            }
        });
        pb1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocl();
            }
        });
    }
    public void uihide()
    {
        View d=getWindow().getDecorView();
        int ui=View.SYSTEM_UI_FLAG_FULLSCREEN;
        d.setSystemUiVisibility(ui);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.R)
            getWindow().setDecorFitsSystemWindows(false);
    }

    public void tocl()
    {
        Intent pro=new Intent(this, foodprot1.class);
        startActivity(pro);
    }
    public void tofib()
    {
        Intent pro=new Intent(this, foodfib1.class);
        startActivity(pro);
    }
    public void tofat()
    {
        Intent pro=new Intent(this, foodfat1.class);
        startActivity(pro);
    }
    public void tocarb()
    {
        Intent pro=new Intent(this, foodcarb1.class);
        startActivity(pro);
    }
    public void towat()
    {
        Intent pro=new Intent(this, foodwat1.class);
        startActivity(pro);
    }



}