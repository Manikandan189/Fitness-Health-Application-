package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class nutrical1 extends AppCompatActivity {
    TextView head1n,does1n,process1n,day1n,take1n,headn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_nutricarb1);
        hideSystemUI();
        headn=findViewById(R.id.headn);
        headn.setText(R.string.calories_what);
        head1n=findViewById(R.id.head1n);
        head1n.setText(R.string.calories_whatInfo);
        does1n=findViewById(R.id.does1n);
        does1n.setText(R.string.calories_does);
        process1n=findViewById(R.id.process1n);
        process1n.setText(R.string.calories_process);
        day1n=findViewById(R.id.day1n);
        day1n.setText(R.string.calories_perday);
        take1n=findViewById(R.id.take1n);
        take1n.setText(R.string.calories_take);
        ImageView img1=findViewById(R.id.imagen);
        img1.setImageResource(R.drawable.img_75);
        ImageView img2=findViewById(R.id.image1n);
        img2.setImageResource(R.drawable.img_76);

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