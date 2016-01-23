package com.veechill.main.veechill;

import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.os.Bundle;
import android.app.Activity;

public class PeerActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        FragmentManager fragmentManager = getFragmentManager();

        FragmentTransaction fragmentTransaction = fragmentManager.beginTransaction();

        FragmentVideoURL fragmentVideoURL;
        fragmentVideoURL = new FragmentVideoURL();

        fragmentTransaction.replace(android.R.id.content, fragmentVideoURL);
        fragmentTransaction.commit();
    }

}
