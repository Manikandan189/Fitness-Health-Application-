package com.example.fitera;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import androidx.appcompat.app.AppCompatActivity;

public class bulking2 extends AppCompatActivity {

    EditText t;
    Button cal;
    Button pro;
    Button main;
    Button day;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_weightloss2);
        hideSystemUI();
        cal = findViewById(R.id.cal);
        pro = findViewById(R.id.pro);
        main = findViewById(R.id.main);
        day = findViewById(R.id.day);

        // Assuming weightloss1 is a public class
        Intent data = getIntent();
        String cur1 = data.getStringExtra("current");
        String tar1 = data.getStringExtra("target");
        int c = Integer.parseInt(cur1);
        int t = Integer.parseInt(tar1);
        double maintain = (c * 2.2 * 14);
        float protein = (float) (c*(2.2));
        double one=0.75;
        double oneper = ((c * 0.01)*100)*10;
        int calorie = (int) (maintain + 750);
        double daysToAchieveGoal = ((t-c) / (one / 7));

        // Set the calculated values on the buttons
        cal.setText( " "+calorie);
        pro.setText(" "+(int) protein);
        main.setText(" "+ (int) maintain);
        day.setText( " " +(int) daysToAchieveGoal);
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
