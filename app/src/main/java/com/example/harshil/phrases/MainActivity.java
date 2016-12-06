package com.example.harshil.phrases;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void buttontapped(View view){
        int id=view.getId();
        String ourId="";
        ourId=view.getResources().getResourceEntryName(id);
        int resourceid=getResources().getIdentifier(ourId,"raw","com.example.harshil.phrases");

        MediaPlayer mediaPlayer=MediaPlayer.create(this,resourceid);
        mediaPlayer.start();
        Log.d("button tapped",ourId);

    }
}
