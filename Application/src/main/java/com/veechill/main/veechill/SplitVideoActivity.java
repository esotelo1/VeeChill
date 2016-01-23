package com.veechill.main.veechill;

import android.os.Bundle;
import android.app.Activity;

import android.app.FragmentManager;
import android.app.FragmentTransaction;

public class SplitVideoActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i("SplitVideoActivity", "test");
        super.onCreate(savedInstanceState);

        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentVideoURL fragmentVideoURL;
        fragmentVideoURL = new FragmentVideoURL();

        fragmentTransaction.replace(android.R.id.content, fragmentVideoURL);
        fragmentTransaction.commit();


    }
}
