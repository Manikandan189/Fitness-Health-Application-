package com.example.fitera;

import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.view.View;
import android.widget.MediaController;
import android.widget.VideoView;

public class splash extends AppCompatActivity {
        VideoView v;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                hideSystemUI();
                setContentView(R.layout.activity_splash);
                v = findViewById(R.id.v);
                MediaController mc = new MediaController(this) {
                        @Override
                        public void show(int timeout) {
                                // Override show method to prevent displaying the controls
                        }
                };
                mc.setAnchorView(v);
                v.setMediaController(mc);

                // Set up video playback
                v.setVideoURI(Uri.parse("android.resource://" + getPackageName() + "/" + R.raw.splash));
                v.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
                        @Override
                        public void onPrepared(MediaPlayer mediaPlayer) {
                                // Loop the video
                                mediaPlayer.setLooping(true);
                                // Start playing the video
                                v.start();
                        }
                });

                v.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
                        @Override
                        public void onCompletion(MediaPlayer mediaPlayer) {
                                // Video playback has completed, navigate to MainActivity
                                goToMainActivity();
                        }
                });

                // Delay and then navigate to the next activity
                new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                                goToMainActivity();
                        }
                }, 4000);
        }

        // Method to navigate to MainActivity
        private void goToMainActivity() {
                Intent intent = new Intent(this, home.class);
                startActivity(intent);

                // Finish the current activity to prevent returning to it with the back button
                finish();
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
