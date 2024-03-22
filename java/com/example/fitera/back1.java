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

public class back1 extends AppCompatActivity {
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
        half.setText("Back Workouts");
        setupExerciseDetails(R.id.c1, getString(R.string.dl), getString(R.string.large_text));
        setupExerciseDetails(R.id.c2, getString(R.string.pu), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c3, getString(R.string.brs), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c4, getString(R.string.lps), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c5, getString(R.string.tbr), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c6, getString(R.string.sadr), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c7, getString(R.string.hebe), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c8, getString(R.string.fps), getString(R.string.shoulder));

        setupVideo(R.id.c1, "https://drive.google.com/uc?export=download&id=1-tEHbyiC9xOifIFp98ruoAdhi1v-r7UQ");
        setupVideo(R.id.c2, "https://drive.google.com/uc?export=download&id=1-lNqjs9dXmcPoAvqvRlzSvkQIm77C4Cj");
        setupVideo(R.id.c3, "https://drive.google.com/uc?export=download&id=1-kXlxk-BFUjSc_nXiSGE5cfvhzJD_6Lv");
        setupVideo(R.id.c4, "https://drive.google.com/uc?export=download&id=1-fByumSq1HAuNJJNUmvA0h6ZX_RxBCcV");
        setupVideo(R.id.c5, "https://drive.google.com/uc?export=download&id=1-dhbk0q9-piu4H1JeO7wSY44t-0BHrm7");
        setupVideo(R.id.c6, "https://drive.google.com/uc?export=download&id=1-cRYwrWBwImZ7yKodIBIHsHJ5ot0fh-v");
        setupVideo(R.id.c7, "https://drive.google.com/uc?export=download&id=1-TkU8eksBHkjL7Bn-LyS3mvzaDv0_sB4");
        setupVideo(R.id.c8, "https://drive.google.com/uc?export=download&id=1-ya1pU6IkDPzDmz0ePYVokYlM5qz9-nw");
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
