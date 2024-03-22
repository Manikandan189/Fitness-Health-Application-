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



public class abs1 extends AppCompatActivity {

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
        half.setText("Abs Workouts");
        setupExerciseDetails(R.id.c1, getString(R.string.aw1), getString(R.string.large_text));
        setupExerciseDetails(R.id.c2, getString(R.string.aw2), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c3, getString(R.string.aw3), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c4, getString(R.string.aw4), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c5, getString(R.string.aw5), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c6, getString(R.string.aw6), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c7, getString(R.string.aw7), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c8, getString(R.string.aw8), getString(R.string.shoulder));

        setupVideo(R.id.c1, "https://drive.google.com/uc?export=download&id=12JSPMPjZpz3bcxTLR3Aa8qIaIW4mE1iz");
        setupVideo(R.id.c2, "https://drive.google.com/uc?export=download&id=12CRvgVXvx5KvMDr4sRUDmyS_W5DY30XF");
        setupVideo(R.id.c3, "https://drive.google.com/uc?export=download&id=123-OHF9V1VYWsAVdEPjRWUkJ7Cz2b7Vg");
        setupVideo(R.id.c4, "https://drive.google.com/uc?export=download&id=12-4zBA76OcMKY8oe5m0guNLKMpzvIQKn");
        setupVideo(R.id.c5, "https://drive.google.com/uc?export=download&id=11vrS0MNjyXogT0Kltx1m8ReoQslorGjY");
        setupVideo(R.id.c6, "https://drive.google.com/uc?export=download&id=11nvxl8gpXvUSDSoQNUa8Yd_RzN4CA8j8");
        setupVideo(R.id.c7, "https://drive.google.com/uc?export=download&id=11jI8UChGm1BJKhiuvXzciDeKui9aGzGA");
        setupVideo(R.id.c8, "https://drive.google.com/uc?export=download&id=11eYs8kc1MdTL6reeWW6CUcchyjK10BYj");
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
