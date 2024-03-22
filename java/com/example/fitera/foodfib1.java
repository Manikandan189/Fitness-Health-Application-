package com.example.fitera;

import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class foodfib1 extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_foodprot1);

        uihide();

        populateFoodCard(R.id.fc1, R.string.oats, R.drawable.img_10, R.string.oats_benefits, R.string.oats_how_to_take, R.string.oats_nutritional_info);
        populateFoodCard(R.id.fc2, R.string.broccoli, R.drawable.img_11, R.string.broccoli_benefits, R.string.broccoli_how_to_take, R.string.broccoli_nutritional_info);
        populateFoodCard(R.id.fc3, R.string.chia_seeds, R.drawable.img_12, R.string.chia_seeds_benefits, R.string.chia_seeds_how_to_take, R.string.chia_seeds_nutritional_info);
        populateFoodCard(R.id.fc4, R.string.avocado, R.drawable.img_13, R.string.avocado_benefits, R.string.avocado_how_to_take, R.string.avocado_nutritional_info);
        populateFoodCard(R.id.fc5, R.string.black_beans, R.drawable.img_14, R.string.black_beans_benefits, R.string.black_beans_how_to_take, R.string.black_beans_nutritional_info);
        populateFoodCard(R.id.fc6, R.string.sweet_potatoes, R.drawable.img_15, R.string.sweet_potatoes_benefits, R.string.sweet_potatoes_how_to_take, R.string.sweet_potatoes_nutritional_info);
        populateFoodCard(R.id.fc7, R.string.berries_raspberries, R.drawable.img_16, R.string.berries_raspberries_benefits, R.string.berries_raspberries_how_to_take, R.string.berries_raspberries_nutritional_info);
        populateFoodCard(R.id.fc8, R.string.popcorn_air_popped, R.drawable.img_17, R.string.popcorn_air_popped_benefits, R.string.popcorn_air_popped_how_to_take, R.string.popcorn_air_popped_nutritional_info);
        populateFoodCard(R.id.fc9, R.string.whole_wheat_bread, R.drawable.img_18, R.string.whole_wheat_bread_benefits, R.string.whole_wheat_bread_how_to_take, R.string.whole_wheat_bread_nutritional_info);
        populateFoodCard(R.id.fc10, R.string.brussels_sprouts, R.drawable.img_19, R.string.broccoli_benefits, R.string.brussels_sprouts_how_to_take, R.string.brussels_sprouts_nutritional_info);
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
