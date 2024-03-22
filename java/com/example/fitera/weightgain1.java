package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class weightgain1 extends AppCompatActivity {

    Button sub;
    EditText fe, se; // Assuming you have these EditText fields
    public static final String current="weight",target="weighttar";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightloss1);
        hideSystemUI();

        // Initialize your EditText fields
        fe = findViewById(R.id.fe);
        se = findViewById(R.id.se);

        sub = findViewById(R.id.sub);
        sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                sub1();
            }
        });
    }

    public void sub1() {
        // Get values from EditText fields
        String feValue = fe.getText().toString();
        String seValue = se.getText().toString();

        if (!feValue.isEmpty() && !seValue.isEmpty()) {
            // Create an Intent and pass data to weightloss2 activity
            String cur=fe.getText().toString();
            String tar=se.getText().toString();
            Intent sus = new Intent(this, weightgain2.class);
            sus.putExtra("current", cur);
            sus.putExtra("target", tar);
            startActivity(sus);
            finish();
        } else {
            Toast.makeText(this, "Enter Both Values", Toast.LENGTH_SHORT).show();
        }
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
