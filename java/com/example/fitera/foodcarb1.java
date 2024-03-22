package com.example.fitera;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodcarb1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodprot1);

        uihide();

        populateFoodCard(R.id.fc1, R.string.brown_rice, R.drawable.img_30, R.string.brown_rice_benefits, R.string.brown_rice_how_to_take, R.string.brown_rice_nutritional_info);
        populateFoodCard(R.id.fc2, R.string.sweet_potatoes, R.drawable.img_31, R.string.sweet_potatoes_benefits, R.string.sweet_potatoes_how_to_take, R.string.sweet_potatoes_nutritional_info);
        populateFoodCard(R.id.fc3, R.string.quinoa, R.drawable.img_32, R.string.q1, R.string.hq1, R.string.nutrient_info_q);
        populateFoodCard(R.id.fc4, R.string.oats, R.drawable.img_33, R.string.oats_benefits, R.string.oats_how_to_take, R.string.oats_nutritional_info);
        populateFoodCard(R.id.fc5, R.string.bananas, R.drawable.img_34, R.string.bananas_benefits, R.string.bananas_how_to_take, R.string.bananas_nutritional_info);
        populateFoodCard(R.id.fc6, R.string.whole_wheat_bread, R.drawable.img_35, R.string.whole_wheat_bread_benefits, R.string.whole_wheat_bread_how_to_take, R.string.whole_wheat_bread_nutritional_info);
        populateFoodCard(R.id.fc7, R.string.lentils, R.drawable.img_36, R.string.lentils_benefits, R.string.lentils_how_to_take, R.string.lentils_nutritional_info);
        populateFoodCard(R.id.fc8, R.string.chickpeas, R.drawable.img_37, R.string.chickpeas_benefits, R.string.chickpeas_how_to_take, R.string.chickpeas_nutritional_info);
        populateFoodCard(R.id.fc9, R.string.apples, R.drawable.img_38, R.string.apples_benefits, R.string.apples_how_to_take, R.string.apples_nutritional_info);
        populateFoodCard(R.id.fc10, R.string.black_beans, R.drawable.img_39, R.string.black_beans_benefits, R.string.black_beans_how_to_take, R.string.black_beans_nutritional_info);
    }

    private void populateFoodCard(int cardId, int headId, int imageId, int subf1Id, int subf2Id, int subf3Id) {
        View foodCardView = findViewById(cardId);
        TextView headTextView = foodCardView.findViewById(R.id.headf);
        headTextView.setText(getString(headId));

        ImageView foodImageView = foodCardView.findViewById(R.id.imagef);
        foodImageView.setImageResource(imageId);

        TextView subf1TextView = foodCardView.findViewById(R.id.subf1d);
        subf1TextView.setText(getString(subf1Id));

        TextView subf2TextView = foodCardView.findViewById(R.id.subf2d);
        subf2TextView.setText(getString(subf2Id));

        TextView subf3TextView = foodCardView.findViewById(R.id.subf3d);
        subf3TextView.setText(getString(subf3Id));
    }

    public void uihide() {
        View scr = getWindow().getDecorView();
        int ph = View.SYSTEM_UI_FLAG_FULLSCREEN;
        scr.setSystemUiVisibility(ph);
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            getWindow().setDecorFitsSystemWindows(false);
        }
    }
}
