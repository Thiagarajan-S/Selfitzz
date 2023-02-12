package com.example.myapp;

import androidx.appcompat.app.AppCompatActivity;

import android.media.MediaPlayer;
import android.os.Bundle;
import android.view.View;

public class Meditation extends AppCompatActivity {

    MediaPlayer player;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_meditation);
    }

    public void buttonmeditate(View view){
        if (player == null){
            player = MediaPlayer.create(this,R.raw.deepmeditation);
            player.setOnCompletionListener(mp -> stopPlayer());
        }

        player.start();
    }

    public void buttondone(View view){
        stopPlayer();
    }

    private void stopPlayer(){
        if (player != null){
            player.release();
            player = null;
        }
    }

    @Override
    protected void onStop() {
        super.onStop();
        stopPlayer();
    }
}
