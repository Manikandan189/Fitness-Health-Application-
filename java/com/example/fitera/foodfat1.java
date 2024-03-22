package com.example.fitera;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodfat1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodprot1);

        uihide();

        populateFoodCard(R.id.fc1, R.string.avocado, R.drawable.img_20, R.string.avocado_benefits, R.string.avocado_how_to_take, R.string.avocado_nutritional_info);
        populateFoodCard(R.id.fc2, R.string.olive_oil, R.drawable.img_21, R.string.olive_oil_benefits, R.string.olive_oil_how_to_take, R.string.olive_oil_nutritional_info);
        populateFoodCard(R.id.fc3, R.string.nuts, R.drawable.img_22, R.string.nuts_benefits, R.string.nuts_how_to_take, R.string.nuts_nutritional_info);
        populateFoodCard(R.id.fc4, R.string.fatty_fish, R.drawable.img_23, R.string.fatty_fish_benefits, R.string.fatty_fish_how_to_take, R.string.fatty_fish_nutritional_info);
        populateFoodCard(R.id.fc5, R.string.dark_chocolate, R.drawable.img_24, R.string.dark_chocolate_benefits, R.string.dark_chocolate_how_to_take, R.string.dark_chocolate_nutritional_info);
        populateFoodCard(R.id.fc6, R.string.coconut_oil, R.drawable.img_25, R.string.coconut_oil_benefits, R.string.coconut_oil_how_to_take, R.string.coconut_oil_nutritional_info);
        populateFoodCard(R.id.fc7, R.string.flaxseeds, R.drawable.img_26, R.string.flaxseeds_benefits, R.string.flaxseeds_how_to_take, R.string.flaxseeds_nutritional_info);
        populateFoodCard(R.id.fc8, R.string.cheese, R.drawable.img_27, R.string.cheese_benefits, R.string.cheese_how_to_take, R.string.cheese_nutritional_info);
        populateFoodCard(R.id.fc9, R.string.full_fat_yogurt, R.drawable.img_28, R.string.full_fat_yogurt_benefits, R.string.full_fat_yogurt_how_to_take, R.string.full_fat_yogurt_nutritional_info);
        populateFoodCard(R.id.fc10, R.string.eggs, R.drawable.img_29, R.string.eggs_benefits, R.string.eggs_how_to_take, R.string.eggs_nutritional_info);
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
