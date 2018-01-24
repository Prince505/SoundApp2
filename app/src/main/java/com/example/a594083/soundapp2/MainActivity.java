package com.example.a594083.soundapp2;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

            MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.billy);
        mediaPlayer.start();
    }
}
