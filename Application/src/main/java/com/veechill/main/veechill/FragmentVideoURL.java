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
    private EditText text;
    private String url;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);


        View rootView = inflater.inflate(R.layout.fragment_split_video_url, container, false);

        text = (EditText) rootView.findViewById(R.id.url_edit);
        url = "";

        b = (Button) rootView.findViewById(R.id.url_button);
        b.setOnClickListener(this);

        return rootView;
    }

    @Override
    public void onClick(View v) {
        url = text.getText().toString();
    }

    public String getUrl() {
        return this.url;
    }

}
