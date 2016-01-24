package com.veechill.main.veechill;

import android.os.Bundle;
import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.util.Log;

public class SplitVideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i("SplitVideoActivity", "test");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_split_video);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentVideoURL fragmentVideoURL;
        fragmentVideoURL = new FragmentVideoURL();

        FragmentVideo fragmentVideo = new FragmentVideo();



        fragmentTransaction.add(R.id.Container1, fragmentVideoURL, "Frag_Top_tag");
        Log.i("beforeFragOne", "test");
        fragmentTransaction.add(R.id.Container2, fragmentVideo, "Frag_Middle_tag");

        fragmentTransaction.commit();






    }
}
