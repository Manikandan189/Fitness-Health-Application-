package com.example.fitera;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;


public class cheast extends AppCompatActivity {
    private ProgressBar p;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        hideSystemUI();
        setContentView(R.layout.content_scrolling);


        NestedScrollView nestedScrollView = findViewById(R.id.nested11);
        nestedScrollView.post(new Runnable() {
            @Override
            public void run() {
                nestedScrollView.fullScroll(View.FOCUS_UP);
            }
        });

        p = findViewById(R.id.ppp);
        p.setVisibility(View.VISIBLE);
        Handler h=new Handler();
                h.postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        p.setVisibility(View.GONE);
                    }
                },7000);

                TextView half=findViewById(R.id.half);
                half.setText("Chest Workouts");
        setupExerciseDetails(R.id.c1, getString(R.string.chp), getString(R.string.large_text));
        setupExerciseDetails(R.id.c2, getString(R.string.idp), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c3, getString(R.string.dbp), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c4, getString(R.string.cf), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c5, getString(R.string.dip), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c6, getString(R.string.cco), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c7, getString(R.string.dfs), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c8, getString(R.string.cco1), getString(R.string.shoulder));

        setupVideo(R.id.c1, "https://drive.google.com/uc?export=download&id=1zoHI3U_sTer9mw908FnqUOQtXC7jTJj8");
        setupVideo(R.id.c2, "https://drive.google.com/uc?export=download&id=1zTkj3yfuMkSl_5dW3u1XgFzzxDhTiFfu");
        setupVideo(R.id.c3, "https://drive.google.com/uc?export=download&id=1zbP_qx64ms4L-Jzk80PBrVDOU3fB8kHr");
        setupVideo(R.id.c4, "https://drive.google.com/uc?export=download&id=1zeWw5mDDanV1s9y83EdY6I6_lQIqb4Jk");
        setupVideo(R.id.c5, "https://drive.google.com/uc?export=download&id=1zhZD4V7KQXhGAZmGFipwhmnJ6D5aXiQz");
        setupVideo(R.id.c6, "https://drive.google.com/uc?export=download&id=1znvIbKZFxxD0tyWWkNwSmlJNXksu2ylb");
        setupVideo(R.id.c7, "https://drive.google.com/uc?export=download&id=1zskPLgdP7YvaNNa6_z7uSpuFlgqV3UbL");
        setupVideo(R.id.c8, "https://drive.google.com/uc?export=download&id=1-yczoJCWcNuGhEgzctF10uN29FIijdaQ");
    }

    private void setupExerciseDetails(int layoutId, String title, String description) {
        TextView temp = findViewById(layoutId).findViewById(R.id.des);
        TextView head = findViewById(layoutId).findViewById(R.id.head);
        head.setText(title);
        temp.setText(description);
    }

    private void setupVideo(int layoutId, String videoUrl) {
        VideoView videoView = findViewById(layoutId).findViewById(R.id.vid);
        videoView.setVideoURI(Uri.parse(videoUrl));
        videoView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
            @Override
            public void onPrepared(MediaPlayer mediaPlayer) {
                mediaPlayer.setLooping(true);
                videoView.start();
            }
        });
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
