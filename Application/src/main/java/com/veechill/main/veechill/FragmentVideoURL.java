package com.veechill.main.veechill;

import android.app.Fragment;
import android.os.Bundle;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FragmentVideoURL extends Fragment implements View.OnClickListener {
    
    private Button b;
    View view;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_split_video_url, container, false);

        b = (Button) rootView.findViewById(R.id.url_button);
        b.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {

        //EditText text = (EditText) v.findViewById(R.id.url_edit);
        //String s = text.getText().toString();
        Log.i("OnClick", "test");

    }

}
