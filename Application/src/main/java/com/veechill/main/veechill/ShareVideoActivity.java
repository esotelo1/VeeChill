package com.veechill.main.veechill;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

public class ShareVideoActivity extends YouTubeBaseActivity {
    Button b;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentVideoURL fragmentVideoURL;
        fragmentVideoURL = new FragmentVideoURL();

        fragmentTransaction.replace(android.R.id.content, fragmentVideoURL);
        fragmentTransaction.commit();

        /*
        FragmentVideo fragmentVideo = new FragmentVideo();

        fragmentTransaction.replace(android.R.id.content, fragmentVideo);
        fragmentTransaction.commit();*/
        /*
        setContentView(R.layout.activity_share_video);

        youTubePlayerView = (YouTubePlayerView) findViewById(R.id.youtube_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener(){

            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("a4NT5iBFuZs");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {

            }
        };
        b = (Button) findViewById(R.id.youtubeButton);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                youTubePlayerView.initialize("AIzaSyAyq1paqjDUyxOBy0uMJ5JpGq791LViez0", onInitializedListener);
                /* API KEY HERE

            }
        });*/
    }

}
