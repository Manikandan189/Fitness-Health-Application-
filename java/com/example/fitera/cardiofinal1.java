package com.example.fitera;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class cardiofinal1 extends AppCompatActivity {

    @SuppressLint("StringFormatInvalid")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cardiofinal1);
        hideSystemUI();
        cardiodetails(R.id.car1,getString(R.string.running_jogging),getString(R.string.running_jogging_warmup),getString(R.string.running_jogging_howtodo),getString(R.string.running_jogging_calories),getString(R.string.running_jogging_benifits),getString(R.string.running_jogging_duration),getString(R.string.running_jogging_time),R.drawable.img_50);
        cardiodetails(R.id.car2,getString(R.string.cycling),getString(R.string.cycling_warmup),getString(R.string.cycling_howtodo),getString(R.string.cycling_calories),getString(R.string.cycling_benifits),getString(R.string.cycling_duration),getString(R.string.cycling_time),R.drawable.img_51);
        cardiodetails(R.id.car3,getString(R.string.swimming),getString(R.string.swimming_warmup),getString(R.string.swimming_howtodo),getString(R.string.swimming_calories),getString(R.string.swimming_benifits),getString(R.string.swimming_duration),getString(R.string.swimming_time),R.drawable.img_52);
        cardiodetails(R.id.car4,getString(R.string.jump_rope),getString(R.string.jump_rope_warmup),getString(R.string.jump_rope_howtodo),getString(R.string.jump_rope_calories),getString(R.string.jump_rope_benifits),getString(R.string.jump_rope_duration),getString(R.string.jump_rope_time),R.drawable.img_53);
        cardiodetails(R.id.car5,getString(R.string.hiit),getString(R.string.hiit_warmup),getString(R.string.hiit_howtodo),getString(R.string.hiit_calories),getString(R.string.hiit_benifits),getString(R.string.hiit_duration),getString(R.string.hiit_time),R.drawable.img_54);
        cardiodetails(R.id.car6,getString(R.string.rowing),getString(R.string.rowing_warmup),getString(R.string.rowing_howtodo),getString(R.string.rowing_calories),getString(R.string.rowing_benifits),getString(R.string.rowing_duration),getString(R.string.rowing_time),R.drawable.img_55);
        cardiodetails(R.id.car7,getString(R.string.elliptical_trainer),getString(R.string.elliptical_trainer_warmup),getString(R.string.elliptical_trainer_howtodo),getString(R.string.elliptical_trainer_calories),getString(R.string.elliptical_trainer_benifits),getString(R.string.elliptical_trainer_duration),getString(R.string.elliptical_trainer_time),R.drawable.img_56);
        cardiodetails(R.id.car8,getString(R.string.dancing),getString(R.string.dancing_warmup),getString(R.string.dancing_howtodo),getString(R.string.dancing_calories),getString(R.string.dancing_benifits),getString(R.string.dancing_duration),getString(R.string.dancing_time),R.drawable.img_57);
        cardiodetails(R.id.car9,getString(R.string.boxing),getString(R.string.boxing_warmup),getString(R.string.boxing_howtodo),getString(R.string.boxing_calories),getString(R.string.boxing_benifits),getString(R.string.boxing_duration),getString(R.string.boxing_time),R.drawable.img_58);
        cardiodetails(R.id.car10,getString(R.string.hiking),getString(R.string.hiking_warmup),getString(R.string.hiking_howtodo),getString(R.string.hiking_calories),getString(R.string.hiking_benifits),getString(R.string.hiking_duration),getString(R.string.hiking_time),R.drawable.img_59);
    }

    public void cardiodetails(int layout, String title, String warm, String how, String burn, String benifits, String duration, String time,int image)
    {
        TextView tit=findViewById(layout).findViewById(R.id.headf);
        tit.setText(title);
        ImageView img=findViewById(layout).findViewById(R.id.imagef);
        img.setImageResource(image);
        TextView war=findViewById(layout).findViewById(R.id.subf1d);
        war.setText(warm);
        TextView how1=findViewById(layout).findViewById(R.id.subf2d);
        how1.setText(how);
        TextView cal=findViewById(layout).findViewById(R.id.subf3d);
        cal.setText(burn);
        TextView beni=findViewById(layout).findViewById(R.id.subf4d);
        beni.setText(benifits);
        TextView dura=findViewById(layout).findViewById(R.id.subf5d);
        dura.setText(duration);
        TextView tim=findViewById(layout).findViewById(R.id.subf6d);
        tim.setText(time);
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