package com.example.fitera;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodprot1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodprot1);

        uihide();

        populateFoodCard(R.id.fc1, R.string.chiken, R.drawable.img_3, R.string.b1, R.string.h1, R.string.nutr1);
        populateFoodCard(R.id.fc2, R.string.greek_yogurt, R.drawable.img, R.string.g1, R.string.hg1, R.string.nutrient_info_gy);
        populateFoodCard(R.id.fc3, R.string.quinoa, R.drawable.img_1, R.string.q1, R.string.hq1, R.string.nutrient_info_q);
        populateFoodCard(R.id.fc4, R.string.eggs, R.drawable.img_2, R.string.eggs_benefits, R.string.eggs_how_to_take, R.string.eggs_nutritional_info);
        populateFoodCard(R.id.fc5, R.string.lentils, R.drawable.img_4, R.string.lentils_benefits, R.string.lentils_how_to_take, R.string.lentils_nutritional_info);
        populateFoodCard(R.id.fc6, R.string.salmon, R.drawable.img_5, R.string.salmon_benefits, R.string.salmon_how_to_take, R.string.salmon_nutritional_info);
        populateFoodCard(R.id.fc7, R.string.cottage_cheese, R.drawable.img_6, R.string.cottage_cheese_benefits, R.string.cottage_cheese_how_to_take, R.string.cottage_cheese_nutritional_info);
        populateFoodCard(R.id.fc8, R.string.almonds, R.drawable.img_7, R.string.almonds_benefits, R.string.almonds_how_to_take, R.string.almonds_nutritional_info);
        populateFoodCard(R.id.fc9, R.string.tofu, R.drawable.img_8, R.string.tofu_benefits, R.string.tofu_how_to_take, R.string.tofu_nutritional_info);
        populateFoodCard(R.id.fc10, R.string.turkey, R.drawable.img_9, R.string.turkey_benefits, R.string.turkey_how_to_take, R.string.turkey_nutritional_info);
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
