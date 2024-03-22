package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class homecal extends AppCompatActivity {
    Button wl,wg,cu,ba;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_homecal);
        hideSystemUI();
        wl = findViewById(R.id.wl);
        wg=findViewById(R.id.wg);
        cu=findViewById(R.id.cu);
        ba=findViewById(R.id.ba);
        ba.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                bul();
            }
        });
        wg.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                gain();

            }
        });
        cu.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                cut();
            }
        });
        wl.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                weigh();
            }
        });
    }
        public void weigh()
        {
            Intent i=new Intent(this,weightloss1.class);
            startActivity(i);
        }
    public void gain()
    {
        Intent g=new Intent(this,weightgain1.class);
        startActivity(g);
    }
    public void cut()
    {
        Intent cu=new Intent(this,cutting1.class);
        startActivity(cu);
    }
    public void bul()
    {
        Intent bu=new Intent(this,bulking1.class);
        startActivity(bu);
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
