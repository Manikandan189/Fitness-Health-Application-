package com.example.fitera;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationBarView;

public class home extends AppCompatActivity {

    Button fit,card,food,nutri,calc,stud;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideSystemUI();
        setContentView(R.layout.activity_home);



        fit = findViewById(R.id.fit);
        card=findViewById(R.id.card);
        food=findViewById(R.id.food);
        nutri=findViewById(R.id.nutri);
        calc=findViewById(R.id.calc);
        stud=findViewById(R.id.stud);
        nutri.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                nutrition(view);
            }
        });
        // Set click listener for the button
        food.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                foods(view);
            }
        });
        fit.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                fit1(view);
            }
        });
        card.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                car(view);
            }
        });
        calc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                calculator(view);
            }
        });
        stud.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                studies(view);
            }
        });
    }

    private void fit1(View view) {
        Intent i = new Intent(this, f1.class);
        startActivity(i);

    }
    private void car(View view) {
       Intent i=new Intent(this, strutch.class);
       startActivity(i);
    }
    private void foods(View view) {
       Intent foo=new Intent(this, foodhome.class);
       startActivity(foo);
    } private void nutrition(View view) {
        Intent foo=new Intent(this, nutri1.class);
        startActivity(foo);
    } private void calculator(View view) {
        Intent cl=new Intent(this, homecal.class);
        startActivity(cl);

    } private void studies(View view) {
        Toast.makeText(this, "Mani is processing. Updates will be available soon.", Toast.LENGTH_SHORT).show();

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
