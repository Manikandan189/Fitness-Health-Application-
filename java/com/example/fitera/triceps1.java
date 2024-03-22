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

public class triceps1 extends AppCompatActivity {

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
        half.setText("Tricep Workouts");

        setupExerciseDetails(R.id.c1, getString(R.string.tw1), getString(R.string.large_text));
        setupExerciseDetails(R.id.c2, getString(R.string.tw2), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c3, getString(R.string.tw3), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c4, getString(R.string.tw4), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c5, getString(R.string.tw5), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c6, getString(R.string.tw6), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c7, getString(R.string.tw7), getString(R.string.shoulder));
        setupExerciseDetails(R.id.c8, getString(R.string.tw8), getString(R.string.shoulder));

        setupVideo(R.id.c1, "https://drive.google.com/uc?export=download&id=11CqxUswnTYU1Krfscue0hUh6h8-ESDa2");
        setupVideo(R.id.c2, "https://drive.google.com/uc?export=download&id=112KD3RpYEIPtkPiWjo9dct14cwvgiSas");
        setupVideo(R.id.c3, "https://drive.google.com/uc?export=download&id=10vrfrVmVtobm_hRDmDAGVpKgyZF7bFqu");
        setupVideo(R.id.c4, "https://drive.google.com/uc?export=download&id=10sf1I39bQOQ1HabWF_DH0rcOaYhZEP6u");
        setupVideo(R.id.c5, "https://drive.google.com/uc?export=download&id=10oz3mc5lBXxfkrLaV3MVDpNtj671OzQy");
        setupVideo(R.id.c6, "https://drive.google.com/uc?export=download&id=10mh2CDaHfEc5r36Qx_XfPbbTwos63_n6");
        setupVideo(R.id.c7, "https://drive.google.com/uc?export=download&id=10klPrLplkVqUVSqMiFdOALJav0B7TjFQ");
        setupVideo(R.id.c8, "https://drive.google.com/uc?export=download&id=10gk0FEjo5MHIQ6sz1LPgGiIJhTaZFp4H");
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
