package com.veechill.main.veechill;

import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.google.android.youtube.player.YouTubeBaseActivity;
import com.google.android.youtube.player.YouTubeInitializationResult;
import com.google.android.youtube.player.YouTubePlayer;
import com.google.android.youtube.player.YouTubePlayerView;

/**
 * Created by Everett on 1/23/2016.
 */
public class Video extends YouTubeBaseActivity implements View.OnClickListener {
    private Button b;
    private String url;
    private YouTubePlayerView youTubePlayerView;
    private YouTubePlayer.OnInitializedListener onInitializedListener;
    View v;
    private int newView;

    public Video(View view) {
        v = view;
    }

    public View play(LayoutInflater inflater, ViewGroup container, String url) {

        Log.i("water", "water");

        this.url = url;

        newView = R.layout.activity_share_video;
        View shareView = inflater.inflate(newView, container, false);

        youTubePlayerView = (YouTubePlayerView) shareView.findViewById(R.id.youtube_view);
        onInitializedListener = new YouTubePlayer.OnInitializedListener() {
            @Override
            public void onInitializationSuccess(YouTubePlayer.Provider provider, YouTubePlayer youTubePlayer, boolean b) {
                youTubePlayer.loadVideo("9ZaEPeaucIU");
            }

            @Override
            public void onInitializationFailure(YouTubePlayer.Provider provider, YouTubeInitializationResult youTubeInitializationResult) {
                Log.e("bad", "cactus");

            }
        };
        //Integer x = R.layout.activity_share_video;
       // newView = (View) x;
        //View newView = R.layout.activity_share_video;

        b = (Button) shareView.findViewById(R.id.youtubeButton);
        b.setOnClickListener(this);
        if(!b.performClick()) {
            Log.e("ClickFailed","Click to initialize video failed");
        }
        return v;
    }

    @Override
    public void onClick(View v) {
        Log.i("melon", "test");
        //int view = newView;
        youTubePlayerView.initialize("AIzaSyAyq1paqjDUyxOBy0uMJ5JpGq791LViez0", onInitializedListener);
    }
}
