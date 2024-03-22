package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class nutrivitamin1 extends AppCompatActivity {
    TextView head1n,does1n,process1n,day1n,take1n,headn,aa1,b1,c1,d1,e1,k1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutrivitamin1);
        hideSystemUI();
        headn=findViewById(R.id.headn);
        headn.setText(R.string.vitamin);
        head1n=findViewById(R.id.head1n);
        head1n.setText(R.string.vitamin11);
        does1n=findViewById(R.id.do11);
        does1n.setText(R.string.vitamindo1);
        process1n=findViewById(R.id.process1n);
        process1n.setText(R.string.vitamin_processed1);
        day1n=findViewById(R.id.day1n);
        day1n.setText(R.string.vitamin_howmuch1);
        take1n=findViewById(R.id.take1n);
        take1n.setText(R.string.vitamin_take1);
        aa1=findViewById(R.id.aa1);
        aa1.setText(R.string.vitaminusa1);
        b1=findViewById(R.id.b1);
        b1.setText(R.string.vitaminb1);
        c1=findViewById(R.id.c1);
        c1.setText(R.string.vitaminc1);
        d1=findViewById(R.id.d1);
        d1.setText(R.string.vitamind1);
        e1=findViewById(R.id.e1);
        e1.setText(R.string.vitamine1);
        k1=findViewById(R.id.k1);
        k1.setText(R.string.vitamink1);

        ImageView img1=findViewById(R.id.imagen);
        img1.setImageResource(R.drawable.img_66);
        ImageView img2=findViewById(R.id.image1n);
        img2.setImageResource(R.drawable.img_67);

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
