package com.example.fitera;

import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.VideoView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.widget.NestedScrollView;

import com.example.fitera.databinding.ActivityCheastBinding;

public class forearms1 extends AppCompatActivity {

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
        half.setText("ForeArm Workouts");

        setupExerciseDetails(R.id.c1, getString(R.string.fw1), getString(R.string.large_text));
        setupExerciseDetails(R.id.c2, getString(R.string.fw2), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c3, getString(R.string.fw3), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c4, getString(R.string.fw4), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c5, getString(R.string.fw5), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c6, getString(R.string.fw6), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c7, getString(R.string.fw7), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c8, getString(R.string.fw8), getString(R.string.shoulder));

        setupVideo(R.id.c1, "https://drive.google.com/uc?export=download&id=11TG04A9Zcz8SgCrRiyxAm2OUjcfkly4P");
        setupVideo(R.id.c2, "https://drive.google.com/uc?export=download&id=11KZ1R313SdC_TJsZC4KMQ7KBTfyMwDDB");
        setupVideo(R.id.c3, "https://drive.google.com/uc?export=download&id=11Jk3ywBjlYFlVGB6EQQPn1ydPEJrsmSx");
        setupVideo(R.id.c4, "https://drive.google.com/uc?export=download&id=11Ji3wL1O6RDbW3TqIHwzqLIU5BJEdIeR");
        setupVideo(R.id.c5, "https://drive.google.com/uc?export=download&id=11FrTmgzPJS-ib1AwjQhHqrhuMsq9-Ktu");
        setupVideo(R.id.c6, "https://drive.google.com/uc?export=download&id=11UQDSHJJ0clTzmEerA-YwSUD2jlb7vNj");
        setupVideo(R.id.c7, "https://drive.google.com/uc?export=download&id=11DlccwSoDuuiWGOA9sZ3Kb2JczvlPlSx");
        setupVideo(R.id.c8, "https://drive.google.com/uc?export=download&id=11WFo-249mnimuR3jCY0IJN0sFt9bSiF4");
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
