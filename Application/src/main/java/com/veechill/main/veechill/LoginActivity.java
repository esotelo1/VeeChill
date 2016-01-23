package com.veechill.main.veechill;

import android.os.Bundle;
import android.app.Activity;
import android.util.Log;

public class LoginActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        Log.i("LoginActivity", "Here");
    }

    protected void readLogin(){
        // pull login code here

    }

}
