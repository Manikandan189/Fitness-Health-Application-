package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class sche extends AppCompatActivity {
    Button sbc,sbs,sbb,sb2,sbt,sbf,sba,sbl;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sche);
        hideSystemUI();

        sbc = findViewById(R.id.sbc);
        sbs=findViewById(R.id.sbs);
        sbb=findViewById(R.id.sbb);
        sb2=findViewById(R.id.sb2);
        sbt=findViewById(R.id.sbt);
        sbf=findViewById(R.id.sbf);
        sba=findViewById(R.id.sba);
        sbl=findViewById(R.id.sbl);
        sbs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                shon();
            }
        });
        sbc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                hai();
            }
        });
        sbb.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                back1();
            }
        });
        sb2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                bys();
            }
        });
        sbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tri();
            }
        });
        sbf.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                fore();
            }
        });
        sba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ab();
            }
        });
        sbl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                legfun();
            }
        });
    }

    private void hai() {
        Intent i = new Intent(this, cheast.class);
        startActivity(i);
    }
    public void shon()
    {
        Intent sh=new Intent(this, shoulder.class);
        startActivity(sh);
    }
    public void back1()
    {
        Intent ba=new Intent(this, back1.class);
        startActivity(ba);
    }
    public void bys()
    {
        Intent bi=new Intent(this, biceps1.class);
        startActivity(bi);
    }
    public void tri()
    {
        Intent ti=new Intent(this, triceps1.class);
        startActivity(ti);
    }
    public void fore()
    {
        Intent fi=new Intent(this, forearms1.class);
        startActivity(fi);
    }
    public void ab()
    {
        Intent ai=new Intent(this, abs1.class);
        startActivity(ai);
    }
    public void legfun()
    {
        Intent le=new Intent(this,legs1.class);
        startActivity(le);
    }
    private void hideSystemUI() {
        View decorView = getWindow().getDecorView();
        int uiOptions = View.SYSTEM_UI_FLAG_FULLSCREEN;
        decorView.setSystemUiVisibility(uiOptions);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
        }
    }




}

