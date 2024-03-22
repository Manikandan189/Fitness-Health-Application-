package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class nutri1 extends AppCompatActivity {
    Button n1,n2,n3,n4,n5,n6,n7,n8,n9,n10,n11,n12;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutri1);
        hideSystemUI();
        n1=findViewById(R.id.n1);
        n2=findViewById(R.id.n2);
        n3=findViewById(R.id.n3);
        n4=findViewById(R.id.n4);
        n5=findViewById(R.id.n5);
        n6=findViewById(R.id.n6);
        n7=findViewById(R.id.n7);
        n8=findViewById(R.id.n8);
        n9=findViewById(R.id.n9);
        n10=findViewById(R.id.n10);
        n11=findViewById(R.id.n11);
        n12=findViewById(R.id.n12);
        n12.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocal(view);
            }
        });
        n11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tofat(view);

            }
        });
        n10.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topre(view);
            }
        });
        n9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topro1(view);
            }
        });
        n8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                toanti(view);
            }
        });
        n7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tofib(view);
            }
        });
        n6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                towat(view);
            }
        });
        n5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tomin(view);
            }
        });
        n4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tovit(view);
            }
        });
        n3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tofat(view);
            }
        });
        n2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                topro(view);
            }
        });
        n1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocar(view);
            }
        });

    }
    public void tocar(View view)
    {
        Intent i=new Intent(this, nutricarb1.class);
        startActivity(i);

    }
    public void topro(View view)
    {
        Intent i=new Intent(this, nutriprotein1.class);
        startActivity(i);

    }
    public void tofat(View view)
    {
        Intent i=new Intent(this, nutrifat1.class);
        startActivity(i);

    }
    public void tovit(View view)
    {
        Intent i=new Intent(this,nutrivitamin1.class);
        startActivity(i);

    }
    public void tomin(View view)
    {
        Intent i=new Intent(this,nutriminerals1.class);
        startActivity(i);

    }
    public void towat(View view)
    {
        Intent i=new Intent(this,nutriwater1.class);
        startActivity(i);

    }
    public void tofib(View view)
    {
        Intent i=new Intent(this,nutridietry1.class);
        startActivity(i);

    }
    public void toanti(View view)
    {
        Intent i=new Intent(this,nutianti1.class);
        startActivity(i);

    }
    public void topro1(View view)
    {
        Intent i=new Intent(this,nutripro1.class);
        startActivity(i);

    }
    public void topre(View view)
    {
        Intent i=new Intent(this,nutripre1.class);
        startActivity(i);

    }
    public void tofaty(View view)
    {
        Intent i=new Intent(this,nutrifat1.class);
        startActivity(i);

    }

    public void tocal(View view)
    {
        Intent i=new Intent(this, nutrical1.class);
        startActivity(i);

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