package com.example.fitera;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodwat1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodprot1);

        uihide();

        populateFoodCard(R.id.fc1, R.string.cucumber, R.drawable.img_40, R.string.cucumber_benefits, R.string.cucumber_how_to_take, R.string.cucumber_nutritional_info);
        populateFoodCard(R.id.fc2, R.string.watermelon, R.drawable.img_41, R.string.watermelon_benefits, R.string.watermelon_how_to_take, R.string.watermelon_nutritional_info);
        populateFoodCard(R.id.fc3, R.string.celery, R.drawable.img_42, R.string.celery_benefits, R.string.celery_how_to_take, R.string.celery_nutritional_info);
        populateFoodCard(R.id.fc4, R.string.strawberries, R.drawable.img_43, R.string.strawberries_benefits, R.string.strawberries_how_to_take, R.string.strawberries_nutritional_info);
        populateFoodCard(R.id.fc5, R.string.lettuce, R.drawable.img_44, R.string.lettuce_benefits, R.string.lettuce_how_to_take, R.string.lettuce_nutritional_info);
        populateFoodCard(R.id.fc6, R.string.oranges, R.drawable.img_45, R.string.oranges_benefits, R.string.oranges_how_to_take, R.string.oranges_nutritional_info);
        populateFoodCard(R.id.fc7, R.string.grapefruit, R.drawable.img_46, R.string.grapefruit_benefits, R.string.grapefruit_how_to_take, R.string.grapefruit_nutritional_info);
        populateFoodCard(R.id.fc8, R.string.zucchini, R.drawable.img_47, R.string.zucchini_benefits, R.string.zucchini_how_to_take, R.string.zucchini_nutritional_info);
        populateFoodCard(R.id.fc9, R.string.bell_peppers, R.drawable.img_48, R.string.bell_peppers_benefits, R.string.bell_peppers_how_to_take, R.string.bell_peppers_nutritional_info);
        populateFoodCard(R.id.fc10, R.string.tomatoes, R.drawable.img_49, R.string.tomatoes_benefits, R.string.tomatoes_how_to_take, R.string.tomatoes_nutritional_info);
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
