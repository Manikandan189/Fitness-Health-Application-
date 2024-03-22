package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.view.animation.TranslateAnimation;
import android.widget.TextView;

public class quote extends AppCompatActivity {
    TextView at1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_quote);
        hideSystemUI();

        at1 = findViewById(R.id.at1);

        // Creating a translation animation using XML
        Animation translateXmlAnimation = AnimationUtils.loadAnimation(this, R.anim.translate_animation_xml);

        // Creating a translation animation using Java
        Animation translateJavaAnimation = new TranslateAnimation(1000, 0, 0, 0);
        translateJavaAnimation.setDuration(15000);

        // Starting the translation animation when the activity is created
        at1.startAnimation(translateXmlAnimation);

        // You can also start the Java animation in a similar way if needed
        // at1.startAnimation(translateJavaAnimation);
        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {
                in();
            }
        }, 4000); // 3000 milliseconds = 3 seconds
    }
    private void in()
    {
        Intent i=new Intent(this,home.class);
        startActivity(i);
        finish();
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
