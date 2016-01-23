package com.veechill.main.veechill;

import android.content.Context;
import android.os.Bundle;
import android.app.Activity;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.app.Fragment;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.Toast;

import org.w3c.dom.Document;

public class SplitVideoActivity extends Activity {

    private static Button b;
    private Fragment frag;
    Context ct = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        //Log.i("SplitVideoActivity", "test");
        super.onCreate(savedInstanceState);

        ct = this;
        setContentView(R.layout.activity_split_video);


        frag = new videoTextButtonFragment();
        b = (Button) findViewById(R.id.youtubeButton);

        FrameLayout fl = new FrameLayout(ct);
        fl.setId(View.generateViewId());
/*
        getFragmentManager().beginTransaction().add(fl.getId(), frag, "").commit();

        setContentView(fl);
*/
    }


    public static class videoTextButtonFragment extends Fragment {

        private EditText link;


       // private Context ct2;
        public videoTextButtonFragment() {

            // Empty constructor required for fragment subclasses
        }

        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {

            //Fragment fragment = new videoTextButtonFragment();
            View listView = (View) getView().findViewById(R.id.youtubeButton);
            Log.i("OnCreateView", "test");
            b = (Button) listView;
            b.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    //Context context = getActivity().getBaseContext();
                    //String s = listView
                    Log.i("SplitVideoActivityButto", "test");

                  //  Document document = l;

                   // youTubePlayerView.initialize("AIzaSyAyq1paqjDUyxOBy0uMJ5JpGq791LViez0", onInitializedListener);
                /* API KEY HERE*/

                }

            });
            //b = (Button) findViewById(R.id.youtubeLink);

            return listView;    //to edit later


            //Fragment fragment = menuFragment.newInstance(position);

        }
    }

}
