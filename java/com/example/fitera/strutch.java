package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class strutch extends AppCompatActivity {
    Button cab11;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_strutch);
        uihide();
        cab11=findViewById(R.id.cab11);
        cab11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                tocar();
            }
        });


    }
    public void tocar()
    {
        Intent i=new Intent(this, cardiofinal1.class);
        startActivity(i);
    }
    public void uihide()
    {
        View v=getWindow().getDecorView();
        int i= View.SYSTEM_UI_FLAG_FULLSCREEN;
        v.setSystemUiVisibility(i);
        if(Build.VERSION.SDK_INT>=Build.VERSION_CODES.R)
        {
            getWindow().setDecorFitsSystemWindows(false);
        }
    }



}